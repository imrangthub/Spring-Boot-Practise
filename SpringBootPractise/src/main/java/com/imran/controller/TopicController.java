package com.imran.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.imran.model.Topic;
import com.imran.service.TopicService;


@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/")
	public List<Topic> list(){
		return  topicService.list();
	}
	
	@RequestMapping("/edit/{id}")
	public Topic getTopic(@PathVariable Integer id) {
		return topicService.topicById(id);
		
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable Integer id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping("/delete/{id}")
	public void delateTopic(@PathVariable Integer id) {
		 topicService.delateTopic(id);
		
	}
	
	
	

}
