package common.html;

public class Comment extends HtmlElement {
    public Comment(String text) {
        super("--");
        setValue(text);
    }

    @Override
    public String toHtml() {
        return "<!-- " + getValue() + " -->";
    }
}
