package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
public final class dyL<T> extends dyN<T> {
    private final drX<dyK<? super T>, InterfaceC8585dra<? super dpR>, Object> e;

    public /* synthetic */ dyL(drX drx, dqZ dqz, int i, BufferOverflow bufferOverflow, int i2, C8627dsp c8627dsp) {
        this(drx, (i2 & 2) != 0 ? EmptyCoroutineContext.e : dqz, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dyL(drX<? super dyK<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        super(drx, dqz, i, bufferOverflow);
        this.e = drx;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // o.dyN, o.dzH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(o.dyK<? super T> r5, o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.c
            o.dyK r5 = (o.dyK) r5
            o.C8556dpz.d(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            o.C8556dpz.d(r6)
            r0.c = r5
            r0.e = r3
            java.lang.Object r6 = super.a(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.n()
            if (r5 == 0) goto L4c
            o.dpR r5 = o.dpR.c
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dyL.a(o.dyK, o.dra):java.lang.Object");
    }

    @Override // o.dyN, o.dzH
    public dzH<T> d(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return new dyL(this.e, dqz, i, bufferOverflow);
    }
}
