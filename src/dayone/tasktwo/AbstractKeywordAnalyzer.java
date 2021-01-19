package dayone.tasktwo;

import java.util.Arrays;

public abstract class AbstractKeywordAnalyzer implements TextAnalizer {
    abstract String[] getKeywords();
    abstract Label getLabel();
    protected String text;

    @Override
    public Label processText(String text) {
        this.text=text;
        return this.getLabel();
    }
}
