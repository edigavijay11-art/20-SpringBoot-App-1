package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbWebApplication {

	privat static final String REST_URL ="htps://www.equifax.com/getScores";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int a=10;
	}

	// HIS-200 related changes
	public void createNew(){
	   //logic goes here
	//update
	}

}
