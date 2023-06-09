package pe.edu.unmsm.backend.report;

import java.time.LocalDateTime;
import java.util.List;

public interface ReportService {

    List<AccountStatement> getAccountStatement(Long customerId, LocalDateTime startDate, LocalDateTime endDate);

}
