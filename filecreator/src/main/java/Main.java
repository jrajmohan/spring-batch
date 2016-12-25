import org.springframework.boot.SpringApplication;

/**
 * Created by Raj on 12/24/16.
 */
public class Main {
    public static void main(String [] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(
                BatchConfiguration.class, args)));
    }
}
