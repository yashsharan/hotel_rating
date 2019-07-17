package com.example.hotelrating;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("restaurant")
public class Hotel {

    @Id
    private String id;

    private String URL;

    private String address;
    private String address_line_2;
    private String outcode;
    private String postcode;
    private String name;
    private String rating;
    private String type_of_food;


    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }





    public Hotel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Hotel(String id, String URL, String address, String address_line_2, String outcode, String postcode, String name, String rating, String type_of_food) {
        this.id = id;
        this.URL = URL;
        this.address = address;
        this.address_line_2 = address_line_2;
        this.outcode = outcode;
        this.postcode = postcode;
        this.name = name;
        this.rating = rating;
        this.type_of_food = type_of_food;
    }

    public String getOutcode() {
        return outcode;
    }

    public void setOutcode(String outcode) {
        this.outcode = outcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getType_of_food() {
        return type_of_food;
    }

    public void setType_of_food(String type_of_food) {
        this.type_of_food = type_of_food;
    }

    public String getFood_type() {
        return type_of_food;
    }

    public void setFood_type(String food_type) {
        this.type_of_food = food_type;
    }
}
