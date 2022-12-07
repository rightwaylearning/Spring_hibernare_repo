package dharma_production.kesari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import production_movie_list.ListOfMovies;
import profile_info.kJadhav;

@SpringBootApplication
@ComponentScan( basePackages = {"dharma_production.kesari","production_movie_list","profile_info"})
@PropertySource("classpath:application.properties")
public class KesariApplication {
	
	
	@Bean
	public ListOfMovies getObj(){
		String[] list = {"test1","test2"};
		return new ListOfMovies(list);
	}
		

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KesariApplication.class, args);
	   
		ListOfMovies listBean = ctx.getBean(ListOfMovies.class);
		
//		for (String string : listBean.list) {
//			System.out.println(string);
//		}
		
		kJadhav kj = ctx.getBean(kJadhav.class);
		System.out.println(kj);
	}

}
