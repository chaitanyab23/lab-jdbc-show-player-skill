package controller;

import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main {
	public static void main(String[] args) throws Exception {
		// object to fetch all skills
		SkillDAO skilldao = new SkillDAO();

		// arraylist to add the skill
		List<Skill> skills = skilldao.listAllSkills();

		// printing all the skill
		System.out.println("List of all Skill");
		System.out.println();
		for (int i = 0; i < skills.size(); i++) {
			System.out.println((i + 1) + ". " + skills.get(i).getSkillName());
		}

	}
}
