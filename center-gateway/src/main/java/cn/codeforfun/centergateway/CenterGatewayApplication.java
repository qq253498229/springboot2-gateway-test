package cn.codeforfun.centergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.context.annotation.Bean;

/**
 * @author wangbin
 */
@SpringBootApplication
public class CenterGatewayApplication {

  @Bean
  DiscoveryClientRouteDefinitionLocator discoveryClientRouteDefinitionLocator(DiscoveryClient dc) {
    return new DiscoveryClientRouteDefinitionLocator(dc);
  }



  /*@Bean
  RouteLocator routeLocator() {

    return Routes
            .locator()
            .route("start")
            .predicate(path("/start"))
            .uri("http://start.spring.io:80/")
            .route("user")
            .predicate(path("/user"))
            .uri("user://service-user/findAll")
            .build();
  }*/

  public static void main(String[] args) {
    SpringApplication.run(CenterGatewayApplication.class, args);
  }
}
