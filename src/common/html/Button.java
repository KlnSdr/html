package common.html;

public class Button extends HtmlElement {
    public Button() {
        super("button");
    }

    public Button(String text) {
        super("button");
        setValue(text);
    }

    public Button(String text, String onClick) {
        super("button");
        setValue(text);
        setOnClick(onClick);
    }

    public void setOnClick(String onClick) {
        addAttribute("onclick", onClick);
    }
}
