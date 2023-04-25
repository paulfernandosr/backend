package pe.edu.unmsm.backend.shared.exception;

import pe.edu.unmsm.backend.shared.Constants;

public class CustomerNotFoundException extends DomainException {

    public CustomerNotFoundException(Long id) {
        super(Constants.CUSTOMER_NOT_FOUND + id);
    }

}
