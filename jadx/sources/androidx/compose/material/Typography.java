package androidx.compose.material;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Typography {
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;
    private final TextStyle h1;
    private final TextStyle h2;
    private final TextStyle h3;
    private final TextStyle h4;
    private final TextStyle h5;
    private final TextStyle h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getOverline() {
        return this.overline;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Typography(androidx.compose.ui.text.font.FontFamily r49, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.TextStyle r51, androidx.compose.ui.text.TextStyle r52, androidx.compose.ui.text.TextStyle r53, androidx.compose.ui.text.TextStyle r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.text.TextStyle r57, androidx.compose.ui.text.TextStyle r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.ui.text.TextStyle r60, androidx.compose.ui.text.TextStyle r61, androidx.compose.ui.text.TextStyle r62, int r63, o.C8627dsp r64) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, o.dsp):void");
    }

    public Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(TypographyKt.access$withDefaultFontFamily(textStyle, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle2, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle3, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle4, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle5, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle6, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle7, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle8, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle9, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle10, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle11, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle12, fontFamily), TypographyKt.access$withDefaultFontFamily(textStyle13, fontFamily));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Typography) {
            Typography typography = (Typography) obj;
            return C8632dsu.c(this.h1, typography.h1) && C8632dsu.c(this.h2, typography.h2) && C8632dsu.c(this.h3, typography.h3) && C8632dsu.c(this.h4, typography.h4) && C8632dsu.c(this.h5, typography.h5) && C8632dsu.c(this.h6, typography.h6) && C8632dsu.c(this.subtitle1, typography.subtitle1) && C8632dsu.c(this.subtitle2, typography.subtitle2) && C8632dsu.c(this.body1, typography.body1) && C8632dsu.c(this.body2, typography.body2) && C8632dsu.c(this.button, typography.button) && C8632dsu.c(this.caption, typography.caption) && C8632dsu.c(this.overline, typography.overline);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.h1.hashCode();
        int hashCode2 = this.h2.hashCode();
        int hashCode3 = this.h3.hashCode();
        int hashCode4 = this.h4.hashCode();
        int hashCode5 = this.h5.hashCode();
        int hashCode6 = this.h6.hashCode();
        int hashCode7 = this.subtitle1.hashCode();
        int hashCode8 = this.subtitle2.hashCode();
        int hashCode9 = this.body1.hashCode();
        int hashCode10 = this.body2.hashCode();
        int hashCode11 = this.button.hashCode();
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }
}
