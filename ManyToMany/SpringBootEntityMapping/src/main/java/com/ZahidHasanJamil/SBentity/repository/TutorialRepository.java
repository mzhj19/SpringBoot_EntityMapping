package com.ZahidHasanJamil.SBentity.repository;

import java.util.List;

import com.ZahidHasanJamil.SBentity.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findTutorialsByTagsId(Long tagId);
    List<Tutorial> findTutorialByPublished(Boolean published);
    List<Tutorial> findTutorialByTitleContaining(String title);
}