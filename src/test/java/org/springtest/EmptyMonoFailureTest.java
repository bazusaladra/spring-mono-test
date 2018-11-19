package org.springtest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.Set;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@RunWith(SpringRunner.class)
public class EmptyMonoFailureTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void testMono() {

        String actualEmptyResult = restTemplate.getForObject("/api/search?query=", String.class);
        String actualFooResult = restTemplate.getForObject("/api/search?query=foo", String.class);

        Assert.assertNull(actualEmptyResult);
        Assert.assertEquals("result: foo", actualFooResult);
    }


}
