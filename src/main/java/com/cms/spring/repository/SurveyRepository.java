package com.cms.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.spring.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
  List<Survey> findByPublished(boolean published);

  List<Survey> findByTitleContaining(String title);
}
