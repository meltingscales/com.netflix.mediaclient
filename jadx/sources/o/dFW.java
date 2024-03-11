package o;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.TypeCastException;
import o.C7819dGn;
import o.C7824dGs;
import o.C7826dGu;
import o.dGJ;
import o.dHG;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dFW implements Closeable, Flushable {
    public static final c e = new c(null);
    private int a;
    private int b;
    private final dGJ c;
    private int d;
    private int i;
    private int j;

    public final int b() {
        return this.i;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final int e() {
        return this.j;
    }

    public final void e(int i) {
        this.j = i;
    }

    public final C7824dGs c(C7826dGu c7826dGu) {
        C8632dsu.d(c7826dGu, "");
        try {
            dGJ.b a2 = this.c.a(e.a(c7826dGu.j()));
            if (a2 != null) {
                try {
                    e eVar = new e(a2.e(0));
                    C7824dGs b2 = eVar.b(a2);
                    if (eVar.e(c7826dGu, b2)) {
                        return b2;
                    }
                    AbstractC7829dGx e2 = b2.e();
                    if (e2 != null) {
                        dGB.e(e2);
                    }
                    return null;
                } catch (IOException unused) {
                    dGB.e(a2);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final dGE d(C7824dGs c7824dGs) {
        dGJ.a aVar;
        C8632dsu.d(c7824dGs, "");
        String i = c7824dGs.n().i();
        if (C7835dHc.a.d(c7824dGs.n().i())) {
            try {
                e(c7824dGs.n());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C8632dsu.c((Object) i, (Object) "GET")) {
            return null;
        } else {
            c cVar = e;
            if (cVar.b(c7824dGs)) {
                return null;
            }
            e eVar = new e(c7824dGs);
            try {
                aVar = dGJ.e(this.c, cVar.a(c7824dGs.n().j()), 0L, 2, null);
                if (aVar != null) {
                    try {
                        eVar.e(aVar);
                        return new b(this, aVar);
                    } catch (IOException unused2) {
                        e(aVar);
                        return null;
                    }
                }
                return null;
            } catch (IOException unused3) {
                aVar = null;
            }
        }
    }

    public final void e(C7826dGu c7826dGu) {
        C8632dsu.d(c7826dGu, "");
        this.c.b(e.a(c7826dGu.j()));
    }

    public final void e(C7824dGs c7824dGs, C7824dGs c7824dGs2) {
        dGJ.a aVar;
        C8632dsu.d(c7824dGs, "");
        C8632dsu.d(c7824dGs2, "");
        e eVar = new e(c7824dGs2);
        AbstractC7829dGx e2 = c7824dGs.e();
        if (e2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            aVar = ((a) e2).b().b();
            if (aVar != null) {
                try {
                    eVar.e(aVar);
                    aVar.b();
                } catch (IOException unused) {
                    e(aVar);
                }
            }
        } catch (IOException unused2) {
            aVar = null;
        }
    }

    private final void e(dGJ.a aVar) {
        if (aVar != null) {
            try {
                aVar.a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    public final void d(dGF dgf) {
        synchronized (this) {
            C8632dsu.d(dgf, "");
            this.a++;
            if (dgf.d() != null) {
                this.b++;
            } else if (dgf.b() != null) {
                this.d++;
            }
        }
    }

    public final void c() {
        synchronized (this) {
            this.d++;
        }
    }

    /* loaded from: classes5.dex */
    final class b implements dGE {
        private final dIH a;
        private final dGJ.a b;
        final /* synthetic */ dFW c;
        private final dIH d;
        private boolean e;

        public final boolean a() {
            return this.e;
        }

        @Override // o.dGE
        public dIH d() {
            return this.d;
        }

        public final void d(boolean z) {
            this.e = z;
        }

        public b(dFW dfw, dGJ.a aVar) {
            C8632dsu.d(aVar, "");
            this.c = dfw;
            this.b = aVar;
            dIH b = aVar.b(1);
            this.a = b;
            this.d = new dIm(b) { // from class: o.dFW.b.3
                @Override // o.dIm, o.dIH, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    synchronized (b.this.c) {
                        if (b.this.a()) {
                            return;
                        }
                        b.this.d(true);
                        dFW dfw2 = b.this.c;
                        dfw2.b(dfw2.b() + 1);
                        super.close();
                        b.this.b.b();
                    }
                }
            };
        }

        @Override // o.dGE
        public void e() {
            synchronized (this.c) {
                if (this.e) {
                    return;
                }
                this.e = true;
                dFW dfw = this.c;
                dfw.e(dfw.e() + 1);
                dGB.e(this.a);
                try {
                    this.b.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class e {
        private static final String a;
        public static final d b = new d(null);
        private static final String e;
        private final int c;
        private final C7821dGp d;
        private final String f;
        private final String g;
        private final long h;
        private final C7819dGn i;
        private final Protocol j;
        private final C7819dGn k;
        private final String m;
        private final long n;

        private final boolean d() {
            boolean i;
            i = C8691duz.i(this.m, "https://", false, 2, null);
            return i;
        }

        public e(dIJ dij) {
            TlsVersion tlsVersion;
            C8632dsu.d(dij, "");
            try {
                InterfaceC7871dIn e2 = dIw.e(dij);
                this.m = e2.z();
                this.g = e2.z();
                C7819dGn.d dVar = new C7819dGn.d();
                int e3 = dFW.e.e(e2);
                for (int i = 0; i < e3; i++) {
                    dVar.c(e2.z());
                }
                this.k = dVar.b();
                C7837dHe e4 = C7837dHe.b.e(e2.z());
                this.j = e4.e;
                this.c = e4.a;
                this.f = e4.d;
                C7819dGn.d dVar2 = new C7819dGn.d();
                int e5 = dFW.e.e(e2);
                for (int i2 = 0; i2 < e5; i2++) {
                    dVar2.c(e2.z());
                }
                String str = e;
                String e6 = dVar2.e(str);
                String str2 = a;
                String e7 = dVar2.e(str2);
                dVar2.d(str);
                dVar2.d(str2);
                this.n = e6 != null ? Long.parseLong(e6) : 0L;
                this.h = e7 != null ? Long.parseLong(e7) : 0L;
                this.i = dVar2.b();
                if (d()) {
                    String z = e2.z();
                    if (z.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + z + JsonFactory.DEFAULT_QUOTE_CHAR);
                    }
                    C7810dGe b2 = C7810dGe.e.b(e2.z());
                    List<Certificate> a2 = a(e2);
                    List<Certificate> a3 = a(e2);
                    if (!e2.m()) {
                        tlsVersion = TlsVersion.a.c(e2.z());
                    } else {
                        tlsVersion = TlsVersion.SSL_3_0;
                    }
                    this.d = C7821dGp.c.b(tlsVersion, b2, a2, a3);
                } else {
                    this.d = null;
                }
            } finally {
                dij.close();
            }
        }

        public e(C7824dGs c7824dGs) {
            C8632dsu.d(c7824dGs, "");
            this.m = c7824dGs.n().j().toString();
            this.k = dFW.e.c(c7824dGs);
            this.g = c7824dGs.n().i();
            this.j = c7824dGs.m();
            this.c = c7824dGs.c();
            this.f = c7824dGs.h();
            this.i = c7824dGs.j();
            this.d = c7824dGs.i();
            this.n = c7824dGs.s();
            this.h = c7824dGs.o();
        }

        public final void e(dGJ.a aVar) {
            C8632dsu.d(aVar, "");
            dIq b2 = dIw.b(aVar.b(0));
            try {
                b2.b(this.m).c(10);
                b2.b(this.g).c(10);
                b2.k(this.k.c()).c(10);
                int c = this.k.c();
                for (int i = 0; i < c; i++) {
                    b2.b(this.k.c(i)).b(": ").b(this.k.a(i)).c(10);
                }
                b2.b(new C7837dHe(this.j, this.c, this.f).toString()).c(10);
                b2.k(this.i.c() + 2).c(10);
                int c2 = this.i.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    b2.b(this.i.c(i2)).b(": ").b(this.i.a(i2)).c(10);
                }
                b2.b(e).b(": ").k(this.n).c(10);
                b2.b(a).b(": ").k(this.h).c(10);
                if (d()) {
                    b2.c(10);
                    C7821dGp c7821dGp = this.d;
                    if (c7821dGp == null) {
                        C8632dsu.e();
                    }
                    b2.b(c7821dGp.c().d()).c(10);
                    e(b2, this.d.a());
                    e(b2, this.d.b());
                    b2.b(this.d.d().c()).c(10);
                }
                dpR dpr = dpR.c;
                C8608drx.a(b2, null);
            } finally {
            }
        }

        private final List<Certificate> a(InterfaceC7871dIn interfaceC7871dIn) {
            List<Certificate> i;
            int e2 = dFW.e.e(interfaceC7871dIn);
            if (e2 == -1) {
                i = C8569dql.i();
                return i;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(e2);
                for (int i2 = 0; i2 < e2; i2++) {
                    String z = interfaceC7871dIn.z();
                    C7872dIo c7872dIo = new C7872dIo();
                    ByteString b2 = ByteString.c.b(z);
                    if (b2 == null) {
                        C8632dsu.e();
                    }
                    c7872dIo.b(b2);
                    arrayList.add(certificateFactory.generateCertificate(c7872dIo.n()));
                }
                return arrayList;
            } catch (CertificateException e3) {
                throw new IOException(e3.getMessage());
            }
        }

        private final void e(dIq diq, List<? extends Certificate> list) {
            try {
                diq.k(list.size()).c(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = list.get(i).getEncoded();
                    ByteString.b bVar = ByteString.c;
                    C8632dsu.b(encoded, "");
                    diq.b(ByteString.b.c(bVar, encoded, 0, 0, 3, null).d()).c(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean e(C7826dGu c7826dGu, C7824dGs c7824dGs) {
            C8632dsu.d(c7826dGu, "");
            C8632dsu.d(c7824dGs, "");
            return C8632dsu.c((Object) this.m, (Object) c7826dGu.j().toString()) && C8632dsu.c((Object) this.g, (Object) c7826dGu.i()) && dFW.e.d(c7824dGs, this.k, c7826dGu);
        }

        public final C7824dGs b(dGJ.b bVar) {
            C8632dsu.d(bVar, "");
            String a2 = this.i.a("Content-Type");
            String a3 = this.i.a("Content-Length");
            return new C7824dGs.b().e(new C7826dGu.b().a(this.m).e(this.g, (AbstractC7825dGt) null).b(this.k).a()).c(this.j).c(this.c).a(this.f).d(this.i).e(new a(bVar, a2, a3)).b(this.d).c(this.n).e(this.h).a();
        }

        /* loaded from: classes5.dex */
        public static final class d {
            private d() {
            }

            public /* synthetic */ d(C8627dsp c8627dsp) {
                this();
            }
        }

        static {
            dHG.e eVar;
            StringBuilder sb = new StringBuilder();
            sb.append(dHG.i.b().h());
            sb.append("-Sent-Millis");
            e = sb.toString();
            a = eVar.b().h() + "-Received-Millis";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC7829dGx {
        private final InterfaceC7871dIn a;
        private final String c;
        private final String d;
        private final dGJ.b e;

        public final dGJ.b b() {
            return this.e;
        }

        @Override // o.AbstractC7829dGx
        public InterfaceC7871dIn e() {
            return this.a;
        }

        public a(dGJ.b bVar, String str, String str2) {
            C8632dsu.d(bVar, "");
            this.e = bVar;
            this.c = str;
            this.d = str2;
            final dIJ e = bVar.e(1);
            this.a = dIw.e(new dIt(e) { // from class: o.dFW.a.1
                @Override // o.dIt, o.dIJ, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    a.this.b().close();
                    super.close();
                }
            });
        }

        @Override // o.AbstractC7829dGx
        public long c() {
            String str = this.d;
            if (str != null) {
                return dGB.b(str, -1L);
            }
            return -1L;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final String a(C7818dGm c7818dGm) {
            C8632dsu.d(c7818dGm, "");
            return ByteString.c.e(c7818dGm.toString()).h().j();
        }

        public final int e(InterfaceC7871dIn interfaceC7871dIn) {
            C8632dsu.d(interfaceC7871dIn, "");
            try {
                long t = interfaceC7871dIn.t();
                String z = interfaceC7871dIn.z();
                if (t < 0 || t > Integer.MAX_VALUE || z.length() > 0) {
                    throw new IOException("expected an int but was \"" + t + z + JsonFactory.DEFAULT_QUOTE_CHAR);
                }
                return (int) t;
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean d(C7824dGs c7824dGs, C7819dGn c7819dGn, C7826dGu c7826dGu) {
            C8632dsu.d(c7824dGs, "");
            C8632dsu.d(c7819dGn, "");
            C8632dsu.d(c7826dGu, "");
            Set<String> b = b(c7824dGs.j());
            if ((b instanceof Collection) && b.isEmpty()) {
                return true;
            }
            for (String str : b) {
                if (!C8632dsu.c(c7819dGn.b(str), c7826dGu.c(str))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(C7824dGs c7824dGs) {
            C8632dsu.d(c7824dGs, "");
            return b(c7824dGs.j()).contains("*");
        }

        private final Set<String> b(C7819dGn c7819dGn) {
            Set<String> e;
            boolean a;
            List<String> b;
            CharSequence n;
            Comparator d;
            int c = c7819dGn.c();
            TreeSet treeSet = null;
            for (int i = 0; i < c; i++) {
                a = C8691duz.a("Vary", c7819dGn.c(i), true);
                if (a) {
                    String a2 = c7819dGn.a(i);
                    if (treeSet == null) {
                        d = C8691duz.d(dsE.b);
                        treeSet = new TreeSet(d);
                    }
                    b = duD.b((CharSequence) a2, new char[]{','}, false, 0, 6, (Object) null);
                    for (String str : b) {
                        if (str == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        n = duD.n((CharSequence) str);
                        treeSet.add(n.toString());
                    }
                    continue;
                }
            }
            if (treeSet != null) {
                return treeSet;
            }
            e = dqN.e();
            return e;
        }

        public final C7819dGn c(C7824dGs c7824dGs) {
            C8632dsu.d(c7824dGs, "");
            C7824dGs g = c7824dGs.g();
            if (g == null) {
                C8632dsu.e();
            }
            return a(g.n().c(), c7824dGs.j());
        }

        private final C7819dGn a(C7819dGn c7819dGn, C7819dGn c7819dGn2) {
            Set<String> b = b(c7819dGn2);
            if (b.isEmpty()) {
                return dGB.b;
            }
            C7819dGn.d dVar = new C7819dGn.d();
            int c = c7819dGn.c();
            for (int i = 0; i < c; i++) {
                String c2 = c7819dGn.c(i);
                if (b.contains(c2)) {
                    dVar.d(c2, c7819dGn.a(i));
                }
            }
            return dVar.b();
        }
    }
}
