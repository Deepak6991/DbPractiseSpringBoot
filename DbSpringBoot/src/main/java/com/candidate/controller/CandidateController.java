package com.candidate.controller;

import com.candidate.model.Candidate;
import com.candidate.service.candidateService;
import com.candidate.serviceimpl.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CandidateController {
 @Autowired
    private candidateService candService;

 @GetMapping("/candidates")
    public List<Candidate> getCandidates() throws SQLException {

        return this.candService.getCandidateData();
    }
}
