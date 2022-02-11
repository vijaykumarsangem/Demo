package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ScriptbeesApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbctemp;

	public static void main(String[] args) {
		SpringApplication.run(ScriptbeesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
	String sql= "INSERT INTO trainee (id,name,email) VALUES("+" '110','vijay','vijay@mail.com')";
	 //String sql2="UPDATE trainee set email='vijay123@mail.com' WHERE id=110";
	// String sql3="delete from trainee where id=100 ";
	 int rows=jdbctemp.update(sql);
	 // jdbctemp.execute(sql2);
	// jdbctemp.execute(sql3);
	if(rows>0)
	 {
	   System.out.println("new row is added");
	 }
		 
		
	}

}
