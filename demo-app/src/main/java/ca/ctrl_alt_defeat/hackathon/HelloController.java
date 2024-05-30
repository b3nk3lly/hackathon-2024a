package ca.ctrl_alt_defeat.hackathon;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        // Simulate some processing time
        try {
            Random r = new Random();
            int low = 100;
            int high = 3000;
            int sleepMs = r.nextInt(high-low) + low;

            Thread.sleep(sleepMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Hello, world!";
    }

    @GetMapping("/roulette")
    public ResponseEntity<?> create() {
        if (new Random().nextInt(2) > 0) {
            return new ResponseEntity<>("You lose !", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>("You win !", HttpStatus.OK);
    }
}