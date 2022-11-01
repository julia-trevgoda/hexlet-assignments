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
            String value;

            if (field.isAnnotationPresent(NotNull.class) || field.isAnnotationPresent(MinLength.class)) {

                try {
                    value = (String) field.get(obj);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

                if (field.isAnnotationPresent(NotNull.class) && value == null) {
                    validationErrors.add("can not be null");
                } else if (field.isAnnotationPresent(MinLength.class)) {
                    int minLength = field.getAnnotation(MinLength.class).minLength();
                    if (value.length() < minLength) {
                        validationErrors.add("length less than " + minLength);
                    }
                }
            }
            if (!validationErrors.isEmpty()) {
                notValidAddresses.put(field.getName(), validationErrors);
            }
        }
        return notValidAddresses;
    }
}
// END
