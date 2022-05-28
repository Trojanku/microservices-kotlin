package com.kuba.customer

import com.kuba.clients.fraud.FraudClient
import lombok.AllArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
@AllArgsConstructor
class CustomerService(
    private val customerRepository:CustomerRepository,
    private val fraudClient: FraudClient) {

//    @Autowired
//    lateinit var customerRepository: CustomerRepository

//    @Autowired
//    private lateinit var fraudClient: FraudClient

    fun registerCustomer(customerRegistrationRequest: CustomerResponse) {
        val customer = Customer(
            firstName = customerRegistrationRequest.firstname,
            lastName = customerRegistrationRequest.lastname,
            email = customerRegistrationRequest.email)

        customerRepository.save(customer)

        val a = fraudClient.isFraudster(customer.getID())

        if (a.isFraudster) {
            throw IllegalStateException("fraudster")
        }
    }

    fun readCustomer(id: Int) =
        customerRepository.findById(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND,
            "Customer with given id does not exist")
}
