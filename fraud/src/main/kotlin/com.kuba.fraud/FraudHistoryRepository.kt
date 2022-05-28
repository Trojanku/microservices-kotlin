package com.kuba.fraud

import org.springframework.data.jpa.repository.JpaRepository

interface FraudHistoryRepository: JpaRepository<FraudHistory, Int> {
}