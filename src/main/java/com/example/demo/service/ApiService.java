package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.ApiRepo;
@Service
public class ApiService {
	 @Autowired
     ApiRepo r;
     public Student saveDetails(Student e) {
   	  return r.save(e);
     }
     public List<Student> getDetails(){
   	  return r.findAll();
     }
     public Optional<Student> getDetails(int id){
      	  return r.findById(id);
        }
     
     public Student updateDetails(Student e1) {
   	  return r.saveAndFlush(e1);
     }
     public void deleteDetails(int id ) {
   	  r.deleteById(id);
     }
}
