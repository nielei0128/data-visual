package com.example.virtual.service;
import com.example.virtual.pojo.Track;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class TrackService {
    public abstract List<Track> test();
}
