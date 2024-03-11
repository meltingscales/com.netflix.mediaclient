package o;

import o.C8646dth;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dts  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8657dts extends C8658dtt {
    public static int b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static double c(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static float c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static long d(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static long e(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static double f(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static float h(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int i(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static C8646dth j(int i, int i2) {
        return C8646dth.c.a(i, i2, -1);
    }

    public static C8646dth e(C8646dth c8646dth) {
        C8632dsu.c((Object) c8646dth, "");
        return C8646dth.c.a(c8646dth.e(), c8646dth.d(), -c8646dth.a());
    }

    public static C8646dth d(C8646dth c8646dth, int i) {
        C8632dsu.c((Object) c8646dth, "");
        C8658dtt.e(i > 0, Integer.valueOf(i));
        C8646dth.a aVar = C8646dth.c;
        int d = c8646dth.d();
        int e = c8646dth.e();
        if (c8646dth.a() <= 0) {
            i = -i;
        }
        return aVar.a(d, e, i);
    }

    public static C8654dtp g(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C8654dtp.e.d();
        }
        return new C8654dtp(i, i2 - 1);
    }

    public static <T extends Comparable<? super T>> T b(T t, T t2) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) t2, "");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    public static <T extends Comparable<? super T>> T b(T t, T t2, T t3) {
        C8632dsu.c((Object) t, "");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            } else if (t.compareTo(t2) < 0) {
                return t2;
            } else {
                if (t.compareTo(t3) > 0) {
                    return t3;
                }
            }
        } else if (t2 != null && t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    public static int c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long b(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static float a(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static double e(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static <T extends Comparable<? super T>> T b(T t, InterfaceC8650dtl<T> interfaceC8650dtl) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) interfaceC8650dtl, "");
        if (!interfaceC8650dtl.e()) {
            return (!interfaceC8650dtl.d(t, interfaceC8650dtl.h()) || interfaceC8650dtl.d(interfaceC8650dtl.h(), t)) ? (!interfaceC8650dtl.d(interfaceC8650dtl.g(), t) || interfaceC8650dtl.d(t, interfaceC8650dtl.g())) ? t : interfaceC8650dtl.g() : interfaceC8650dtl.h();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC8650dtl + '.');
    }
}
