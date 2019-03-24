package com.sony.hackaton.womenmusic.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.sony.hackaton.womenmusic.repository")
public class MongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String mongoURI;

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(mongo(), "heroku_49hzn6cc");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "heroku_49hzn6cc");
    }

    @Bean
    public MongoClient mongo() throws Exception {
        MongoClientURI uri = new MongoClientURI(mongoURI);

        return new MongoClient(uri);
    }
}