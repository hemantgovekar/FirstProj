package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> Topics() {
        return Arrays.asList(
                new Topic("1", "Spring", "Spring Tutorial"),
                new Topic("2", "ASP.Net", "ASP.Net  Tutorial"),
                new Topic("3", "ASP.Net MVC", "MVC Tutorial"),
                new Topic("4", "React Js", "React Js Tutorial")
        );
    }
}