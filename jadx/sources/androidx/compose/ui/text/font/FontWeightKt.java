package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import o.C8657dts;

/* loaded from: classes.dex */
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f) {
        int c;
        c = C8657dts.c(MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f), 1, 1000);
        return new FontWeight(c);
    }
}
