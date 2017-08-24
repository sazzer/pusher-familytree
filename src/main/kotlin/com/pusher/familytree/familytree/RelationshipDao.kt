package com.pusher.familytree.familytree

import org.springframework.stereotype.Component

@Component
class RelationshipDao {
    private val data = mutableListOf(
            Relationship(from = "qeii", to = "pp", relationship = "SPOUSE"),
            Relationship(from = "pp", to = "qeii", relationship = "SPOUSE"),
            Relationship(from = "qeii", to = "pc", relationship = "PARENT"),
            Relationship(from = "pp", to = "pc", relationship = "PARENT"),
            Relationship(from = "pc", to = "pw", relationship = "PARENT")
    )

    fun getRelationshipsFromPerson(personId: String) = data.filter { relationship -> relationship.from == personId }

    fun getRelationshipsOfTypeFromPerson(personId: String, type: String) =
            data.filter { relationship -> relationship.from == personId }
                    .filter { relationship -> relationship.relationship == type }

}
