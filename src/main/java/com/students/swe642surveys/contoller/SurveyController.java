package com.students.swe642surveys.contoller;

import com.students.swe642surveys.entity.Surveys;
import com.students.swe642surveys.exceptions.ResponseDto;
import com.students.swe642surveys.service.SurveysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/surveys")
@CrossOrigin
public class SurveyController {

    @Autowired
    private SurveysService surveysService;

    @PostMapping
    public ResponseEntity<Surveys> addSurvey(@RequestBody Surveys survey) {
        return new ResponseEntity<Surveys>(surveysService.saveSurvey(survey), HttpStatus.CREATED);
    }

    @PutMapping(params = "id")
    public ResponseEntity<Surveys> updateSurvey(@RequestParam int id, @RequestBody Surveys survey) {
        return new ResponseEntity<Surveys>(surveysService.updateSurvey(id, survey), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Surveys>> getAllSurveys() {
        return new ResponseEntity<List<Surveys>>(surveysService.getAllSurveys(), HttpStatus.OK);
    }

    @GetMapping(params = "id")
    public ResponseEntity<Surveys> getSurvey(@RequestParam int id) {
        return new ResponseEntity<Surveys>(surveysService.getSurvey(id), HttpStatus.OK);
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<ResponseDto> deleteSurvey(@RequestParam int id) {
        surveysService.deleteSurvey(id);
         return new ResponseEntity<ResponseDto>(new ResponseDto("Survey Deleted Successfully!", HttpStatus.OK.value()), HttpStatus.OK);
    }
}
