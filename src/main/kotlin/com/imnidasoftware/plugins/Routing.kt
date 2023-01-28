package com.imnidasoftware.plugins

import com.imnidasoftware.domain.repository.UserDataSource
import com.imnidasoftware.routes.authorizedRoute
import com.imnidasoftware.routes.rootRoute
import com.imnidasoftware.routes.tokenVerificationRoute
import com.imnidasoftware.routes.unauthorizedRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.java.KoinJavaComponent.inject

fun Application.configureRouting() {
    routing {
        val userDataSource: UserDataSource by inject(UserDataSource::class.java)

        rootRoute()
        tokenVerificationRoute(application, userDataSource)
        authorizedRoute()
        unauthorizedRoute()
    }
}
