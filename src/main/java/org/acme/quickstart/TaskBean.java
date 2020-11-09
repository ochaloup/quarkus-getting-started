package org.acme.quickstart;

import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class TaskBean {

    @Scheduled(every = "10s")
    @Transactional
    void schedule() {
        new Recording().setName("HEY").persist();
        System.out.println("HEY");
    }
}
