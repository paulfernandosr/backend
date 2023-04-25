package pe.edu.unmsm.backend.customer;

import pe.edu.unmsm.backend.shared.Constants;

public class CustomerMapper {

    private CustomerMapper() {
        throw new IllegalStateException(Constants.UTILITY_CLASS);
    }

    public static Customer toCustomer(CustomerEntity customerEntity) {
        return Customer.builder()
                .customerId(customerEntity.getPersonId())
                .name(customerEntity.getName())
                .gender(customerEntity.getGender().name())
                .age(customerEntity.getAge())
                .dni(customerEntity.getDni())
                .address(customerEntity.getAddress())
                .telephone(customerEntity.getTelephone())
                .password(customerEntity.getPassword())
                .status(customerEntity.getStatus())
                .build();
    }

    public static CustomerEntity toCustomerEntity(Customer customer) {
        return CustomerEntity.builder()
                .personId(customer.getCustomerId())
                .name(customer.getName())
                .gender(Gender.valueOf(customer.getGender()))
                .age(customer.getAge())
                .dni(customer.getDni())
                .address(customer.getAddress())
                .telephone(customer.getTelephone())
                .password(customer.getPassword())
                .status(customer.getStatus())
                .build();
    }

}
