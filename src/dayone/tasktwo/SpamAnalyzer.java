package dayone.tasktwo;

public class SpamAnalyzer extends AbstractKeywordAnalyzer{
    private final String[] SPAM_STRINGS;

    @Override
    String[] getKeywords() {
        return SPAM_STRINGS;
    }

    @Override
    Label getLabel() {
        boolean isOK = true;
        for (String s: SPAM_STRINGS ) {
            if(super.text.contains(s)){
                isOK = false;
                break;
            }
        }
        return (isOK) ? Label.OK : Label.SPAM;
    }

    public SpamAnalyzer(String[] strings) {
        this.SPAM_STRINGS =strings;
    }
}
