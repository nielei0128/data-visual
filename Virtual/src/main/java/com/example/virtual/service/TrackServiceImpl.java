package com.example.virtual.service;

import com.example.virtual.DAO.TrackDAORepository;
import com.example.virtual.pojo.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class TrackServiceImpl extends TrackService {
    @Autowired
    private TrackDAORepository trackDAORepository;
    public List<Track> test(){
        return trackDAORepository.findAll();
    }
}
