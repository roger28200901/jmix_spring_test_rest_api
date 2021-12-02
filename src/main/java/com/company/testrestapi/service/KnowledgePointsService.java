package com.company.testrestapi.service;

import com.company.testrestapi.entity.KnowledgePoints;
import com.company.testrestapi.repository.KnowledgePointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgePointsService {

    @Autowired
    private KnowledgePointsRepository repository;

    public List<KnowledgePoints> getKnowledgePoints() {
        return repository.findAll();
    }
}
