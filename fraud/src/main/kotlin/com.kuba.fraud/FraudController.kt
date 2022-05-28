package com.kuba.fraud

import com.kuba.clients.fraud.FraudCheckResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/fraud")
class FraudController(fraudHistoryRepository: FraudHistoryRepository) {

    var fraudService = FraudService(fraudHistoryRepository)

    @GetMapping("/{id}")
    fun isFraudster(@PathVariable id: Int): FraudCheckResponse {
        println("Fraud check request for customer id: $id")
        return FraudCheckResponse(fraudService.isFraudster(id))
    }
}