package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {

    private final String body;
    private final List<Tag> children;

    public PairedTag(String tag, Map<String,String> attributes, String body, List<Tag> children) {
        super(tag, attributes);
        this.body = body;
        this.children = children;
    }

    public String getChildrenToString() {
        StringBuilder childrenToString = new StringBuilder();
        if (!children.isEmpty()) {
            children.forEach(c -> childrenToString.append(c.toString()));
        } else return "";
        return childrenToString.toString();
    }

    @Override
    public String toString() {
        StringBuilder pairedTag = new StringBuilder();
        pairedTag.append("<" + tag + getAttributesToString(attributes) + ">")
                .append(getChildrenToString())
                .append(body)
                .append("</" + tag + ">");
        return pairedTag.toString();
    }
}
// END
