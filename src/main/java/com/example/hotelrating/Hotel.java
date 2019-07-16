package com.example.hotelrating;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Hotel {

    @Id
    private ObjectId _id;

    private String URL;

    private String address;
    //private String address line 2;

    private String name;
    private String rating;

    private String food_type;

    public Hotel(ObjectId _id, String url, String address, String name, String rating, String food_type) {
        this._id = _id;
        this.URL = url;
        this.address = address;
        this.name = name;
        this.rating = rating;
        this.food_type = food_type;
    }

    public Hotel(){

    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getUrl() {
        return URL;
    }

    public void setUrl(String url) {
        this.URL = url;
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

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }
}
