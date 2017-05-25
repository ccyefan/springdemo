package com.alec.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.alec.demo.domain.Demo;
@RepositoryRestResource(collectionResourceRel="demo",path="demo")
public interface DemoRepository extends JpaRepository<Demo, Long>{
	List<Demo> findByFirstname(@Param("name") String name);

}
 