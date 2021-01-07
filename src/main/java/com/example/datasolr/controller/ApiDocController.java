package com.example.datasolr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.datasolr.model.ApiDoc;
import com.example.datasolr.service.ApiDocService;

/**
 * @program: datasolr
 * @description
 * @author: @C5315935
 * @create: 2020-12-30 16:16
 **/
@RestController
@RequestMapping("/solr/product")
public class ApiDocController {

    @Autowired
    private ApiDocService apiDocService;

    @PostMapping("/create")
    public void create(@RequestBody ApiDoc apiDoc) {
        apiDocService.create(apiDoc);
    }

    @GetMapping("/{id}")
    public ApiDoc get(@PathVariable("id") String id) {
        return apiDocService.get(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ApiDoc apiDoc) {
        apiDocService.update(apiDoc);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        apiDocService.delete(id);
    }

}
