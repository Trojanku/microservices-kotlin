package com.kuba.fraud

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class FraudHistory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int? = null,

    @Column(nullable = false)
    private var customerId: Int? = null,

    @Column(nullable = false)
    private var isFraudster: Boolean? = null,

    @Column(nullable = false)
    private var date: LocalDateTime? = null
)