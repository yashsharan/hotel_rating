package com.example.hotelrating;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel,String> {

Hotel findBy_id(ObjectId id);
}
