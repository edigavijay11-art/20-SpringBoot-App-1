package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbWebApplication {

	private Map<String,Object> cache = new HasMap<String,Object>

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int a=10;
	}
	//HIS-301 changes
	public void loadDataToCache(){
	   //logic
        }

}
