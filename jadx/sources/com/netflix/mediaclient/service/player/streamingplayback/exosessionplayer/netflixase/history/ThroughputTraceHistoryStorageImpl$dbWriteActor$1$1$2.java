package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* loaded from: classes6.dex */
final class ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$2(InterfaceC8585dra<? super ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
    }

    @Override // o.drM
    /* renamed from: a */
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new ThroughputTraceHistoryStorageImpl$dbWriteActor$1$1$2(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
