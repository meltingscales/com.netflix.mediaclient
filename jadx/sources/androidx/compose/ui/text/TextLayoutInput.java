package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TextLayoutInput {
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j, C8627dsp c8627dsp) {
        this(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, resolver, j);
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m2138getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8  reason: not valid java name */
    public final int m2139getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i;
        this.softWrap = z;
        this.overflow = i2;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        this(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, (Font.ResourceLoader) null, resolver, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextLayoutInput) {
            TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
            return C8632dsu.c(this.text, textLayoutInput.text) && C8632dsu.c(this.style, textLayoutInput.style) && C8632dsu.c(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m2453equalsimpl0(this.overflow, textLayoutInput.overflow) && C8632dsu.c(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && C8632dsu.c(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m2466equalsimpl0(this.constraints, textLayoutInput.constraints);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode();
        int hashCode2 = this.style.hashCode();
        int hashCode3 = this.placeholders.hashCode();
        int i = this.maxLines;
        int hashCode4 = Boolean.hashCode(this.softWrap);
        int m2454hashCodeimpl = TextOverflow.m2454hashCodeimpl(this.overflow);
        int hashCode5 = this.density.hashCode();
        int hashCode6 = this.layoutDirection.hashCode();
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + hashCode4) * 31) + m2454hashCodeimpl) * 31) + hashCode5) * 31) + hashCode6) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m2476hashCodeimpl(this.constraints);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m2455toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m2477toStringimpl(this.constraints)) + ')';
    }
}
