package com.nhuocquy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private long idPost;
	private Friend poster;
	private Date datePost;
	private String context;
	private List<String> images;
	private Topic topic;
	private int clike, cdislike;
	public Post() {
		images = new ArrayList<String>();
	}
	
	public Post(Friend poster, Date datePost, String context,
			List<String> images) {
		super();
		this.poster = poster;
		this.datePost = datePost;
		this.context = context;
		this.images = images;
	}

	public long getIdPost() {
		return idPost;
	}
	public void setIdPost(long idPost) {
		this.idPost = idPost;
	}
	public Friend getPoster() {
		return poster;
	}
	public void setPoster(Friend poster) {
		this.poster = poster;
	}
	public Date getDatePost() {
		return datePost;
	}
	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	
	public int getClike() {
		return clike;
	}

	public void setClike(int clike) {
		this.clike = clike;
	}

	public int getCdislike() {
		return cdislike;
	}

	public void setCdislike(int cdislike) {
		this.cdislike = cdislike;
	}

	public void like(){
		clike++;
	}
	public void dislike(){
		cdislike++;
	}
	
}
