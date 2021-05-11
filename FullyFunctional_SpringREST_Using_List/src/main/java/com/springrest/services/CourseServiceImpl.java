package com.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	List<Course> list;
	
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(123,"java course","this is about java"));
		list.add(new Course(156,"Spring Boot Course","this is about Spring Boot demo"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourses(Long courseId) {
		Course c=null;
		
		for (Course course : list) {
			
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
			
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		list.forEach(e->{if(e.getId()==course.getId())
			{
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
			
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		
	list=this.list.stream().filter(e-> e.getId()!=parseLong).collect(Collectors.toList());
	}

	@Override
	public List justdemo() {
		List l=new ArrayList();
		l.add(12);
		l.add(45);
		l.add(89);
		l.add(430);
		return l;
	}

}
