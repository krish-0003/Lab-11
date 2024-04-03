package com.example.lab11;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class numberControllerHttpTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sendGetRequestToDouble() {
        ResponseEntity<Integer> response = restTemplate.getForEntity("/double?number={number}", Integer.class, 3);
        assertThat(response.getBody()).isEqualTo(6);
    }
}
