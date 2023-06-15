package com.ZahidHasanJamil.SBentity.repository;

import java.util.List;

import com.ZahidHasanJamil.SBentity.model.Comment;
import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);
}