package com.kuba.customer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableJpaRepositories("com.kuba.customer")
@EnableFeignClients("com.kuba.clients")
open class CustomerApplication {
}

fun main(vararg args: String) {
    runApplication<CustomerApplication>(*args)
}