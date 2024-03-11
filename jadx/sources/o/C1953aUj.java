package o;

import com.netflix.mediaclient.service.logging.LoggingExecutor$threadFactory$2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.C1953aUj;
import o.C8632dsu;

/* renamed from: o.aUj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1953aUj {
    public static final C1953aUj a = new C1953aUj();
    private static final InterfaceC8554dpx c;
    private static final InterfaceC8554dpx e;

    private C1953aUj() {
    }

    static {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        b = dpB.b(new drO<LoggingExecutor$threadFactory$2.AnonymousClass4>() { // from class: com.netflix.mediaclient.service.logging.LoggingExecutor$threadFactory$2
            /* JADX WARN: Type inference failed for: r0v0, types: [com.netflix.mediaclient.service.logging.LoggingExecutor$threadFactory$2$4] */
            @Override // o.drO
            /* renamed from: c */
            public final AnonymousClass4 invoke() {
                return new ThreadFactory() { // from class: com.netflix.mediaclient.service.logging.LoggingExecutor$threadFactory$2.4
                    private final AtomicInteger b = new AtomicInteger(1);

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        C8632dsu.c((Object) runnable, "");
                        int andIncrement = this.b.getAndIncrement();
                        return new Thread(runnable, "LoggingAgent #" + andIncrement);
                    }
                };
            }
        });
        e = b;
        b2 = dpB.b(new drO<ScheduledExecutorService>() { // from class: com.netflix.mediaclient.service.logging.LoggingExecutor$executor$2
            @Override // o.drO
            /* renamed from: a */
            public final ScheduledExecutorService invoke() {
                LoggingExecutor$threadFactory$2.AnonymousClass4 d;
                d = C1953aUj.a.d();
                return Executors.newSingleThreadScheduledExecutor(d);
            }
        });
        c = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoggingExecutor$threadFactory$2.AnonymousClass4 d() {
        return (LoggingExecutor$threadFactory$2.AnonymousClass4) e.getValue();
    }

    public final ScheduledExecutorService e() {
        Object value = c.getValue();
        C8632dsu.a(value, "");
        return (ScheduledExecutorService) value;
    }
}
