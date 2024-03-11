package o;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import kotlin.time.DurationUnit;

/* loaded from: classes5.dex */
public final class duM {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j) {
        return j * ((long) Prefetch.NANOSECONDS_PER_MILLISECOND);
    }

    public static final long a(int i, DurationUnit durationUnit) {
        C8632dsu.c((Object) durationUnit, "");
        if (durationUnit.compareTo(DurationUnit.f) <= 0) {
            return f(duJ.a(i, durationUnit, DurationUnit.j));
        }
        return e(i, durationUnit);
    }

    public static final long e(long j, DurationUnit durationUnit) {
        long b;
        C8632dsu.c((Object) durationUnit, "");
        DurationUnit durationUnit2 = DurationUnit.j;
        long a = duJ.a(4611686018426999999L, durationUnit2, durationUnit);
        if (new C8652dtn(-a, a).e(j)) {
            return f(duJ.a(j, durationUnit, durationUnit2));
        }
        b = C8657dts.b(duJ.b(j, durationUnit, DurationUnit.a), -4611686018427387903L, 4611686018427387903L);
        return g(b);
    }

    public static final long a(double d, DurationUnit durationUnit) {
        long a;
        long a2;
        C8632dsu.c((Object) durationUnit, "");
        double c = duJ.c(d, durationUnit, DurationUnit.j);
        if (!(!Double.isNaN(c))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        a = dsT.a(c);
        if (new C8652dtn(-4611686018426999999L, 4611686018426999999L).e(a)) {
            return f(a);
        }
        a2 = dsT.a(duJ.c(d, durationUnit, DurationUnit.a));
        return i(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long d(java.lang.String r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.duM.d(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final long e(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 <= 0) goto L18
            java.lang.String r5 = "+-"
            char r6 = r9.charAt(r4)
            boolean r5 = o.C8684dus.d(r5, r6, r4, r3, r2)
            if (r5 == 0) goto L18
            r5 = r1
            goto L19
        L18:
            r5 = r4
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6b
            o.dtp r0 = new o.dtp
            int r6 = o.C8684dus.d(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L35
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L35
            goto L5a
        L35:
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L5a
            r5 = r0
            o.dqB r5 = (o.dqB) r5
            int r5 = r5.nextInt()
            o.dtc r6 = new o.dtc
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.b(r5)
            if (r5 != 0) goto L39
            goto L6b
        L5a:
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L65
            r0 = -9223372036854775808
            goto L6a
        L65:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6a:
            return r0
        L6b:
            java.lang.String r0 = "+"
            boolean r0 = o.C8684dus.c(r9, r0, r4, r3, r2)
            if (r0 == 0) goto L77
            java.lang.String r9 = o.C8684dus.e(r9, r1)
        L77:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.duM.e(java.lang.String):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j) {
        return j / ((long) Prefetch.NANOSECONDS_PER_MILLISECOND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j) {
        return duI.a(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j) {
        return duI.a((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j, int i) {
        return duI.a((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j) {
        if (new C8652dtn(-4611686018426999999L, 4611686018426999999L).e(j)) {
            return f(j);
        }
        return g(n(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j) {
        long b;
        if (new C8652dtn(-4611686018426L, 4611686018426L).e(j)) {
            return f(m(j));
        }
        b = C8657dts.b(j, -4611686018427387903L, 4611686018427387903L);
        return g(b);
    }
}
