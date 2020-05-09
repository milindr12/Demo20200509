package com.milind.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.milind.model.Student;

@Repository
@Transactional
public interface StudentDao extends JpaRepository<Student, Integer> {
	
}
