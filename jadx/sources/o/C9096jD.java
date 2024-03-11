package o;

import android.support.v4.media.session.PlaybackStateCompat;
import com.apollographql.apollo3.exception.DefaultApolloException;
import com.netflix.android.org.json.HTTP;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import o.dIA;
import okio.ByteString;

/* renamed from: o.jD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9096jD implements Closeable {
    private static final c d = new c(null);
    private final String a;
    private final dIA b;
    private boolean c;
    private final ByteString e;
    private boolean f;
    private final ByteString g;
    private int h;
    private e i;
    private final InterfaceC7871dIn j;

    public C9096jD(InterfaceC7871dIn interfaceC7871dIn, String str) {
        C8632dsu.c((Object) interfaceC7871dIn, "");
        C8632dsu.c((Object) str, "");
        this.j = interfaceC7871dIn;
        this.a = str;
        this.g = new C7872dIo().b("--").b(str).r();
        this.e = new C7872dIo().b("\r\n--").b(str).r();
        dIA.c cVar = dIA.a;
        ByteString.b bVar = ByteString.c;
        this.b = cVar.e(bVar.e("\r\n--" + str + "--"), bVar.e(HTTP.CRLF), bVar.e("--"), bVar.e(" "), bVar.e("\t"));
    }

    public final d b() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f) {
            return null;
        }
        if (this.h == 0 && this.j.a(0L, this.g)) {
            this.j.h(this.g.k());
        } else {
            while (true) {
                long b = b(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (b == 0) {
                    break;
                }
                this.j.h(b);
            }
            this.j.h(this.e.k());
        }
        boolean z = false;
        while (true) {
            int b2 = this.j.b(this.b);
            if (b2 == -1) {
                throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
            }
            if (b2 == 0) {
                if (this.h != 0) {
                    this.f = true;
                    return null;
                }
                throw new DefaultApolloException("expected at least 1 part", null, 2, null);
            } else if (b2 == 1) {
                this.h++;
                List a = d.a(this.j);
                e eVar = new e();
                this.i = eVar;
                return new d(a, dIw.e(eVar));
            } else if (b2 == 2) {
                if (z) {
                    throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (this.h != 0) {
                    this.f = true;
                    return null;
                }
                throw new DefaultApolloException("expected at least 1 part", null, 2, null);
            } else if (b2 == 3 || b2 == 4) {
                z = true;
            }
        }
    }

    /* renamed from: o.jD$e */
    /* loaded from: classes2.dex */
    final class e implements dIJ {
        public e() {
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (C8632dsu.c(C9096jD.this.i, this)) {
                C9096jD.this.i = null;
            }
        }

        @Override // o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.c((Object) c7872dIo, "");
            if (j >= 0) {
                if (C8632dsu.c(C9096jD.this.i, this)) {
                    long b = C9096jD.this.b(j);
                    if (b == 0) {
                        return -1L;
                    }
                    return C9096jD.this.j.b(c7872dIo, b);
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }

        @Override // o.dIJ
        public dIK e() {
            return C9096jD.this.j.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long b(long j) {
        this.j.g(this.e.k());
        long e2 = this.j.o().e(this.e);
        if (e2 == -1) {
            return Math.min(j, (this.j.o().D() - this.e.k()) + 1);
        }
        return Math.min(j, e2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.i = null;
        this.j.close();
    }

    /* renamed from: o.jD$d */
    /* loaded from: classes2.dex */
    public static final class d implements Closeable {
        private final List<C9006hT> c;
        private final InterfaceC7871dIn d;

        public final InterfaceC7871dIn c() {
            return this.d;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.d.close();
        }

        public d(List<C9006hT> list, InterfaceC7871dIn interfaceC7871dIn) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) interfaceC7871dIn, "");
            this.c = list;
            this.d = interfaceC7871dIn;
        }
    }

    /* renamed from: o.jD$c */
    /* loaded from: classes2.dex */
    static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<C9006hT> a(InterfaceC7871dIn interfaceC7871dIn) {
            int b;
            CharSequence n;
            CharSequence n2;
            ArrayList arrayList = new ArrayList();
            while (true) {
                String z = interfaceC7871dIn.z();
                if (z.length() == 0) {
                    return arrayList;
                }
                b = duD.b((CharSequence) z, ':', 0, false, 6, (Object) null);
                if (b == -1) {
                    throw new IllegalStateException(("Unexpected header: " + z).toString());
                }
                String substring = z.substring(0, b);
                C8632dsu.a(substring, "");
                n = duD.n((CharSequence) substring);
                String obj = n.toString();
                String substring2 = z.substring(b + 1);
                C8632dsu.a(substring2, "");
                n2 = duD.n((CharSequence) substring2);
                arrayList.add(new C9006hT(obj, n2.toString()));
            }
        }
    }
}
