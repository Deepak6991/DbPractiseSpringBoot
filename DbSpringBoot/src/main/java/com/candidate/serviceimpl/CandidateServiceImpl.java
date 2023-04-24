package com.candidate.serviceimpl;

import com.candidate.DButil.DBUtil;
import com.candidate.model.Candidate;
import com.candidate.service.candidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Service
public class CandidateServiceImpl implements candidateService {
@Autowired
    static List<Candidate> candidateList= new ArrayList<>();

Connection connection;

public CandidateServiceImpl() throws SQLException {
    connection= DBUtil.getConnection();
}

@Override
    public List<Candidate> getCandidateData() throws SQLException {

    PreparedStatement stmt = connection.prepareStatement("Select * from candidate_data");
   ResultSet rs= stmt.executeQuery();
   while(rs.next()){
       Candidate cand= new Candidate();
       cand.setCandidateName(rs.getString(1));
       cand.setExperience(rs.getString(2));
       cand.setEduBack(rs.getString(3));
       cand.setTechSkills(rs.getString(4));
       cand.setComSkills(rs.getString(5));
       candidateList.add(cand);
   }
        return candidateList;
    }

}
