package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;
import o.dyJ;
import o.dyQ;

/* loaded from: classes6.dex */
final class CombineKt$zipImpl$1$1$2$1$1 extends SuspendLambda implements drX<dpR, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dyQ<R> a;
    Object b;
    final /* synthetic */ T1 c;
    final /* synthetic */ dyJ<Object> d;
    final /* synthetic */ InterfaceC8612dsa<T1, T2, InterfaceC8585dra<? super R>, Object> e;
    int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1$2$1$1(dyJ<? extends Object> dyj, dyQ<? super R> dyq, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa, T1 t1, InterfaceC8585dra<? super CombineKt$zipImpl$1$1$2$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dyj;
        this.a = dyq;
        this.e = interfaceC8612dsa;
        this.c = t1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CombineKt$zipImpl$1$1$2$1$1(this.d, this.a, this.e, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dpR dpr, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CombineKt$zipImpl$1$1$2$1$1) create(dpr, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r8.h
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L30
            if (r1 == r5) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            o.C8556dpz.d(r9)
            goto L6f
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.b
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r9)
            goto L64
        L26:
            o.C8556dpz.d(r9)
            o.dyx r9 = (o.C8797dyx) r9
            java.lang.Object r9 = r9.e()
            goto L3e
        L30:
            o.C8556dpz.d(r9)
            o.dyJ<java.lang.Object> r9 = r8.d
            r8.h = r5
            java.lang.Object r9 = r9.e(r8)
            if (r9 != r0) goto L3e
            return r0
        L3e:
            o.dyQ<R> r1 = r8.a
            boolean r5 = r9 instanceof o.C8797dyx.a
            if (r5 == 0) goto L50
            java.lang.Throwable r9 = o.C8797dyx.d(r9)
            if (r9 != 0) goto L4f
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r1)
        L4f:
            throw r9
        L50:
            o.dsa<T1, T2, o.dra<? super R>, java.lang.Object> r5 = r8.e
            T1 r6 = r8.c
            o.dAH r7 = o.dzT.b
            if (r9 != r7) goto L59
            r9 = r2
        L59:
            r8.b = r1
            r8.h = r4
            java.lang.Object r9 = r5.invoke(r6, r9, r8)
            if (r9 != r0) goto L64
            return r0
        L64:
            r8.b = r2
            r8.h = r3
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L6f
            return r0
        L6f:
            o.dpR r9 = o.dpR.c
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
