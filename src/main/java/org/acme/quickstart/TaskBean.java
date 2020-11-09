package org.acme.quickstart;

import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TaskBean {

    @Scheduled(every = "10s")
    void schedule() {
        System.out.println("HEY");
    }
}
