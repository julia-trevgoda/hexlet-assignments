package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// BEGIN
class App {

    public static ObjectMapper mapper = new ObjectMapper();

    public static void save(Path path, Car car) throws IOException {
        String json = car.serialize();
        Files.write(path, json.getBytes());
    }

    public static Car extract(Path path) throws IOException {
        String json = Files.readString(path.toAbsolutePath());
        return Car.unserialize(json);
    }
}
// END
