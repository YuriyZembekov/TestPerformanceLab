package dayone.tasktwo;

public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer {
    private final String[] NEGATIVE_STRINGS={":(", "=(", ":|"};
    @Override
    String[] getKeywords() {
        return NEGATIVE_STRINGS;
    }

    @Override
    Label getLabel() {
        boolean isOK = true;
        for (String s: NEGATIVE_STRINGS ) {
            if(super.text.contains(s)){
                isOK = false;
                break;
            }
        }
        return (isOK) ? Label.OK : Label.NEGATIVE_TEXT;
    }

    public NegativeTextAnalyzer() {
    }
}
