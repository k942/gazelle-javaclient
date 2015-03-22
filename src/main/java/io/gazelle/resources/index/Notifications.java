package io.gazelle.resources.index;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Notifications {

	private int messages;
	private int notifications;
	private boolean newAnnouncement;
	private boolean newBlog;
	private boolean newSubscriptions;

	/**
	 * 
	 * @return The messages
	 */
	public int getMessages() {
		return messages;
	}

	/**
	 * 
	 * @param messages
	 *            The messages
	 */
	public void setMessages(int messages) {
		this.messages = messages;
	}

	/**
	 * 
	 * @return The notifications
	 */
	public int getNotifications() {
		return notifications;
	}

	/**
	 * 
	 * @param notifications
	 *            The notifications
	 */
	public void setNotifications(int notifications) {
		this.notifications = notifications;
	}

	/**
	 * 
	 * @return The newAnnouncement
	 */
	public boolean isNewAnnouncement() {
		return newAnnouncement;
	}

	/**
	 * 
	 * @param newAnnouncement
	 *            The newAnnouncement
	 */
	public void setNewAnnouncement(boolean newAnnouncement) {
		this.newAnnouncement = newAnnouncement;
	}

	/**
	 * 
	 * @return The newBlog
	 */
	public boolean isNewBlog() {
		return newBlog;
	}

	/**
	 * 
	 * @param newBlog
	 *            The newBlog
	 */
	public void setNewBlog(boolean newBlog) {
		this.newBlog = newBlog;
	}

	/**
	 * @return the newSubscriptions
	 */
	public boolean isNewSubscriptions() {
		return newSubscriptions;
	}

	/**
	 * @param newSubscriptions
	 *            the newSubscriptions to set
	 */
	public void setNewSubscriptions(boolean newSubscriptions) {
		this.newSubscriptions = newSubscriptions;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
