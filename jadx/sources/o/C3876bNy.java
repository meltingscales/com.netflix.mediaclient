package o;

import android.os.Handler;
import javax.inject.Inject;
import o.AbstractC3855bNd;

/* renamed from: o.bNy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3876bNy implements InterfaceC3857bNf {
    private final InterfaceC3862bNk e;

    @Inject
    public C3876bNy(InterfaceC3862bNk interfaceC3862bNk) {
        C8632dsu.c((Object) interfaceC3862bNk, "");
        this.e = interfaceC3862bNk;
    }

    @Override // o.InterfaceC3857bNf
    public void d(Handler handler, final AbstractC3855bNd abstractC3855bNd) {
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) abstractC3855bNd, "");
        handler.post(new Runnable() { // from class: o.bNv
            @Override // java.lang.Runnable
            public final void run() {
                C3876bNy.d(AbstractC3855bNd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC3855bNd abstractC3855bNd, C3876bNy c3876bNy) {
        C8632dsu.c((Object) abstractC3855bNd, "");
        C8632dsu.c((Object) c3876bNy, "");
        if (abstractC3855bNd instanceof AbstractC3855bNd.d) {
            c3876bNy.e.a(abstractC3855bNd.b());
        } else if (abstractC3855bNd instanceof AbstractC3855bNd.c) {
            c3876bNy.e.c((AbstractC3855bNd.c) abstractC3855bNd);
        } else if (abstractC3855bNd instanceof AbstractC3855bNd.a) {
            c3876bNy.e.a(abstractC3855bNd.b(), abstractC3855bNd.e());
        }
    }
}
