package com.example.datasolr.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.example.datasolr.model.ApiDoc;
import com.example.datasolr.repository.ApiDocRepository;

/**
 * @program: datasolr
 * @description
 * @author: @C5315935
 * @create: 2020-12-30 16:21
 **/
@Service
public class ApiDocServiceImpl implements ApiDocService {

    @Resource
    private ApiDocRepository repository;

    @Override
    public void create(ApiDoc apiDoc) {
        repository.save(apiDoc);
    }

    @Override
    public ApiDoc get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void update(ApiDoc apiDoc) {
        repository.save(apiDoc);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
