package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Color;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class TextSelectionColors {
    private final long backgroundColor;
    private final long handleColor;

    public /* synthetic */ TextSelectionColors(long j, long j2, C8627dsp c8627dsp) {
        this(j, j2);
    }

    /* renamed from: getBackgroundColor-0d7_KjU  reason: not valid java name */
    public final long m549getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU  reason: not valid java name */
    public final long m550getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    private TextSelectionColors(long j, long j2) {
        this.handleColor = j;
        this.backgroundColor = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextSelectionColors) {
            TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
            return Color.m1294equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m1294equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
        }
        return false;
    }

    public int hashCode() {
        return (Color.m1300hashCodeimpl(this.handleColor) * 31) + Color.m1300hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m1301toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m1301toStringimpl(this.backgroundColor)) + ')';
    }
}
