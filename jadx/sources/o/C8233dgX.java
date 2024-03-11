package o;

import android.graphics.Bitmap;
import com.netflix.android.volley.Request;
import java.util.Random;
import o.C8235dgZ;
import o.C8298dhj;
import o.C9864xy;
import o.InterfaceC9854xo;

/* renamed from: o.dgX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8233dgX extends C8235dgZ {
    public static final a d = new a(null);
    private final boolean a;
    private final long g;
    private final Request.Priority i;

    @Override // o.C8235dgZ, com.netflix.android.volley.Request
    public Request.Priority s() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8233dgX(String str, C9864xy.a<Bitmap> aVar, int i, int i2, Bitmap.Config config, C9864xy.b bVar, Request.Priority priority, int i3, long j, InterfaceC8229dgT interfaceC8229dgT, InterfaceC8230dgU interfaceC8230dgU) {
        super(str, aVar, i, i2, config, bVar, interfaceC8229dgT, interfaceC8230dgU);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) config, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) priority, "");
        C8632dsu.c((Object) interfaceC8229dgT, "");
        C8632dsu.c((Object) interfaceC8230dgU, "");
        this.i = priority;
        if (i3 > 0) {
            e(new C9852xm(i3, 2, 2.0f));
        }
        this.g = j;
    }

    @Override // com.netflix.android.volley.Request
    public String b() {
        if (this.a) {
            C8298dhj.b bVar = C8298dhj.b;
            String u = u();
            C8632dsu.a(u, "");
            String a2 = bVar.a(u);
            int nextInt = new Random().nextInt();
            return a2 + nextInt;
        }
        C8298dhj.b bVar2 = C8298dhj.b;
        String u2 = u();
        C8632dsu.a(u2, "");
        return bVar2.a(u2);
    }

    @Override // o.C8235dgZ, com.netflix.android.volley.Request
    public C9864xy<C8235dgZ.a> b(C9858xs c9858xs) {
        C8632dsu.c((Object) c9858xs, "");
        C9864xy<C8235dgZ.a> b = super.b(c9858xs);
        if (b.a != null && b.d == null && this.g > 0) {
            long currentTimeMillis = System.currentTimeMillis() + this.g;
            InterfaceC9854xo.d dVar = b.a;
            if (currentTimeMillis > dVar.g) {
                dVar.g = currentTimeMillis;
                dVar.b = currentTimeMillis;
            }
        }
        return b;
    }

    /* renamed from: o.dgX$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_ImageRequest");
        }
    }
}
