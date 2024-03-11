package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import o.C8632dsu;
import o.C8737dwr;
import o.C8797dyx;
import o.C8799dyz;
import o.InterfaceC8585dra;
import o.InterfaceC8792dys;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;
import o.dxD;

/* loaded from: classes2.dex */
public final class SimpleActor<T> {
    private final drX<T, InterfaceC8585dra<? super dpR>, Object> consumeMessage;
    private final InterfaceC8792dys<T> messageQueue;
    private final AtomicInteger remainingMessages;
    private final dwU scope;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(dwU dwu, final drM<? super Throwable, dpR> drm, final drX<? super T, ? super Throwable, dpR> drx, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx2) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drx2, "");
        this.scope = dwu;
        this.consumeMessage = drx2;
        this.messageQueue = C8799dyz.e(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        dxD dxd = (dxD) dwu.getCoroutineContext().get(dxD.b);
        if (dxd == null) {
            return;
        }
        dxd.e(new drM<Throwable, dpR>() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                invoke2(th);
                return dpR.c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                dpR dpr;
                drm.invoke(th);
                ((SimpleActor) this).messageQueue.b(th);
                do {
                    Object c = C8797dyx.c(((SimpleActor) this).messageQueue.s());
                    if (c == null) {
                        dpr = null;
                        continue;
                    } else {
                        drx.invoke(c, th);
                        dpr = dpR.c;
                        continue;
                    }
                } while (dpr != null);
            }
        });
    }

    public final void offer(T t) {
        Object d = this.messageQueue.d((InterfaceC8792dys<T>) t);
        if (d instanceof C8797dyx.b) {
            Throwable d2 = C8797dyx.d(d);
            if (d2 != null) {
                throw d2;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        } else if (!C8797dyx.f(d)) {
            throw new IllegalStateException("Check failed.".toString());
        } else {
            if (this.remainingMessages.getAndIncrement() == 0) {
                C8737dwr.c(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
            }
        }
    }
}
