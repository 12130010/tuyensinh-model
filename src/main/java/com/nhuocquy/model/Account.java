package com.nhuocquy.model;

import java.util.ArrayList;
import java.util.List;


public class Account  {
	private long idAcc;
	private String name;
	private String username;
	private String password;
	private List<Friend> listFrs;
	private List<Conversation> conversations;

	public Account() {
		listFrs = new ArrayList<Friend>();
		conversations = new ArrayList<Conversation>();
	}

	public Account(long idAcc, String name, List<Friend> listFrs) {
		super();
		this.idAcc = idAcc;
		this.name = name;
		this.listFrs = listFrs;
	}

	public long getIdAcc() {
		return idAcc;
	}

	public void setIdAcc(long idAcc) {
		this.idAcc = idAcc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Friend> getListFrs() {
		return listFrs;
	}

	public void setListFrs(List<Friend> listFrs) {
		this.listFrs = listFrs;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Conversation> getConversations() {
		return conversations;
	}

	public void setConversations(List<Conversation> conversations) {
		this.conversations = conversations;
	}

	@Override
	public String toString() {
		return "Account [idAcc=" + idAcc + ", name=" + name + ", username="
				+ username + ", password=" + password + ", listFrs=" + listFrs
				+ ", conversations=" + conversations + "]";
	}

	
	

}
