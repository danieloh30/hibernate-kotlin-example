package org.acme

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ReactiveGreetingResource {

    @Inject
    lateinit var personRepository: PersonRepository

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    fun greeting(@PathParam("name") name: String): String {
        return "Hello ${personRepository.findByName(name)?.name}"
    }
}