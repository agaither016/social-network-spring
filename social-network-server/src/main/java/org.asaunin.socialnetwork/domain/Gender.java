package org.asaunin.socialnetwork.domain;

public enum Gender {

	UNDEFINED(0), MALE(1), FEMALE(2);

	private int id;

	Gender(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static Gender getGender(Integer id) {
		if (id == null)
			return null;
		for (Gender g : values()) {
			if (g.getId() == id)
				return g;
		}
		return null;
	}
}
