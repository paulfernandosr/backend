package pe.edu.unmsm.backend.account;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class AccountBalance {

    private final Long accountId;
    private final Double initialBalance;

}
