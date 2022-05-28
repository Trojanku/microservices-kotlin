package com.kuba.clients.fraud

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name =  "fraud",
    url = "http://localhost:8081"
)
interface FraudClient {
    @GetMapping("/api/v1/fraud/{id}")
    fun isFraudster(@PathVariable id: Int): FraudCheckResponse
}