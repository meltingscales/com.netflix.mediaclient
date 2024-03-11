package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class TextIndent {
    public static final Companion Companion = new Companion(null);
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    public /* synthetic */ TextIndent(long j, long j2, C8627dsp c8627dsp) {
        this(j, j2);
    }

    /* renamed from: getFirstLine-XSAIIZE  reason: not valid java name */
    public final long m2439getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE  reason: not valid java name */
    public final long m2440getRestLineXSAIIZE() {
        return this.restLine;
    }

    private TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    public /* synthetic */ TextIndent(long j, long j2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? TextUnitKt.getSp(0) : j, (i & 2) != 0 ? TextUnitKt.getSp(0) : j2, null);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextIndent) {
            TextIndent textIndent = (TextIndent) obj;
            return TextUnit.m2557equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m2557equalsimpl0(this.restLine, textIndent.restLine);
        }
        return false;
    }

    public int hashCode() {
        return (TextUnit.m2561hashCodeimpl(this.firstLine) * 31) + TextUnit.m2561hashCodeimpl(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m2562toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m2562toStringimpl(this.restLine)) + ')';
    }
}
