package com.imran.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imran.model.Topic;

@Service
public class TopicService {
	
	public List<Topic> list(){
		return topics;
	}
	
	public Topic topicById(Integer id) {
		Topic topic = null;
		topic =  topics.stream().filter(t ->
		   t.getId().equals(id)).findFirst().get();
		
		return topic;
	}
	
	public String addTopic(Topic topic) {
		if(topic != null) {
			topics.add(topic);
			return "Successfully Topic add";
		}else {
			return "Topic adding faild";
		}
	}
	
	public void updateTopic(Integer id, Topic topic) {
		for(int i = 0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void delateTopic(Integer id) {
		topics.removeIf(t ->
		         t.getId().equals(id));
	}
	
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
				 new Topic(1, "Java", "This is a Java topic"),
				 new Topic(2, "PhP", "This is a php topic"),
				 new Topic(3, "CCNA", "This is a CCNA topic"),
				 new Topic(3, "CCNP", "This is a CCNP topic")
				 ));	

}
