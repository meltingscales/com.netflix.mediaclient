package o;

import android.os.Handler;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import java.util.concurrent.Executor;

/* renamed from: o.xp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9855xp implements InterfaceC9863xx {
    private final Executor e;

    public C9855xp(final Handler handler) {
        this.e = new Executor() { // from class: o.xp.3
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // o.InterfaceC9863xx
    public void b(Request<?> request, C9864xy<?> c9864xy) {
        d(request, c9864xy, null);
    }

    @Override // o.InterfaceC9863xx
    public void d(Request<?> request, C9864xy<?> c9864xy, Runnable runnable) {
        request.I();
        request.e("post-response");
        this.e.execute(new d(request, c9864xy, runnable));
    }

    @Override // o.InterfaceC9863xx
    public void e(Request<?> request, VolleyError volleyError) {
        request.e("post-error");
        this.e.execute(new d(request, C9864xy.a(volleyError), null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.xp$d */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        private final C9864xy a;
        private final Request c;
        private final Runnable e;

        public d(Request request, C9864xy c9864xy, Runnable runnable) {
            this.c = request;
            this.a = c9864xy;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.D()) {
                this.c.c("canceled-at-delivery");
                return;
            }
            if (this.a.c()) {
                this.c.b((Request) this.a.c);
            } else {
                this.c.a_(this.a.d);
            }
            if (this.a.b) {
                this.c.e("intermediate-response");
            } else {
                this.c.c("done");
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
