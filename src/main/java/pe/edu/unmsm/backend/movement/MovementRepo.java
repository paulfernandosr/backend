package pe.edu.unmsm.backend.movement;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.unmsm.backend.account.AccountEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface MovementRepo extends JpaRepository<MovementEntity, Long> {

    List<MovementEntity> findByAccount(AccountEntity account);

    List<MovementEntity> findByAccountAndDateBetween(AccountEntity account, LocalDateTime startDate, LocalDateTime endDate);

}
