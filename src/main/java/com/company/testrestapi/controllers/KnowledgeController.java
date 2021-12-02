package com.company.testrestapi.controllers;

import com.company.testrestapi.entity.KnowledgePoints;
import com.company.testrestapi.repository.KnowledgePointsRepository;
import com.company.testrestapi.service.KnowledgePointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/knowledgepoints")
public class KnowledgeController {

    @Autowired
    private KnowledgePointsRepository repository;

    @GetMapping("/getall")
    public List<KnowledgePoints> getName()
    {
        return repository.findAll();
    }

}
