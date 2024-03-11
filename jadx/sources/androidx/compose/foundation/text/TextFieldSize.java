package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldSize {
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection layoutDirection;
    private long minSize = m470computeMinSizeYbymL2g();
    private TextStyle resolvedStyle;
    private Object typeface;

    /* renamed from: getMinSize-YbymL2g  reason: not valid java name */
    public final long m471getMinSizeYbymL2g() {
        return this.minSize;
    }

    public TextFieldSize(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    public final void update(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        if (layoutDirection == this.layoutDirection && C8632dsu.c(density, this.density) && C8632dsu.c(resolver, this.fontFamilyResolver) && C8632dsu.c(textStyle, this.resolvedStyle) && C8632dsu.c(obj, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
        this.minSize = m470computeMinSizeYbymL2g();
    }

    /* renamed from: computeMinSize-YbymL2g  reason: not valid java name */
    private final long m470computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }
}
