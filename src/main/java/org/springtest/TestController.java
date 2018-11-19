package org.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping(path = "search")
    public Mono<String> search(@RequestParam(value = "query") String query) {
        if (Objects.isNull(query) || query.isEmpty()) {
            return Mono.empty();
        }
        return Mono.just("result: " + query);
    }

}

