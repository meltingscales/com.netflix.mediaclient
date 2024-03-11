package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;

/* loaded from: classes.dex */
public final class Placeholder {
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    /* renamed from: getHeight-XSAIIZE  reason: not valid java name */
    public final long m2100getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc  reason: not valid java name */
    public final int m2101getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE  reason: not valid java name */
    public final long m2102getWidthXSAIIZE() {
        return this.width;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Placeholder) {
            Placeholder placeholder = (Placeholder) obj;
            return TextUnit.m2557equalsimpl0(this.width, placeholder.width) && TextUnit.m2557equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m2105equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
        }
        return false;
    }

    public int hashCode() {
        int m2561hashCodeimpl = TextUnit.m2561hashCodeimpl(this.width);
        return (((m2561hashCodeimpl * 31) + TextUnit.m2561hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m2106hashCodeimpl(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m2562toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m2562toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m2107toStringimpl(this.placeholderVerticalAlign)) + ')';
    }
}
