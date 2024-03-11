package o;

import android.content.Context;
import android.os.Build;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class NZ implements NW {
    private NX c;

    public NZ() {
        Schedulers.computation().scheduleDirect(new Runnable() { // from class: o.Oc
            @Override // java.lang.Runnable
            public final void run() {
                NZ.this.a();
            }
        }, 50L, TimeUnit.MILLISECONDS);
    }

    @Override // o.NW
    public NV e() {
        return a().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public NX a() {
        NX nx = this.c;
        if (nx != null) {
            return nx;
        }
        synchronized (this) {
            if (this.c == null) {
                String e = C8157dfA.e((Context) C1332Xp.b(Context.class), "device_history", (String) null);
                C1044Mm.c("deviceHistory", "deviceHistory %s", e);
                this.c = NX.c(e);
                a(Build.VERSION.SDK_INT);
            }
        }
        return this.c;
    }

    private void a(int i) {
        NV e = e();
        if (e == null || e.e() != i) {
            this.c = this.c.a().e(NV.c(i)).b();
            C8157dfA.a((Context) C1332Xp.b(Context.class), "device_history", this.c.b());
        }
    }
}
