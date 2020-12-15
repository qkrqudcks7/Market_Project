package project.traditionalmarket;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class TraditionalmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraditionalmarketApplication.class, args);
    }

    @Bean
    JPAQueryFactory queryFactory(EntityManager em){
        return new JPAQueryFactory(em);
    }

}
