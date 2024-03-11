package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5339bwr;
import o.InterfaceC8585dra;
import o.InterfaceC8791dyr;
import o.dpR;
import o.drX;

/* loaded from: classes6.dex */
public final class ThroughputTraceHistoryStorageImpl$dbWriteActor$1 extends SuspendLambda implements drX<InterfaceC8791dyr<C5339bwr>, InterfaceC8585dra<? super dpR>, Object> {
    Object a;
    Object b;
    private /* synthetic */ Object c;
    int d;
    long e;

    public ThroughputTraceHistoryStorageImpl$dbWriteActor$1(InterfaceC8585dra<? super ThroughputTraceHistoryStorageImpl$dbWriteActor$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ThroughputTraceHistoryStorageImpl$dbWriteActor$1 throughputTraceHistoryStorageImpl$dbWriteActor$1 = new ThroughputTraceHistoryStorageImpl$dbWriteActor$1(interfaceC8585dra);
        throughputTraceHistoryStorageImpl$dbWriteActor$1.c = obj;
        return throughputTraceHistoryStorageImpl$dbWriteActor$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(InterfaceC8791dyr<C5339bwr> interfaceC8791dyr, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ThroughputTraceHistoryStorageImpl$dbWriteActor$1) create(interfaceC8791dyr, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac A[Catch: all -> 0x0227, TryCatch #1 {all -> 0x0227, blocks: (B:15:0x009c, B:19:0x00bf, B:18:0x00ac), top: B:69:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: all -> 0x021e, TryCatch #2 {all -> 0x021e, blocks: (B:27:0x00ea, B:31:0x0111, B:30:0x00fa), top: B:71:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0195 A[Catch: all -> 0x0215, TryCatch #0 {all -> 0x0215, blocks: (B:37:0x017d, B:41:0x01c0, B:40:0x0195), top: B:67:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020d A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, java.util.LinkedList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x020b -> B:8:0x002e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history.ThroughputTraceHistoryStorageImpl$dbWriteActor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
