package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C4755bkv;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class ThroughputTraceHistoryStorageImpl$pruneIfNeeded$1 extends ContinuationImpl {
    public int b;
    final /* synthetic */ Object c$7487ff0e;
    public /* synthetic */ Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThroughputTraceHistoryStorageImpl$pruneIfNeeded$1(Object obj, InterfaceC8585dra<? super ThroughputTraceHistoryStorageImpl$pruneIfNeeded$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c$7487ff0e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.b |= Integer.MIN_VALUE;
        try {
            Object[] objArr = {this.c$7487ff0e, this};
            Object obj2 = C4755bkv.q.get(453342192);
            if (obj2 == null) {
                obj2 = ((Class) C4755bkv.b((char) 0, 5, 1484)).getMethod("d", (Class) C4755bkv.b((char) 0, 5, 1484), InterfaceC8585dra.class);
                C4755bkv.q.put(453342192, obj2);
            }
            return ((Method) obj2).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
