package dayone.tasktwo;

public class TooLongTextAnalyzer extends AbstractKeywordAnalyzer {
    private final int MAX_LENGTH;
    @Override
    String[] getKeywords() {
        return new String[0];
    }

    @Override
    Label getLabel() {
        return (super.text.length()>MAX_LENGTH)
                ? Label.TOO_LONG
                : Label.OK;
    }

    public TooLongTextAnalyzer(int max_length) {
        MAX_LENGTH = max_length;
    }
}
