package o;

import kotlin.Pair;

/* renamed from: o.aHb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1594aHb {
    private final int a;
    private final C8560dqc<Pair<C1596aHd, Throwable>> b;
    private drX<? super C1596aHd, ? super Throwable, dpR> d;

    public C1594aHb() {
        this(0, 1, null);
    }

    public C1594aHb(int i) {
        this.a = i;
        this.b = new C8560dqc<>(i);
    }

    public /* synthetic */ C1594aHb(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public final void b(C1596aHd c1596aHd, Throwable th) {
        C8632dsu.c((Object) c1596aHd, "");
        C8632dsu.c((Object) th, "");
        synchronized (this.b) {
            drX<? super C1596aHd, ? super Throwable, dpR> drx = this.d;
            if (drx != null) {
                drx.invoke(c1596aHd, th);
                return;
            }
            if (this.b.size() == this.a) {
                this.b.d();
            }
            this.b.b((C8560dqc<Pair<C1596aHd, Throwable>>) new Pair<>(c1596aHd, th));
            dpR dpr = dpR.c;
        }
    }

    public final void d(drX<? super C1596aHd, ? super Throwable, dpR> drx) {
        C8632dsu.c((Object) drx, "");
        synchronized (this.b) {
            if (this.d == null) {
                for (Pair<C1596aHd, Throwable> pair : this.b) {
                    drx.invoke(pair.d(), pair.a());
                }
                this.b.clear();
            }
            this.d = drx;
            dpR dpr = dpR.c;
        }
    }
}
