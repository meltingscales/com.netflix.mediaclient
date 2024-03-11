package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history;

import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Queue;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C4755bkv;
import o.C5339bwr;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes6.dex */
final class ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$1 extends SuspendLambda implements drX<C5339bwr, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Ref.LongRef a;
    /* synthetic */ Object b;
    final /* synthetic */ Ref.ObjectRef<Queue<C5339bwr>> c;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$1(Ref.ObjectRef<Queue<C5339bwr>> objectRef, Ref.LongRef longRef, InterfaceC8585dra<? super ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = objectRef;
        this.a = longRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$1 throughputTraceHistoryStorageImpl$dbWriteActor$1$1$1 = new ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$1(this.c, this.a, interfaceC8585dra);
        throughputTraceHistoryStorageImpl$dbWriteActor$1$1$1.b = obj;
        return throughputTraceHistoryStorageImpl$dbWriteActor$1$1$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(C5339bwr c5339bwr, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$1) create(c5339bwr, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            this.c.d.add((C5339bwr) this.b);
            if (this.c.d.size() == 1) {
                Ref.LongRef longRef = this.a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Object obj2 = ((Class) C4755bkv.b((char) 0, 5, 1484)).getField("c").get(null);
                try {
                    Object obj3 = C4755bkv.q.get(32277216);
                    if (obj3 == null) {
                        obj3 = ((Class) C4755bkv.b((char) 0, 5, 1484)).getMethod("b", null);
                        C4755bkv.q.put(32277216, obj3);
                    }
                    longRef.a = elapsedRealtime + ((Long) ((Method) obj3).invoke(obj2, null)).longValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
