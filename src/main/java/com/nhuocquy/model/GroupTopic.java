package com.nhuocquy.model;

import java.util.ArrayList;
import java.util.List;

public class GroupTopic {
	private long idGroupTopic;
	private List<Topic> lisTopics;
	private String groupName;
	public GroupTopic() {
		lisTopics = new ArrayList<Topic>();
	}
	
	public GroupTopic(List<Topic> lisTopics, String groupName) {
		super();
		this.lisTopics = lisTopics;
		this.groupName = groupName;
	}

	public long getIdGroupTopic() {
		return idGroupTopic;
	}
	public void setIdGroupTopic(long idGroupTopic) {
		this.idGroupTopic = idGroupTopic;
	}
	public List<Topic> getLisTopics() {
		return lisTopics;
	}
	public void setLisTopics(List<Topic> lisTopics) {
		this.lisTopics = lisTopics;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void addTopic(Topic top){
		lisTopics.add(top);
	}
}
