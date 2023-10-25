package com.students.swe642surveys.repository;

import com.students.swe642surveys.entity.Surveys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Surveys, Integer> {
}