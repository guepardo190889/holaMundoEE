package com.blackdeath.holaMundoEE.bean;

import java.io.Serializable;

/**
 * @author Seth Luis
 *
 */
public class Login implements Serializable {

	private static final long serialVersionUID = -773470293053750232L;

	private String name;
	private String password;

	public Login() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
