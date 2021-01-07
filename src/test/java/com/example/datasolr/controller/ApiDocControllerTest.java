package com.example.datasolr.controller;

import java.util.UUID;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import com.example.datasolr.model.ApiDoc;
import com.example.datasolr.service.ApiDocService;

/**
 * @program: datasolr
 * @description
 * @author: @C5315935
 * @create: 2020-12-30 16:34
 **/
@SpringBootTest
class ApiDocControllerTest {

    private final static String API_ID = UUID.randomUUID().toString().replace("-", "");

    @Resource
    private ApiDocService service;

    @Test
    void create() {
        ApiDoc apiDoc = new ApiDoc();
        apiDoc.setId(API_ID);
        apiDoc.setServiceId(1L);
        apiDoc.setServiceName("test-service");
        apiDoc.setTitle("dataSolr-title");
        apiDoc.setDescription("desc");
        apiDoc.setVersion("v1.1.0");
        apiDoc.setSwaggerJson("json");
        service.create(apiDoc);
    }

    @Test
    void get() {
        System.out.println(service.get(API_ID));
    }

    @Test
    void update() {
        ApiDoc apiDoc = new ApiDoc();
        apiDoc.setId(API_ID);
        apiDoc.setServiceId(1L);
        apiDoc.setServiceName("test-service1");
        apiDoc.setTitle("dataSolr-title");
        apiDoc.setDescription("swaggerDesc");
        apiDoc.setVersion("v1.2.0");
        apiDoc.setSwaggerJson("swaggerJson");
        service.create(apiDoc);
    }

    @Test
    void delete() {
        System.out.println(service.get(API_ID));
        service.delete(API_ID);
    }
}