package pe.edu.unmsm.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.edu.unmsm.backend.customer.CustomerEntity;
import pe.edu.unmsm.backend.customer.CustomerRepo;
import pe.edu.unmsm.backend.customer.Gender;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepo repo) {
        return args -> {
            CustomerEntity customer1 = CustomerEntity.builder()
                    .name("Jose Carlos")
                    .gender(Gender.MASCULINO)
                    .age(23)
                    .dni("12345678")
                    .address("Av. Las Palmeras")
                    .telephone("956766843")
                    .password("12345")
                    .status(true)
                    .build();
            CustomerEntity customer2 = CustomerEntity.builder()
                    .name("Mario Lima")
                    .gender(Gender.MASCULINO)
                    .age(23)
                    .dni("12345679")
                    .address("Av. Las Palmeras")
                    .telephone("956766842")
                    .password("12345")
                    .status(true)
                    .build();
            repo.save(customer1);
            repo.save(customer2);
        };
    }

}
