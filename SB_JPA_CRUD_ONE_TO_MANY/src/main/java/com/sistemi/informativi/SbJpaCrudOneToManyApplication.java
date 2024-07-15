package com.sistemi.informativi;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;
import com.sistemi.informativi.facade.FacadeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbJpaCrudOneToManyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbJpaCrudOneToManyApplication.class, args);
    }

    private FacadeService facadeService;

    public SbJpaCrudOneToManyApplication(FacadeService facadeService) {
        this.facadeService = facadeService;
    }

    @Override
    public void run(String... args) throws Exception {

        Course course1 = new Course("Java");
        Course course2 = new Course("Python");
        Course course3 = new Course("JavaScript");

        facadeService.addCourse(course1);
        facadeService.addCourse(course2);
        facadeService.addCourse(course3);

        facadeService.addReview(new Review("Roma", course1));
        facadeService.addReview(new Review("Milano", course1));
        facadeService.addReview(new Review("Roma", course2));
        facadeService.addReview(new Review("Bologna", course2));

        facadeService.deleteCourse(3);

        facadeService.getReviewbyCourse(2);
    }
}
