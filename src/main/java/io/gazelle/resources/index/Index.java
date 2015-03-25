package io.gazelle.resources.index;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Index {

	private String username;
	private int id;
	private String authkey;
	private String passkey;
	private Notifications notifications;
	private Userstats userstats;

	/**
	 * 
	 * @return The username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 *            The username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return The id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The authkey
	 */
	public String getAuthkey() {
		return authkey;
	}

	/**
	 * 
	 * @param authkey
	 *            The authkey
	 */
	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	/**
	 * 
	 * @return The passkey
	 */
	public String getPasskey() {
		return passkey;
	}

	/**
	 * 
	 * @param passkey
	 *            The passkey
	 */
	public void setPasskey(String passkey) {
		this.passkey = passkey;
	}

	/**
	 * 
	 * @return The notifications
	 */
	public Notifications getNotifications() {
		return notifications;
	}

	/**
	 * 
	 * @param notifications
	 *            The notifications
	 */
	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}

	/**
	 * 
	 * @return The userstats
	 */
	public Userstats getUserstats() {
		return userstats;
	}

	/**
	 * 
	 * @param userstats
	 *            The userstats
	 */
	public void setUserstats(Userstats userstats) {
		this.userstats = userstats;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
