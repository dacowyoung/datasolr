package com.example.datasolr.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;
import com.example.datasolr.model.ApiDoc;

/**
 * @program: datasolr
 * @description
 * @author: @C5315935
 * @create: 2020-12-30 16:21
 **/
@Repository
public interface ApiDocRepository extends SolrCrudRepository<ApiDoc, String> {

}
