package com.literalInjection;

public class CricketCoach{

	public String email, team;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Setting Email : " + email);
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setting Team : " + team);
		this.team = team;
	}
}
