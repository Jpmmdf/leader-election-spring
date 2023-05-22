package br.com.jpmm.sampleleaderelectionwithspringcloud.support;

import org.springframework.integration.leader.Context;
import org.springframework.stereotype.Service;

@Service
public class ManagerContext {
    private Context context;


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
