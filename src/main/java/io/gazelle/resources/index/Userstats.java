package io.gazelle.resources.index;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Userstats {

	private Long uploaded;
	private Long downloaded;
	private double ratio;
	private double requiredratio;
	@XmlElement(name = "class")
	private String _class;

	/**
	 * 
	 * @return The uploaded
	 */
	public Long getUploaded() {
		return uploaded;
	}

	/**
	 * 
	 * @param uploaded
	 *            The uploaded
	 */
	public void setUploaded(Long uploaded) {
		this.uploaded = uploaded;
	}

	/**
	 * 
	 * @return The downloaded
	 */
	public Long getDownloaded() {
		return downloaded;
	}

	/**
	 * 
	 * @param downloaded
	 *            The downloaded
	 */
	public void setDownloaded(Long downloaded) {
		this.downloaded = downloaded;
	}

	/**
	 * 
	 * @return The ratio
	 */
	public double getRatio() {
		return ratio;
	}

	/**
	 * 
	 * @param ratio
	 *            The ratio
	 */
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	/**
	 * 
	 * @return The requiredratio
	 */
	public double getRequiredratio() {
		return requiredratio;
	}

	/**
	 * 
	 * @param requiredratio
	 *            The requiredratio
	 */
	public void setRequiredratio(double requiredratio) {
		this.requiredratio = requiredratio;
	}

	/**
	 * 
	 * @return The _class
	 */
	public String getClass_() {
		return _class;
	}

	/**
	 * 
	 * @param _class
	 *            The class
	 */
	public void setClass_(String _class) {
		this._class = _class;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
