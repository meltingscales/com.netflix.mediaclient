package o;

import androidx.compose.runtime.MutableState;
import com.netflix.hawkins.consumer.component.input.HawkinsPhoneInputSize;

/* loaded from: classes3.dex */
public final class KY {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 0;
    private static int e = 1;
    private static char[] e$s11$132 = {23077};
    private static char d$s12$132 = 28559;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[HawkinsPhoneInputSize.values().length];
            try {
                iArr[HawkinsPhoneInputSize.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HawkinsPhoneInputSize.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HawkinsPhoneInputSize.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
        }
    }

    public static final /* synthetic */ void a(MutableState mutableState, KX kx) {
        int i = 2 % 2;
        int i2 = e + 31;
        a = i2 % 128;
        int i3 = i2 % 2;
        e(mutableState, kx);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
    }

    public static final /* synthetic */ String b(MutableState mutableState) {
        int i = 2 % 2;
        int i2 = e + 55;
        a = i2 % 128;
        int i3 = i2 % 2;
        String c = c(mutableState);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = e + 31;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void b(MutableState mutableState, String str) {
        int i = 2 % 2;
        int i2 = a + 57;
        e = i2 % 128;
        int i3 = i2 % 2;
        a(mutableState, str);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    public static final /* synthetic */ KX e(MutableState mutableState) {
        int i = 2 % 2;
        int i2 = e + 13;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            d(mutableState);
            throw null;
        }
        KX d2 = d(mutableState);
        int i3 = e + 35;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public static final /* synthetic */ void e(MutableState mutableState, boolean z) {
        int i = 2 % 2;
        int i2 = a + 95;
        e = i2 % 128;
        int i3 = i2 % 2;
        a(mutableState, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = a + 59;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014a, code lost:
        if (r5.changed(r59) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x014c, code lost:
        r2 = 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x014f, code lost:
        r2 = 33554432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0143, code lost:
        if (r5.changed(r59) != false) goto L278;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final o.drX<? super o.KX, ? super java.lang.String, o.dpR> r51, androidx.compose.ui.Modifier r52, com.netflix.hawkins.consumer.tokens.Theme r53, com.netflix.hawkins.consumer.component.input.HawkinsPhoneInputSize r54, com.netflix.hawkins.consumer.component.input.HawkinsPhoneInputType r55, java.lang.String r56, java.lang.String r57, o.KX r58, java.lang.String r59, java.util.List<o.KX> r60, o.drO<o.dpR> r61, o.drO<o.dpR> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 2333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KY.e(o.drX, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, com.netflix.hawkins.consumer.component.input.HawkinsPhoneInputSize, com.netflix.hawkins.consumer.component.input.HawkinsPhoneInputType, java.lang.String, java.lang.String, o.KX, java.lang.String, java.util.List, o.drO, o.drO, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final KX d(MutableState<KX> mutableState) {
        int i = 2 % 2;
        int i2 = e + 55;
        a = i2 % 128;
        int i3 = i2 % 2;
        KX value = mutableState.getValue();
        int i4 = e + 107;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return value;
    }

    private static final void e(MutableState<KX> mutableState, KX kx) {
        int i = 2 % 2;
        int i2 = a + 11;
        e = i2 % 128;
        int i3 = i2 % 2;
        mutableState.setValue(kx);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = e + 11;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final String c(MutableState<String> mutableState) {
        int i = 2 % 2;
        int i2 = e + 57;
        a = i2 % 128;
        int i3 = i2 % 2;
        String value = mutableState.getValue();
        int i4 = e + 21;
        a = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    private static final void a(MutableState<String> mutableState, String str) {
        int i = 2 % 2;
        int i2 = a + 115;
        e = i2 % 128;
        int i3 = i2 % 2;
        mutableState.setValue(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = a + 27;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean a(MutableState<Boolean> mutableState) {
        int i = 2 % 2;
        int i2 = a + 115;
        e = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanValue = mutableState.getValue().booleanValue();
        int i4 = e + 45;
        a = i4 % 128;
        int i5 = i4 % 2;
        return booleanValue;
    }

    private static final void a(MutableState<Boolean> mutableState, boolean z) {
        int i = 2 % 2;
        int i2 = a + 21;
        e = i2 % 128;
        int i3 = i2 % 2;
        mutableState.setValue(Boolean.valueOf(z));
        int i4 = e + 103;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void f(byte b, int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        C9612sx c9612sx = new C9612sx();
        char[] cArr2 = e$s11$132;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $11 + 19;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr3[i4] = (char) (cArr2[i4] ^ 1428963431804333966L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (1428963431804333966L ^ d$s12$132);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            c9612sx.d = 0;
            while (c9612sx.d < i2) {
                c9612sx.b = cArr[c9612sx.d];
                c9612sx.a = cArr[c9612sx.d + 1];
                if (c9612sx.b == c9612sx.a) {
                    cArr4[c9612sx.d] = (char) (c9612sx.b - b);
                    cArr4[c9612sx.d + 1] = (char) (c9612sx.a - b);
                } else {
                    c9612sx.c = c9612sx.b / c;
                    c9612sx.g = c9612sx.b % c;
                    c9612sx.e = c9612sx.a / c;
                    c9612sx.j = c9612sx.a % c;
                    if (c9612sx.g != c9612sx.j) {
                        if (c9612sx.c == c9612sx.e) {
                            c9612sx.g = ((c9612sx.g + c) - 1) % c;
                            c9612sx.j = ((c9612sx.j + c) - 1) % c;
                            int i7 = (c9612sx.c * c) + c9612sx.g;
                            int i8 = (c9612sx.e * c) + c9612sx.j;
                            cArr4[c9612sx.d] = cArr2[i7];
                            cArr4[c9612sx.d + 1] = cArr2[i8];
                        } else {
                            int i9 = (c9612sx.c * c) + c9612sx.j;
                            int i10 = (c9612sx.e * c) + c9612sx.g;
                            cArr4[c9612sx.d] = cArr2[i9];
                            cArr4[c9612sx.d + 1] = cArr2[i10];
                        }
                    } else {
                        int i11 = $11 + 39;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        c9612sx.c = ((c9612sx.c + c) - 1) % c;
                        c9612sx.e = ((c9612sx.e + c) - 1) % c;
                        int i13 = (c9612sx.c * c) + c9612sx.g;
                        int i14 = (c9612sx.e * c) + c9612sx.j;
                        cArr4[c9612sx.d] = cArr2[i13];
                        cArr4[c9612sx.d + 1] = cArr2[i14];
                    }
                }
                c9612sx.d += 2;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
