package com.example.shoot.models;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="matches")
public class MatchModel {
	@Id       									//pour dire que id est une clé primaire 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="MATCH_ID") 
	private Long id ; 
	private String teamOne ; 
	private String teamTwo ; 
	private int scoreOne ; 
	private int scoretwo ;
	
	public MatchModel() {
	}

	public MatchModel(String teamOne, String teamTwo, int scoreOne, int scoretwo) {
	
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.scoreOne = scoreOne;
		this.scoretwo = scoretwo;
	}

	public Long getId() {
		return id;
	}


	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public int getScoreOne() {
		return scoreOne;
	}

	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}

	public int getScoretwo() {
		return scoretwo;
	}

	public void setScoretwo(int scoretwo) {
		this.scoretwo = scoretwo;
	}

	@Override
	public String toString() {
		return "MatchModel [id=" + id + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", scoreOne=" + scoreOne
				+ ", scoretwo=" + scoretwo + "]";
	} 
	
	
	
	
	
	


	
	
	

}
