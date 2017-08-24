package com.pusher.familytree.familytree

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class PersonQueryResolver(
        private val personDao : PersonDao
) : GraphQLQueryResolver {
    fun getPersonById(id: String) = personDao.getPersonById(id)
}
