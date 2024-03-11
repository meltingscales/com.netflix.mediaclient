package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Result;
import o.C8556dpz;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8632dsu;
import o.C8741dwv;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqY;
import o.dqZ;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
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

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        final AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            dqZ.b bVar = interfaceC8585dra.getContext().get(dqY.d);
            androidUiDispatcher = bVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) bVar : null;
        }
        b = C8590drf.b(interfaceC8585dra);
        final C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object e2;
                InterfaceC8585dra interfaceC8585dra2 = c8741dwv;
                drM<Long, R> drm2 = drm;
                try {
                    Result.c cVar = Result.e;
                    e2 = Result.e(drm2.invoke(Long.valueOf(j)));
                } catch (Throwable th) {
                    Result.c cVar2 = Result.e;
                    e2 = Result.e(C8556dpz.a(th));
                }
                interfaceC8585dra2.resumeWith(e2);
            }
        };
        if (androidUiDispatcher != null && C8632dsu.c(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                    invoke2(th);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    AndroidUiDispatcher.this.removeFrameCallback$ui_release(frameCallback);
                }
            });
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                    invoke2(th);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    AndroidUiFrameClock.this.getChoreographer().removeFrameCallback(frameCallback);
                }
            });
        }
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
