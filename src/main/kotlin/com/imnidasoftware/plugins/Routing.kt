package com.imnidasoftware.plugins

import com.imnidasoftware.routes.rootRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        rootRoute()
    }
}
