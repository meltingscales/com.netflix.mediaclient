package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;

/* loaded from: classes.dex */
public final class FontKt {
    /* renamed from: Font-YpTlLL0$default  reason: not valid java name */
    public static /* synthetic */ Font m2203FontYpTlLL0$default(int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m2222getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m2211getBlockingPKNRLFQ();
        }
        return m2202FontYpTlLL0(i, fontWeight, i2, i3);
    }

    /* renamed from: Font-YpTlLL0  reason: not valid java name */
    public static final Font m2202FontYpTlLL0(int i, FontWeight fontWeight, int i2, int i3) {
        return new ResourceFont(i, fontWeight, i2, new FontVariation.Settings(new FontVariation.Setting[0]), i3, null);
    }
}
