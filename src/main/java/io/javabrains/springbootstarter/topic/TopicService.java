package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Spring", "Spring Tutorial - Hemant"),
            new Topic("2", "ASP.Net", "ASP.Net  Tutorial"),
            new Topic("3", "ASP.Net MVC", "MVC Tutorial"),
            new Topic("4", "React Js", "React Js Tutorial")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }


    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void DeleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
