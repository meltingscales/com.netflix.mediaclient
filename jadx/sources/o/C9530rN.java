package o;

import java.lang.reflect.Array;

/* renamed from: o.rN  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9530rN {
    private e a = null;
    private c e = null;
    private i j = null;
    private b b = null;
    private j i = null;
    private a d = null;
    private d c = null;

    public e c() {
        if (this.a == null) {
            this.a = new e();
        }
        return this.a;
    }

    public c a() {
        if (this.e == null) {
            this.e = new c();
        }
        return this.e;
    }

    public i f() {
        if (this.j == null) {
            this.j = new i();
        }
        return this.j;
    }

    public b e() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public j j() {
        if (this.i == null) {
            this.i = new j();
        }
        return this.i;
    }

    public a d() {
        if (this.d == null) {
            this.d = new a();
        }
        return this.d;
    }

    public d b() {
        if (this.c == null) {
            this.c = new d();
        }
        return this.c;
    }

    /* renamed from: o.rN$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC9590sb<boolean[]> {
        @Override // o.AbstractC9590sb
        /* renamed from: d */
        public final boolean[] a(int i) {
            return new boolean[i];
        }
    }

    /* renamed from: o.rN$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC9590sb<byte[]> {
        @Override // o.AbstractC9590sb
        /* renamed from: e */
        public final byte[] a(int i) {
            return new byte[i];
        }
    }

    /* renamed from: o.rN$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC9590sb<short[]> {
        @Override // o.AbstractC9590sb
        /* renamed from: b */
        public final short[] a(int i) {
            return new short[i];
        }
    }

    /* renamed from: o.rN$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC9590sb<int[]> {
        @Override // o.AbstractC9590sb
        /* renamed from: b */
        public final int[] a(int i) {
            return new int[i];
        }
    }

    /* renamed from: o.rN$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC9590sb<long[]> {
        @Override // o.AbstractC9590sb
        /* renamed from: e */
        public final long[] a(int i) {
            return new long[i];
        }
    }

    /* renamed from: o.rN$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC9590sb<float[]> {
        @Override // o.AbstractC9590sb
        /* renamed from: b */
        public final float[] a(int i) {
            return new float[i];
        }
    }

    /* renamed from: o.rN$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC9590sb<double[]> {
        @Override // o.AbstractC9590sb
        /* renamed from: c */
        public final double[] a(int i) {
            return new double[i];
        }
    }

    public static Object e(final Object obj) {
        final int length = Array.getLength(obj);
        final Class<?> cls = obj.getClass();
        return new Object() { // from class: o.rN.2
            public boolean equals(Object obj2) {
                if (obj2 == this) {
                    return true;
                }
                if (C9537rU.c(obj2, cls) && Array.getLength(obj2) == length) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj3 = Array.get(obj, i2);
                        Object obj4 = Array.get(obj2, i2);
                        if (obj3 != obj4 && obj3 != null && !obj3.equals(obj4)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }
}
