package com.students.swe642surveys.service.impl;

import com.students.swe642surveys.entity.Surveys;
import com.students.swe642surveys.repository.SurveyRepository;
import com.students.swe642surveys.service.SurveysService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;

@Service
public class SurveysServiceImpl implements SurveysService {

    //dependency Injection
    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public Surveys saveSurvey(Surveys survey) {
        // Save the student data to the database
        return surveyRepository.save(survey);
    }

    @Override
    public List<Surveys> getAllSurveys() {
        return surveyRepository.findAll();
    }

    @Override
    public Surveys getSurvey(int id) {
        return surveyRepository.findById(id).orElseThrow(() -> new NullPointerException("Survey not found - " + id ));
    }

    @Override
    public Surveys updateSurvey(int id, Surveys survey) {
        if(id != survey.getStudentId()) {
            throw new InputMismatchException("param id and object id doesn't match");
        }
        Surveys currentSurvey = surveyRepository.findById(id).orElseThrow(() -> new NullPointerException("Survey not found - " + id ));
        BeanUtils.copyProperties(survey, currentSurvey);
        return surveyRepository.save(survey);

    }

    @Override
    public void deleteSurvey(int id) {
        getSurvey(id);
        surveyRepository.deleteById(id);
    }
}
