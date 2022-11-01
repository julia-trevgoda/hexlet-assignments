package exercise;

import java.util.Locale;
import java.util.Map;

// BEGIN
public abstract class Tag {

    protected String tag;
    protected Map<String, String> attributes;

    public Tag(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    public String getAttributesToString(Map<String, String> attributes) {
        StringBuilder attributesToString = new StringBuilder();
        if (!attributes.isEmpty()) {
            attributes.forEach((k, v) -> attributesToString.append(" " + k + "=\"" + v + "\""));
        } else return "";
        return attributesToString.toString();
    }
}
// END
