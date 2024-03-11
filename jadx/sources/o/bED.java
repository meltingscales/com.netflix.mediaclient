package o;

import android.view.Window;
import o.bEL;

/* loaded from: classes4.dex */
public final class bED extends AbstractC9940zU<bEL, Object> {
    private final bEE a;
    private boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bED(o.bEE r6, io.reactivex.Observable<o.bEL> r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r7, r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Scheduler r2 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            r3 = 2250(0x8ca, double:1.1116E-320)
            io.reactivex.Observable r7 = r7.delay(r3, r1, r2)
            o.C8632dsu.a(r7, r0)
            r0 = 1
            o.zT[] r1 = new o.InterfaceC9939zT[r0]
            r2 = 0
            r1[r2] = r6
            r5.<init>(r7, r1)
            r5.a = r6
            r5.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bED.<init>(o.bEE, io.reactivex.Observable):void");
    }

    @Override // o.AbstractC9940zU
    public void onEvent(bEL bel) {
        C8632dsu.c((Object) bel, "");
        if (bel instanceof bEL.e) {
            bEL.e eVar = (bEL.e) bel;
            if ((eVar.d() & 2048) == 0) {
                e(this, eVar.c(), false, 2, null);
            }
        } else if (bel instanceof bEL.d) {
            bEL.d dVar = (bEL.d) bel;
            e(dVar.c(), dVar.d() == 2);
        }
    }

    static /* synthetic */ void e(bED bed, Window window, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = bed.c;
        }
        bed.e(window, z);
    }

    private final void e(Window window, boolean z) {
        this.c = z;
        if (z) {
            this.a.e(window);
        } else {
            this.a.b(window);
        }
    }
}
