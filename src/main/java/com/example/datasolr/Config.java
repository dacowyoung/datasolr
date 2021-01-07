package com.example.datasolr;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * @program: datasolr
 * @description
 * @author: @C5315935
 * @create: 2020-12-30 17:05
 **/
@Configuration
@EnableSolrRepositories(basePackages = { "com.example.datasolr.repository" }, schemaCreationSupport = true)
@ComponentScan
public class Config {

    @Bean
    public SolrClient solrClient() {
        return new HttpSolrClient.Builder("https://host/solr").build();
    }

    @Bean
    public SolrTemplate solrTemplate() throws Exception {
        return new SolrTemplate(solrClient());
    }

}
