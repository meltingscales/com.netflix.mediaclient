package com.netflix.mediaclient.ui.mylist.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7056cox;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
final class MyListActivity$onCreate$1 extends SuspendLambda implements drX<C7056cox, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MyListActivity c;
    int d;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListActivity$onCreate$1(MyListActivity myListActivity, InterfaceC8585dra<? super MyListActivity$onCreate$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = myListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MyListActivity$onCreate$1 myListActivity$onCreate$1 = new MyListActivity$onCreate$1(this.c, interfaceC8585dra);
        myListActivity$onCreate$1.e = obj;
        return myListActivity$onCreate$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(C7056cox c7056cox, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MyListActivity$onCreate$1) create(c7056cox, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            this.c.g().a((C7056cox) this.e);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
