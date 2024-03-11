package androidx.compose.ui.text.font;

import o.C8657dts;

/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    private final int fontWeightAdjustment;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment;
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }

    public AndroidFontResolveInterceptor(int i) {
        this.fontWeightAdjustment = i;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public FontWeight interceptFontWeight(FontWeight fontWeight) {
        int c;
        int i = this.fontWeightAdjustment;
        if (i == 0 || i == Integer.MAX_VALUE) {
            return fontWeight;
        }
        c = C8657dts.c(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000);
        return new FontWeight(c);
    }
}
