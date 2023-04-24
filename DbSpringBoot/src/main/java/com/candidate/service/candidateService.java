package com.candidate.service;

import com.candidate.model.Candidate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
public interface candidateService {
    public List<Candidate> getCandidateData() throws SQLException;

}
