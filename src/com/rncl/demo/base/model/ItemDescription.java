package com.rncl.demo.base.model;

import android.media.Image;

public class ItemDescription {

	private String name;
	private String description;
	private String githubUrl;
	private Image shotcut;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGithubUrl() {
		return githubUrl;
	}

	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}

	public Image getShotcut() {
		return shotcut;
	}

	public void setShotcut(Image shotcut) {
		this.shotcut = shotcut;
	}

}
