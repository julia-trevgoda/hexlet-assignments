package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static exercise.App.mapper;

// BEGIN
@Data
@AllArgsConstructor
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws JsonProcessingException {
        return mapper.writeValueAsString(this);
    }

    public static Car unserialize(String json) throws IOException {
        return mapper.readValue(json, Car.class);
    }
    // END
}
