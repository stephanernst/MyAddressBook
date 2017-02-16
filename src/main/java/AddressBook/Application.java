package AddressBook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by stephanernst on 2/9/2017.
 */
@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new BuddyInfo("Jack", "6137778998"));
            repository.save(new BuddyInfo("Chloe", "6134448798"));
            repository.save(new BuddyInfo("Kim", "6138765544"));
            repository.save(new BuddyInfo("David", "6137238998"));
            repository.save(new BuddyInfo("Michelle", "6132345674"));

            // fetch all customers
            log.info("Customers found with fidAll():\");\n" +
                    "            log.info(\"---------------n----------------");
            for (BuddyInfo buddy : repository.findByName("Jack")) {
                log.info(buddy.toString());
            }
            log.info("");
        };
    }
}
