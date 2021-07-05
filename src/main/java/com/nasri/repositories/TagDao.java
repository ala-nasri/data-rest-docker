package com.nasri.repositories;

import com.nasri.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "tags")
public interface TagDao extends JpaRepository<Tag, Long> {

    List<Tag> findByType(String type);
}
