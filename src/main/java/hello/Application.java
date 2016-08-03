package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
      /*  Result result = JUnitCore.runClasses(EmployeeRestService.class);
        for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());*/
    }
}
