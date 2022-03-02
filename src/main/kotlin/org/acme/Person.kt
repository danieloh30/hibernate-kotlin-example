package org.acme

import javax.persistence.Entity
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity

@Entity(name = "Person")
class Person : PanacheEntity() {
    lateinit var name: String
}