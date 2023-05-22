package br.com.jpmm.sampleleaderelectionwithspringcloud.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private ManagerContext managerContext;
    public ScheduledTasks(ManagerContext managerContext){
        this.managerContext = managerContext;
    }
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {

        if (isLeader()) {
            // Perform the task
            log.info("The time is now {}", dateFormat.format(new Date()));
        } else {
            // Not the leader instance, wait until becoming the leader
            log.info("I'm not the leader");
        }

    }

    private boolean isLeader() {
        // Logic to check if this instance is the leader
        return managerContext.getContext() != null; // Modify the logic to check real leadership
    }
}
