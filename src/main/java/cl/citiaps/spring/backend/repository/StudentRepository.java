package cl.citiaps.spring.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import cl.citiaps.spring.backend.entities.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
	

}
