package com.netflix.mediaclient.ui.kids.character_details;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4171bYw;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.bYA;
import o.bZK;
import o.dpR;
import o.dyQ;

/* loaded from: classes4.dex */
public final class ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super bZK>, C4171bYw, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ bYA d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1(InterfaceC8585dra interfaceC8585dra, bYA bya) {
        super(3, interfaceC8585dra);
        this.d = bya;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(dyQ<? super bZK> dyq, C4171bYw c4171bYw, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1 showViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1 = new ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1(interfaceC8585dra, this.d);
        showViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1.e = dyq;
        showViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1.a = c4171bYw;
        return showViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1.invokeSuspend(dpR.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (r1 != null) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r11.b
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            o.C8556dpz.d(r12)
            goto L9e
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            o.C8556dpz.d(r12)
            java.lang.Object r12 = r11.e
            o.dyQ r12 = (o.dyQ) r12
            java.lang.Object r1 = r11.a
            o.bYw r1 = (o.C4171bYw) r1
            java.lang.String r3 = r1.h()
            o.C8632dsu.d(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = o.C8589dre.c(r3)
            java.util.Set r3 = o.dqL.e(r3)
            java.util.List r1 = r1.b()
            java.lang.String r4 = ""
            if (r1 == 0) goto L73
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = o.C8570dqm.a(r1, r6)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r1.next()
            o.bul r6 = (o.InterfaceC5227bul) r6
            java.lang.String r6 = r6.getId()
            o.C8632dsu.a(r6, r4)
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = o.C8589dre.c(r6)
            r5.add(r6)
            goto L4d
        L6c:
            java.util.Set r1 = o.C8570dqm.y(r5)
            if (r1 == 0) goto L73
            goto L77
        L73:
            java.util.Set r1 = o.dqL.a()
        L77:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r6 = o.dqL.b(r3, r1)
            o.bYA r1 = r11.d
            dagger.Lazy r1 = o.bYA.h(r1)
            java.lang.Object r1 = r1.get()
            o.C8632dsu.a(r1, r4)
            r5 = r1
            o.bZI r5 = (o.bZI) r5
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            o.dyS r1 = o.bZI.d.e(r5, r6, r7, r8, r9, r10)
            r11.b = r2
            java.lang.Object r12 = o.dyR.e(r12, r1, r11)
            if (r12 != r0) goto L9e
            return r0
        L9e:
            o.dpR r12 = o.dpR.c
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$liveStateChangesFlow$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
