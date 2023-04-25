package pe.edu.unmsm.backend.shared.exception;

import pe.edu.unmsm.backend.shared.Constants;

public class MovementNotFoundException extends DomainException {

    public MovementNotFoundException(Long id) {
        super(Constants.MOVEMENT_NOT_FOUND + id);
    }

}
