package com.nhuocquy.model;

import java.io.Serializable;
import java.util.Date;

public class MessageChat implements Serializable {
	private static final long serialVersionUID = 4855247675318069736L;
	private long idMes;
	private String text;
	private Date date;
	private long idConversation;
//	private long idSender;
//	private String fromName;
	private Friend sender;

	public MessageChat() {
	}

//	public MessageChat(long idMes, long idSender, String fromName, String text,
//			Date date) {
//		super();
//		this.idMes = idMes;
//		this.idSender = idSender;
//		this.fromName = fromName;
//		this.text = text;
//		this.date = date;
//	}

	public MessageChat(long idMes, String text, Date date, long idConversation,
			Friend sender) {
		this.idMes = idMes;
		this.text = text;
		this.date = date;
		this.idConversation = idConversation;
		this.sender = sender;
	}

	public Friend getSender() {
		return sender;
	}

	public void setSender(Friend sender) {
		this.sender = sender;
	}

	public long getIdMes() {
		return idMes;
	}

	public void setIdMes(long idMes) {
		this.idMes = idMes;
	}

	public long getIdSender() {
		return sender.getIdFriend();
	}

	public void setIdSender(long idSender) {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFromName() {
		return sender.getName();
	}

	public void setFromName(String fromName) {
	}

	public long getIdConversation() {
		return idConversation;
	}

	public void setIdConversation(long idConversation) {
		this.idConversation = idConversation;
	}
	
}
