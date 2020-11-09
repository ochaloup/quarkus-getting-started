package org.acme.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Recording extends PanacheEntity {
    String name;

    Recording setName(String name) {
        this.name = name;
        return this;
    }
}
