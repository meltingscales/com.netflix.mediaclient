package o;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class bFZ extends C9941zV {
    public /* synthetic */ bFZ(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class f extends bFZ {
        public static final f e = new f();

        private f() {
            super(null);
        }
    }

    private bFZ() {
    }

    /* loaded from: classes4.dex */
    public static final class i extends bFZ {
        private final InterfaceC5195buF c;

        public final InterfaceC5195buF b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC5195buF interfaceC5195buF) {
            super(null);
            C8632dsu.c((Object) interfaceC5195buF, "");
            this.c = interfaceC5195buF;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends bFZ {
        private final int a;

        public final int e() {
            return this.a;
        }

        public j(int i) {
            super(null);
            this.a = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends bFZ {
        private final Integer a;
        private final long b;
        private final Long c;
        private final String d;
        private final Integer e;
        private final int f;

        public final long a() {
            return this.b;
        }

        public final Integer b() {
            return this.e;
        }

        public final Integer c() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public final Long e() {
            return this.c;
        }

        public final int i() {
            return this.f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, long j, String str, Integer num, Integer num2, Long l) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.f = i;
            this.b = j;
            this.d = str;
            this.e = num;
            this.a = num2;
            this.c = l;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends bFZ {
        private final boolean d;

        public final boolean e() {
            return this.d;
        }

        public a(boolean z) {
            super(null);
            this.d = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends bFZ {
        public static final g c = new g();

        private g() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends bFZ {
        private final int a;
        private final String c;
        private final List<InterfaceC5227bul> e;

        public final int b() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final List<InterfaceC5227bul> e() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<InterfaceC5227bul> list, int i, String str) {
            super(null);
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) str, "");
            this.e = list;
            this.a = i;
            this.c = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends bFZ {
        private final int d;
        private final int e;

        public final int b() {
            return this.e;
        }

        public final int d() {
            return this.d;
        }

        public h(int i, int i2) {
            super(null);
            this.e = i;
            this.d = i2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends bFZ {
        public static final b e = new b();

        private b() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends bFZ {
        private final String a;
        private final int b;

        public final int b() {
            return this.b;
        }

        public c(int i, String str) {
            super(null);
            this.b = i;
            this.a = str;
        }
    }
}
