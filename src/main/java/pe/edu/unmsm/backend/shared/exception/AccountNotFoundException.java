package pe.edu.unmsm.backend.shared.exception;

import pe.edu.unmsm.backend.shared.Constants;

public class AccountNotFoundException extends DomainException {

    public AccountNotFoundException(Long id) {
        super(Constants.ACCOUNT_NOT_FOUND + id);
    }

}
