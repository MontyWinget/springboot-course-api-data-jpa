package com.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * @Service annotation marks this class as a Spring business service.
 * Creates its instance at application boot up, registers it and stores in memory.
*/
@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Sprign framework Description"),
			new Topic("Java", "Core Java", "Core Java Description"),
			new Topic("JavaScript", "JavaScript Language", "JavaScript Description")
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
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
	

}
