package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ResourceFont implements Font {
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, C8627dsp c8627dsp) {
        this(i, fontWeight, i2, settings, i3);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo2189getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo2199getStyle_LCdwA() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    private ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = settings;
        this.loadingStrategy = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResourceFont) {
            ResourceFont resourceFont = (ResourceFont) obj;
            return this.resId == resourceFont.resId && C8632dsu.c(getWeight(), resourceFont.getWeight()) && FontStyle.m2217equalsimpl0(mo2199getStyle_LCdwA(), resourceFont.mo2199getStyle_LCdwA()) && C8632dsu.c(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m2206equalsimpl0(mo2189getLoadingStrategyPKNRLFQ(), resourceFont.mo2189getLoadingStrategyPKNRLFQ());
        }
        return false;
    }

    public int hashCode() {
        int i = this.resId;
        int hashCode = getWeight().hashCode();
        int m2218hashCodeimpl = FontStyle.m2218hashCodeimpl(mo2199getStyle_LCdwA());
        return (((((((i * 31) + hashCode) * 31) + m2218hashCodeimpl) * 31) + FontLoadingStrategy.m2207hashCodeimpl(mo2189getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m2219toStringimpl(mo2199getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m2208toStringimpl(mo2189getLoadingStrategyPKNRLFQ())) + ')';
    }
}
