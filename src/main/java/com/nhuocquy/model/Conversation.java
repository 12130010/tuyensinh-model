package com.nhuocquy.model;

import java.util.ArrayList;
import java.util.List;


public class Conversation {
	private boolean readed;
	private long idCon;
	
	private List<Friend> friends;
	private List<MessageChat> listMes;
	
	public Conversation() {
		friends = new ArrayList<Friend>();
		listMes = new ArrayList<MessageChat>();
	}

	public Conversation(long idCon, List<Friend> friends, List<MessageChat> listMes) {
		super();
		this.idCon = idCon;
		this.friends = friends;
		this.listMes = listMes;
	}

	public long getIdCon() {
		return idCon;
	}

	public void setIdCon(long idCon) {
		this.idCon = idCon;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	public List<MessageChat> getListMes() {
		return listMes;
	}

	public void setListMes(List<MessageChat> listMes) {
		this.listMes = listMes;
	}
	public String selectNames(){
		StringBuilder sb = new StringBuilder();
		for (Friend f : friends) {
			sb.append(f.getName());
			sb.append(", ");
		}
		sb.delete(sb.length() -1, sb.length());
		
		return sb.toString();
	}
	public boolean containIDFri(long idFri){
		return friends.contains(new Friend(idFri, ""));
	}
	public boolean addMessageChat(MessageChat messageChat){
		return listMes.add(messageChat);
	}

	@Override
	public String toString() {
		return "Conversation [readed=" + readed + ", idCon=" + idCon
				+ ", friends=" + friends + ", listMes=" + listMes + "]";
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	
}
