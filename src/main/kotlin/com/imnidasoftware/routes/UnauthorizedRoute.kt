package com.imnidasoftware.routes

import com.imnidasoftware.domain.model.Endpoint
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.unauthorizedRoute() {
    get(Endpoint.Unauthorized.path) {
        call.respond(
            message = "Not Authorized",
            status = HttpStatusCode.Unauthorized
        )
    }
}