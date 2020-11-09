package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

import javax.transaction.Transactional;

import io.quarkus.scheduler.Scheduled;

@ApplicationScoped
public class TaskBean {

    @Scheduled(every = "10s")
    void schedule() {
        System.out.println("HEY");
    }
}
