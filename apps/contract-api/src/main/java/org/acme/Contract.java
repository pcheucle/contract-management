package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Contract extends PanacheEntity {

    public String name;

    @Override
    public String toString() {
        return "Contract [name=" + name + "]";
    }

    

}
