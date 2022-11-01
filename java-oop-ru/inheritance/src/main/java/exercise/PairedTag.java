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

    String openedTag = "<" + tag + getAttributesToString(attributes) + ">";
    String closedTag = "</" + tag + ">";

    @Override
    public String toString() {
        StringBuilder pairedTag = new StringBuilder();
        pairedTag.append(openedTag)
                .append(getChildrenToString())
                .append(body)
                .append(closedTag);
        return pairedTag.toString();
    }
}
// END
