package com.ch5;

public class MyUser {
	private Integer uid;
	private String uname;
	private String usex;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String toString() {
		return "myUser [uid=" + uid + ",uname=" + uname + ",usex=" + usex + "]";

	}
}
