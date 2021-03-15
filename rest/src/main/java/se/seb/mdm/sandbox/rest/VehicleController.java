package se.seb.mdm.sandbox.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se.seb.mdm.sandbox.domain.Car;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

public class VehicleController {


    @RequestMapping(value = "/car", method = GET)
    public ResponseEntity<Car> findMyCar(@RequestParam(value = "registrationNumber") final String registrationNumber) {

        //TODO replace this line with a call to the SomeService class
        Car car = new Car(null, null, null);

        return new ResponseEntity<>(car, HttpStatus.OK);

    }
}
