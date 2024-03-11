package o;

import android.os.Process;
import com.netflix.android.volley.Request;
import java.util.concurrent.BlockingQueue;
import o.InterfaceC9854xo;

/* renamed from: o.xn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9853xn extends Thread {
    private final InterfaceC9863xx a;
    private final InterfaceC9854xo b;
    private final BlockingQueue<Request> c;
    private final BlockingQueue<Request> d;
    private volatile boolean e = false;

    public C9853xn(BlockingQueue<Request> blockingQueue, BlockingQueue<Request> blockingQueue2, InterfaceC9854xo interfaceC9854xo, InterfaceC9863xx interfaceC9863xx) {
        this.d = blockingQueue;
        this.c = blockingQueue2;
        this.b = interfaceC9854xo;
        this.a = interfaceC9863xx;
    }

    public void c() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        this.b.d();
        while (true) {
            try {
                final Request<?> take = this.d.take();
                take.e("cache-queue-take");
                if (take.D()) {
                    take.c("cache-discard-canceled");
                } else {
                    InterfaceC9854xo.d c = this.b.c(take.b());
                    if (c == null) {
                        take.e("cache-miss");
                        this.c.put(take);
                    } else if (c.e()) {
                        take.e("cache-hit-expired");
                        take.d(c);
                        this.c.put(take);
                    } else {
                        take.e("cache-hit");
                        C9864xy<?> b = take.b(new C9858xs(c.c, c.d));
                        take.e("cache-hit-parsed");
                        if (!c.d()) {
                            take.c(Request.ResourceLocationType.CACHE);
                            this.a.b(take, b);
                        } else {
                            take.e("cache-hit-refresh-needed");
                            take.d(c);
                            b.b = true;
                            this.a.d(take, b, new Runnable() { // from class: o.xn.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        C9853xn.this.c.put(take);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            });
                        }
                    }
                }
            } catch (InterruptedException unused) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
