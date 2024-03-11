package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.OffsetKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import o.C8569dql;
import o.dpL;

/* loaded from: classes.dex */
public final class DecodeHelper {
    private final Parcel parcel;

    public DecodeHelper(String str) {
        Parcel obtain = Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle2 = r15;
        MutableSpanStyle mutableSpanStyle3 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte != 1) {
                mutableSpanStyle = mutableSpanStyle2;
                if (decodeByte == 2) {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m2008setFontSizeR2X_6o(m1994decodeTextUnitXSAIIZE());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 3) {
                    if (dataAvailable() < 4) {
                        break;
                    }
                    mutableSpanStyle.setFontWeight(decodeFontWeight());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 4) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m2009setFontStylemLjRB2g(FontStyle.m2214boximpl(m1992decodeFontStyle_LCdwA()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte != 5) {
                    if (decodeByte != 6) {
                        if (decodeByte != 7) {
                            if (decodeByte != 8) {
                                if (decodeByte != 9) {
                                    if (decodeByte != 10) {
                                        if (decodeByte != 11) {
                                            if (decodeByte == 12) {
                                                if (dataAvailable() < 20) {
                                                    break;
                                                }
                                                mutableSpanStyle.setShadow(decodeShadow());
                                            }
                                        } else if (dataAvailable() < 4) {
                                            break;
                                        } else {
                                            mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                        }
                                    } else if (dataAvailable() < 8) {
                                        break;
                                    } else {
                                        mutableSpanStyle.m2005setBackground8_81llA(m1991decodeColor0d7_KjU());
                                    }
                                } else if (dataAvailable() < 8) {
                                    break;
                                } else {
                                    mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                }
                            } else if (dataAvailable() < 4) {
                                break;
                            } else {
                                mutableSpanStyle.m2006setBaselineShift_isdbwI(BaselineShift.m2331boximpl(m1989decodeBaselineShifty9eOQZs()));
                            }
                        } else if (dataAvailable() < 5) {
                            break;
                        } else {
                            mutableSpanStyle.m2011setLetterSpacingR2X_6o(m1994decodeTextUnitXSAIIZE());
                        }
                    } else {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (dataAvailable() < 1) {
                    break;
                } else {
                    mutableSpanStyle.m2010setFontSynthesistDdu0R4(FontSynthesis.m2223boximpl(m1993decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                }
            } else if (dataAvailable() < 8) {
                break;
            } else {
                mutableSpanStyle2.m2007setColor8_81llA(m1991decodeColor0d7_KjU());
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeColor-0d7_KjU  reason: not valid java name */
    public final long m1991decodeColor0d7_KjU() {
        return Color.m1289constructorimpl(m1990decodeULongsVKNKU());
    }

    /* renamed from: decodeTextUnit-XSAIIZE  reason: not valid java name */
    public final long m1994decodeTextUnitXSAIIZE() {
        long m2579getUnspecifiedUIouoOA;
        byte decodeByte = decodeByte();
        if (decodeByte == 1) {
            m2579getUnspecifiedUIouoOA = TextUnitType.Companion.m2578getSpUIouoOA();
        } else if (decodeByte == 2) {
            m2579getUnspecifiedUIouoOA = TextUnitType.Companion.m2577getEmUIouoOA();
        } else {
            m2579getUnspecifiedUIouoOA = TextUnitType.Companion.m2579getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m2573equalsimpl0(m2579getUnspecifiedUIouoOA, TextUnitType.Companion.m2579getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m2564getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m2565TextUnitanM5pPY(decodeFloat(), m2579getUnspecifiedUIouoOA);
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    /* renamed from: decodeFontStyle-_-LCdwA  reason: not valid java name */
    public final int m1992decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontStyle.Companion.m2222getNormal_LCdwA();
        }
        if (decodeByte == 1) {
            return FontStyle.Companion.m2221getItalic_LCdwA();
        }
        return FontStyle.Companion.m2222getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m1993decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontSynthesis.Companion.m2233getNoneGVVA2EU();
        }
        if (decodeByte == 1) {
            return FontSynthesis.Companion.m2232getAllGVVA2EU();
        }
        if (decodeByte == 3) {
            return FontSynthesis.Companion.m2234getStyleGVVA2EU();
        }
        if (decodeByte == 2) {
            return FontSynthesis.Companion.m2235getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m2233getNoneGVVA2EU();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs  reason: not valid java name */
    private final float m1989decodeBaselineShifty9eOQZs() {
        return BaselineShift.m2332constructorimpl(decodeFloat());
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    private final TextDecoration decodeTextDecoration() {
        List<TextDecoration> j;
        int decodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        boolean z = (companion.getLineThrough().getMask() & decodeInt) != 0;
        boolean z2 = (decodeInt & companion.getUnderline().getMask()) != 0;
        if (z && z2) {
            j = C8569dql.j(companion.getLineThrough(), companion.getUnderline());
            return companion.combine(j);
        } else if (z) {
            return companion.getLineThrough();
        } else {
            if (z2) {
                return companion.getUnderline();
            }
            return companion.getNone();
        }
    }

    private final Shadow decodeShadow() {
        return new Shadow(m1991decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    /* renamed from: decodeULong-s-VKNKU  reason: not valid java name */
    private final long m1990decodeULongsVKNKU() {
        return dpL.b(this.parcel.readLong());
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }
}
