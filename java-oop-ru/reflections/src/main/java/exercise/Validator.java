package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {

    public static List<String> validate(Address obj) throws IllegalAccessException {
        Field[] addresses = obj.getClass().getDeclaredFields();
        List<String> notValidAddresses = new ArrayList<>();
        for (Field address : addresses) {
            address.setAccessible(true);
            if (address.isAnnotationPresent(NotNull.class) && address.get(obj) == null) {
                notValidAddresses.add(address.getName());
            }
        }
        return notValidAddresses;
    }

    public static Map<String, List<String>> advancedValidate(Address obj) throws IllegalAccessException {

        Field[] fields = obj.getClass().getDeclaredFields();

        Map<String, List<String>> notValidAddresses = new HashMap<>();

        for (Field field : fields) {
            List<String> validationErrors = new ArrayList<>();
            field.setAccessible(true);

            if (field.isAnnotationPresent(NotNull.class) && field.get(obj) == null) {
                validationErrors.add("can not be null");
            } else if (field.isAnnotationPresent(MinLength.class) && ((String) field.get(obj)).length() < 4) {
                validationErrors.add("length less than " + 4);
            }
            if (!validationErrors.isEmpty()) {
                notValidAddresses.put(field.getName(), validationErrors);
            }
        }
        return notValidAddresses;
    }
}
// END
