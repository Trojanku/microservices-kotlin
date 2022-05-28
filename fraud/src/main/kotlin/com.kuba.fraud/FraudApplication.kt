package com.kuba.fraud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FraudApplication {
}

fun main(vararg args: String) {
    runApplication<FraudApplication>(*args)
}