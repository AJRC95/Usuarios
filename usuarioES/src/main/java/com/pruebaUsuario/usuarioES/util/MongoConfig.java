/**
 * 
 */
package com.pruebaUsuario.usuarioES.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//import com.mongodb.client.MongoClient;

import com.mongodb.MongoClient;

/**
 * @author Anggie JRC
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.pruebaUsuario.usuarioES" })
@EnableMongoRepositories(basePackages = { "com.pruebaUsuario.usuarioES" })
public class MongoConfig {
	@Bean
	public MongoDbFactory mongoDbFactory() {
		MongoClient mongoClient = new MongoClient("localhost", 27027);
		return new SimpleMongoDbFactory(mongoClient, "db");
	}

	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		return mongoTemplate;
	}
}
