package pe.edu.unmsm.backend.customer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class CustomerPassword {

    private final Long customerId;
    private final String password;

}
