package com.company.testrestapi.repository;
import com.company.testrestapi.entity.KnowledgePoints;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KnowledgePointsRepository extends JpaRepository<KnowledgePoints, Integer> {

//    KnowledgePoints findByName(String name);

}
