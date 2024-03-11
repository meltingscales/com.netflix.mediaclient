package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Result;
import o.C8556dpz;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8738dws;
import o.C8741dwv;
import o.C8752dxf;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) C8738dws.e(C8752dxf.d().c(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
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
        b = C8590drf.b(interfaceC8585dra);
        final C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object e2;
                InterfaceC8585dra interfaceC8585dra2 = c8741dwv;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
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
        choreographer.postFrameCallback(frameCallback);
        c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
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
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(frameCallback);
            }
        });
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
