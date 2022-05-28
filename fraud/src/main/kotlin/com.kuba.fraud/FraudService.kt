package com.kuba.fraud

import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class FraudService(var fraudHistoryRepository: FraudHistoryRepository) {

    // TODO: check for real
    var isFraudster = false

    fun isFraudster(id: Int): Boolean {
        val fraudHistory = FraudHistory(
            customerId = id,
            date = LocalDateTime.now(),
            isFraudster = isFraudster
        )
        fraudHistoryRepository.save(fraudHistory)
        return isFraudster
    }
}