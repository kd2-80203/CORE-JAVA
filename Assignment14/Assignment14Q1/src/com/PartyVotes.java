package com;

public class PartyVotes {
	
	private String PartyName;
	private int totalVotes;
	
	
	public PartyVotes() {
		
	}


	public PartyVotes(String partyName, int totalVotes) {
		
		PartyName = partyName;
		this.totalVotes = totalVotes;
	}


	public String getPartyName() {
		return PartyName;
	}


	public void setPartyName(String partyName) {
		PartyName = partyName;
	}


	public int getTotalVotes() {
		return totalVotes;
	}


	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}


	@Override
	public String toString() {
		return "PartyVotes [PartyName=" + PartyName + ", totalVotes=" + totalVotes + "]";
	}
	
	

}
