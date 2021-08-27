import static java.awt.SystemColor.text;

public class Range {
    String text = "";
    public Range(String text) {
        this.text = text;
    }

    public boolean isStartWithInclusive() {
        return text.startsWith("[");
    }
    public boolean isStartWithBracket() {
        return text.startsWith("(");
    }

    public int isStartInputNumber() {
        return Integer.parseInt(text.substring(1, 2));
    }

    public int isEndInputNumber() {
        return Integer.parseInt(text.substring(3, 4));
    }

    public boolean isEndWithInclusive() {
        return text.endsWith("]");
    }

    public boolean isEndWithBracket() {
        return text.endsWith(")");
    }
}
