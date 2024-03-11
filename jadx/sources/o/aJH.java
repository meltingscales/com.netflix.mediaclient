package o;

import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.context.PerformanceTrace;
import com.netflix.cl.model.event.discrete.PerformanceTraceReported;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref;
import o.C1665aJs;
import o.aJH;
import o.dpR;

/* loaded from: classes3.dex */
public final class aJH {
    public static final c b = new c(null);
    private long a;
    private final Choreographer c;
    private int d;
    private final Choreographer.FrameCallback e;
    private Long h;
    private InterfaceC8613dsb<? super Float, ? super Integer, ? super Long, ? super Long, dpR> i;
    private drO<dpR> j;

    public aJH(RecyclerView recyclerView, drO<dpR> dro, InterfaceC8613dsb<? super Float, ? super Integer, ? super Long, ? super Long, dpR> interfaceC8613dsb) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) interfaceC8613dsb, "");
        this.j = dro;
        this.i = interfaceC8613dsb;
        Choreographer choreographer = Choreographer.getInstance();
        C8632dsu.a(choreographer, "");
        this.c = choreographer;
        this.e = new Choreographer.FrameCallback() { // from class: o.aJG
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                aJH.d(aJH.this, j);
            }
        };
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: o.aJH.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                C8632dsu.c((Object) recyclerView2, "");
                if (i == 0) {
                    aJH.this.d();
                } else if (i == 1 || i == 2) {
                    aJH.this.c();
                }
            }
        });
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("RecyclerViewScrollPerformance");
        }

        public final void e(RecyclerView recyclerView, final AppView appView, final String str) {
            C8632dsu.c((Object) recyclerView, "");
            C8632dsu.c((Object) appView, "");
            C8632dsu.c((Object) str, "");
            final Ref.LongRef longRef = new Ref.LongRef();
            new aJH(recyclerView, new drO<dpR>() { // from class: com.netflix.mediaclient.performance.impl.capture.recyclerview.RecyclerViewScrollPerformance$Companion$reportScrollFps$1
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }

                public final void a() {
                    Ref.LongRef.this.a = Logger.INSTANCE.addContext(new PerformanceTrace());
                    aJH.b.getLogTag();
                }
            }, new InterfaceC8613dsb<Float, Integer, Long, Long, dpR>() { // from class: com.netflix.mediaclient.performance.impl.capture.recyclerview.RecyclerViewScrollPerformance$Companion$reportScrollFps$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // o.InterfaceC8613dsb
                public /* synthetic */ dpR invoke(Float f, Integer num, Long l, Long l2) {
                    c(f.floatValue(), num.intValue(), l.longValue(), l2.longValue());
                    return dpR.c;
                }

                public final void c(float f, int i, long j, long j2) {
                    C1665aJs c1665aJs = new C1665aJs(Ref.LongRef.this.a, null, false, null, 14, null);
                    String str2 = str;
                    AppView appView2 = appView;
                    c1665aJs.b(str2, "scroll.fps", Float.valueOf(f));
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    C1665aJs.a(c1665aJs, str2, timeUnit.toMicros(j2), timeUnit.toMicros(j), null, null, null, null, null, null, null, null, appView2, null, 6136, null);
                    Logger logger = Logger.INSTANCE;
                    PerformanceTraceReported c = c1665aJs.c();
                    aJH.b.getLogTag();
                    logger.logEvent(c);
                    logger.removeContext(Long.valueOf(Ref.LongRef.this.a));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(aJH ajh, long j) {
        C8632dsu.c((Object) ajh, "");
        if (ajh.h == null) {
            ajh.d = 0;
            ajh.h = Long.valueOf(j);
        }
        ajh.a = j;
        ajh.d++;
        ajh.e();
    }

    private final void e() {
        this.c.postFrameCallback(this.e);
    }

    private final void a() {
        this.c.removeFrameCallback(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.h == null) {
            this.j.invoke();
            b.getLogTag();
            this.d = 0;
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Long l = this.h;
        if (l != null) {
            long longValue = l.longValue();
            a();
            long j = this.a - longValue;
            long millis = TimeUnit.NANOSECONDS.toMillis(j);
            int i = this.d;
            if (i > 0 && millis > 250) {
                this.i.invoke(Float.valueOf((i * 1000.0f) / ((float) millis)), Integer.valueOf(this.d), Long.valueOf(j), Long.valueOf(longValue));
                b.getLogTag();
            } else {
                b.getLogTag();
            }
            this.h = null;
        }
    }
}
