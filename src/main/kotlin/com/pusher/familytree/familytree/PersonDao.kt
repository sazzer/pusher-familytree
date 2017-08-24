package com.pusher.familytree.familytree

import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonDao {
    private val data = mutableListOf(
            Person(id = "qeii", name = "Queen Elizabeth II"),
            Person(id = "pp", name = "Prince Philip"),
            Person(id = "pc", name = "Prince Charles"),
            Person(id = "pw", name = "Prince William")
    )

    fun getPersonById(id: String) = data.firstOrNull { person -> person.id == id }

    fun createPerson(name: String): Person {
        val person = Person(id = UUID.randomUUID().toString(), name = name)
        data.add(person)
        return person
    }
}
