package com.example.shedlocksample.component;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Project shed-lock-sample
 * Developer Fazliddin
 * Date 10/7/2022
 */

@Component
public class RevenueReporter {

    @Scheduled(fixedDelay = 5000)
    @SchedulerLock(name = "shortRunningTask", lockAtMostFor = "10s", lockAtLeastFor = "5s")
    public void shortRunningTask() {
        System.out.println("Start short running task");
    }
}
