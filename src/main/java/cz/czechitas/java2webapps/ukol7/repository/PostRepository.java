package cz.czechitas.java2webapps.ukol7.repository;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PostRepository extends JpaRepository<Post, Long> {
    Page<Post> findAllByPublishedBeforeOrderByPublishedDesc(Pageable pageable, LocalDate now);
    Post findBySlug(String slug);
}
