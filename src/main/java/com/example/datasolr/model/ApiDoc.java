package com.example.datasolr.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: datasolr
 * @description
 * @author: @C5315935
 * @create: 2021-01-07 15:23
 **/
@Getter
@Setter
@ToString
@SolrDocument(collection = "api-doc")
public class ApiDoc {

    @Id
    private String id;

    @Field("serviceId")
    @Indexed
    private Long serviceId;

    @Field("serviceName")
    @Indexed
    private String serviceName;

    @Field("title")
    @Indexed
    private String title;

    @Field("description")
    @Indexed
    private String description;

    @Field("version")
    @Indexed
    private String version;

    @Field("swaggerJson")
    private String swaggerJson;
}
