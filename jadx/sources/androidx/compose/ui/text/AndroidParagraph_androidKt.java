package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    public static final /* synthetic */ CharSequence access$attachIndentationFixSpan(CharSequence charSequence) {
        return attachIndentationFixSpan(charSequence);
    }

    public static final /* synthetic */ int access$numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        return numberOfLinesThatFitMaxHeight(textLayout, i);
    }

    public static final /* synthetic */ boolean access$shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        return shouldAttachIndentationFixSpan(textStyle, z);
    }

    /* renamed from: access$toLayoutAlign-aXe7zB0  reason: not valid java name */
    public static final /* synthetic */ int m2057access$toLayoutAlignaXe7zB0(int i) {
        return m2062toLayoutAlignaXe7zB0(i);
    }

    /* renamed from: access$toLayoutBreakStrategy-xImikfE  reason: not valid java name */
    public static final /* synthetic */ int m2058access$toLayoutBreakStrategyxImikfE(int i) {
        return m2063toLayoutBreakStrategyxImikfE(i);
    }

    /* renamed from: access$toLayoutHyphenationFrequency--3fSNIE  reason: not valid java name */
    public static final /* synthetic */ int m2059access$toLayoutHyphenationFrequency3fSNIE(int i) {
        return m2064toLayoutHyphenationFrequency3fSNIE(i);
    }

    /* renamed from: access$toLayoutLineBreakStyle-hpcqdu8  reason: not valid java name */
    public static final /* synthetic */ int m2060access$toLayoutLineBreakStylehpcqdu8(int i) {
        return m2065toLayoutLineBreakStylehpcqdu8(i);
    }

    /* renamed from: access$toLayoutLineBreakWordStyle-wPN0Rpw  reason: not valid java name */
    public static final /* synthetic */ int m2061access$toLayoutLineBreakWordStylewPN0Rpw(int i) {
        return m2066toLayoutLineBreakWordStylewPN0Rpw(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0  reason: not valid java name */
    public static final int m2062toLayoutAlignaXe7zB0(int i) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m2413equalsimpl0(i, companion.m2420getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m2413equalsimpl0(i, companion.m2421getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m2413equalsimpl0(i, companion.m2417getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m2413equalsimpl0(i, companion.m2422getStarte0LSkKk()) && TextAlign.m2413equalsimpl0(i, companion.m2418getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE  reason: not valid java name */
    public static final int m2064toLayoutHyphenationFrequency3fSNIE(int i) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m2344equalsimpl0(i, companion.m2348getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m2344equalsimpl0(i, companion.m2349getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE  reason: not valid java name */
    public static final int m2063toLayoutBreakStrategyxImikfE(int i) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (!LineBreak.Strategy.m2365equalsimpl0(i, companion.m2371getSimplefcGXIks())) {
            if (LineBreak.Strategy.m2365equalsimpl0(i, companion.m2370getHighQualityfcGXIks())) {
                return 1;
            }
            if (LineBreak.Strategy.m2365equalsimpl0(i, companion.m2369getBalancedfcGXIks())) {
                return 2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8  reason: not valid java name */
    public static final int m2065toLayoutLineBreakStylehpcqdu8(int i) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (!LineBreak.Strictness.m2374equalsimpl0(i, companion.m2378getDefaultusljTpc())) {
            if (LineBreak.Strictness.m2374equalsimpl0(i, companion.m2379getLooseusljTpc())) {
                return 1;
            }
            if (LineBreak.Strictness.m2374equalsimpl0(i, companion.m2380getNormalusljTpc())) {
                return 2;
            }
            if (LineBreak.Strictness.m2374equalsimpl0(i, companion.m2381getStrictusljTpc())) {
                return 3;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw  reason: not valid java name */
    public static final int m2066toLayoutLineBreakWordStylewPN0Rpw(int i) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        return (!LineBreak.WordBreak.m2384equalsimpl0(i, companion.m2388getDefaultjp8hJ3c()) && LineBreak.WordBreak.m2384equalsimpl0(i, companion.m2389getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (!z || TextUnit.m2557equalsimpl0(textStyle.m2174getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m2557equalsimpl0(textStyle.m2174getLetterSpacingXSAIIZE(), TextUnit.Companion.m2564getUnspecifiedXSAIIZE())) {
            return false;
        }
        int m2177getTextAligne0LSkKk = textStyle.m2177getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        return (TextAlign.m2413equalsimpl0(m2177getTextAligne0LSkKk, companion.m2423getUnspecifiede0LSkKk()) || TextAlign.m2413equalsimpl0(textStyle.m2177getTextAligne0LSkKk(), companion.m2422getStarte0LSkKk()) || TextAlign.m2413equalsimpl0(textStyle.m2177getTextAligne0LSkKk(), companion.m2419getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }
}
