package pe.edu.unmsm.backend.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pe.edu.unmsm.backend.customer.Customer;
import pe.edu.unmsm.backend.shared.validator.EnumValidator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@ToString
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {

    private final Long accountId;

    @Size(min = 20, max = 20)
    private final String accountNumber;

    @NotNull
    @EnumValidator(enumClass = AccountType.class)
    private final String accountType;

    @Min(0)
    private final Double initialBalance;

    private final Boolean status;
    private final Customer customer;

}
