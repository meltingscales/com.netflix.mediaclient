package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dtW;
import o.dxD;
import o.dxM;

/* loaded from: classes5.dex */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements drX<dtW<? super dxD>, InterfaceC8585dra<? super dpR>, Object> {
    Object a;
    int b;
    private /* synthetic */ Object c;
    final /* synthetic */ dxM d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(dxM dxm, InterfaceC8585dra<? super JobSupport$children$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dxm;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dtW<? super dxD> dtw, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((JobSupport$children$1) create(dtw, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.d, interfaceC8585dra);
        jobSupport$children$1.c = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:27:0x007f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r6.e
            o.dAu r1 = (o.C7664dAu) r1
            java.lang.Object r3 = r6.a
            o.dAt r3 = (o.C7663dAt) r3
            java.lang.Object r4 = r6.c
            o.dtW r4 = (o.dtW) r4
            o.C8556dpz.d(r7)
            goto L7f
        L1e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L26:
            o.C8556dpz.d(r7)
            goto L84
        L2a:
            o.C8556dpz.d(r7)
            java.lang.Object r7 = r6.c
            o.dtW r7 = (o.dtW) r7
            o.dxM r1 = r6.d
            java.lang.Object r1 = r1.cy_()
            boolean r4 = r1 instanceof o.dwD
            if (r4 == 0) goto L48
            o.dwD r1 = (o.dwD) r1
            o.dwI r1 = r1.e
            r6.b = r3
            java.lang.Object r7 = r7.d(r1, r6)
            if (r7 != r0) goto L84
            return r0
        L48:
            boolean r3 = r1 instanceof o.dxA
            if (r3 == 0) goto L84
            o.dxA r1 = (o.dxA) r1
            o.dxQ r1 = r1.cp_()
            if (r1 == 0) goto L84
            java.lang.Object r3 = r1.g()
            o.C8632dsu.d(r3)
            o.dAu r3 = (o.C7664dAu) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L61:
            boolean r7 = o.C8632dsu.c(r1, r3)
            if (r7 != 0) goto L84
            boolean r7 = r1 instanceof o.dwD
            if (r7 == 0) goto L7f
            r7 = r1
            o.dwD r7 = (o.dwD) r7
            o.dwI r7 = r7.e
            r6.c = r4
            r6.a = r3
            r6.e = r1
            r6.b = r2
            java.lang.Object r7 = r4.d(r7, r6)
            if (r7 != r0) goto L7f
            return r0
        L7f:
            o.dAu r1 = r1.j()
            goto L61
        L84:
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
