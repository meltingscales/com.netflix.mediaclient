package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import o.C7819dGn;
import o.C7824dGs;
import o.C7837dHe;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;

/* renamed from: o.dHl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7844dHl implements dGZ {
    private volatile boolean b;
    private final C7842dHj f;
    private final dGQ g;
    private final C7834dHb h;
    private volatile C7848dHp i;
    private final Protocol j;
    public static final a d = new a(null);
    private static final List<String> c = dGB.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> a = dGB.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    @Override // o.dGZ
    public dGQ c() {
        return this.g;
    }

    public C7844dHl(C7823dGr c7823dGr, dGQ dgq, C7834dHb c7834dHb, C7842dHj c7842dHj) {
        C8632dsu.d(c7823dGr, "");
        C8632dsu.d(dgq, "");
        C8632dsu.d(c7834dHb, "");
        C8632dsu.d(c7842dHj, "");
        this.g = dgq;
        this.h = c7834dHb;
        this.f = c7842dHj;
        List<Protocol> y = c7823dGr.y();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.j = y.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // o.dGZ
    public dIH e(C7826dGu c7826dGu, long j) {
        C8632dsu.d(c7826dGu, "");
        C7848dHp c7848dHp = this.i;
        if (c7848dHp == null) {
            C8632dsu.e();
        }
        return c7848dHp.i();
    }

    @Override // o.dGZ
    public void a(C7826dGu c7826dGu) {
        C8632dsu.d(c7826dGu, "");
        if (this.i != null) {
            return;
        }
        this.i = this.f.d(d.e(c7826dGu), c7826dGu.b() != null);
        if (this.b) {
            C7848dHp c7848dHp = this.i;
            if (c7848dHp == null) {
                C8632dsu.e();
            }
            c7848dHp.a(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        C7848dHp c7848dHp2 = this.i;
        if (c7848dHp2 == null) {
            C8632dsu.e();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7848dHp2.p().a(this.h.i(), timeUnit);
        C7848dHp c7848dHp3 = this.i;
        if (c7848dHp3 == null) {
            C8632dsu.e();
        }
        c7848dHp3.u().a(this.h.g(), timeUnit);
    }

    @Override // o.dGZ
    public void b() {
        this.f.e();
    }

    @Override // o.dGZ
    public void e() {
        C7848dHp c7848dHp = this.i;
        if (c7848dHp == null) {
            C8632dsu.e();
        }
        c7848dHp.i().close();
    }

    @Override // o.dGZ
    public C7824dGs.b e(boolean z) {
        C7848dHp c7848dHp = this.i;
        if (c7848dHp == null) {
            C8632dsu.e();
        }
        C7824dGs.b c2 = d.c(c7848dHp.s(), this.j);
        if (z && c2.d() == 100) {
            return null;
        }
        return c2;
    }

    @Override // o.dGZ
    public long b(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        if (C7833dHa.d(c7824dGs)) {
            return dGB.e(c7824dGs);
        }
        return 0L;
    }

    @Override // o.dGZ
    public dIJ d(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        C7848dHp c7848dHp = this.i;
        if (c7848dHp == null) {
            C8632dsu.e();
        }
        return c7848dHp.n();
    }

    @Override // o.dGZ
    public void a() {
        this.b = true;
        C7848dHp c7848dHp = this.i;
        if (c7848dHp != null) {
            c7848dHp.a(ErrorCode.CANCEL);
        }
    }

    /* renamed from: o.dHl$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final List<C7845dHm> e(C7826dGu c7826dGu) {
            C8632dsu.d(c7826dGu, "");
            C7819dGn c = c7826dGu.c();
            ArrayList arrayList = new ArrayList(c.c() + 4);
            arrayList.add(new C7845dHm(C7845dHm.c, c7826dGu.i()));
            arrayList.add(new C7845dHm(C7845dHm.g, C7839dHg.b.b(c7826dGu.j())));
            String a = c7826dGu.a("Host");
            if (a != null) {
                arrayList.add(new C7845dHm(C7845dHm.a, a));
            }
            arrayList.add(new C7845dHm(C7845dHm.h, c7826dGu.j().l()));
            int c2 = c.c();
            for (int i = 0; i < c2; i++) {
                String c3 = c.c(i);
                Locale locale = Locale.US;
                C8632dsu.b(locale, "");
                if (c3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = c3.toLowerCase(locale);
                C8632dsu.b(lowerCase, "");
                if (!C7844dHl.c.contains(lowerCase) || (C8632dsu.c((Object) lowerCase, (Object) "te") && C8632dsu.c((Object) c.a(i), (Object) "trailers"))) {
                    arrayList.add(new C7845dHm(lowerCase, c.a(i)));
                }
            }
            return arrayList;
        }

        public final C7824dGs.b c(C7819dGn c7819dGn, Protocol protocol) {
            C8632dsu.d(c7819dGn, "");
            C8632dsu.d(protocol, "");
            C7819dGn.d dVar = new C7819dGn.d();
            int c = c7819dGn.c();
            C7837dHe c7837dHe = null;
            for (int i = 0; i < c; i++) {
                String c2 = c7819dGn.c(i);
                String a = c7819dGn.a(i);
                if (C8632dsu.c((Object) c2, (Object) ":status")) {
                    C7837dHe.e eVar = C7837dHe.b;
                    c7837dHe = eVar.e("HTTP/1.1 " + a);
                } else if (!C7844dHl.a.contains(c2)) {
                    dVar.e(c2, a);
                }
            }
            if (c7837dHe == null) {
                throw new ProtocolException("Expected ':status' header not present");
            }
            return new C7824dGs.b().c(protocol).c(c7837dHe.a).a(c7837dHe.d).d(dVar.b());
        }
    }
}
