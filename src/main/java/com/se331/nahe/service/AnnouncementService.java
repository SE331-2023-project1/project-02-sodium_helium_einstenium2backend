package com.se331.nahe.service;

import com.se331.nahe.entity.Announcement;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface AnnouncementService {

    Announcement createAnnouncement(Long teacherId, Announcement announcement);

}
