package androidx.compose.ui.text.android.selection;

import java.util.Locale;

/* loaded from: classes.dex */
public final class WordBoundary {
    private final WordIterator wordIterator;

    public WordBoundary(Locale locale, CharSequence charSequence) {
        this.wordIterator = new WordIterator(charSequence, 0, charSequence.length(), locale);
    }

    public final int getWordStart(int i) {
        int prevWordBeginningOnTwoWordsBoundary;
        if (this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(i))) {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPunctuationBeginning(i);
        } else {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        }
        return prevWordBeginningOnTwoWordsBoundary == -1 ? i : prevWordBeginningOnTwoWordsBoundary;
    }

    public final int getWordEnd(int i) {
        int nextWordEndOnTwoWordBoundary;
        if (this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(i))) {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getPunctuationEnd(i);
        } else {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getNextWordEndOnTwoWordBoundary(i);
        }
        return nextWordEndOnTwoWordBoundary == -1 ? i : nextWordEndOnTwoWordBoundary;
    }
}
