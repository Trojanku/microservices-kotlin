package com.kuba.customer;

import lombok.Builder
import javax.persistence.*

@Entity
@Builder
class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int = 0,
    @Column(nullable = false)
     var firstName: String,
    @Column(nullable = false)
     var lastName: String,
    @Column(nullable = false)
     var email: String,
) {
    constructor() : this(0, "", "", "") {
    }
    fun getID(): Int {return id}
}
