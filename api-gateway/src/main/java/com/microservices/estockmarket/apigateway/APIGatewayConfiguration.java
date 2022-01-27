/*
 * package com.microservices.estockmarket.apigateway;
 * 
 * import org.springframework.cloud.gateway.route.RouteLocator; import
 * org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * @Configuration public class APIGatewayConfiguration {
 * 
 * @Bean public RouteLocator gatewayRouter(RouteLocatorBuilder builder) { return
 * builder.routes() .route(p -> p.path("/limits-service/**").filters(f ->
 * f.stripPrefix(1)).uri("lb://limits-service")) .route(p -> p.path("/get")
 * .filters(f -> f.addRequestHeader("MyHeader",
 * "MyHeaderData").addRequestParameter("MyParam", "MyValue"))
 * .uri("http://httpbin.org:80")) .route("company-service",p ->
 * p.path("/company-service/**").filters(f ->
 * f.stripPrefix(1)).uri("lb://company-service")) .route("stock-service",p ->
 * p.path("/stock-service/**").filters(f ->
 * f.stripPrefix(1)).uri("lb://stock-service")) .build(); }
 * 
 * }
 */
