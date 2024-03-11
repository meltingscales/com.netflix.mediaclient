package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;

/* loaded from: classes.dex */
public final class EncodeHelper {
    private Parcel parcel = Parcel.obtain();

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void encode(SpanStyle spanStyle) {
        long m2131getColor0d7_KjU = spanStyle.m2131getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m1294equalsimpl0(m2131getColor0d7_KjU, companion.m1309getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m1999encode8_81llA(spanStyle.m2131getColor0d7_KjU());
        }
        long m2132getFontSizeXSAIIZE = spanStyle.m2132getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m2557equalsimpl0(m2132getFontSizeXSAIIZE, companion2.m2564getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m1996encodeR2X_6o(spanStyle.m2132getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m2133getFontStyle4Lr2A7w = spanStyle.m2133getFontStyle4Lr2A7w();
        if (m2133getFontStyle4Lr2A7w != null) {
            int m2220unboximpl = m2133getFontStyle4Lr2A7w.m2220unboximpl();
            encode((byte) 4);
            m2001encodenzbMABs(m2220unboximpl);
        }
        FontSynthesis m2134getFontSynthesisZQGJjVo = spanStyle.m2134getFontSynthesisZQGJjVo();
        if (m2134getFontSynthesisZQGJjVo != null) {
            int m2231unboximpl = m2134getFontSynthesisZQGJjVo.m2231unboximpl();
            encode((byte) 5);
            m1998encode6p3vJLY(m2231unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m2557equalsimpl0(spanStyle.m2135getLetterSpacingXSAIIZE(), companion2.m2564getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m1996encodeR2X_6o(spanStyle.m2135getLetterSpacingXSAIIZE());
        }
        BaselineShift m2130getBaselineShift5SSeXJ0 = spanStyle.m2130getBaselineShift5SSeXJ0();
        if (m2130getBaselineShift5SSeXJ0 != null) {
            float m2337unboximpl = m2130getBaselineShift5SSeXJ0.m2337unboximpl();
            encode((byte) 8);
            m1997encode4Dl_Bck(m2337unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m1294equalsimpl0(spanStyle.m2129getBackground0d7_KjU(), companion.m1309getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m1999encode8_81llA(spanStyle.m2129getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode-8_81llA  reason: not valid java name */
    public final void m1999encode8_81llA(long j) {
        m2000encodeVKZWuLQ(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: encode--R2X_6o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1996encodeR2X_6o(long r6) {
        /*
            r5 = this;
            long r0 = androidx.compose.ui.unit.TextUnit.m2559getTypeUIouoOA(r6)
            androidx.compose.ui.unit.TextUnitType$Companion r2 = androidx.compose.ui.unit.TextUnitType.Companion
            long r3 = r2.m2579getUnspecifiedUIouoOA()
            boolean r3 = androidx.compose.ui.unit.TextUnitType.m2573equalsimpl0(r0, r3)
            if (r3 == 0) goto L11
            goto L29
        L11:
            long r3 = r2.m2578getSpUIouoOA()
            boolean r3 = androidx.compose.ui.unit.TextUnitType.m2573equalsimpl0(r0, r3)
            if (r3 == 0) goto L1d
            r0 = 1
            goto L2a
        L1d:
            long r3 = r2.m2577getEmUIouoOA()
            boolean r0 = androidx.compose.ui.unit.TextUnitType.m2573equalsimpl0(r0, r3)
            if (r0 == 0) goto L29
            r0 = 2
            goto L2a
        L29:
            r0 = 0
        L2a:
            r5.encode(r0)
            long r0 = androidx.compose.ui.unit.TextUnit.m2559getTypeUIouoOA(r6)
            long r2 = r2.m2579getUnspecifiedUIouoOA()
            boolean r0 = androidx.compose.ui.unit.TextUnitType.m2573equalsimpl0(r0, r2)
            if (r0 != 0) goto L42
            float r6 = androidx.compose.ui.unit.TextUnit.m2560getValueimpl(r6)
            r5.encode(r6)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.EncodeHelper.m1996encodeR2X_6o(long):void");
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    /* renamed from: encode-nzbMABs  reason: not valid java name */
    public final void m2001encodenzbMABs(int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        encode((!FontStyle.m2217equalsimpl0(i, companion.m2222getNormal_LCdwA()) && FontStyle.m2217equalsimpl0(i, companion.m2221getItalic_LCdwA())) ? (byte) 1 : (byte) 0);
    }

    /* renamed from: encode-6p3vJLY  reason: not valid java name */
    public final void m1998encode6p3vJLY(int i) {
        byte b;
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        if (!FontSynthesis.m2226equalsimpl0(i, companion.m2233getNoneGVVA2EU())) {
            if (FontSynthesis.m2226equalsimpl0(i, companion.m2232getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m2226equalsimpl0(i, companion.m2235getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m2226equalsimpl0(i, companion.m2234getStyleGVVA2EU())) {
                b = 3;
            }
            encode(b);
        }
        b = 0;
        encode(b);
    }

    /* renamed from: encode-4Dl_Bck  reason: not valid java name */
    public final void m1997encode4Dl_Bck(float f) {
        encode(f);
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m1999encode8_81llA(shadow.m1431getColor0d7_KjU());
        encode(Offset.m1137getXimpl(shadow.m1432getOffsetF1C5BW0()));
        encode(Offset.m1138getYimpl(shadow.m1432getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.parcel.writeByte(b);
    }

    public final void encode(int i) {
        this.parcel.writeInt(i);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    /* renamed from: encode-VKZWuLQ  reason: not valid java name */
    public final void m2000encodeVKZWuLQ(long j) {
        this.parcel.writeLong(j);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
