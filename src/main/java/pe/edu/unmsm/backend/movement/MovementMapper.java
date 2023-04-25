package pe.edu.unmsm.backend.movement;

import pe.edu.unmsm.backend.account.AccountMapper;
import pe.edu.unmsm.backend.shared.Constants;

public class MovementMapper {

    private MovementMapper() {
        throw new IllegalStateException(Constants.UTILITY_CLASS);
    }

    public static Movement toMovement(MovementEntity movementEntity) {
        return Movement.builder()
                .movementId(movementEntity.getMovementId())
                .date(movementEntity.getDate())
                .movementType(movementEntity.getMovementType().name())
                .value(movementEntity.getValue())
                .balance(movementEntity.getBalance())
                .account(AccountMapper.toAccount(movementEntity.getAccount()))
                .build();
    }

    public static MovementEntity toMovementEntity(Movement movement) {
        return MovementEntity.builder()
                .movementId(movement.getMovementId())
                .date(movement.getDate())
                .movementType(MovementType.valueOf(movement.getMovementType()))
                .value(movement.getValue())
                .balance(movement.getBalance())
                .account(AccountMapper.toAccountEntity(movement.getAccount()))
                .build();
    }

}
