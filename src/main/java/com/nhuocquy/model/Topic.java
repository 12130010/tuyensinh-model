package com.nhuocquy.model;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	private long idTopic;
	private String title;
	private List<Post> listPosts;
	private GroupTopic groupTopic;
	private boolean isCheck;
	public Topic() {
		listPosts = new ArrayList<Post>();
	}
	public Topic( String tittle, List<Post> listPosts) {
		super();
		this.title = tittle;
		this.listPosts = listPosts;
	}
	public long getIdTopic() {
		return idTopic;
	}
	public void setIdTopic(long idTopic) {
		this.idTopic = idTopic;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Post> getListPosts() {
		return listPosts;
	}
	public void setListPosts(List<Post> listPosts) {
		this.listPosts = listPosts;
	}
	public void addPost(Post p){
		listPosts.add(p);
	}
	public GroupTopic getGroupTopic() {
		return groupTopic;
	}
	public void setGroupTopic(GroupTopic groupTopic) {
		this.groupTopic = groupTopic;
	}
	public boolean isCheck() {
		return isCheck;
	}
	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}
	
}
