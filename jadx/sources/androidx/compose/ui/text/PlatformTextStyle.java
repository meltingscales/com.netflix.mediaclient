package androidx.compose.ui.text;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class PlatformTextStyle {
    private final PlatformParagraphStyle paragraphStyle;
    private final PlatformSpanStyle spanStyle;

    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public PlatformTextStyle(boolean z) {
        this(null, new PlatformParagraphStyle(z));
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int hashCode = platformSpanStyle != null ? platformSpanStyle.hashCode() : 0;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        return (hashCode * 31) + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlatformTextStyle) {
            PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
            return C8632dsu.c(this.paragraphStyle, platformTextStyle.paragraphStyle) && C8632dsu.c(this.spanStyle, platformTextStyle.spanStyle);
        }
        return false;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }
}
