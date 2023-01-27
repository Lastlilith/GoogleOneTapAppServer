package com.imnidasoftware.plugins

import com.imnidasoftware.routes.authorizedRoute
import com.imnidasoftware.routes.rootRoute
import com.imnidasoftware.routes.tokenVerificationRoute
import com.imnidasoftware.routes.unauthorizedRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        rootRoute()
        tokenVerificationRoute()
        authorizedRoute()
        unauthorizedRoute()
    }
}
