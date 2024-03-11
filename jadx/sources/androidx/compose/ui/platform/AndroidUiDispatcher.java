package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.core.os.HandlerCompat;
import java.util.ArrayList;
import java.util.List;
import o.C8560dqc;
import o.C8627dsp;
import o.C8738dws;
import o.C8752dxf;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;
import o.dqZ;
import o.drO;
import o.dwQ;

/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends dwQ {
    private static final InterfaceC8554dpx<dqZ> Main$delegate;
    private static final ThreadLocal<dqZ> currentThread;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final MonotonicFrameClock frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    private List<Choreographer.FrameCallback> toRunOnFrame;
    private final C8560dqc<Runnable> toRunTrampolined;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, C8627dsp c8627dsp) {
        this(choreographer, handler);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new C8560dqc<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z;
        do {
            Runnable nextTask = nextTask();
            while (nextTask != null) {
                nextTask.run();
                nextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final dqZ getMain() {
            return (dqZ) AndroidUiDispatcher.Main$delegate.getValue();
        }

        public final dqZ getCurrentThread() {
            boolean isMainThread;
            isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
            if (isMainThread) {
                return getMain();
            }
            dqZ dqz = (dqZ) AndroidUiDispatcher.currentThread.get();
            if (dqz != null) {
                return dqz;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }
    }

    static {
        InterfaceC8554dpx<dqZ> b;
        b = dpB.b(new drO<dqZ>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
            @Override // o.drO
            public final dqZ invoke() {
                boolean isMainThread;
                isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(isMainThread ? Choreographer.getInstance() : (Choreographer) C8738dws.e(C8752dxf.d(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), HandlerCompat.createAsync(Looper.getMainLooper()), null);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            }
        });
        Main$delegate = b;
        currentThread = new ThreadLocal<dqZ>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public dqZ initialValue() {
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync(myLooper), null);
                    return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
                }
                throw new IllegalStateException("no Looper on this thread".toString());
            }
        };
    }

    private final Runnable nextTask() {
        Runnable g;
        synchronized (this.lock) {
            g = this.toRunTrampolined.g();
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(j);
                }
                list.clear();
            }
        }
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.add(frameCallback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            dpR dpr = dpR.c;
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        synchronized (this.lock) {
            this.toRunTrampolined.b((C8560dqc<Runnable>) runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
            dpR dpr = dpR.c;
        }
    }
}
