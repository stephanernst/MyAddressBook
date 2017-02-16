/*
import static org.assertj.core.api.Assertions.assertThat;

import AddressBook.Application;
import AddressBook.BuddyInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * Created by stephanernst on 2/16/2017.
 */
/*
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addBuddy() {
        BuddyInfo buddy = new BuddyInfo("Aboud", "6134498327");
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:"+port+"/", buddy, String.class);
        assertThat(response.getStatusCode().equals(HttpStatus.CREATED));
    }

   @Test
    public void deleteBuddy() {
        BuddyInfo buddy = new BuddyInfo("Aboud", "6134498327");
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:"+port+"/", buddy, String.class);
        assertThat(response.getStatusCode().equals(HttpStatus.NOT_FOUND));
    }

    @Test
    public void addBuddyToAddressBook() {
        BuddyInfo buddy = new BuddyInfo("Aboud", "6134498327");
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:"+port+"/", buddy, String.class);
        assertThat(response.getStatusCode().equals(HttpStatus.CREATED));
    }

    @Test
    public void removeBuddyFromAddressBook() {
        BuddyInfo buddy = new BuddyInfo("Aboud", "6134498327");
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:"+port+"/", buddy, String.class);
        assertThat(response.getStatusCode().equals(HttpStatus.CREATED));
    }
}*/
