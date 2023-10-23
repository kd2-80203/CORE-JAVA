package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023 Author: Nilesh Ghule
 * <nilesh@sunbeaminfo.com> Time: 2023-10-22 12:53
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id to be deleted: ");
			int id = sc.nextInt();
			int cnt = dao.deleteById(id);
			System.out.println("Candidates deleted: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}

		try (CandidateDao dao = new CandidateDao()) {
			List<Candidate> list = dao.findAll();
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}

		try (CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter party: ");
			String party = sc.next();
			List<Candidate> list = dao.findByParty(party);
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}

		try (CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id (to vote): ");
			int candidateId = sc.nextInt();
			int cnt = dao.incrementVote(candidateId);
			System.out.println("Rows updated: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		// ------------------------------
		try (CandidateDao dao = new CandidateDao()) {
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter votes");
			int votes = sc.nextInt();
			System.out.println("Enter party");
			String party = sc.next();
			Candidate candidate = new Candidate();
			candidate.setName(name);
			candidate.setParty(party);
			candidate.setVotes(votes);

			int ctn = dao.addCandidate(candidate);
			System.out.println("Candidates added succesfully : no rows affected =" + ctn);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (CandidateDao dao = new CandidateDao()) {
			List<PartyVotes> arr = new ArrayList<PartyVotes>();

			arr = dao.getPartywiseVoteCount();
			for (PartyVotes pv : arr) {
				System.out.println(pv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (CandidateDao dao = new CandidateDao()) {

			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter party");
			String party = sc.next();
			System.out.println("Enter the votes");
			int votes = sc.nextInt();

			Candidate c = new Candidate();
			c.setId(id);
			c.setName(name);
			c.setParty(party);
			c.setVotes(votes);

			int cnt = dao.updateCandidate(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
