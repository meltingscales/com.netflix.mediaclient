package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8924fr;
import o.InterfaceC8585dra;
import o.InterfaceC8810dzj;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [S] */
/* loaded from: classes5.dex */
public final class CoroutinesStateStore$flushQueuesOnce$2$1<S> extends SuspendLambda implements drX<drM<? super S, ? extends S>, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C8924fr<S> c;
    /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesStateStore$flushQueuesOnce$2$1(C8924fr<S> c8924fr, InterfaceC8585dra<? super CoroutinesStateStore$flushQueuesOnce$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c8924fr;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(drM<? super S, ? extends S> drm, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoroutinesStateStore$flushQueuesOnce$2$1) create(drm, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        CoroutinesStateStore$flushQueuesOnce$2$1 coroutinesStateStore$flushQueuesOnce$2$1 = new CoroutinesStateStore$flushQueuesOnce$2$1(this.c, interfaceC8585dra);
        coroutinesStateStore$flushQueuesOnce$2$1.d = obj;
        return coroutinesStateStore$flushQueuesOnce$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC8810dzj interfaceC8810dzj;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8888fH interfaceC8888fH = (InterfaceC8888fH) ((drM) this.d).invoke(this.c.b());
            if (!C8632dsu.c(interfaceC8888fH, this.c.b())) {
                this.c.c((C8924fr<S>) interfaceC8888fH);
                interfaceC8810dzj = ((C8924fr) this.c).i;
                this.a = 1;
                if (interfaceC8810dzj.emit(interfaceC8888fH, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
