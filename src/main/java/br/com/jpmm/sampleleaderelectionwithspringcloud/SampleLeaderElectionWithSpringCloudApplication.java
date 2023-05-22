package br.com.jpmm.sampleleaderelectionwithspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SampleLeaderElectionWithSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleLeaderElectionWithSpringCloudApplication.class, args);
	}

}
