package com.students.swe642surveys.service;

import com.students.swe642surveys.entity.Surveys;
import org.springframework.http.HttpStatusCode;

import java.util.List;

/*
 * @author Vamshi Gopari, Akhil Krishna Sai Takkella, Purna Chandra Pattipati, Vaishnavi Priya Chennu
 * This is a service interface that has methods declared for crud operations.
 * implementation for this methods in SurveysServiceImpl
 * */
public interface SurveysService {

    public Surveys saveSurvey(Surveys survey);

    List<Surveys> getAllSurveys();

    Surveys getSurvey(int id);

    Surveys updateSurvey(int id, Surveys survey);

    void deleteSurvey(int id);
}
