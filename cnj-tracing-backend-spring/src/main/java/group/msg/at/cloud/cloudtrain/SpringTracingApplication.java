package group.msg.at.cloud.cloudtrain;

import group.msg.at.cloud.common.observability.CommonObservability;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Point of entry for this Spring Boot application.
 */
@SpringBootApplication(scanBasePackageClasses = {SpringTracingApplication.class, CommonObservability.class})
public class SpringTracingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTracingApplication.class, args);
    }
}
