package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.math.BigDecimal;
import java.util.Arrays;
import o.C9337ng;

/* renamed from: o.nf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9336nf {

    /* renamed from: J  reason: collision with root package name */
    private static final BigDecimal f13885J;
    private static final BigDecimal M;
    private static final byte[] O;
    private static final byte[] P;
    public static final short[] I = new short[0];
    public static final int[] t = new int[0];
    public static final long[] w = new long[0];
    public static final float[] m = new float[0];
    public static final double[] a = new double[0];
    public static final Short K = 0;
    public static final Integer r = 0;
    public static final Long z = 0L;

    /* renamed from: o  reason: collision with root package name */
    public static final Float f13886o = Float.valueOf(0.0f);
    public static final Double h = Double.valueOf(0.0d);
    private static final int[] R = new int[1000];
    private static final int[] Q = {111, 222, 444, 888, 1776};
    private static final int[] S = {50, 100, 200, 400, 800};
    private static final int[] W = {10000, 1000, 100, 10, 1};
    private static final double[] U = {10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d, 9.999999999999999E22d, 1.0E24d, 1.0E25d, 1.0E26d, 1.0E27d, 1.0E28d, 1.0E29d, 1.0E30d, 1.0E31d, 1.0E32d, 1.0E33d, 1.0E34d, 1.0E35d, 1.0E36d, 1.0E37d, 1.0E38d, 1.0E39d, 1.0E40d, 1.0E41d, 1.0E42d, 1.0E43d, 1.0E44d, 1.0E45d, 1.0E46d, 1.0E47d, 1.0E48d, 1.0E49d, 1.0E50d, 1.0E51d, 1.0E52d, 1.0E53d, 1.0E54d, 1.0E55d, 1.0E56d, 1.0E57d, 1.0E58d, 1.0E59d, 1.0E60d, 1.0E61d, 1.0E62d, 1.0E63d, 1.0E64d, 1.0E65d};
    public static final JsonReader.d<Double> e = new JsonReader.d<Double>() { // from class: o.nf.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public Double d(JsonReader jsonReader) {
            return Double.valueOf(AbstractC9336nf.e(jsonReader));
        }
    };
    public static final JsonReader.d<Double> D = new JsonReader.d<Double>() { // from class: o.nf.13
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public Double d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return Double.valueOf(AbstractC9336nf.e(jsonReader));
        }
    };
    public static final C9337ng.a<Double> c = new C9337ng.a<Double>() { // from class: o.nf.23
        @Override // o.C9337ng.a
        /* renamed from: d */
        public void b(C9337ng c9337ng, Double d2) {
            AbstractC9336nf.e(d2, c9337ng);
        }
    };
    public static final JsonReader.d<double[]> b = new JsonReader.d<double[]>() { // from class: o.nf.21
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: a */
        public double[] d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            if (jsonReader.i() != 91) {
                throw jsonReader.a("Expecting '[' for double array start");
            }
            jsonReader.d();
            return AbstractC9336nf.a(jsonReader);
        }
    };
    public static final C9337ng.a<double[]> d = new C9337ng.a<double[]>() { // from class: o.nf.24
        @Override // o.C9337ng.a
        /* renamed from: e */
        public void b(C9337ng c9337ng, double[] dArr) {
            AbstractC9336nf.c(dArr, c9337ng);
        }
    };
    public static final JsonReader.d<Float> n = new JsonReader.d<Float>() { // from class: o.nf.22
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public Float d(JsonReader jsonReader) {
            return Float.valueOf(AbstractC9336nf.b(jsonReader));
        }
    };
    public static final JsonReader.d<Float> C = new JsonReader.d<Float>() { // from class: o.nf.29
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: a */
        public Float d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return Float.valueOf(AbstractC9336nf.b(jsonReader));
        }
    };
    public static final C9337ng.a<Float> k = new C9337ng.a<Float>() { // from class: o.nf.30
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, Float f2) {
            AbstractC9336nf.e(f2, c9337ng);
        }
    };
    public static final JsonReader.d<float[]> j = new JsonReader.d<float[]>() { // from class: o.nf.27
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: a */
        public float[] d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            if (jsonReader.i() != 91) {
                throw jsonReader.a("Expecting '[' for float array start");
            }
            jsonReader.d();
            return AbstractC9336nf.d(jsonReader);
        }
    };
    public static final C9337ng.a<float[]> f = new C9337ng.a<float[]>() { // from class: o.nf.2
        @Override // o.C9337ng.a
        /* renamed from: c */
        public void b(C9337ng c9337ng, float[] fArr) {
            AbstractC9336nf.b(fArr, c9337ng);
        }
    };
    public static final JsonReader.d<Integer> p = new JsonReader.d<Integer>() { // from class: o.nf.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public Integer d(JsonReader jsonReader) {
            return Integer.valueOf(AbstractC9336nf.g(jsonReader));
        }
    };
    public static final JsonReader.d<Integer> A = new JsonReader.d<Integer>() { // from class: o.nf.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public Integer d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return Integer.valueOf(AbstractC9336nf.g(jsonReader));
        }
    };
    public static final C9337ng.a<Integer> s = new C9337ng.a<Integer>() { // from class: o.nf.3
        @Override // o.C9337ng.a
        /* renamed from: c */
        public void b(C9337ng c9337ng, Integer num) {
            AbstractC9336nf.c(num, c9337ng);
        }
    };
    public static final JsonReader.d<int[]> l = new JsonReader.d<int[]>() { // from class: o.nf.10
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public int[] d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            if (jsonReader.i() != 91) {
                throw jsonReader.a("Expecting '[' for int array start");
            }
            jsonReader.d();
            return AbstractC9336nf.h(jsonReader);
        }
    };
    public static final C9337ng.a<int[]> q = new C9337ng.a<int[]>() { // from class: o.nf.9
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, int[] iArr) {
            AbstractC9336nf.a(iArr, c9337ng);
        }
    };
    public static final JsonReader.d<Short> N = new JsonReader.d<Short>() { // from class: o.nf.7
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: a */
        public Short d(JsonReader jsonReader) {
            return Short.valueOf(AbstractC9336nf.n(jsonReader));
        }
    };
    public static final JsonReader.d<Short> E = new JsonReader.d<Short>() { // from class: o.nf.8
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: b */
        public Short d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return Short.valueOf(AbstractC9336nf.n(jsonReader));
        }
    };
    public static final C9337ng.a<Short> L = new C9337ng.a<Short>() { // from class: o.nf.6
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, Short sh) {
            if (sh == null) {
                c9337ng.b();
            } else {
                AbstractC9336nf.c(sh.intValue(), c9337ng);
            }
        }
    };
    public static final JsonReader.d<short[]> F = new JsonReader.d<short[]>() { // from class: o.nf.12
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: b */
        public short[] d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            if (jsonReader.i() != 91) {
                throw jsonReader.a("Expecting '[' for short array start");
            }
            jsonReader.d();
            return AbstractC9336nf.o(jsonReader);
        }
    };
    public static final C9337ng.a<short[]> H = new C9337ng.a<short[]>() { // from class: o.nf.14
        @Override // o.C9337ng.a
        /* renamed from: e */
        public void b(C9337ng c9337ng, short[] sArr) {
            AbstractC9336nf.c(sArr, c9337ng);
        }
    };
    public static final JsonReader.d<Long> x = new JsonReader.d<Long>() { // from class: o.nf.15
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public Long d(JsonReader jsonReader) {
            return Long.valueOf(AbstractC9336nf.i(jsonReader));
        }
    };
    public static final JsonReader.d<Long> B = new JsonReader.d<Long>() { // from class: o.nf.11
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: b */
        public Long d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return Long.valueOf(AbstractC9336nf.i(jsonReader));
        }
    };
    public static final C9337ng.a<Long> u = new C9337ng.a<Long>() { // from class: o.nf.19
        @Override // o.C9337ng.a
        /* renamed from: a */
        public void b(C9337ng c9337ng, Long l2) {
            AbstractC9336nf.c(l2, c9337ng);
        }
    };
    public static final JsonReader.d<long[]> v = new JsonReader.d<long[]>() { // from class: o.nf.16
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: b */
        public long[] d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            if (jsonReader.i() != 91) {
                throw jsonReader.a("Expecting '[' for long array start");
            }
            jsonReader.d();
            return AbstractC9336nf.j(jsonReader);
        }
    };
    public static final C9337ng.a<long[]> y = new C9337ng.a<long[]>() { // from class: o.nf.18
        @Override // o.C9337ng.a
        /* renamed from: c */
        public void b(C9337ng c9337ng, long[] jArr) {
            AbstractC9336nf.a(jArr, c9337ng);
        }
    };
    public static final JsonReader.d<BigDecimal> i = new JsonReader.d<BigDecimal>() { // from class: o.nf.17
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public BigDecimal d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9336nf.c(jsonReader);
        }
    };
    public static final C9337ng.a<BigDecimal> g = new C9337ng.a<BigDecimal>() { // from class: o.nf.20
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, BigDecimal bigDecimal) {
            AbstractC9336nf.b(bigDecimal, c9337ng);
        }
    };
    static final JsonReader.d<Number> G = new JsonReader.d<Number>() { // from class: o.nf.25
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public Number d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9336nf.f(jsonReader);
        }
    };

    static {
        int i2 = 0;
        while (true) {
            int[] iArr = R;
            if (i2 < iArr.length) {
                iArr[i2] = (i2 < 10 ? 33554432 : i2 < 100 ? 16777216 : 0) + (((i2 / 100) + 48) << 16) + ((((i2 / 10) % 10) + 48) << 8) + (i2 % 10) + 48;
                i2++;
            } else {
                P = "-2147483648".getBytes();
                O = "-9223372036854775808".getBytes();
                f13885J = BigDecimal.valueOf(Long.MAX_VALUE);
                M = BigDecimal.valueOf(Long.MIN_VALUE);
                return;
            }
        }
    }

    static void c(JsonReader jsonReader, int i2, int i3, String str) {
        int i4 = i3 - i2;
        if (i4 > jsonReader.i) {
            throw jsonReader.d("Too many digits detected in number", i4, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        throw jsonReader.d("Error parsing number", i4, "", str, null, ". Error parsing number");
    }

    static void e(JsonReader jsonReader, int i2, int i3, String str, Object obj) {
        int i4 = i3 - i2;
        if (i4 > jsonReader.i) {
            throw jsonReader.d("Too many digits detected in number", i4, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        throw jsonReader.d("Error parsing number", i4, "", str, obj, ". Error parsing number");
    }

    public static void e(Double d2, C9337ng c9337ng) {
        if (d2 == null) {
            c9337ng.b();
        } else {
            c(d2.doubleValue(), c9337ng);
        }
    }

    private static BigDecimal b(char[] cArr, int i2, JsonReader jsonReader, boolean z2) {
        int i3;
        char c2;
        int i4 = i2;
        while (i4 > 0 && Character.isWhitespace(cArr[i4 - 1])) {
            i4--;
        }
        if (i4 > jsonReader.i) {
            throw jsonReader.d("Too many digits detected in number", i2, "", "Too many digits detected in number", Integer.valueOf(i4), "");
        }
        int i5 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i5] == '0' && i4 > (i3 = i5 + 1) && (c2 = cArr[i3]) >= '0' && c2 <= '9') {
            throw jsonReader.e("Leading zero is not allowed. Error parsing number", i2 + (z2 ? 2 : 0));
        }
        try {
            return new BigDecimal(cArr, 0, i4);
        } catch (NumberFormatException e2) {
            throw jsonReader.e("Error parsing number", i2 + (z2 ? 2 : 0), e2);
        }
    }

    public static void c(double d2, C9337ng c9337ng) {
        c9337ng.c(d2);
    }

    public static void c(double[] dArr, C9337ng c9337ng) {
        if (dArr == null) {
            c9337ng.b();
        } else if (dArr.length == 0) {
            c9337ng.c("[]");
        } else {
            c9337ng.b((byte) 91);
            c(dArr[0], c9337ng);
            for (int i2 = 1; i2 < dArr.length; i2++) {
                c9337ng.b((byte) 44);
                c(dArr[i2], c9337ng);
            }
            c9337ng.b((byte) 93);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.nf$b */
    /* loaded from: classes2.dex */
    public static class b {
        final char[] c;
        final int d;

        b(char[] cArr, int i) {
            this.c = cArr;
            this.d = i;
        }
    }

    private static b b(JsonReader jsonReader, int i2) {
        int j2 = jsonReader.j() - i2;
        char[] a2 = jsonReader.a(i2, j2);
        while (jsonReader.j() == jsonReader.a() && !jsonReader.c()) {
            jsonReader.t();
            int a3 = jsonReader.a();
            int i3 = j2 + a3;
            int i4 = jsonReader.i;
            if (i3 > i4) {
                throw jsonReader.a("Too many digits detected in number", i3, "Number of digits larger than %d. Unable to read number", Integer.valueOf(i4));
            }
            char[] cArr = new char[i3];
            System.arraycopy(a2, 0, cArr, 0, j2);
            System.arraycopy(jsonReader.a(0, a3), 0, cArr, j2, a3);
            j2 = i3;
            a2 = cArr;
        }
        return new b(a2, j2);
    }

    public static double e(JsonReader jsonReader) {
        if (jsonReader.i() == 34) {
            return e(jsonReader.l(), (jsonReader.a() - jsonReader.a()) - 1, jsonReader, true);
        }
        int t2 = jsonReader.t();
        int a2 = jsonReader.a();
        byte[] bArr = jsonReader.c;
        if (bArr[t2] == 45) {
            return -c(bArr, jsonReader, t2, a2, 1);
        }
        return c(bArr, jsonReader, t2, a2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        c(r23, r24, r25, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double c(byte[] r22, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9336nf.c(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int, int):double");
    }

    private static double d(int i2, double d2, int i3) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        int i4 = ((int) (doubleToRawLongBits >> 52)) - 1022;
        return Double.longBitsToDouble(doubleToRawLongBits + (((i2 * W[i3 + 1]) + S[i4]) / Q[i4]));
    }

    private static double e(JsonReader jsonReader, long j2, int i2, double d2, byte[] bArr, int i3, int i4, int i5, int i6) {
        int b2;
        double d3;
        double d4;
        if (jsonReader.d == JsonReader.DoublePrecision.EXACT) {
            int i7 = (i4 - i3) - i5;
            return e(jsonReader.a(i3 + i5, i7), i7, jsonReader, false);
        }
        int i8 = i6 + 1;
        byte b3 = bArr[i8];
        if (b3 == 45) {
            b2 = b(bArr, jsonReader, i8, i4);
        } else if (b3 == 43) {
            b2 = b(bArr, jsonReader, i8, i4, 1);
        } else {
            b2 = b(bArr, jsonReader, i8, i4, 0);
        }
        int i9 = b2 - i2;
        if (d2 == 0.0d) {
            if (i9 == 0 || j2 == 0) {
                return j2;
            }
            if (i9 > 0) {
                double[] dArr = U;
                if (i9 < dArr.length) {
                    return j2 * dArr[i9 - 1];
                }
            }
            if (i9 < 0) {
                int i10 = -i9;
                double[] dArr2 = U;
                if (i10 < dArr2.length) {
                    return j2 / dArr2[i10 - 1];
                }
            }
            if (jsonReader.d != JsonReader.DoublePrecision.HIGH) {
                if (i9 > 0 && i9 < 300) {
                    return j2 * Math.pow(10.0d, i9);
                }
                if (i9 > -300 && i9 < 0) {
                    return j2 / Math.pow(10.0d, i9);
                }
            }
        } else if (i9 == 0) {
            return j2 + d2;
        } else {
            if (i9 > 0) {
                double[] dArr3 = U;
                if (i9 < dArr3.length) {
                    double d5 = dArr3[i9 - 1];
                    d3 = d2 * d5;
                    d4 = j2 * d5;
                    return d3 + d4;
                }
            }
            if (i9 < 0) {
                int i11 = -i9;
                double[] dArr4 = U;
                if (i11 < dArr4.length) {
                    double d6 = dArr4[i11 - 1];
                    d3 = d2 / d6;
                    d4 = j2 / d6;
                    return d3 + d4;
                }
            }
            if (jsonReader.d != JsonReader.DoublePrecision.HIGH) {
                if (i9 > 0 && i9 < 300) {
                    return j2 * Math.pow(10.0d, i9);
                }
                if (i9 > -300 && i9 < 0) {
                    return j2 / Math.pow(10.0d, i9);
                }
            }
        }
        int i12 = (i4 - i3) - i5;
        return e(jsonReader.a(i3 + i5, i12), i12, jsonReader, false);
    }

    private static double e(char[] cArr, int i2, JsonReader jsonReader, boolean z2) {
        int i3;
        char c2;
        int i4 = i2;
        while (i4 > 0 && Character.isWhitespace(cArr[i4 - 1])) {
            i4--;
        }
        if (i4 > jsonReader.i) {
            throw jsonReader.d("Too many digits detected in number", i2, "", "Too many digits detected in number", Integer.valueOf(i4), "");
        }
        int i5 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i5] == '0' && i4 > (i3 = i5 + 1) && (c2 = cArr[i3]) >= '0' && c2 <= '9') {
            throw jsonReader.e("Leading zero is not allowed. Error parsing number", i2 + (z2 ? 2 : 0));
        }
        try {
            return Double.parseDouble(new String(cArr, 0, i4));
        } catch (NumberFormatException e2) {
            throw jsonReader.e("Error parsing number", i2 + (z2 ? 2 : 0), e2);
        }
    }

    public static void e(Float f2, C9337ng c9337ng) {
        if (f2 == null) {
            c9337ng.b();
        } else {
            a(f2.floatValue(), c9337ng);
        }
    }

    public static void a(float f2, C9337ng c9337ng) {
        if (f2 == Float.POSITIVE_INFINITY) {
            c9337ng.c("\"Infinity\"");
        } else if (f2 == Float.NEGATIVE_INFINITY) {
            c9337ng.c("\"-Infinity\"");
        } else if (f2 != f2) {
            c9337ng.c("\"NaN\"");
        } else {
            c9337ng.c(Float.toString(f2));
        }
    }

    public static void b(float[] fArr, C9337ng c9337ng) {
        if (fArr == null) {
            c9337ng.b();
        } else if (fArr.length == 0) {
            c9337ng.c("[]");
        } else {
            c9337ng.b((byte) 91);
            a(fArr[0], c9337ng);
            for (int i2 = 1; i2 < fArr.length; i2++) {
                c9337ng.b((byte) 44);
                a(fArr[i2], c9337ng);
            }
            c9337ng.b((byte) 93);
        }
    }

    public static float b(JsonReader jsonReader) {
        if (jsonReader.i() == 34) {
            return a(jsonReader.l(), (jsonReader.a() - jsonReader.a()) - 1, jsonReader, true);
        }
        int t2 = jsonReader.t();
        int a2 = jsonReader.a();
        if (a2 == jsonReader.j()) {
            b b2 = b(jsonReader, t2);
            return a(b2.c, b2.d, jsonReader, false);
        }
        byte[] bArr = jsonReader.c;
        if (bArr[t2] == 45) {
            return -e(bArr, jsonReader, t2, a2, 1);
        }
        return e(bArr, jsonReader, t2, a2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        c(r22, r23, r24, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static float e(byte[] r21, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9336nf.e(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int, int):float");
    }

    private static float b(JsonReader jsonReader, long j2, int i2, byte[] bArr, int i3, int i4) {
        int b2;
        byte b3 = bArr[i4];
        if (b3 == 45) {
            b2 = b(bArr, jsonReader, i4, i3);
        } else if (b3 == 43) {
            b2 = b(bArr, jsonReader, i4, i3, 1);
        } else {
            b2 = b(bArr, jsonReader, i4, i3, 0);
        }
        int i5 = b2 - i2;
        if (i5 == 0 || j2 == 0) {
            return (float) j2;
        }
        if (i5 > 0) {
            double[] dArr = U;
            if (i5 < dArr.length) {
                return (float) (j2 * dArr[i5 - 1]);
            }
        }
        if (i5 < 0) {
            int i6 = -i5;
            double[] dArr2 = U;
            if (i6 < dArr2.length) {
                return (float) (j2 / dArr2[i6 - 1]);
            }
        }
        return i5 > 0 ? Float.POSITIVE_INFINITY : 0.0f;
    }

    private static float a(char[] cArr, int i2, JsonReader jsonReader, boolean z2) {
        int i3;
        char c2;
        int i4 = i2;
        while (i4 > 0 && Character.isWhitespace(cArr[i4 - 1])) {
            i4--;
        }
        if (i4 > jsonReader.i) {
            throw jsonReader.d("Too many digits detected in number", i2, "", "Too many digits detected in number", Integer.valueOf(i4), "");
        }
        int i5 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i5] == '0' && i4 > (i3 = i5 + 1) && (c2 = cArr[i3]) >= '0' && c2 <= '9') {
            throw jsonReader.e("Leading zero is not allowed. Error parsing number", i2 + (z2 ? 2 : 0));
        }
        try {
            return Float.parseFloat(new String(cArr, 0, i4));
        } catch (NumberFormatException e2) {
            throw jsonReader.e("Error parsing number", i2 + (z2 ? 2 : 0), e2);
        }
    }

    public static void c(Integer num, C9337ng c9337ng) {
        if (num == null) {
            c9337ng.b();
        } else {
            c(num.intValue(), c9337ng);
        }
    }

    public static void c(int i2, C9337ng c9337ng) {
        byte[] b2 = c9337ng.b(11);
        int a2 = c9337ng.a();
        c9337ng.e(e(b2, a2, i2) - a2);
    }

    private static int e(byte[] bArr, int i2, int i3) {
        int i4;
        if (i3 < 0) {
            if (i3 == Integer.MIN_VALUE) {
                int i5 = 0;
                while (true) {
                    byte[] bArr2 = P;
                    if (i5 < bArr2.length) {
                        bArr[i2 + i5] = bArr2[i5];
                        i5++;
                    } else {
                        return i2 + bArr2.length;
                    }
                }
            } else {
                i3 = -i3;
                bArr[i2] = 45;
                i2++;
            }
        }
        int i6 = i3 / 1000;
        if (i6 == 0) {
            return i2 + b(bArr, R[i3], i2);
        }
        int i7 = i3 - (i6 * 1000);
        int i8 = i6 / 1000;
        if (i8 == 0) {
            int[] iArr = R;
            int i9 = iArr[i7];
            int b2 = b(bArr, iArr[i6], i2);
            a(bArr, i9, i2 + b2);
            return i2 + 3 + b2;
        }
        int i10 = i8 / 1000;
        int[] iArr2 = R;
        int i11 = iArr2[i7];
        int i12 = iArr2[i6 - (i8 * 1000)];
        if (i10 == 0) {
            i4 = i2 + b(bArr, iArr2[i8], i2);
        } else {
            bArr[i2] = (byte) (i10 + 48);
            a(bArr, iArr2[i8 - (i10 * 1000)], i2 + 1);
            i4 = i2 + 4;
        }
        a(bArr, i12, i4);
        a(bArr, i11, i4 + 3);
        return i4 + 6;
    }

    public static void a(int[] iArr, C9337ng c9337ng) {
        if (iArr == null) {
            c9337ng.b();
        } else if (iArr.length == 0) {
            c9337ng.c("[]");
        } else {
            byte[] b2 = c9337ng.b((iArr.length * 11) + 2);
            int a2 = c9337ng.a();
            b2[a2] = 91;
            int e2 = e(b2, a2 + 1, iArr[0]);
            for (int i2 = 1; i2 < iArr.length; i2++) {
                b2[e2] = 44;
                e2 = e(b2, e2 + 1, iArr[i2]);
            }
            b2[e2] = 93;
            c9337ng.e((e2 + 1) - c9337ng.a());
        }
    }

    public static void c(short[] sArr, C9337ng c9337ng) {
        if (sArr == null) {
            c9337ng.b();
        } else if (sArr.length == 0) {
            c9337ng.c("[]");
        } else {
            c9337ng.b((byte) 91);
            c((int) sArr[0], c9337ng);
            for (int i2 = 1; i2 < sArr.length; i2++) {
                c9337ng.b((byte) 44);
                c((int) sArr[i2], c9337ng);
            }
            c9337ng.b((byte) 93);
        }
    }

    public static short n(JsonReader jsonReader) {
        int b2;
        if (jsonReader.i() == 34) {
            int a2 = jsonReader.a();
            try {
                return b(jsonReader.l(), (jsonReader.a() - a2) - 1, jsonReader, true).shortValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.e("Short overflow detected", jsonReader.a() - a2);
            }
        }
        int t2 = jsonReader.t();
        int a3 = jsonReader.a();
        byte[] bArr = jsonReader.c;
        if (bArr[t2] == 45) {
            b2 = b(bArr, jsonReader, t2, a3);
        } else {
            b2 = b(bArr, jsonReader, t2, a3, 0);
        }
        if (b2 < -32768 || b2 > 32767) {
            throw jsonReader.e("Short overflow detected", jsonReader.a());
        }
        return (short) b2;
    }

    public static int g(JsonReader jsonReader) {
        int i2;
        byte b2;
        byte b3;
        if (jsonReader.i() == 34) {
            int a2 = jsonReader.a();
            try {
                return b(jsonReader.l(), (jsonReader.a() - a2) - 1, jsonReader, true).intValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.e("Integer overflow detected", jsonReader.a() - a2);
            }
        }
        int t2 = jsonReader.t();
        int a3 = jsonReader.a();
        byte[] bArr = jsonReader.c;
        byte b4 = bArr[t2];
        if (b4 == 45) {
            int i3 = t2 + 2;
            if (a3 > i3 && bArr[t2 + 1] == 48 && (b3 = bArr[i3]) >= 48 && b3 <= 57) {
                c(jsonReader, t2, a3, "Leading zero is not allowed");
            }
            return b(bArr, jsonReader, t2, a3);
        }
        if (b4 == 48 && a3 > (i2 = t2 + 1) && (b2 = bArr[i2]) >= 48 && b2 <= 57) {
            c(jsonReader, t2, a3, "Leading zero is not allowed");
        }
        return b(bArr, jsonReader, t2, a3, 0);
    }

    private static int b(byte[] bArr, JsonReader jsonReader, int i2, int i3, int i4) {
        int i5 = i4 + i2;
        if (i5 == i3) {
            c(jsonReader, i2, i3, "Digit not found");
        }
        int i6 = 0;
        for (int i7 = i5; i7 < i3; i7++) {
            int i8 = bArr[i7] - 48;
            if (i8 < 0 || i8 > 9) {
                if (i7 <= i5 || !jsonReader.e(i7, i3)) {
                    if (i7 == i3 - 1 && bArr[i7] == 46) {
                        c(jsonReader, i2, i3, "Number ends with a dot");
                    }
                    int i9 = i3 - i2;
                    BigDecimal b2 = b(jsonReader.a(i2, i9), i9, jsonReader, false);
                    if (b2.scale() > 0) {
                        e(jsonReader, i2, i3, "Expecting int but found decimal value", b2);
                    }
                    return b2.intValue();
                }
                return i6;
            }
            i6 = (i6 << 3) + (i6 << 1) + i8;
            if (i6 < 0) {
                c(jsonReader, i2, i3, "Integer overflow detected");
            }
        }
        return i6;
    }

    private static int b(byte[] bArr, JsonReader jsonReader, int i2, int i3) {
        int i4 = i2 + 1;
        if (i4 == i3) {
            c(jsonReader, i2, i3, "Digit not found");
        }
        int i5 = 0;
        for (int i6 = i4; i6 < i3; i6++) {
            int i7 = bArr[i6] - 48;
            if (i7 < 0 || i7 > 9) {
                if (i6 <= i4 || !jsonReader.e(i6, i3)) {
                    if (i6 == i3 - 1 && bArr[i6] == 46) {
                        c(jsonReader, i2, i3, "Number ends with a dot");
                    }
                    int i8 = i3 - i2;
                    BigDecimal b2 = b(jsonReader.a(i2, i8), i8, jsonReader, false);
                    if (b2.scale() > 0) {
                        e(jsonReader, i2, i3, "Expecting int but found decimal value", b2);
                    }
                    return b2.intValue();
                }
                return i5;
            }
            i5 = ((i5 << 3) + (i5 << 1)) - i7;
            if (i5 > 0) {
                c(jsonReader, i2, i3, "Integer overflow detected");
            }
        }
        return i5;
    }

    public static int[] h(JsonReader jsonReader) {
        if (jsonReader.i() == 93) {
            return t;
        }
        int[] iArr = new int[4];
        iArr[0] = g(jsonReader);
        int i2 = 1;
        while (jsonReader.d() == 44) {
            jsonReader.d();
            if (i2 == iArr.length) {
                iArr = Arrays.copyOf(iArr, iArr.length << 1);
            }
            iArr[i2] = g(jsonReader);
            i2++;
        }
        jsonReader.e();
        return Arrays.copyOf(iArr, i2);
    }

    public static short[] o(JsonReader jsonReader) {
        if (jsonReader.i() == 93) {
            return I;
        }
        short[] sArr = new short[4];
        sArr[0] = (short) g(jsonReader);
        int i2 = 1;
        while (jsonReader.d() == 44) {
            jsonReader.d();
            if (i2 == sArr.length) {
                sArr = Arrays.copyOf(sArr, sArr.length << 1);
            }
            sArr[i2] = (short) g(jsonReader);
            i2++;
        }
        jsonReader.e();
        return Arrays.copyOf(sArr, i2);
    }

    public static long[] j(JsonReader jsonReader) {
        if (jsonReader.i() == 93) {
            return w;
        }
        long[] jArr = new long[4];
        jArr[0] = i(jsonReader);
        int i2 = 1;
        while (jsonReader.d() == 44) {
            jsonReader.d();
            if (i2 == jArr.length) {
                jArr = Arrays.copyOf(jArr, jArr.length << 1);
            }
            jArr[i2] = i(jsonReader);
            i2++;
        }
        jsonReader.e();
        return Arrays.copyOf(jArr, i2);
    }

    public static float[] d(JsonReader jsonReader) {
        if (jsonReader.i() == 93) {
            return m;
        }
        float[] fArr = new float[4];
        fArr[0] = b(jsonReader);
        int i2 = 1;
        while (jsonReader.d() == 44) {
            jsonReader.d();
            if (i2 == fArr.length) {
                fArr = Arrays.copyOf(fArr, fArr.length << 1);
            }
            fArr[i2] = b(jsonReader);
            i2++;
        }
        jsonReader.e();
        return Arrays.copyOf(fArr, i2);
    }

    public static double[] a(JsonReader jsonReader) {
        if (jsonReader.i() == 93) {
            return a;
        }
        double[] dArr = new double[4];
        dArr[0] = e(jsonReader);
        int i2 = 1;
        while (jsonReader.d() == 44) {
            jsonReader.d();
            if (i2 == dArr.length) {
                dArr = Arrays.copyOf(dArr, dArr.length << 1);
            }
            dArr[i2] = e(jsonReader);
            i2++;
        }
        jsonReader.e();
        return Arrays.copyOf(dArr, i2);
    }

    public static void c(Long l2, C9337ng c9337ng) {
        if (l2 == null) {
            c9337ng.b();
        } else {
            c(l2.longValue(), c9337ng);
        }
    }

    private static int b(byte[] bArr, int i2, int i3) {
        int i4 = i2 >> 24;
        if (i4 == 0) {
            bArr[i3] = (byte) (i2 >> 16);
            int i5 = i3 + 2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            i3 = i5;
        } else if (i4 == 1) {
            bArr[i3] = (byte) (i2 >> 8);
            i3++;
        }
        bArr[i3] = (byte) i2;
        return 3 - i4;
    }

    private static void a(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (i2 >> 16);
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) i2;
    }

    public static void c(long j2, C9337ng c9337ng) {
        byte[] b2 = c9337ng.b(21);
        int a2 = c9337ng.a();
        c9337ng.e(c(b2, a2, j2) - a2);
    }

    private static int c(byte[] bArr, int i2, long j2) {
        int i3;
        if (j2 < 0) {
            if (j2 == Long.MIN_VALUE) {
                int i4 = 0;
                while (true) {
                    byte[] bArr2 = O;
                    if (i4 < bArr2.length) {
                        bArr[i2 + i4] = bArr2[i4];
                        i4++;
                    } else {
                        return i2 + bArr2.length;
                    }
                }
            } else {
                j2 = -j2;
                bArr[i2] = 45;
                i2++;
            }
        }
        long j3 = j2 / 1000;
        if (j3 == 0) {
            return i2 + b(bArr, R[(int) j2], i2);
        }
        int i5 = (int) (j2 - (j3 * 1000));
        long j4 = j3 / 1000;
        if (j4 == 0) {
            int[] iArr = R;
            int i6 = iArr[i5];
            int b2 = b(bArr, iArr[(int) j3], i2);
            a(bArr, i6, i2 + b2);
            return i2 + 3 + b2;
        }
        int i7 = (int) (j3 - (j4 * 1000));
        long j5 = j4 / 1000;
        if (j5 == 0) {
            int[] iArr2 = R;
            int i8 = iArr2[i5];
            int i9 = iArr2[i7];
            int b3 = i2 + b(bArr, iArr2[(int) j4], i2);
            a(bArr, i9, b3);
            a(bArr, i8, b3 + 3);
            return b3 + 6;
        }
        int i10 = (int) (j4 - (j5 * 1000));
        int i11 = (int) (j5 / 1000);
        if (i11 == 0) {
            int[] iArr3 = R;
            int i12 = iArr3[i5];
            int i13 = iArr3[i7];
            int i14 = iArr3[i10];
            int b4 = i2 + b(bArr, iArr3[(int) j5], i2);
            a(bArr, i14, b4);
            a(bArr, i13, b4 + 3);
            a(bArr, i12, b4 + 6);
            return b4 + 9;
        }
        int i15 = (int) (j5 - (i11 * 1000));
        int i16 = i11 / 1000;
        if (i16 == 0) {
            int[] iArr4 = R;
            int i17 = iArr4[i5];
            int i18 = iArr4[i7];
            int i19 = iArr4[i10];
            int i20 = iArr4[i15];
            int b5 = i2 + b(bArr, iArr4[i11], i2);
            a(bArr, i20, b5);
            a(bArr, i19, b5 + 3);
            a(bArr, i18, b5 + 6);
            a(bArr, i17, b5 + 9);
            return b5 + 12;
        }
        int i21 = i16 / 1000;
        int[] iArr5 = R;
        int i22 = iArr5[i5];
        int i23 = iArr5[i7];
        int i24 = iArr5[i10];
        int i25 = iArr5[i15];
        int i26 = iArr5[i11 - (i16 * 1000)];
        if (i21 == 0) {
            i3 = i2 + b(bArr, iArr5[i16], i2);
        } else {
            bArr[i2] = (byte) (i21 + 48);
            a(bArr, iArr5[i16 - (i21 * 1000)], i2 + 1);
            i3 = i2 + 4;
        }
        a(bArr, i26, i3);
        a(bArr, i25, i3 + 3);
        a(bArr, i24, i3 + 6);
        a(bArr, i23, i3 + 9);
        a(bArr, i22, i3 + 12);
        return i3 + 15;
    }

    public static void a(long[] jArr, C9337ng c9337ng) {
        if (jArr == null) {
            c9337ng.b();
        } else if (jArr.length == 0) {
            c9337ng.c("[]");
        } else {
            byte[] b2 = c9337ng.b((jArr.length * 21) + 2);
            int a2 = c9337ng.a();
            b2[a2] = 91;
            int c2 = c(b2, a2 + 1, jArr[0]);
            for (int i2 = 1; i2 < jArr.length; i2++) {
                b2[c2] = 44;
                c2 = c(b2, c2 + 1, jArr[i2]);
            }
            b2[c2] = 93;
            c9337ng.e((c2 + 1) - c9337ng.a());
        }
    }

    public static long i(JsonReader jsonReader) {
        boolean z2;
        if (jsonReader.i() == 34) {
            int a2 = jsonReader.a();
            try {
                return b(jsonReader.l(), (jsonReader.a() - a2) - 1, jsonReader, true).longValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.e("Long overflow detected", jsonReader.a() - a2);
            }
        }
        int t2 = jsonReader.t();
        int a3 = jsonReader.a();
        byte[] bArr = jsonReader.c;
        byte b2 = bArr[t2];
        char c2 = 3;
        int i2 = 9;
        byte b3 = 48;
        if (b2 == 45) {
            int i3 = t2 + 1;
            if (i3 == a3) {
                c(jsonReader, t2, a3, "Digit not found");
            }
            z2 = bArr[i3] == 48;
            int i4 = i3;
            long j2 = 0;
            while (i4 < a3) {
                int i5 = bArr[i4] - 48;
                if (i5 < 0 || i5 > i2) {
                    if (z2 && i4 > t2 + 2) {
                        c(jsonReader, t2, a3, "Leading zero is not allowed");
                    }
                    return (i4 <= i3 || !jsonReader.e(i4, a3)) ? e(jsonReader, t2, a3) : j2;
                }
                j2 = ((j2 << c2) + (j2 << 1)) - i5;
                if (j2 > 0) {
                    c(jsonReader, t2, a3, "Long overflow detected");
                }
                i4++;
                c2 = 3;
                i2 = 9;
            }
            if (z2 && i4 > t2 + 2) {
                c(jsonReader, t2, a3, "Leading zero is not allowed");
            }
            return j2;
        }
        if (t2 == a3) {
            c(jsonReader, t2, a3, "Digit not found");
        }
        z2 = bArr[t2] == 48;
        int i6 = t2;
        long j3 = 0;
        while (i6 < a3) {
            int i7 = bArr[i6] - b3;
            if (i7 < 0 || i7 > 9) {
                if (z2 && i6 > t2 + 1) {
                    c(jsonReader, t2, a3, "Leading zero is not allowed");
                }
                return (b2 == 43 && i6 > t2 + 1 && jsonReader.e(i6, a3)) ? j3 : (b2 == 43 || i6 <= t2 || !jsonReader.e(i6, a3)) ? e(jsonReader, t2, a3) : j3;
            }
            j3 = (j3 << 3) + (j3 << 1) + i7;
            if (j3 < 0) {
                c(jsonReader, t2, a3, "Long overflow detected");
            }
            i6++;
            b3 = 48;
        }
        if (z2 && i6 > t2 + 1) {
            c(jsonReader, t2, a3, "Leading zero is not allowed");
        }
        return j3;
    }

    private static long e(JsonReader jsonReader, int i2, int i3) {
        int i4 = i3 - i2;
        char[] a2 = jsonReader.a(i2, i4);
        if (i4 > 0 && a2[i4 - 1] == '.') {
            c(jsonReader, i2, i3, "Number ends with a dot");
        }
        BigDecimal b2 = b(a2, i4, jsonReader, false);
        if (b2.scale() > 0) {
            e(jsonReader, i2, i3, "Expecting long, but found decimal value ", b2);
        }
        return b2.longValue();
    }

    public static void b(BigDecimal bigDecimal, C9337ng c9337ng) {
        if (bigDecimal == null) {
            c9337ng.b();
        } else {
            c9337ng.c(bigDecimal.toString());
        }
    }

    public static BigDecimal c(JsonReader jsonReader) {
        if (jsonReader.i() == 34) {
            return b(jsonReader.b, jsonReader.h(), jsonReader, true);
        }
        int t2 = jsonReader.t();
        int a2 = jsonReader.a();
        if (a2 == jsonReader.j()) {
            b b2 = b(jsonReader, t2);
            return b(b2.c, b2.d, jsonReader, false);
        }
        int i2 = a2 - t2;
        if (i2 > 18) {
            return b(jsonReader.a(t2, i2), i2, jsonReader, false);
        }
        byte[] bArr = jsonReader.c;
        if (bArr[t2] == 45) {
            return e(bArr, jsonReader, t2, a2);
        }
        return d(bArr, jsonReader, t2, a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        c(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.math.BigDecimal d(byte[] r19, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9336nf.d(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.math.BigDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        c(r21, r22, r23, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.math.BigDecimal e(byte[] r20, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9336nf.e(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.math.BigDecimal");
    }

    private static Number e(BigDecimal bigDecimal, JsonReader.UnknownNumberParsing unknownNumberParsing) {
        return unknownNumberParsing == JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL ? bigDecimal : Double.valueOf(bigDecimal.doubleValue());
    }

    private static Number b(char[] cArr, int i2, JsonReader jsonReader) {
        BigDecimal b2 = b(cArr, i2, jsonReader, false);
        if (b2.scale() == 0 && b2.precision() <= 19) {
            if (b2.signum() == 1) {
                if (b2.compareTo(f13885J) <= 0) {
                    return Long.valueOf(b2.longValue());
                }
            } else if (b2.compareTo(M) >= 0) {
                return Long.valueOf(b2.longValue());
            }
        }
        return e(b2, jsonReader.g);
    }

    public static Number f(JsonReader jsonReader) {
        JsonReader.UnknownNumberParsing unknownNumberParsing = jsonReader.g;
        if (unknownNumberParsing == JsonReader.UnknownNumberParsing.BIGDECIMAL) {
            return c(jsonReader);
        }
        if (unknownNumberParsing == JsonReader.UnknownNumberParsing.DOUBLE) {
            return Double.valueOf(e(jsonReader));
        }
        int t2 = jsonReader.t();
        int a2 = jsonReader.a();
        if (a2 == jsonReader.j()) {
            b b2 = b(jsonReader, t2);
            return b(b2.c, b2.d, jsonReader);
        }
        int i2 = a2 - t2;
        if (i2 > 18) {
            return b(jsonReader.a(t2, i2), i2, jsonReader);
        }
        byte[] bArr = jsonReader.c;
        if (bArr[t2] == 45) {
            return a(bArr, jsonReader, t2, a2);
        }
        return c(bArr, jsonReader, t2, a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        c(r19, r20, r21, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Number c(byte[] r18, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9336nf.c(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.lang.Number");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
        c(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Number a(byte[] r19, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9336nf.a(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.lang.Number");
    }
}
