package com.imnidasoftware.routes

import com.imnidasoftware.domain.model.Endpoint
import com.imnidasoftware.domain.model.UserSession
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*

fun Route.tokenVerificationRoute() {
    post(Endpoint.TokenVerification.path) {
        call.sessions.set(UserSession(id = "123", name = "Vladimir"))
        call.respondRedirect(Endpoint.Authorized.path)
    }
}