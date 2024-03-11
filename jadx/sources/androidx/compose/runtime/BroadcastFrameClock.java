package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8627dsp;
import o.C8632dsu;
import o.C8741dwv;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final Object lock;
    private final drO<dpR> onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    public BroadcastFrameClock() {
        this(null, 1, null);
    }

    public BroadcastFrameClock(drO<dpR> dro) {
        this.onNewAwaiters = dro;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(drO dro, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : dro);
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, drx);
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, dVar);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dqz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class FrameAwaiter<R> {
        private final InterfaceC8585dra<R> continuation;
        private final drM<Long, R> onFrame;

        public final InterfaceC8585dra<R> getContinuation() {
            return this.continuation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
            this.onFrame = drm;
            this.continuation = interfaceC8585dra;
        }

        public final void resume(long j) {
            Object e;
            InterfaceC8585dra<R> interfaceC8585dra = this.continuation;
            try {
                Result.c cVar = Result.e;
                e = Result.e(this.onFrame.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.c cVar2 = Result.e;
                e = Result.e(C8556dpz.a(th));
            }
            interfaceC8585dra.resumeWith(e);
        }
    }

    public final boolean getHasAwaiters() {
        boolean isEmpty;
        synchronized (this.lock) {
            isEmpty = this.awaiters.isEmpty();
        }
        return !isEmpty;
    }

    public final void sendFrame(long j) {
        synchronized (this.lock) {
            List<FrameAwaiter<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).resume(j);
            }
            list.clear();
            dpR dpr = dpR.c;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$FrameAwaiter] */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        InterfaceC8585dra b;
        FrameAwaiter frameAwaiter;
        Object e;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                Result.c cVar = Result.e;
                c8741dwv.resumeWith(Result.e(C8556dpz.a(th)));
            } else {
                objectRef.d = new FrameAwaiter(drm, c8741dwv);
                boolean isEmpty = this.awaiters.isEmpty();
                List list = this.awaiters;
                T t = objectRef.d;
                if (t == 0) {
                    C8632dsu.d("");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) t;
                }
                list.add(frameAwaiter);
                c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(Throwable th2) {
                        invoke2(th2);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        BroadcastFrameClock.FrameAwaiter frameAwaiter2;
                        Object obj = BroadcastFrameClock.this.lock;
                        BroadcastFrameClock broadcastFrameClock = BroadcastFrameClock.this;
                        Ref.ObjectRef<BroadcastFrameClock.FrameAwaiter<R>> objectRef2 = objectRef;
                        synchronized (obj) {
                            List list2 = broadcastFrameClock.awaiters;
                            Object obj2 = objectRef2.d;
                            if (obj2 == null) {
                                C8632dsu.d("");
                                frameAwaiter2 = null;
                            } else {
                                frameAwaiter2 = (BroadcastFrameClock.FrameAwaiter) obj2;
                            }
                            list2.remove(frameAwaiter2);
                            dpR dpr = dpR.c;
                        }
                    }
                });
                if (isEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = th;
            List<FrameAwaiter<?>> list = this.awaiters;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                InterfaceC8585dra<?> continuation = list.get(i).getContinuation();
                Result.c cVar = Result.e;
                continuation.resumeWith(Result.e(C8556dpz.a(th)));
            }
            this.awaiters.clear();
            dpR dpr = dpR.c;
        }
    }
}
