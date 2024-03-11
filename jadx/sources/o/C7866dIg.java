package o;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref;
import o.C7862dIc;
import okhttp3.Protocol;
import okio.ByteString;

/* renamed from: o.dIg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7866dIg implements InterfaceC7830dGy, C7862dIc.c {
    public static final d c = new d(null);
    private static final List<Protocol> d;
    private dGH B;
    private C7865dIf C;
    private boolean a;
    private dFY b;
    private boolean e;
    private final ArrayDeque<Object> f;
    private final AbstractC7827dGv g;
    private final String h;
    private C7863dId i;
    private boolean j;
    private long k;
    private final ArrayDeque<ByteString> l;
    private final C7826dGu m;
    private final long n;

    /* renamed from: o  reason: collision with root package name */
    private String f13813o;
    private final Random p;
    private long q;
    private String r;
    private C7862dIc s;
    private int t;
    private int u;
    private dGK v;
    private int w;
    private int x;
    private b y;

    public final AbstractC7827dGv d() {
        return this.g;
    }

    public C7866dIg(dGL dgl, C7826dGu c7826dGu, AbstractC7827dGv abstractC7827dGv, Random random, long j2, C7863dId c7863dId, long j3) {
        C8632dsu.d(dgl, "");
        C8632dsu.d(c7826dGu, "");
        C8632dsu.d(abstractC7827dGv, "");
        C8632dsu.d(random, "");
        this.m = c7826dGu;
        this.g = abstractC7827dGv;
        this.p = random;
        this.n = j2;
        this.i = c7863dId;
        this.k = j3;
        this.v = dgl.b();
        this.l = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.t = -1;
        if (!C8632dsu.c((Object) "GET", (Object) c7826dGu.i())) {
            throw new IllegalArgumentException(("Request must be GET: " + c7826dGu.i()).toString());
        }
        ByteString.b bVar = ByteString.c;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.h = ByteString.b.c(bVar, bArr, 0, 0, 3, null).d();
    }

    /* renamed from: o.dIg$i */
    /* loaded from: classes5.dex */
    public static final class i extends dGH {
        final /* synthetic */ long a;
        final /* synthetic */ C7863dId b;
        final /* synthetic */ b c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ C7866dIg i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, long j, C7866dIg c7866dIg, String str3, b bVar, C7863dId c7863dId) {
            super(str2, false, 2, null);
            this.d = str;
            this.a = j;
            this.i = c7866dIg;
            this.e = str3;
            this.c = bVar;
            this.b = c7863dId;
        }

        @Override // o.dGH
        public long d() {
            this.i.c();
            return this.a;
        }
    }

    /* renamed from: o.dIg$j */
    /* loaded from: classes5.dex */
    public static final class j extends dGH {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ Ref.ObjectRef c;
        final /* synthetic */ Ref.ObjectRef d;
        final /* synthetic */ ByteString e;
        final /* synthetic */ Ref.ObjectRef f;
        final /* synthetic */ Ref.IntRef g;
        final /* synthetic */ C7865dIf h;
        final /* synthetic */ Ref.ObjectRef i;
        final /* synthetic */ Ref.ObjectRef j;
        final /* synthetic */ C7866dIg n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z, String str2, boolean z2, C7866dIg c7866dIg, C7865dIf c7865dIf, ByteString byteString, Ref.ObjectRef objectRef, Ref.IntRef intRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.ObjectRef objectRef5) {
            super(str2, z2);
            this.a = str;
            this.b = z;
            this.n = c7866dIg;
            this.h = c7865dIf;
            this.e = byteString;
            this.c = objectRef;
            this.g = intRef;
            this.f = objectRef2;
            this.i = objectRef3;
            this.d = objectRef4;
            this.j = objectRef5;
        }

        @Override // o.dGH
        public long d() {
            this.n.b();
            return -1L;
        }
    }

    public void b() {
        dFY dfy = this.b;
        if (dfy == null) {
            C8632dsu.e();
        }
        dfy.d();
    }

    public final void c(C7823dGr c7823dGr) {
        C8632dsu.d(c7823dGr, "");
        if (this.m.a("Sec-WebSocket-Extensions") != null) {
            d(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (C7824dGs) null);
            return;
        }
        C7823dGr b2 = c7823dGr.v().b(AbstractC7820dGo.c).c(d).b();
        C7826dGu a2 = this.m.g().a("Upgrade", "websocket").a("Connection", "Upgrade").a("Sec-WebSocket-Key", this.h).a("Sec-WebSocket-Version", "13").a("Sec-WebSocket-Extensions", "permessage-deflate").a();
        dGS dgs = new dGS(b2, a2, true);
        this.b = dgs;
        dgs.d(new h(a2));
    }

    /* renamed from: o.dIg$h */
    /* loaded from: classes5.dex */
    public static final class h implements dFZ {
        final /* synthetic */ C7826dGu a;

        h(C7826dGu c7826dGu) {
            this.a = c7826dGu;
        }

        @Override // o.dFZ
        public void e(dFY dfy, C7824dGs c7824dGs) {
            C8632dsu.d(dfy, "");
            C8632dsu.d(c7824dGs, "");
            dGO f = c7824dGs.f();
            try {
                C7866dIg.this.e(c7824dGs, f);
                if (f == null) {
                    C8632dsu.e();
                }
                b k = f.k();
                C7863dId d = C7863dId.d.d(c7824dGs.j());
                C7866dIg.this.i = d;
                if (!C7866dIg.this.d(d)) {
                    synchronized (C7866dIg.this) {
                        C7866dIg.this.f.clear();
                        C7866dIg.this.a(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    C7866dIg.this.a(dGB.f + " WebSocket " + this.a.j().m(), k);
                    C7866dIg.this.d().d(C7866dIg.this, c7824dGs);
                    C7866dIg.this.a();
                } catch (Exception e) {
                    C7866dIg.this.d(e, (C7824dGs) null);
                }
            } catch (IOException e2) {
                if (f != null) {
                    f.m();
                }
                C7866dIg.this.d(e2, c7824dGs);
                dGB.e((Closeable) c7824dGs);
            }
        }

        @Override // o.dFZ
        public void b(dFY dfy, IOException iOException) {
            C8632dsu.d(dfy, "");
            C8632dsu.d(iOException, "");
            C7866dIg.this.d(iOException, (C7824dGs) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(C7863dId c7863dId) {
        if (!c7863dId.g && c7863dId.b == null) {
            Integer num = c7863dId.e;
            if (num != null) {
                int intValue = num.intValue();
                return 8 <= intValue && 15 >= intValue;
            }
            return true;
        }
        return false;
    }

    public final void e(C7824dGs c7824dGs, dGO dgo) {
        boolean a2;
        boolean a3;
        C8632dsu.d(c7824dGs, "");
        if (c7824dGs.c() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + c7824dGs.c() + ' ' + c7824dGs.h() + '\'');
        }
        String c2 = C7824dGs.c(c7824dGs, "Connection", null, 2, null);
        a2 = C8691duz.a("Upgrade", c2, true);
        if (!a2) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + c2 + '\'');
        }
        String c3 = C7824dGs.c(c7824dGs, "Upgrade", null, 2, null);
        a3 = C8691duz.a("websocket", c3, true);
        if (!a3) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + c3 + '\'');
        }
        String c4 = C7824dGs.c(c7824dGs, "Sec-WebSocket-Accept", null, 2, null);
        ByteString.b bVar = ByteString.c;
        String d2 = bVar.e(this.h + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").i().d();
        if (!(!C8632dsu.c((Object) d2, (Object) c4))) {
            if (dgo == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + d2 + "' but was '" + c4 + '\'');
    }

    public final void a(String str, b bVar) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d(bVar, "");
        C7863dId c7863dId = this.i;
        if (c7863dId == null) {
            C8632dsu.e();
        }
        synchronized (this) {
            this.f13813o = str;
            this.y = bVar;
            this.C = new C7865dIf(bVar.c(), bVar.a(), this.p, c7863dId.a, c7863dId.c(bVar.c()), this.k);
            this.B = new c();
            long j2 = this.n;
            if (j2 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                String str2 = str + " ping";
                this.v.d(new i(str2, str2, nanos, this, str, bVar, c7863dId), nanos);
            }
            if (!this.f.isEmpty()) {
                g();
            }
            dpR dpr = dpR.c;
        }
        this.s = new C7862dIc(bVar.c(), bVar.d(), this, c7863dId.a, c7863dId.c(!bVar.c()));
    }

    public final void a() {
        while (this.t == -1) {
            C7862dIc c7862dIc = this.s;
            if (c7862dIc == null) {
                C8632dsu.e();
            }
            c7862dIc.b();
        }
    }

    @Override // o.C7862dIc.c
    public void b(String str) {
        C8632dsu.d((Object) str, "");
        this.g.d(this, str);
    }

    @Override // o.C7862dIc.c
    public void a(ByteString byteString) {
        C8632dsu.d(byteString, "");
        this.g.a(this, byteString);
    }

    @Override // o.C7862dIc.c
    public void c(ByteString byteString) {
        synchronized (this) {
            C8632dsu.d(byteString, "");
            if (!this.j && (!this.e || !this.f.isEmpty())) {
                this.l.add(byteString);
                g();
                this.x++;
            }
        }
    }

    @Override // o.C7862dIc.c
    public void d(ByteString byteString) {
        synchronized (this) {
            C8632dsu.d(byteString, "");
            this.u++;
            this.a = false;
        }
    }

    @Override // o.C7862dIc.c
    public void e(int i2, String str) {
        b bVar;
        C7862dIc c7862dIc;
        C7865dIf c7865dIf;
        C8632dsu.d((Object) str, "");
        if (i2 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.t != -1) {
                throw new IllegalStateException("already closed".toString());
            }
            this.t = i2;
            this.r = str;
            bVar = null;
            if (this.e && this.f.isEmpty()) {
                b bVar2 = this.y;
                this.y = null;
                c7862dIc = this.s;
                this.s = null;
                c7865dIf = this.C;
                this.C = null;
                this.v.h();
                bVar = bVar2;
            } else {
                c7862dIc = null;
                c7865dIf = null;
            }
            dpR dpr = dpR.c;
        }
        try {
            this.g.a(this, i2, str);
            if (bVar != null) {
                this.g.c(this, i2, str);
            }
        } finally {
            if (bVar != null) {
                dGB.e(bVar);
            }
            if (c7862dIc != null) {
                dGB.e(c7862dIc);
            }
            if (c7865dIf != null) {
                dGB.e(c7865dIf);
            }
        }
    }

    @Override // o.InterfaceC7830dGy
    public boolean a(String str) {
        C8632dsu.d((Object) str, "");
        return e(ByteString.c.e(str), 1);
    }

    @Override // o.InterfaceC7830dGy
    public boolean b(ByteString byteString) {
        C8632dsu.d(byteString, "");
        return e(byteString, 2);
    }

    private final boolean e(ByteString byteString, int i2) {
        synchronized (this) {
            if (!this.j && !this.e) {
                if (this.q + byteString.k() > 16777216) {
                    a(1001, (String) null);
                    return false;
                }
                this.q += byteString.k();
                this.f.add(new a(i2, byteString));
                g();
                return true;
            }
            return false;
        }
    }

    @Override // o.InterfaceC7830dGy
    public boolean a(int i2, String str) {
        return a(i2, str, 60000L);
    }

    public final boolean a(int i2, String str, long j2) {
        ByteString byteString;
        synchronized (this) {
            C7864dIe.c.e(i2);
            if (str != null) {
                byteString = ByteString.c.e(str);
                if (byteString.k() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                byteString = null;
            }
            if (!this.j && !this.e) {
                this.e = true;
                this.f.add(new e(i2, byteString, j2));
                g();
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108 A[Catch: all -> 0x01b9, TryCatch #3 {all -> 0x01b9, blocks: (B:32:0x0101, B:33:0x0104, B:34:0x0108, B:37:0x0112, B:39:0x0116, B:40:0x0119, B:41:0x0124, B:43:0x0133, B:48:0x013a, B:49:0x0141, B:50:0x0142, B:53:0x0148, B:55:0x014c, B:56:0x014f, B:42:0x0125), top: B:102:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Type inference failed for: r1v10, types: [o.dIf] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, o.dIg$b] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, o.dIc] */
    /* JADX WARN: Type inference failed for: r2v17, types: [o.dIf, T] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.ByteString] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7866dIg.e():boolean");
    }

    public final void c() {
        synchronized (this) {
            if (this.j) {
                return;
            }
            C7865dIf c7865dIf = this.C;
            if (c7865dIf != null) {
                int i2 = this.a ? this.w : -1;
                this.w++;
                this.a = true;
                dpR dpr = dpR.c;
                if (i2 != -1) {
                    d(new SocketTimeoutException("sent ping but didn't receive pong within " + this.n + "ms (after " + (i2 - 1) + " successful ping/pongs)"), (C7824dGs) null);
                    return;
                }
                try {
                    c7865dIf.a(ByteString.e);
                } catch (IOException e2) {
                    d(e2, (C7824dGs) null);
                }
            }
        }
    }

    public final void d(Exception exc, C7824dGs c7824dGs) {
        C8632dsu.d(exc, "");
        synchronized (this) {
            if (this.j) {
                return;
            }
            this.j = true;
            b bVar = this.y;
            this.y = null;
            C7862dIc c7862dIc = this.s;
            this.s = null;
            C7865dIf c7865dIf = this.C;
            this.C = null;
            this.v.h();
            dpR dpr = dpR.c;
            try {
                this.g.b(this, exc, c7824dGs);
            } finally {
                if (bVar != null) {
                    dGB.e(bVar);
                }
                if (c7862dIc != null) {
                    dGB.e(c7862dIc);
                }
                if (c7865dIf != null) {
                    dGB.e(c7865dIf);
                }
            }
        }
    }

    /* renamed from: o.dIg$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private final int c;
        private final ByteString d;

        public final ByteString d() {
            return this.d;
        }

        public final int e() {
            return this.c;
        }

        public a(int i, ByteString byteString) {
            C8632dsu.d(byteString, "");
            this.c = i;
            this.d = byteString;
        }
    }

    /* renamed from: o.dIg$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private final ByteString a;
        private final long b;
        private final int d;

        public final long a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final ByteString c() {
            return this.a;
        }

        public e(int i, ByteString byteString, long j) {
            this.d = i;
            this.a = byteString;
            this.b = j;
        }
    }

    /* renamed from: o.dIg$b */
    /* loaded from: classes5.dex */
    public static abstract class b implements Closeable {
        private final dIq a;
        private final boolean b;
        private final InterfaceC7871dIn e;

        public final dIq a() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public final InterfaceC7871dIn d() {
            return this.e;
        }

        public b(boolean z, InterfaceC7871dIn interfaceC7871dIn, dIq diq) {
            C8632dsu.d(interfaceC7871dIn, "");
            C8632dsu.d(diq, "");
            this.b = z;
            this.e = interfaceC7871dIn;
            this.a = diq;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dIg$c */
    /* loaded from: classes5.dex */
    public final class c extends dGH {
        public c() {
            super(C7866dIg.this.f13813o + " writer", false, 2, null);
        }

        @Override // o.dGH
        public long d() {
            try {
                return C7866dIg.this.e() ? 0L : -1L;
            } catch (IOException e) {
                C7866dIg.this.d(e, (C7824dGs) null);
                return -1L;
            }
        }
    }

    /* renamed from: o.dIg$d */
    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }
    }

    static {
        List<Protocol> e2;
        e2 = C8566dqi.e(Protocol.HTTP_1_1);
        d = e2;
    }

    private final void g() {
        if (!dGB.h || Thread.holdsLock(this)) {
            dGH dgh = this.B;
            if (dgh != null) {
                dGK.b(this.v, dgh, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}
