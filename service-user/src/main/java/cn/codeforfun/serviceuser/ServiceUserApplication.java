package cn.codeforfun.serviceuser;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

/**
 * @author wangbin
 */
@SpringBootApplication
public class ServiceUserApplication {

  @Bean
  ApplicationRunner init(UserDao userDao) {
    userDao.deleteAll();

    return args -> Flux.just("小强", "小王", "小张", "小明").map(name -> new User(null, name)).map(userDao::save).subscribe(System.out::println);
  }

  public static void main(String[] args) {
    SpringApplication.run(ServiceUserApplication.class, args);
  }
}
