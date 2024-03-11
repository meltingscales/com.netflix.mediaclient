package o;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import o.C7850dHr;
import o.dGK;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* renamed from: o.dHj */
/* loaded from: classes5.dex */
public final class C7842dHj implements Closeable {
    public static final a b = new a(null);
    private static final C7852dHt c;
    private final dGL A;
    private final C7851dHs B;
    private long C;
    private final dGK D;
    private long a;
    private final String d;
    private final boolean e;
    private long f;
    private long g;
    private final Set<Integer> h;
    private long i;
    private long j;
    private boolean k;
    private int l;
    private final d m;
    private long n;

    /* renamed from: o */
    private int f13810o;
    private C7852dHt p;
    private final InterfaceC7849dHq q;
    private final dGK r;
    private final C7852dHt s;
    private long t;
    private final c u;
    private final Socket v;
    private final Map<Integer, C7848dHp> w;
    private long x;
    private final dGK y;
    private long z;

    public final void a(int i2) {
        this.f13810o = i2;
    }

    public final void a(C7852dHt c7852dHt) {
        C8632dsu.d(c7852dHt, "");
        this.p = c7852dHt;
    }

    public final boolean a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.f13810o;
    }

    public final boolean d(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final C7852dHt f() {
        return this.p;
    }

    public final int g() {
        return this.l;
    }

    public final C7852dHt h() {
        return this.s;
    }

    public final Map<Integer, C7848dHp> i() {
        return this.w;
    }

    public final d j() {
        return this.m;
    }

    public final C7851dHs k() {
        return this.B;
    }

    public final long n() {
        return this.z;
    }

    public C7842dHj(b bVar) {
        C7852dHt c7852dHt;
        C8632dsu.d(bVar, "");
        boolean a2 = bVar.a();
        this.e = a2;
        this.m = bVar.d();
        this.w = new LinkedHashMap();
        String e2 = bVar.e();
        this.d = e2;
        this.l = bVar.a() ? 3 : 2;
        dGL i2 = bVar.i();
        this.A = i2;
        dGK b2 = i2.b();
        this.D = b2;
        this.r = i2.b();
        this.y = i2.b();
        this.q = bVar.g();
        C7852dHt c7852dHt2 = new C7852dHt();
        if (bVar.a()) {
            c7852dHt2.d(7, 16777216);
        }
        this.s = c7852dHt2;
        this.p = c;
        this.z = c7852dHt.d();
        this.v = bVar.f();
        this.B = new C7851dHs(bVar.j(), a2);
        this.u = new c(this, new C7850dHr(bVar.h(), a2));
        this.h = new LinkedHashSet();
        if (bVar.b() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.b());
            String str = e2 + " ping";
            b2.d(new e(str, str, this, nanos), nanos);
        }
    }

    /* renamed from: o.dHj$e */
    /* loaded from: classes5.dex */
    public static final class e extends dGH {
        final /* synthetic */ C7842dHj a;
        final /* synthetic */ String c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, C7842dHj c7842dHj, long j) {
            super(str2, false, 2, null);
            this.c = str;
            this.a = c7842dHj;
            this.d = j;
        }

        @Override // o.dGH
        public long d() {
            boolean z;
            synchronized (this.a) {
                if (this.a.n < this.a.i) {
                    z = true;
                } else {
                    this.a.i++;
                    z = false;
                }
            }
            if (z) {
                this.a.a((IOException) null);
                return -1L;
            }
            this.a.c(false, 1, 0);
            return this.d;
        }
    }

    /* renamed from: o.dHj$c */
    /* loaded from: classes5.dex */
    public final class c implements C7850dHr.d, drO<dpR> {
        private final C7850dHr c;
        final /* synthetic */ C7842dHj d;

        @Override // o.C7850dHr.d
        public void b(int i, int i2, int i3, boolean z) {
        }

        @Override // o.C7850dHr.d
        public void c() {
        }

        /* renamed from: o.dHj$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends dGH {
            final /* synthetic */ boolean a;
            final /* synthetic */ List b;
            final /* synthetic */ C7848dHp c;
            final /* synthetic */ boolean d;
            final /* synthetic */ String e;
            final /* synthetic */ C7848dHp f;
            final /* synthetic */ int i;
            final /* synthetic */ c j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, C7848dHp c7848dHp, c cVar, C7848dHp c7848dHp2, int i, List list, boolean z3) {
                super(str2, z2);
                this.e = str;
                this.d = z;
                this.c = c7848dHp;
                this.j = cVar;
                this.f = c7848dHp2;
                this.i = i;
                this.b = list;
                this.a = z3;
            }

            @Override // o.dGH
            public long d() {
                try {
                    this.j.d.j().d(this.c);
                    return -1L;
                } catch (IOException e) {
                    dHG b = dHG.i.b();
                    b.d("Http2Connection.Listener failure for " + this.j.d.b(), 4, e);
                    try {
                        this.c.c(ErrorCode.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: o.dHj$c$c */
        /* loaded from: classes5.dex */
        public static final class C0122c extends dGH {
            final /* synthetic */ String a;
            final /* synthetic */ c b;
            final /* synthetic */ C7852dHt c;
            final /* synthetic */ boolean d;
            final /* synthetic */ boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0122c(String str, boolean z, String str2, boolean z2, c cVar, boolean z3, C7852dHt c7852dHt) {
                super(str2, z2);
                this.a = str;
                this.d = z;
                this.b = cVar;
                this.e = z3;
                this.c = c7852dHt;
            }

            @Override // o.dGH
            public long d() {
                this.b.c(this.e, this.c);
                return -1L;
            }
        }

        /* renamed from: o.dHj$c$d */
        /* loaded from: classes5.dex */
        public static final class d extends dGH {
            final /* synthetic */ Ref.LongRef a;
            final /* synthetic */ boolean b;
            final /* synthetic */ boolean c;
            final /* synthetic */ String d;
            final /* synthetic */ Ref.ObjectRef e;
            final /* synthetic */ C7852dHt f;
            final /* synthetic */ Ref.ObjectRef g;
            final /* synthetic */ c i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z, String str2, boolean z2, c cVar, boolean z3, Ref.ObjectRef objectRef, C7852dHt c7852dHt, Ref.LongRef longRef, Ref.ObjectRef objectRef2) {
                super(str2, z2);
                this.d = str;
                this.c = z;
                this.i = cVar;
                this.b = z3;
                this.e = objectRef;
                this.f = c7852dHt;
                this.a = longRef;
                this.g = objectRef2;
            }

            @Override // o.dGH
            public long d() {
                this.i.d.j().a(this.i.d, (C7852dHt) this.e.d);
                return -1L;
            }
        }

        /* renamed from: o.dHj$c$e */
        /* loaded from: classes5.dex */
        public static final class e extends dGH {
            final /* synthetic */ String a;
            final /* synthetic */ int b;
            final /* synthetic */ int c;
            final /* synthetic */ boolean d;
            final /* synthetic */ c e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, boolean z, String str2, boolean z2, c cVar, int i, int i2) {
                super(str2, z2);
                this.a = str;
                this.d = z;
                this.e = cVar;
                this.c = i;
                this.b = i2;
            }

            @Override // o.dGH
            public long d() {
                this.e.d.c(true, this.c, this.b);
                return -1L;
            }
        }

        public c(C7842dHj c7842dHj, C7850dHr c7850dHr) {
            C8632dsu.d(c7850dHr, "");
            this.d = c7842dHj;
            this.c = c7850dHr;
        }

        @Override // o.drO
        public /* synthetic */ dpR invoke() {
            a();
            return dpR.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, o.dHr] */
        public void a() {
            Throwable th;
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                try {
                    this.c.d(this);
                    while (this.c.c(false, this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e3) {
                    e2 = e3;
                } catch (Throwable th2) {
                    th = th2;
                    errorCode = errorCode3;
                    this.d.e(errorCode, errorCode3, e2);
                    dGB.e(this.c);
                    throw th;
                }
                try {
                    this.d.e(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e4) {
                    e2 = e4;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    C7842dHj c7842dHj = this.d;
                    c7842dHj.e(errorCode4, errorCode4, e2);
                    errorCode = c7842dHj;
                    errorCode3 = this.c;
                    dGB.e((Closeable) errorCode3);
                }
                errorCode3 = this.c;
                dGB.e((Closeable) errorCode3);
            } catch (Throwable th3) {
                th = th3;
                this.d.e(errorCode, errorCode3, e2);
                dGB.e(this.c);
                throw th;
            }
        }

        @Override // o.C7850dHr.d
        public void b(boolean z, int i, InterfaceC7871dIn interfaceC7871dIn, int i2) {
            C8632dsu.d(interfaceC7871dIn, "");
            if (this.d.d(i)) {
                this.d.a(i, interfaceC7871dIn, i2, z);
                return;
            }
            C7848dHp b = this.d.b(i);
            if (b == null) {
                this.d.c(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                this.d.b(j);
                interfaceC7871dIn.h(j);
                return;
            }
            b.d(interfaceC7871dIn, i2);
            if (z) {
                b.c(dGB.b, true);
            }
        }

        @Override // o.C7850dHr.d
        public void e(boolean z, int i, int i2, List<C7845dHm> list) {
            C8632dsu.d(list, "");
            if (this.d.d(i)) {
                this.d.d(i, list, z);
                return;
            }
            synchronized (this.d) {
                C7848dHp b = this.d.b(i);
                if (b == null) {
                    if (this.d.k) {
                        return;
                    }
                    if (i <= this.d.c()) {
                        return;
                    }
                    if (i % 2 == this.d.g() % 2) {
                        return;
                    }
                    C7848dHp c7848dHp = new C7848dHp(i, this.d, false, z, dGB.b(list));
                    this.d.a(i);
                    this.d.i().put(Integer.valueOf(i), c7848dHp);
                    String str = this.d.b() + '[' + i + "] onStream";
                    this.d.A.b().d(new a(str, true, str, true, c7848dHp, this, b, i, list, z), 0L);
                    return;
                }
                dpR dpr = dpR.c;
                b.c(dGB.b(list), z);
            }
        }

        @Override // o.C7850dHr.d
        public void b(int i, ErrorCode errorCode) {
            C8632dsu.d(errorCode, "");
            if (this.d.d(i)) {
                this.d.e(i, errorCode);
                return;
            }
            C7848dHp c = this.d.c(i);
            if (c != null) {
                c.d(errorCode);
            }
        }

        @Override // o.C7850dHr.d
        public void e(boolean z, C7852dHt c7852dHt) {
            C8632dsu.d(c7852dHt, "");
            String str = this.d.b() + " applyAndAckSettings";
            this.d.D.d(new C0122c(str, true, str, true, this, z, c7852dHt), 0L);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|(1:9)(1:56)|10|(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:53|54))|55|18|19|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x00d9, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00da, code lost:
            r21.d.a(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [o.dHt, T] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(boolean r22, o.C7852dHt r23) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7842dHj.c.c(boolean, o.dHt):void");
        }

        @Override // o.C7850dHr.d
        public void c(boolean z, int i, int i2) {
            if (!z) {
                String str = this.d.b() + " ping";
                this.d.D.d(new e(str, true, str, true, this, i, i2), 0L);
                return;
            }
            synchronized (this.d) {
                if (i == 1) {
                    this.d.n++;
                } else if (i != 2) {
                    if (i == 3) {
                        this.d.a++;
                        C7842dHj c7842dHj = this.d;
                        if (c7842dHj == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                        }
                        c7842dHj.notifyAll();
                    }
                    dpR dpr = dpR.c;
                } else {
                    this.d.f++;
                }
            }
        }

        @Override // o.C7850dHr.d
        public void b(int i, ErrorCode errorCode, ByteString byteString) {
            int i2;
            C7848dHp[] c7848dHpArr;
            C8632dsu.d(errorCode, "");
            C8632dsu.d(byteString, "");
            byteString.k();
            synchronized (this.d) {
                Object[] array = this.d.i().values().toArray(new C7848dHp[0]);
                if (array != null) {
                    c7848dHpArr = (C7848dHp[]) array;
                    this.d.k = true;
                    dpR dpr = dpR.c;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C7848dHp c7848dHp : c7848dHpArr) {
                if (c7848dHp.j() > i && c7848dHp.r()) {
                    c7848dHp.d(ErrorCode.REFUSED_STREAM);
                    this.d.c(c7848dHp.j());
                }
            }
        }

        @Override // o.C7850dHr.d
        public void a(int i, long j) {
            if (i == 0) {
                synchronized (this.d) {
                    C7842dHj c7842dHj = this.d;
                    c7842dHj.z = c7842dHj.n() + j;
                    C7842dHj c7842dHj2 = this.d;
                    if (c7842dHj2 != null) {
                        c7842dHj2.notifyAll();
                        dpR dpr = dpR.c;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            C7848dHp b = this.d.b(i);
            if (b != null) {
                synchronized (b) {
                    b.d(j);
                    dpR dpr2 = dpR.c;
                }
            }
        }

        @Override // o.C7850dHr.d
        public void d(int i, int i2, List<C7845dHm> list) {
            C8632dsu.d(list, "");
            this.d.d(i2, list);
        }
    }

    /* renamed from: o.dHj$f */
    /* loaded from: classes5.dex */
    public static final class f extends dGH {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;
        final /* synthetic */ C7872dIo c;
        final /* synthetic */ int d;
        final /* synthetic */ boolean e;
        final /* synthetic */ C7842dHj f;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, String str2, boolean z2, C7842dHj c7842dHj, int i, C7872dIo c7872dIo, int i2, boolean z3) {
            super(str2, z2);
            this.b = str;
            this.a = z;
            this.f = c7842dHj;
            this.i = i;
            this.c = c7872dIo;
            this.d = i2;
            this.e = z3;
        }

        @Override // o.dGH
        public long d() {
            try {
                boolean b = this.f.q.b(this.i, this.c, this.d, this.e);
                if (b) {
                    this.f.k().c(this.i, ErrorCode.CANCEL);
                }
                if (b || this.e) {
                    synchronized (this.f) {
                        this.f.h.remove(Integer.valueOf(this.i));
                    }
                    return -1L;
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: o.dHj$g */
    /* loaded from: classes5.dex */
    public static final class g extends dGH {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ List d;
        final /* synthetic */ int e;
        final /* synthetic */ C7842dHj j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z, String str2, boolean z2, C7842dHj c7842dHj, int i, List list, boolean z3) {
            super(str2, z2);
            this.a = str;
            this.b = z;
            this.j = c7842dHj;
            this.e = i;
            this.d = list;
            this.c = z3;
        }

        @Override // o.dGH
        public long d() {
            boolean d = this.j.q.d(this.e, this.d, this.c);
            if (d) {
                try {
                    this.j.k().c(this.e, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (d || this.c) {
                synchronized (this.j) {
                    this.j.h.remove(Integer.valueOf(this.e));
                }
                return -1L;
            }
            return -1L;
        }
    }

    /* renamed from: o.dHj$h */
    /* loaded from: classes5.dex */
    public static final class h extends dGH {
        final /* synthetic */ List a;
        final /* synthetic */ C7842dHj b;
        final /* synthetic */ int c;
        final /* synthetic */ boolean d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z, String str2, boolean z2, C7842dHj c7842dHj, int i, List list) {
            super(str2, z2);
            this.e = str;
            this.d = z;
            this.b = c7842dHj;
            this.c = i;
            this.a = list;
        }

        @Override // o.dGH
        public long d() {
            if (this.b.q.a(this.c, this.a)) {
                try {
                    this.b.k().c(this.c, ErrorCode.CANCEL);
                    synchronized (this.b) {
                        this.b.h.remove(Integer.valueOf(this.c));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    /* renamed from: o.dHj$i */
    /* loaded from: classes5.dex */
    public static final class i extends dGH {
        final /* synthetic */ boolean c;
        final /* synthetic */ String d;
        final /* synthetic */ C7842dHj e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z, String str2, boolean z2, C7842dHj c7842dHj) {
            super(str2, z2);
            this.d = str;
            this.c = z;
            this.e = c7842dHj;
        }

        @Override // o.dGH
        public long d() {
            this.e.c(false, 2, 0);
            return -1L;
        }
    }

    /* renamed from: o.dHj$j */
    /* loaded from: classes5.dex */
    public static final class j extends dGH {
        final /* synthetic */ ErrorCode a;
        final /* synthetic */ C7842dHj b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z, String str2, boolean z2, C7842dHj c7842dHj, int i, ErrorCode errorCode) {
            super(str2, z2);
            this.d = str;
            this.e = z;
            this.b = c7842dHj;
            this.c = i;
            this.a = errorCode;
        }

        @Override // o.dGH
        public long d() {
            this.b.q.c(this.c, this.a);
            synchronized (this.b) {
                this.b.h.remove(Integer.valueOf(this.c));
            }
            return -1L;
        }
    }

    /* renamed from: o.dHj$k */
    /* loaded from: classes5.dex */
    public static final class k extends dGH {
        final /* synthetic */ C7842dHj a;
        final /* synthetic */ boolean b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z, String str2, boolean z2, C7842dHj c7842dHj, int i, long j) {
            super(str2, z2);
            this.d = str;
            this.b = z;
            this.a = c7842dHj;
            this.c = i;
            this.e = j;
        }

        @Override // o.dGH
        public long d() {
            try {
                this.a.k().b(this.c, this.e);
                return -1L;
            } catch (IOException e) {
                this.a.a(e);
                return -1L;
            }
        }
    }

    /* renamed from: o.dHj$m */
    /* loaded from: classes5.dex */
    public static final class m extends dGH {
        final /* synthetic */ ErrorCode a;
        final /* synthetic */ String b;
        final /* synthetic */ C7842dHj c;
        final /* synthetic */ int d;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, boolean z, String str2, boolean z2, C7842dHj c7842dHj, int i, ErrorCode errorCode) {
            super(str2, z2);
            this.b = str;
            this.e = z;
            this.c = c7842dHj;
            this.d = i;
            this.a = errorCode;
        }

        @Override // o.dGH
        public long d() {
            try {
                this.c.b(this.d, this.a);
                return -1L;
            } catch (IOException e) {
                this.c.a(e);
                return -1L;
            }
        }
    }

    public final C7848dHp b(int i2) {
        C7848dHp c7848dHp;
        synchronized (this) {
            c7848dHp = this.w.get(Integer.valueOf(i2));
        }
        return c7848dHp;
    }

    public final C7848dHp c(int i2) {
        C7848dHp remove;
        synchronized (this) {
            remove = this.w.remove(Integer.valueOf(i2));
            notifyAll();
        }
        return remove;
    }

    public final void b(long j2) {
        synchronized (this) {
            long j3 = this.x + j2;
            this.x = j3;
            long j4 = j3 - this.t;
            if (j4 >= this.s.d() / 2) {
                b(0, j4);
                this.t += j4;
            }
        }
    }

    public final C7848dHp d(List<C7845dHm> list, boolean z) {
        C8632dsu.d(list, "");
        return b(0, list, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0048 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:48:0x0005, B:67:0x0053, B:69:0x0056, B:70:0x005c, B:72:0x0061, B:77:0x006f, B:78:0x007a, B:49:0x0006, B:51:0x000d, B:52:0x0012, B:54:0x0016, B:56:0x002a, B:58:0x0032, B:63:0x0042, B:65:0x0048, B:66:0x0051, B:79:0x007b, B:80:0x0080), top: B:87:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.C7848dHp b(int r11, java.util.List<o.C7845dHm> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            o.dHs r7 = r10.B
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L84
            int r0 = r10.l     // Catch: java.lang.Throwable -> L81
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L12
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L81
            r10.b(r0)     // Catch: java.lang.Throwable -> L81
        L12:
            boolean r0 = r10.k     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7b
            int r8 = r10.l     // Catch: java.lang.Throwable -> L81
            int r0 = r8 + 2
            r10.l = r0     // Catch: java.lang.Throwable -> L81
            o.dHp r9 = new o.dHp     // Catch: java.lang.Throwable -> L81
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.C     // Catch: java.lang.Throwable -> L81
            long r3 = r10.z     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.k()     // Catch: java.lang.Throwable -> L81
            long r3 = r9.m()     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = r0
        L42:
            boolean r1 = r9.q()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, o.dHp> r1 = r10.w     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L81
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L81
        L51:
            o.dpR r1 = o.dpR.c     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L5c
            o.dHs r11 = r10.B     // Catch: java.lang.Throwable -> L84
            r11.c(r6, r8, r12)     // Catch: java.lang.Throwable -> L84
            goto L66
        L5c:
            boolean r1 = r10.e     // Catch: java.lang.Throwable -> L84
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            o.dHs r0 = r10.B     // Catch: java.lang.Throwable -> L84
            r0.b(r11, r8, r12)     // Catch: java.lang.Throwable -> L84
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            o.dHs r11 = r10.B
            r11.c()
        L6e:
            return r9
        L6f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L84
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L7b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L84:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7842dHj.b(int, java.util.List, boolean):o.dHp");
    }

    public final void b(int i2, boolean z, List<C7845dHm> list) {
        C8632dsu.d(list, "");
        this.B.c(z, i2, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0038, code lost:
        r4 = (int) java.lang.Math.min(r13, r6 - r4);
        r2.b = r4;
        r4 = java.lang.Math.min(r4, r9.B.b());
        r2.b = r4;
        r7 = r4;
        r9.C += r7;
        r2 = o.dpR.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r10, boolean r11, o.C7872dIo r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            o.dHs r13 = r9.B
            r13.b(r11, r10, r12, r3)
            return
        Ld:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L75
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            monitor-enter(r9)
        L17:
            long r4 = r9.C     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            long r6 = r9.z     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L37
            java.util.Map<java.lang.Integer, o.dHp> r4 = r9.w     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            if (r4 == 0) goto L2f
            r9.wait()     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            goto L17
        L2f:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
            throw r10     // Catch: java.lang.Throwable -> L64 java.lang.InterruptedException -> L66
        L37:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch: java.lang.Throwable -> L64
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L64
            r2.b = r4     // Catch: java.lang.Throwable -> L64
            o.dHs r5 = r9.B     // Catch: java.lang.Throwable -> L64
            int r5 = r5.b()     // Catch: java.lang.Throwable -> L64
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L64
            r2.b = r4     // Catch: java.lang.Throwable -> L64
            long r5 = r9.C     // Catch: java.lang.Throwable -> L64
            long r7 = (long) r4     // Catch: java.lang.Throwable -> L64
            long r5 = r5 + r7
            r9.C = r5     // Catch: java.lang.Throwable -> L64
            o.dpR r2 = o.dpR.c     // Catch: java.lang.Throwable -> L64
            monitor-exit(r9)
            long r13 = r13 - r7
            o.dHs r2 = r9.B
            if (r11 == 0) goto L5f
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L5f
            r5 = 1
            goto L60
        L5f:
            r5 = r3
        L60:
            r2.b(r5, r10, r12, r4)
            goto Ld
        L64:
            r10 = move-exception
            goto L73
        L66:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L64
            r10.interrupt()     // Catch: java.lang.Throwable -> L64
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L64
            r10.<init>()     // Catch: java.lang.Throwable -> L64
            throw r10     // Catch: java.lang.Throwable -> L64
        L73:
            monitor-exit(r9)
            throw r10
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7842dHj.b(int, boolean, o.dIo, long):void");
    }

    public final void c(int i2, ErrorCode errorCode) {
        C8632dsu.d(errorCode, "");
        String str = this.d + '[' + i2 + "] writeSynReset";
        this.D.d(new m(str, true, str, true, this, i2, errorCode), 0L);
    }

    public final void b(int i2, ErrorCode errorCode) {
        C8632dsu.d(errorCode, "");
        this.B.c(i2, errorCode);
    }

    public final void b(int i2, long j2) {
        String str = this.d + '[' + i2 + "] windowUpdate";
        this.D.d(new k(str, true, str, true, this, i2, j2), 0L);
    }

    public final void c(boolean z, int i2, int i3) {
        try {
            this.B.c(z, i2, i3);
        } catch (IOException e2) {
            a(e2);
        }
    }

    public final void e() {
        this.B.c();
    }

    public final void b(ErrorCode errorCode) {
        C8632dsu.d(errorCode, "");
        synchronized (this.B) {
            synchronized (this) {
                if (this.k) {
                    return;
                }
                this.k = true;
                int i2 = this.f13810o;
                dpR dpr = dpR.c;
                this.B.b(i2, errorCode, dGB.d);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void a(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        e(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void a(C7842dHj c7842dHj, boolean z, dGL dgl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            dgl = dGL.e;
        }
        c7842dHj.e(z, dgl);
    }

    public final void e(boolean z, dGL dgl) {
        C8632dsu.d(dgl, "");
        if (z) {
            this.B.d();
            this.B.a(this.s);
            int d2 = this.s.d();
            if (d2 != 65535) {
                this.B.b(0, d2 - 65535);
            }
        }
        dGK b2 = dgl.b();
        String str = this.d;
        b2.d(new dGK.a(this.u, str, true, str, true), 0L);
    }

    public final boolean a(long j2) {
        synchronized (this) {
            if (this.k) {
                return false;
            }
            if (this.f < this.g) {
                if (j2 >= this.j) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void o() {
        synchronized (this) {
            long j2 = this.f;
            long j3 = this.g;
            if (j2 < j3) {
                return;
            }
            this.g = j3 + 1;
            this.j = System.nanoTime() + ((long) Prefetch.NANOSECONDS_PER_SECOND);
            dpR dpr = dpR.c;
            String str = this.d + " ping";
            this.D.d(new i(str, true, str, true, this), 0L);
        }
    }

    /* renamed from: o.dHj$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private boolean a;
        public InterfaceC7871dIn b;
        public String c;
        public Socket d;
        public dIq e;
        private d g;
        private int h;
        private final dGL i;
        private InterfaceC7849dHq j;

        public final boolean a() {
            return this.a;
        }

        public final int b() {
            return this.h;
        }

        public final d d() {
            return this.g;
        }

        public final b e(int i) {
            this.h = i;
            return this;
        }

        public final b e(d dVar) {
            C8632dsu.d(dVar, "");
            this.g = dVar;
            return this;
        }

        public final InterfaceC7849dHq g() {
            return this.j;
        }

        public final dGL i() {
            return this.i;
        }

        public b(boolean z, dGL dgl) {
            C8632dsu.d(dgl, "");
            this.a = z;
            this.i = dgl;
            this.g = d.d;
            this.j = InterfaceC7849dHq.b;
        }

        public final Socket f() {
            Socket socket = this.d;
            if (socket == null) {
                C8632dsu.d("");
            }
            return socket;
        }

        public final String e() {
            String str = this.c;
            if (str == null) {
                C8632dsu.d("");
            }
            return str;
        }

        public final InterfaceC7871dIn h() {
            InterfaceC7871dIn interfaceC7871dIn = this.b;
            if (interfaceC7871dIn == null) {
                C8632dsu.d("");
            }
            return interfaceC7871dIn;
        }

        public final dIq j() {
            dIq diq = this.e;
            if (diq == null) {
                C8632dsu.d("");
            }
            return diq;
        }

        public final b a(Socket socket, String str, InterfaceC7871dIn interfaceC7871dIn, dIq diq) {
            String str2;
            C8632dsu.d(socket, "");
            C8632dsu.d((Object) str, "");
            C8632dsu.d(interfaceC7871dIn, "");
            C8632dsu.d(diq, "");
            this.d = socket;
            if (this.a) {
                str2 = dGB.f + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.c = str2;
            this.b = interfaceC7871dIn;
            this.e = diq;
            return this;
        }

        public final C7842dHj c() {
            return new C7842dHj(this);
        }
    }

    public final void d(int i2, List<C7845dHm> list) {
        C8632dsu.d(list, "");
        synchronized (this) {
            if (this.h.contains(Integer.valueOf(i2))) {
                c(i2, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.h.add(Integer.valueOf(i2));
            String str = this.d + '[' + i2 + "] onRequest";
            this.r.d(new h(str, true, str, true, this, i2, list), 0L);
        }
    }

    public final void d(int i2, List<C7845dHm> list, boolean z) {
        C8632dsu.d(list, "");
        String str = this.d + '[' + i2 + "] onHeaders";
        this.r.d(new g(str, true, str, true, this, i2, list, z), 0L);
    }

    public final void a(int i2, InterfaceC7871dIn interfaceC7871dIn, int i3, boolean z) {
        C8632dsu.d(interfaceC7871dIn, "");
        C7872dIo c7872dIo = new C7872dIo();
        long j2 = i3;
        interfaceC7871dIn.g(j2);
        interfaceC7871dIn.b(c7872dIo, j2);
        String str = this.d + '[' + i2 + "] onData";
        this.r.d(new f(str, true, str, true, this, i2, c7872dIo, i3, z), 0L);
    }

    public final void e(int i2, ErrorCode errorCode) {
        C8632dsu.d(errorCode, "");
        String str = this.d + '[' + i2 + "] onReset";
        this.r.d(new j(str, true, str, true, this, i2, errorCode), 0L);
    }

    /* renamed from: o.dHj$d */
    /* loaded from: classes5.dex */
    public static abstract class d {
        public static final e a = new e(null);
        public static final d d = new a();

        public void a(C7842dHj c7842dHj, C7852dHt c7852dHt) {
            C8632dsu.d(c7842dHj, "");
            C8632dsu.d(c7852dHt, "");
        }

        public abstract void d(C7848dHp c7848dHp);

        /* renamed from: o.dHj$d$e */
        /* loaded from: classes5.dex */
        public static final class e {
            private e() {
            }

            public /* synthetic */ e(C8627dsp c8627dsp) {
                this();
            }
        }

        /* renamed from: o.dHj$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends d {
            a() {
            }

            @Override // o.C7842dHj.d
            public void d(C7848dHp c7848dHp) {
                C8632dsu.d(c7848dHp, "");
                c7848dHp.c(ErrorCode.REFUSED_STREAM, (IOException) null);
            }
        }
    }

    /* renamed from: o.dHj$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final C7852dHt c() {
            return C7842dHj.c;
        }
    }

    static {
        C7852dHt c7852dHt = new C7852dHt();
        c7852dHt.d(7, 65535);
        c7852dHt.d(5, 16384);
        c = c7852dHt;
    }

    public final void e(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i2;
        C7848dHp[] c7848dHpArr;
        C8632dsu.d(errorCode, "");
        C8632dsu.d(errorCode2, "");
        if (!dGB.h || !Thread.holdsLock(this)) {
            try {
                b(errorCode);
            } catch (IOException unused) {
            }
            synchronized (this) {
                if (!this.w.isEmpty()) {
                    Object[] array = this.w.values().toArray(new C7848dHp[0]);
                    if (array != null) {
                        c7848dHpArr = (C7848dHp[]) array;
                        this.w.clear();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    c7848dHpArr = null;
                }
                dpR dpr = dpR.c;
            }
            if (c7848dHpArr != null) {
                for (C7848dHp c7848dHp : c7848dHpArr) {
                    try {
                        c7848dHp.c(errorCode2, iOException);
                    } catch (IOException unused2) {
                    }
                }
            }
            try {
                this.B.close();
            } catch (IOException unused3) {
            }
            try {
                this.v.close();
            } catch (IOException unused4) {
            }
            this.D.h();
            this.r.h();
            this.y.h();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}
