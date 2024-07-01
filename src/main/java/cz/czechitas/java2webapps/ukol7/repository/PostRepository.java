package cz.czechitas.java2webapps.ukol7.repository;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findBySlug(String slug);
    Page<Post> findAllByPublishedBeforeOrderByPublishedDesc(Date currentDate, Pageable pageable);
}
