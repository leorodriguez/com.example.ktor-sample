package com.example.plugins

import com.example.models.customerStorage
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        route("/customer") {
            get {
                call.respond(customerStorage)
            }
        }
    }

}
