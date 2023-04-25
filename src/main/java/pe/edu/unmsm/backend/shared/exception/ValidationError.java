package pe.edu.unmsm.backend.shared.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ValidationError {
    private final String field;
    private final String message;
}
