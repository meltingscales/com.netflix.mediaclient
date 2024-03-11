package androidx.compose.ui.graphics;

import o.C8626dso;
import o.C8627dsp;
import o.C8632dsu;
import o.drN;
import org.chromium.net.NetError;
import org.chromium.net.PrivateKeyType;
import org.linphone.core.Privacy;

@drN
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    private static final float FP32_DENORMAL_FLOAT;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m1337constructorimpl((short) 5120);
    private static final short LowestValue = m1337constructorimpl((short) -1025);
    private static final short MaxValue = m1337constructorimpl((short) 31743);
    private static final short MinNormal = m1337constructorimpl((short) 1024);
    private static final short MinValue = m1337constructorimpl((short) 1);
    private static final short NaN = m1337constructorimpl((short) 32256);
    private static final short NegativeInfinity = m1337constructorimpl((short) -1024);
    private static final short NegativeZero = m1337constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m1337constructorimpl((short) 31744);
    private static final short PositiveZero = m1337constructorimpl((short) 0);
    private static final short One = m1336constructorimpl(1.0f);
    private static final short NegativeOne = m1336constructorimpl(-1.0f);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m1337constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1338equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m1344unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1339hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: isNaN-impl  reason: not valid java name */
    public static final boolean m1340isNaNimpl(short s) {
        return (s & Short.MAX_VALUE) > 31744;
    }

    public boolean equals(Object obj) {
        return m1338equalsimpl(this.halfValue, obj);
    }

    public int hashCode() {
        return m1339hashCodeimpl(this.halfValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m1344unboximpl() {
        return this.halfValue;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Float16 float16) {
        return m1343compareTo41bOqos(float16.m1344unboximpl());
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m1336constructorimpl(float f) {
        return m1337constructorimpl(Companion.floatToHalf(f));
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    public static final float m1341toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = PrivateKeyType.INVALID;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else if (i6 != 0) {
            C8626dso c8626dso = C8626dso.e;
            float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - FP32_DENORMAL_FLOAT;
            return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i3 = 0;
            i2 = 0;
        }
        C8626dso c8626dso2 = C8626dso.e;
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public String toString() {
        return m1342toStringimpl(this.halfValue);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1342toStringimpl(short s) {
        return String.valueOf(m1341toFloatimpl(s));
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public int m1343compareTo41bOqos(short s) {
        return m1335compareTo41bOqos(this.halfValue, s);
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public static int m1335compareTo41bOqos(short s, short s2) {
        if (m1340isNaNimpl(s)) {
            return !m1340isNaNimpl(s2) ? 1 : 0;
        }
        if (m1340isNaNimpl(s2)) {
            return -1;
        }
        Companion companion = Companion;
        return C8632dsu.d(companion.toCompareValue(s), companion.toCompareValue(s2));
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short s) {
            return (s & 32768) != 0 ? Privacy.DEFAULT - (s & 65535) : s & 65535;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f) {
            int i;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i2 = floatToRawIntBits >>> 31;
            int i3 = (floatToRawIntBits >>> 23) & PrivateKeyType.INVALID;
            int i4 = 8388607 & floatToRawIntBits;
            int i5 = 31;
            int i6 = 0;
            if (i3 != 255) {
                int i7 = i3 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
                if (i7 >= 31) {
                    i5 = 49;
                } else if (i7 > 0) {
                    i6 = i4 >> 13;
                    if ((floatToRawIntBits & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                        return (short) i;
                    }
                    i5 = i7;
                } else if (i7 >= -10) {
                    int i8 = (8388608 | i4) >> (1 - i7);
                    if ((i8 & 4096) != 0) {
                        i8 += 8192;
                    }
                    i5 = 0;
                    i6 = i8 >> 13;
                } else {
                    i5 = 0;
                }
            } else if (i4 != 0) {
                i6 = 512;
            }
            i = (i2 << 15) | (i5 << 10) | i6;
            return (short) i;
        }
    }

    static {
        C8626dso c8626dso = C8626dso.e;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(1056964608);
    }
}
