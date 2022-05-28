package com.kuba.customer

import lombok.AllArgsConstructor
import lombok.extern.slf4j.Slf4j
import com.kuba.clients.fraud.FraudClient
import com.kuba.clients.fraud.FraudCheckResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
class CustomerController(
    customerRepository:CustomerRepository,
    fraudClient: FraudClient) {

    private val customerService = CustomerService(customerRepository, fraudClient)

    @PostMapping
    fun registerCustomer(@RequestBody customerRegistrationRequest: CustomerResponse) {
        print("new customer registration $customerRegistrationRequest")
        customerService.registerCustomer(customerRegistrationRequest)
    }

    @GetMapping("{id}")
    fun readCustomer(@PathVariable id: Int): Customer {
        val customer = customerService.readCustomer(id)

        print("$customer found")
        return customer.get()
    }
}