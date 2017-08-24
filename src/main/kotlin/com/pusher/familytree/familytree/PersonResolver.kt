package com.pusher.familytree.familytree

import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component

@Component
class PersonResolver(private val relationshipDao: RelationshipDao) : GraphQLResolver<Person> {
    fun relationships(person: Person, type: String?) =
            when (type) {
                null -> relationshipDao.getRelationshipsFromPerson(person.id)
                else -> relationshipDao.getRelationshipsOfTypeFromPerson(person.id, type)
            }
}
