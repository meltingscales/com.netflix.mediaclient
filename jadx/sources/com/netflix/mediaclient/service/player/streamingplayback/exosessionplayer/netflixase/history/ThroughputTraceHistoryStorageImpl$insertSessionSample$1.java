package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4755bkv;
import o.C5339bwr;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyI;

/* loaded from: classes6.dex */
public final class ThroughputTraceHistoryStorageImpl$insertSessionSample$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C5339bwr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThroughputTraceHistoryStorageImpl$insertSessionSample$1(C5339bwr c5339bwr, InterfaceC8585dra<? super ThroughputTraceHistoryStorageImpl$insertSessionSample$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c5339bwr;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ThroughputTraceHistoryStorageImpl$insertSessionSample$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ThroughputTraceHistoryStorageImpl$insertSessionSample$1(this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            try {
                Object obj2 = C4755bkv.q.get(32280099);
                if (obj2 == null) {
                    obj2 = ((Class) C4755bkv.b((char) 0, 5, 1484)).getMethod("e", null);
                    C4755bkv.q.put(32280099, obj2);
                }
                dyI dyi = (dyI) ((Method) obj2).invoke(null, null);
                C5339bwr c5339bwr = this.c;
                this.a = 1;
                if (dyi.a(c5339bwr, this) == e) {
                    return e;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
