package pe.edu.unmsm.backend.movement;

import pe.edu.unmsm.backend.account.Account;

import java.time.LocalDateTime;
import java.util.List;

public interface MovementService {

    List<Movement> getAllMovements();
    Movement getMovementById(Long id);
    List<Movement> getMovementsByAccountId(Long accountId);
    List<Movement> getMovementsByAccountIdAndDateRange(Long accountId, LocalDateTime startDate, LocalDateTime endDate);
    Movement createMovement(Movement movement);
    Movement updateMovementValue(Long id, MovementValue movementValue);
    Movement updateMovement(Long id, Movement movement);
    void deleteMovementById(Long id);

}
