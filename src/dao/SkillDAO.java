package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {
	public List<Skill> listAllSkills() throws Exception {

	// Arraylist to add skill to the list
	List<Skill> skills = new ArrayList<Skill>();
	
	//connection to the database
	Connection connection= ConnectionManager.getConnection();
	
	//statement to fetch all skills from database
	Statement statement= connection.createStatement();
	
	//store the fetch results
	ResultSet resultSet= statement.executeQuery("SELECT * FROM skill");
	
	//adding the skill to the list
	while(resultSet.next()) {
		Skill skill=new Skill(resultSet.getLong("id"),resultSet.getString("name"));
		skills.add(skill);
	}
	return skills;
	}

}
