package com.airbnb.mvrx;

import androidx.fragment.app.Fragment;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8888fH;
import o.InterfaceC8894fN;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: classes2.dex */
public final class DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1<S> extends SuspendLambda implements drX<S, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Fragment d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Lo/dra<-Lcom/airbnb/mvrx/DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1;>;)V */
    public DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1(Fragment fragment, InterfaceC8585dra interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = fragment;
    }

    /* JADX WARN: Incorrect types in method signature: (TS;Lo/dra<-Lo/dpR;>;)Ljava/lang/Object; */
    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(InterfaceC8888fH interfaceC8888fH, InterfaceC8585dra interfaceC8585dra) {
        return ((DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1) create(interfaceC8888fH, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1(this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            ((InterfaceC8894fN) this.d).i_();
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
