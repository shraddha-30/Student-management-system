package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StuRepo;
@Service
public class StuService {
@Autowired
	private StuRepo repo;	
	public void addStu(Student s) {
              repo.save(s);
	}
	public List<Student> getAllStu(){
		return repo.findAll();
	}
	 public Student getStuById(int id) {
		Optional<Student> s= repo.findById(id);
		if(s.isPresent()) {
			return s.get();
		}
		return null;
		
	}
                   public void deleteEMp(int id) {
		repo.deleteById(id);;
		}
}
