package org.acme.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Recording extends PanacheEntity {
    String name;
}