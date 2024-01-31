package com.github.viiiraj07.JavaScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class SchedulingJobs {

    // Running at a fixed rate (5 seconds)
    @Scheduled(timeUnit = TimeUnit.SECONDS, fixedRate = 5)
    public void job() {
        System.out.println("Running job");
    }

    // Running at a fixed rate (5 seconds) after 5 seconds of initial delay
    @Scheduled(timeUnit = TimeUnit.SECONDS, fixedRate = 5, initialDelay = 5)
    public void delayedRecursiveJob() {
        System.out.println("Running job 2");
    }

    // Runs every day at 12:00 AM
    @Scheduled(cron = "0 0 0 * * *")
    public void cronJob() {
        System.out.println("Running cron job");
    }
}
