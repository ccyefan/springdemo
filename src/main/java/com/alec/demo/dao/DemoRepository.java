package com.alec.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.alec.demo.domain.Demo;
@RepositoryRestResource(collectionResourceRel="demo",path="demo")
public interface DemoRepository extends CrudRepository<Demo, Long>{
	List<Demo> findByName(@Param("name") String name);

}
 