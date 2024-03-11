package o;

import android.graphics.Bitmap;
import com.netflix.android.volley.ParseError;
import com.netflix.android.volley.Request;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.C9864xy;

/* renamed from: o.dgZ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8235dgZ extends Request<a> {
    private static Executor a;
    private final String f;
    private final InterfaceC8230dgU g;
    private final InterfaceC8229dgT h;
    private final C9864xy.a<Bitmap> i;
    private final Bitmap.Config j;
    private final int l;
    private final int n;
    public static final e e = new e(null);
    private static final Object d = new Object();

    /* renamed from: o.dgZ$a */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8235dgZ(String str, C9864xy.a<Bitmap> aVar, int i, int i2, Bitmap.Config config, C9864xy.b bVar, InterfaceC8229dgT interfaceC8229dgT, InterfaceC8230dgU interfaceC8230dgU) {
        super(0, str, bVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) config, "");
        C8632dsu.c((Object) interfaceC8229dgT, "");
        C8632dsu.c((Object) interfaceC8230dgU, "");
        this.g = interfaceC8230dgU;
        e(new C9852xm(1000, 2, 2.0f));
        this.i = aVar;
        this.j = config;
        this.n = i;
        this.l = i2;
        this.f = str;
        this.h = interfaceC8229dgT;
    }

    /* renamed from: o.dgZ$b */
    /* loaded from: classes5.dex */
    public static final class b implements a {
        private final C9858xs e;

        public final C9858xs b() {
            return this.e;
        }

        public b(C9858xs c9858xs) {
            C8632dsu.c((Object) c9858xs, "");
            this.e = c9858xs;
        }
    }

    /* renamed from: o.dgZ$c */
    /* loaded from: classes5.dex */
    public static final class c implements a {
        private final C9858xs a;
        private final Bitmap e;

        public final Bitmap d() {
            return this.e;
        }

        public c(Bitmap bitmap, C9858xs c9858xs) {
            C8632dsu.c((Object) bitmap, "");
            C8632dsu.c((Object) c9858xs, "");
            this.e = bitmap;
            this.a = c9858xs;
        }
    }

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.LOW;
    }

    @Override // com.netflix.android.volley.Request
    public C9864xy<a> b(C9858xs c9858xs) {
        C9864xy<a> a2;
        C8632dsu.c((Object) c9858xs, "");
        synchronized (d) {
            try {
                a2 = e(c9858xs);
            } catch (OutOfMemoryError e2) {
                C9862xw.a("Caught OOM for %d byte image, url=%s", Integer.valueOf(c9858xs.c.length), u());
                a2 = C9864xy.a(new ParseError(e2));
                C8632dsu.d(a2);
            }
        }
        return a2;
    }

    private final C9864xy<a> e(C9858xs c9858xs) {
        C9864xy<a> c2;
        if (!this.g.c() || q() == Request.ResourceLocationType.NETWORK) {
            Bitmap c3 = c(c9858xs);
            if (c3 == null) {
                c2 = C9864xy.a(new ParseError());
            } else {
                c2 = C9864xy.c(new c(c3, c9858xs), C9821xH.d(c9858xs));
            }
            C8632dsu.d(c2);
            return c2;
        }
        C9864xy<a> c4 = C9864xy.c(new b(c9858xs), C9821xH.d(c9858xs));
        C8632dsu.d(c4);
        return c4;
    }

    private final Bitmap c(C9858xs c9858xs) {
        byte[] bArr = c9858xs.c;
        this.c = bArr.length;
        InterfaceC8229dgT interfaceC8229dgT = this.h;
        C8632dsu.d(bArr);
        return interfaceC8229dgT.b(bArr, this.n, this.l, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.android.volley.Request
    public void b(final a aVar) {
        if (aVar instanceof c) {
            this.i.b(((c) aVar).d());
        } else if (aVar instanceof b) {
            a.execute(new Runnable() { // from class: o.dgY
                @Override // java.lang.Runnable
                public final void run() {
                    C8235dgZ.a(C8235dgZ.this, aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C8235dgZ c8235dgZ, a aVar) {
        C8632dsu.c((Object) c8235dgZ, "");
        final Bitmap c2 = c8235dgZ.c(((b) aVar).b());
        C8187dfe.c(new Runnable() { // from class: o.dgW
            @Override // java.lang.Runnable
            public final void run() {
                C8235dgZ.e(c2, c8235dgZ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Bitmap bitmap, C8235dgZ c8235dgZ) {
        C8632dsu.c((Object) c8235dgZ, "");
        if (bitmap != null) {
            c8235dgZ.i.b(bitmap);
        } else {
            c8235dgZ.a_(new ParseError());
        }
    }

    /* renamed from: o.dgZ$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_imageReqVolley");
        }
    }

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        C8632dsu.a(newFixedThreadPool, "");
        a = newFixedThreadPool;
    }
}
