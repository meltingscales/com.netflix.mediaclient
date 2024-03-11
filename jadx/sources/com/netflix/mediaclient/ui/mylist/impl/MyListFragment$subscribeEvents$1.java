package com.netflix.mediaclient.ui.mylist.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7056cox;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
final class MyListFragment$subscribeEvents$1 extends SuspendLambda implements drX<C7056cox, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ MyListFragment c;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListFragment$subscribeEvents$1(MyListFragment myListFragment, InterfaceC8585dra<? super MyListFragment$subscribeEvents$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = myListFragment;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(C7056cox c7056cox, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MyListFragment$subscribeEvents$1) create(c7056cox, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MyListFragment$subscribeEvents$1 myListFragment$subscribeEvents$1 = new MyListFragment$subscribeEvents$1(this.c, interfaceC8585dra);
        myListFragment$subscribeEvents$1.e = obj;
        return myListFragment$subscribeEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            this.c.K().e(((C7056cox) this.e).e());
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
