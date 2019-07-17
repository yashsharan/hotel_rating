package com.example.hotelrating;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @RequestMapping(value="/",method = RequestMethod.GET)
    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Hotel getPetById(@PathVariable("id") String id) {
        return hotelRepository.findById(id).get();
    }
}
