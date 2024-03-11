package o;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: o.aJz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1672aJz implements InterfaceC1662aJp {
    public static final e e = new e(null);
    private final Handler a;
    private final HandlerThread d;

    @Override // o.InterfaceC1662aJp
    public Handler b() {
        return this.a;
    }

    public C1672aJz() {
        HandlerThread handlerThread = new HandlerThread("PerformanceCapture");
        this.d = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: o.aJz$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PerfHandlerThread");
        }
    }
}
