package com.iluwatar.mediator.enums;

/**
 * 
 * Action enumeration.
 *
 */
public enum EAction {
	HUNT("hunted a rabbit", "arrives for dinner"),

	TALE("tells a tale", "comes to listen"),

	GOLD("found gold", "takes his share of the gold"),

	ENEMY("spotted enemies", "runs for cover"),

	NONE("", "");

	private String title;
	private String description;

	EAction(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String toString() {
		return title;
	}
}
