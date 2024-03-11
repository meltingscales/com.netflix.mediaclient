package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.dsT;

/* loaded from: classes.dex */
public final class AccessibilityIterators {

    /* loaded from: classes.dex */
    public interface TextSegmentIterator {
        int[] following(int i);

        int[] preceding(int i);
    }

    /* loaded from: classes.dex */
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        private final int[] segment = new int[2];
        protected String text;

        protected final void setText(String str) {
            this.text = str;
        }

        protected final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            C8632dsu.d("");
            return null;
        }

        public void initialize(String str) {
            setText(str);
        }

        protected final int[] getRange(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
    }

    /* loaded from: classes.dex */
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, C8627dsp c8627dsp) {
            this(locale);
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                C8632dsu.d(characterTextSegmentIterator);
                return characterTextSegmentIterator;
            }
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                C8632dsu.d("");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int length = getText().length();
            if (length > 0 && i < length) {
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        C8632dsu.d("");
                        breakIterator = null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.impl;
                        if (breakIterator2 == null) {
                            C8632dsu.d("");
                            breakIterator2 = null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return getRange(i, following);
                    }
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        C8632dsu.d("");
                        breakIterator3 = null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length > 0 && i > 0) {
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        C8632dsu.d("");
                        breakIterator = null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.impl;
                        if (breakIterator2 == null) {
                            C8632dsu.d("");
                            breakIterator2 = null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return getRange(preceding, i);
                    }
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        C8632dsu.d("");
                        breakIterator3 = null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            }
            return null;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }
    }

    /* loaded from: classes.dex */
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ WordTextSegmentIterator(Locale locale, C8627dsp c8627dsp) {
            this(locale);
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                C8632dsu.d(wordTextSegmentIterator);
                return wordTextSegmentIterator;
            }
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                C8632dsu.d("");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            if (getText().length() > 0 && i < getText().length()) {
                if (i < 0) {
                    i = 0;
                }
                while (!isLetterOrDigit(i) && !isStartBoundary(i)) {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        C8632dsu.d("");
                        breakIterator = null;
                    }
                    i = breakIterator.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    C8632dsu.d("");
                    breakIterator2 = null;
                }
                int following = breakIterator2.following(i);
                if (following == -1 || !isEndBoundary(following)) {
                    return null;
                }
                return getRange(i, following);
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length > 0 && i > 0) {
                if (i > length) {
                    i = length;
                }
                while (i > 0 && !isLetterOrDigit(i - 1) && !isEndBoundary(i)) {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        C8632dsu.d("");
                        breakIterator = null;
                    }
                    i = breakIterator.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    C8632dsu.d("");
                    breakIterator2 = null;
                }
                int preceding = breakIterator2.preceding(i);
                if (preceding == -1 || !isStartBoundary(preceding)) {
                    return null;
                }
                return getRange(preceding, i);
            }
            return null;
        }

        private final boolean isStartBoundary(int i) {
            return isLetterOrDigit(i) && (i == 0 || !isLetterOrDigit(i - 1));
        }

        private final boolean isEndBoundary(int i) {
            return i > 0 && isLetterOrDigit(i + (-1)) && (i == getText().length() || !isLetterOrDigit(i));
        }

        private final boolean isLetterOrDigit(int i) {
            if (i < 0 || i >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i));
        }
    }

    /* loaded from: classes.dex */
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final Companion Companion = new Companion(null);
        private static ParagraphTextSegmentIterator instance;

        public /* synthetic */ ParagraphTextSegmentIterator(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                C8632dsu.d(paragraphTextSegmentIterator);
                return paragraphTextSegmentIterator;
            }
        }

        private ParagraphTextSegmentIterator() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int[] following(int r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r5 < r0) goto Lf
                return r1
            Lf:
                if (r5 >= 0) goto L12
                r5 = 0
            L12:
                if (r5 >= r0) goto L29
                java.lang.String r2 = r4.getText()
                char r2 = r2.charAt(r5)
                r3 = 10
                if (r2 != r3) goto L29
                boolean r2 = r4.isStartBoundary(r5)
                if (r2 != 0) goto L29
                int r5 = r5 + 1
                goto L12
            L29:
                if (r5 < r0) goto L2c
                return r1
            L2c:
                int r1 = r5 + 1
            L2e:
                if (r1 >= r0) goto L39
                boolean r2 = r4.isEndBoundary(r1)
                if (r2 != 0) goto L39
                int r1 = r1 + 1
                goto L2e
            L39:
                int[] r5 = r4.getRange(r5, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.following(int):int[]");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int[] preceding(int r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r4 > 0) goto Lf
                return r1
            Lf:
                if (r4 <= r0) goto L12
                r4 = r0
            L12:
                if (r4 <= 0) goto L2b
                java.lang.String r0 = r3.getText()
                int r2 = r4 + (-1)
                char r0 = r0.charAt(r2)
                r2 = 10
                if (r0 != r2) goto L2b
                boolean r0 = r3.isEndBoundary(r4)
                if (r0 != 0) goto L2b
                int r4 = r4 + (-1)
                goto L12
            L2b:
                if (r4 > 0) goto L2e
                return r1
            L2e:
                int r0 = r4 + (-1)
            L30:
                if (r0 <= 0) goto L3b
                boolean r1 = r3.isStartBoundary(r0)
                if (r1 != 0) goto L3b
                int r0 = r0 + (-1)
                goto L30
            L3b:
                int[] r4 = r3.getRange(r0, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.preceding(int):int[]");
        }

        private final boolean isStartBoundary(int i) {
            return getText().charAt(i) != '\n' && (i == 0 || getText().charAt(i - 1) == '\n');
        }

        private final boolean isEndBoundary(int i) {
            return i > 0 && getText().charAt(i + (-1)) != '\n' && (i == getText().length() || getText().charAt(i) == '\n');
        }
    }

    /* loaded from: classes.dex */
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public /* synthetic */ LineTextSegmentIterator(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                C8632dsu.d(lineTextSegmentIterator);
                return lineTextSegmentIterator;
            }
        }

        private LineTextSegmentIterator() {
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int i2;
            if (getText().length() > 0 && i < getText().length()) {
                if (i < 0) {
                    TextLayoutResult textLayoutResult = this.layoutResult;
                    if (textLayoutResult == null) {
                        C8632dsu.d("");
                        textLayoutResult = null;
                    }
                    i2 = textLayoutResult.getLineForOffset(0);
                } else {
                    TextLayoutResult textLayoutResult2 = this.layoutResult;
                    if (textLayoutResult2 == null) {
                        C8632dsu.d("");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(i);
                    i2 = getLineEdgeIndex(lineForOffset, DirectionStart) == i ? lineForOffset : lineForOffset + 1;
                }
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    C8632dsu.d("");
                    textLayoutResult3 = null;
                }
                if (i2 >= textLayoutResult3.getLineCount()) {
                    return null;
                }
                return getRange(getLineEdgeIndex(i2, DirectionStart), getLineEdgeIndex(i2, DirectionEnd) + 1);
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int i2;
            if (getText().length() > 0 && i > 0) {
                if (i > getText().length()) {
                    TextLayoutResult textLayoutResult = this.layoutResult;
                    if (textLayoutResult == null) {
                        C8632dsu.d("");
                        textLayoutResult = null;
                    }
                    i2 = textLayoutResult.getLineForOffset(getText().length());
                } else {
                    TextLayoutResult textLayoutResult2 = this.layoutResult;
                    if (textLayoutResult2 == null) {
                        C8632dsu.d("");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(i);
                    i2 = getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == i ? lineForOffset : lineForOffset - 1;
                }
                if (i2 < 0) {
                    return null;
                }
                return getRange(getLineEdgeIndex(i2, DirectionStart), getLineEdgeIndex(i2, DirectionEnd) + 1);
            }
            return null;
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                C8632dsu.d("");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                C8632dsu.d("");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    C8632dsu.d("");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                C8632dsu.d("");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i, false, 2, null) - 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public /* synthetic */ PageTextSegmentIterator(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                C8632dsu.d(pageTextSegmentIterator);
                return pageTextSegmentIterator;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int e;
            int b;
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() > 0 && i < getText().length()) {
                try {
                    SemanticsNode semanticsNode = this.node;
                    if (semanticsNode == null) {
                        C8632dsu.d("");
                        semanticsNode = null;
                    }
                    e = dsT.e(semanticsNode.getBoundsInRoot().getHeight());
                    b = C8657dts.b(0, i);
                    TextLayoutResult textLayoutResult2 = this.layoutResult;
                    if (textLayoutResult2 == null) {
                        C8632dsu.d("");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(b);
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if (textLayoutResult3 == null) {
                        C8632dsu.d("");
                        textLayoutResult3 = null;
                    }
                    float lineTop = textLayoutResult3.getLineTop(lineForOffset) + e;
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        C8632dsu.d("");
                        textLayoutResult4 = null;
                    }
                    TextLayoutResult textLayoutResult5 = this.layoutResult;
                    if (textLayoutResult5 == null) {
                        C8632dsu.d("");
                        textLayoutResult5 = null;
                    }
                    if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                        TextLayoutResult textLayoutResult6 = this.layoutResult;
                        if (textLayoutResult6 == null) {
                            C8632dsu.d("");
                        } else {
                            textLayoutResult = textLayoutResult6;
                        }
                        lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                    } else {
                        TextLayoutResult textLayoutResult7 = this.layoutResult;
                        if (textLayoutResult7 == null) {
                            C8632dsu.d("");
                        } else {
                            textLayoutResult = textLayoutResult7;
                        }
                        lineCount = textLayoutResult.getLineCount();
                    }
                    return getRange(b, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int e;
            int i2;
            int i3;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() > 0 && i > 0) {
                try {
                    SemanticsNode semanticsNode = this.node;
                    if (semanticsNode == null) {
                        C8632dsu.d("");
                        semanticsNode = null;
                    }
                    e = dsT.e(semanticsNode.getBoundsInRoot().getHeight());
                    i2 = C8657dts.i(getText().length(), i);
                    TextLayoutResult textLayoutResult2 = this.layoutResult;
                    if (textLayoutResult2 == null) {
                        C8632dsu.d("");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(i2);
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if (textLayoutResult3 == null) {
                        C8632dsu.d("");
                        textLayoutResult3 = null;
                    }
                    float lineTop = textLayoutResult3.getLineTop(lineForOffset) - e;
                    if (lineTop > 0.0f) {
                        TextLayoutResult textLayoutResult4 = this.layoutResult;
                        if (textLayoutResult4 == null) {
                            C8632dsu.d("");
                        } else {
                            textLayoutResult = textLayoutResult4;
                        }
                        i3 = textLayoutResult.getLineForVerticalPosition(lineTop);
                    } else {
                        i3 = 0;
                    }
                    if (i2 == getText().length() && i3 < lineForOffset) {
                        i3++;
                    }
                    return getRange(getLineEdgeIndex(i3, DirectionStart), i2);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            return null;
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                C8632dsu.d("");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                C8632dsu.d("");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    C8632dsu.d("");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                C8632dsu.d("");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i, false, 2, null) - 1;
        }
    }
}
