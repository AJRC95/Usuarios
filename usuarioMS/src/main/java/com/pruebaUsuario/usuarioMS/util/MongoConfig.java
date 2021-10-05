/**
 * 
 */
package com.pruebaUsuario.usuarioMS.util;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
//import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClient;

/**
 * @author Anggie JRC
 *
 */

@Configuration
@EnableMongoRepositories(basePackages = "com.pruebaUsuario.repository")
@PropertySource("classpath:application.properties")
public class MongoConfig extends AbstractMongoClientConfiguration {

	@Value("${spring.data.mongodb.database}")
	private String database;
	@Value("${spring.data.mongodb.host}")
	private String host;
	@Value("${spring.data.mongodb.port}")
	private String port;
	@Value("${spring.data.mongodb.username}")
	private String username;
	@Value("${spring.data.mongodb.password}")
	private String password;

	@Override
	protected String getDatabaseName() {
		return database;
	}

	@Override
	protected String getMappingBasePackage() {
		return "com.frugalis.entity.mongo";
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoClient(), getDatabaseName());
	}

	@Override
	@Bean
	public MongoClient mongoClient() {

		List<MongoCredential> allCred = new ArrayList<MongoCredential>();
		System.out
				.println("???????????????????" + username + " " + database + " " + password + " " + host + " " + port);
		allCred.add(MongoCredential.createCredential(username, database, password.toCharArray()));
		MongoClient client = null;
		//client = ((new ServerAddress(host, Integer.parseInt(port))), allCred);
		//((MongoTemplate) client).setWriteConcern(WriteConcern.ACKNOWLEDGED);

		return client;
	}

/*@Configuration
public class MongoConfig {

    @Autowired
    private Environment env;

    @Bean
    public MongoDbFactory mongoDbFactory() {
        return new SimpleMongoDbFactory(new MongoClientURI(env.getProperty("spring.data.mongodb.uri")));
    }

	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

		return mongoTemplate;

   }

}*/
	
}
