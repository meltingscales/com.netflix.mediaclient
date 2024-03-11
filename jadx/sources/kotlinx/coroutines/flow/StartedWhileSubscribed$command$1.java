package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8824dzx;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dyQ;

/* loaded from: classes5.dex */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super SharingCommand>, Integer, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    /* synthetic */ int c;
    private /* synthetic */ Object d;
    final /* synthetic */ C8824dzx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(C8824dzx c8824dzx, InterfaceC8585dra<? super StartedWhileSubscribed$command$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.e = c8824dzx;
    }

    public final Object b(dyQ<? super SharingCommand> dyq, int i, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.e, interfaceC8585dra);
        startedWhileSubscribed$command$1.d = dyq;
        startedWhileSubscribed$command$1.c = i;
        return startedWhileSubscribed$command$1.invokeSuspend(dpR.c);
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(dyQ<? super SharingCommand> dyq, Integer num, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return b(dyq, num.intValue(), interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r9.a
            r2 = 4
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L38
            if (r1 == r5) goto L30
            if (r1 == r4) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            goto L38
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.d
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r10)
            goto L8e
        L28:
            java.lang.Object r1 = r9.d
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r10)
            goto L7d
        L30:
            java.lang.Object r1 = r9.d
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r10)
            goto L64
        L38:
            o.C8556dpz.d(r10)
            goto L9c
        L3c:
            o.C8556dpz.d(r10)
            java.lang.Object r10 = r9.d
            o.dyQ r10 = (o.dyQ) r10
            int r1 = r9.c
            if (r1 <= 0) goto L52
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START
            r9.a = r6
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L9c
            return r0
        L52:
            o.dzx r1 = r9.e
            long r6 = o.C8824dzx.b(r1)
            r9.d = r10
            r9.a = r5
            java.lang.Object r1 = o.C8749dxc.b(r6, r9)
            if (r1 != r0) goto L63
            return r0
        L63:
            r1 = r10
        L64:
            o.dzx r10 = r9.e
            long r5 = o.C8824dzx.e(r10)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L8e
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
            r9.d = r1
            r9.a = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L7d
            return r0
        L7d:
            o.dzx r10 = r9.e
            long r4 = o.C8824dzx.e(r10)
            r9.d = r1
            r9.a = r2
            java.lang.Object r10 = o.C8749dxc.b(r4, r9)
            if (r10 != r0) goto L8e
            return r0
        L8e:
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r2 = 0
            r9.d = r2
            r9.a = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L9c
            return r0
        L9c:
            o.dpR r10 = o.dpR.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
