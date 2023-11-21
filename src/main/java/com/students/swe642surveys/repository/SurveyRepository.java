package com.students.swe642surveys.repository;

import com.students.swe642surveys.entity.Surveys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
 * @author Vamshi Gopari, Akhil Krishna Sai Takkella, Purna Chandra Pattipati, Vaishnavi Priya Chennu
 * This is a repository interface to interact with the database to perform CRUD operations
 * */
@Repository
public interface SurveyRepository extends JpaRepository<Surveys, Integer> {
}