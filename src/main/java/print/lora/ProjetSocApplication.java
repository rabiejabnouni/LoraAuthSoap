package print.lora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "print.lora")  // Ajouter pour scanner le bon package
public class ProjetSocApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetSocApplication.class, args);
		System.out.println("heloo word");
	}

}
