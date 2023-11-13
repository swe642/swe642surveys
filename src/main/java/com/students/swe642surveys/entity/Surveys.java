package com.students.swe642surveys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.students.swe642surveys.util.InterestSource;
import com.students.swe642surveys.util.RecommendLikelihood;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "surveys")
@Data
public class Surveys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zip", nullable = false)
    private String zip;

    @Column(name = "telephone_number", nullable = false)
    private String telephoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date_of_survey", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfSurvey;

    @Column(name = "liked_students", nullable = false)
    private boolean likedStudents;

    @Column(name = "liked_location", nullable = false)
    private boolean likedLocation;

    @Column(name = "liked_campus", nullable = false)
    private boolean likedCampus;

    @Column(name = "liked_atmosphere", nullable = false)
    private boolean likedAtmosphere;

    @Column(name = "liked_dorm_rooms", nullable = false)
    private boolean likedDormRooms;

    @Column(name = "liked_sports", nullable = false)
    private boolean likedSports;

    @Column(name = "interest_source")
    @Enumerated(EnumType.STRING)
    private InterestSource interestSource;

    @Column(name = "recommend_likelihood")
    @Enumerated(EnumType.STRING)
    private RecommendLikelihood recommendLikelihood;

    @Column(name = "additional_comments", columnDefinition = "TEXT")
    private String additionalComments;

    @Column(name = "submission_timestamp", updatable = false)
    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private LocalDateTime submissionTimestamp;

    public Surveys() {
    }

}
