package androidx.compose.ui.text.font;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TypefaceRequest {
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, C8627dsp c8627dsp) {
        this(fontFamily, fontWeight, i, i2, obj);
    }

    /* renamed from: copy-e1PVR60$default  reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m2244copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i3 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i3 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.fontSynthesis;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m2245copye1PVR60(fontFamily, fontWeight2, i4, i5, obj);
    }

    /* renamed from: copy-e1PVR60  reason: not valid java name */
    public final TypefaceRequest m2245copye1PVR60(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i, i2, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypefaceRequest) {
            TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
            return C8632dsu.c(this.fontFamily, typefaceRequest.fontFamily) && C8632dsu.c(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m2217equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m2226equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && C8632dsu.c(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
        }
        return false;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA  reason: not valid java name */
    public final int m2246getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m2247getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int hashCode = fontFamily == null ? 0 : fontFamily.hashCode();
        int hashCode2 = this.fontWeight.hashCode();
        int m2218hashCodeimpl = FontStyle.m2218hashCodeimpl(this.fontStyle);
        int m2227hashCodeimpl = FontSynthesis.m2227hashCodeimpl(this.fontSynthesis);
        Object obj = this.resourceLoaderCacheKey;
        return (((((((hashCode * 31) + hashCode2) * 31) + m2218hashCodeimpl) * 31) + m2227hashCodeimpl) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m2219toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m2230toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }
}
