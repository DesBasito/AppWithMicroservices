package kg.manurov.services;

import kg.manurov.entities.Customer;
import kg.manurov.dto.CustomerRegistrationRequest;
import kg.manurov.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();
        //todo: check if email valid
        //todo: check if email not taken
        customerRepository.save(customer);
    }
}
