package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

import javax.transaction.Transactional;

import io.quarkus.scheduler.Scheduled;

@ApplicationScoped
public class TaskBean {

    @Transactional
    @Scheduled(every = "10s")
    void schedule() {
        Task task = new Task();
        task.persist();
        System.out.println("HEY");
    }
}
