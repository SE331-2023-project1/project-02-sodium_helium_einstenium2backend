package com.se331.nahe.repository;

import com.se331.nahe.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AnnouncementRepository extends JpaRepository<Announcement,Long>{

    List<Announcement> findAll();

}
