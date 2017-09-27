package de.be.aff;

import de.be.aff.domain.Journal;
import de.be.aff.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication// @Configuration + @ComponenetScan
// + @EnableAutoConfiguration - reads from classpath, annotations, configuration files and  uses correct technology
public class ProSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProSpringBootApplication.class, args);
	}


	@Bean
	InitializingBean prepareDatabase(JournalRepository repo)
	{
		return()->
		{
			repo.save(new Journal("title 1", "title 1 summary", "01/01/2018"));
			repo.save(new Journal("title 2", "title 2 summary", "02/02/2018"));
			repo.save(new Journal("title 3", "title 3 summary", "03/03/2018"));
		};
	}
}
