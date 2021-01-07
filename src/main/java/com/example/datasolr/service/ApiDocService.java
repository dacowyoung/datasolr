package com.example.datasolr.service;

import com.example.datasolr.model.ApiDoc;

/**
 * @program: datasolr
 * @description
 * @author: @C5315935
 * @create: 2020-12-30 16:19
 **/
public interface ApiDocService {

    void create(ApiDoc apiDoc);

    ApiDoc get(String id);

    void update(ApiDoc apiDoc);

    void delete(String id);
}
