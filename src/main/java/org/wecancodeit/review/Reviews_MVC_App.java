package org.wecancodeit.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reviews_MVC_App {
    //private static Object Student;

    public static void main(String[] args) { SpringApplication.run(Reviews_MVC_App.class, args);}
//        Review model = retrieveReviewFromDatabase();
//
//        Review view = new Review();
//
//        ReviewsController controller = new ReviewsController(model,view);
//
//        controller.updateView();
//
//        controller.setReviewTitle("Ben Walsh");
//
//        controller.updateView();
//    }
//
//    private static Review retrieveReviewFromDatabase()
//    {
//        Review review = new Review();
//        review.setReviewTitle("Cassandra");
//        review.setReviewId("ABC123");
//    review.setReviewCategory("Recycle-Friendly");
//    review.setReviewContent("Very Good");
//    review.setDate("10/07/2020");
//        return review;
//    }
}
