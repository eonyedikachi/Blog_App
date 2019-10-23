package com.blog.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.app.topic.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			
			new Topic("intro", "Introduction to Programming", "Short note on Programming"),
			new Topic("java", "Introduction to Java", "Short note on Java Data Types"),
			new Topic("javascript", "JavaScript Best Practice", "Best Practices for writing clean JavaScript codes")
			);
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
}
	
