package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable {

	private Connection con;
	// con = DbUtil.getConnection();

	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {

		try {
			if (con != null) {
				con.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// add new candidate
	public int addCandidate(Candidate candidate) throws SQLException {
		// String sal="insert into candidates values(default,'Geeta','AAP',30);"

		int votes = candidate.getVotes();
		String name = candidate.getName();
		String party = candidate.getParty();
		// int id=candidate.getId();

		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, votes);

			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// delete given candidates
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// update candidate
	public int updateCandidate(Candidate candidate) throws SQLException {
		
		String sql = "UPDATE candidates SET votes=?,name=?,party=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1,candidate.getVotes());
			stmt.setString(2,candidate.getName());
			stmt.setString(3,candidate.getParty());
			stmt.setInt(4,candidate.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
		
	}

	// get all candidates
	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// increment candidate vote
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// get all candidates of given party
	public List<Candidate> findByParty(String givenParty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// get partywise vote count
	public List<PartyVotes> getPartywiseVoteCount() throws SQLException {
		
		List<PartyVotes>arr=new ArrayList<PartyVotes>();
		
		String sql="SELECT PARTY,SUM(votes) AS Total FROM candidates GROUP BY PARTY";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					
					String party = rs.getString("party");
					int totalVotes = rs.getInt("Total");
					PartyVotes pv = new PartyVotes(party,totalVotes);
					arr.add(pv);
				}
			} // rs.close();
		} // stmt.close();
		return arr;
	}
	
	
	
	
	
	

}
