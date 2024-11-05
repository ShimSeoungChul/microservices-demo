package com.microservices.demo.elastic.index.client.service;

import com.microservices.demo.elastic.model.index.IndexModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ElasticIndexClient<T extends IndexModel> {
    List<String> save(List<T> documents);
}
