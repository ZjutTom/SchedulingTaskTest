package com.myhexin.schedulingtasktest.component;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
@Async
public class SchedulingTask {

    @Scheduled(cron = "0/5 * * * * *")
    public void task1() {
        System.out.println(new Date() + "---" + Thread.currentThread().getName() + ": task1()");
    }

    @Scheduled(fixedDelay = 5000)
    public void task2() {
        System.out.println(new Date() + "---" + Thread.currentThread().getName() + ": task2()");
    }

    @Scheduled(initialDelay = 2000, fixedDelay = 5000)
    public void task3() {
        System.out.println(new Date() + "---" + Thread.currentThread().getName() + ": task3()");
    }
}
