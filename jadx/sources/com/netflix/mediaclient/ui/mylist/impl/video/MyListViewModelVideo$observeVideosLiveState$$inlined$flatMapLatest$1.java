package com.netflix.mediaclient.ui.mylist.impl.video;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7011coC;
import o.C7052cot;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.bZK;
import o.dpR;
import o.dyQ;

/* loaded from: classes4.dex */
public final class MyListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super bZK>, C7011coC, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C7052cot a;
    private /* synthetic */ Object b;
    int c;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1(InterfaceC8585dra interfaceC8585dra, C7052cot c7052cot) {
        super(3, interfaceC8585dra);
        this.a = c7052cot;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: b */
    public final Object invoke(dyQ<? super bZK> dyq, C7011coC c7011coC, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        MyListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1 myListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1 = new MyListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1(interfaceC8585dra, this.a);
        myListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1.b = dyq;
        myListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1.e = c7011coC;
        return myListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1.invokeSuspend(dpR.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r1 == null) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            o.C8556dpz.d(r7)
            goto Lad
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            o.C8556dpz.d(r7)
            java.lang.Object r7 = r6.b
            o.dyQ r7 = (o.dyQ) r7
            java.lang.Object r1 = r6.e
            o.coC r1 = (o.C7011coC) r1
            o.fl r1 = r1.h()
            java.lang.Object r1 = r1.c()
            o.coE r1 = (o.C7013coE) r1
            if (r1 == 0) goto L6a
            java.util.List r1 = r1.b()
            if (r1 == 0) goto L6a
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = o.C8570dqm.a(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r1.next()
            o.cou r4 = (o.C7053cou) r4
            o.cou r4 = r4.getVideo()
            java.lang.String r4 = r4.getId()
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = o.C8589dre.c(r4)
            r3.add(r4)
            goto L44
        L64:
            java.util.Set r1 = o.C8570dqm.y(r3)
            if (r1 != 0) goto L6e
        L6a:
            java.util.Set r1 = o.dqL.a()
        L6e:
            o.cot r3 = r6.a
            dagger.Lazy r3 = o.C7052cot.e(r3)
            java.lang.Object r3 = r3.get()
            o.bZI r3 = (o.bZI) r3
            o.cot r4 = r6.a
            o.aDB r4 = o.C7052cot.a(r4)
            o.cot r5 = r6.a
            o.aDB r5 = o.C7052cot.a(r5)
            int r5 = r5.a()
            o.aoD r4 = r4.c(r5)
            o.aRB$d r5 = o.aRB.c
            boolean r5 = r5.c()
            o.dyS r1 = r3.c(r1, r4, r5)
            com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$3$1 r3 = new com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$3$1
            o.cot r4 = r6.a
            r5 = 0
            r3.<init>(r4, r5)
            o.dyS r1 = o.dyR.a(r1, r3)
            r6.c = r2
            java.lang.Object r7 = o.dyR.e(r7, r1, r6)
            if (r7 != r0) goto Lad
            return r0
        Lad:
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
