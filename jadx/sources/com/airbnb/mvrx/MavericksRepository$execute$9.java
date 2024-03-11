package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8886fF;
import o.AbstractC8918fl;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8927fu;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.drX;
import o.dtE;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class MavericksRepository$execute$9<T> extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super T>, Throwable, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ drX<S, AbstractC8918fl<? extends T>, S> c;
    final /* synthetic */ AbstractC8886fF<S> d;
    final /* synthetic */ dtE<S, AbstractC8918fl<T>> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksRepository$execute$9(AbstractC8886fF<S> abstractC8886fF, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx, dtE<S, ? extends AbstractC8918fl<? extends T>> dte, InterfaceC8585dra<? super MavericksRepository$execute$9> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.d = abstractC8886fF;
        this.c = drx;
        this.e = dte;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(dyQ<? super T> dyq, Throwable th, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        MavericksRepository$execute$9 mavericksRepository$execute$9 = new MavericksRepository$execute$9(this.d, this.c, this.e, interfaceC8585dra);
        mavericksRepository$execute$9.b = th;
        return mavericksRepository$execute$9.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            final Throwable th = (Throwable) this.b;
            AbstractC8886fF<S> abstractC8886fF = this.d;
            final drX<S, AbstractC8918fl<? extends T>, S> drx = this.c;
            final dtE<S, AbstractC8918fl<T>> dte = this.e;
            abstractC8886fF.d((drM<? super S, ? extends S>) new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$9.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                @Override // o.drM
                /* renamed from: d */
                public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                    AbstractC8918fl<T> abstractC8918fl;
                    C8632dsu.c((Object) interfaceC8888fH, "");
                    drX<S, AbstractC8918fl<? extends T>, S> drx2 = drx;
                    Throwable th2 = th;
                    dtE<S, AbstractC8918fl<T>> dte2 = dte;
                    return (InterfaceC8888fH) drx2.invoke(interfaceC8888fH, new C8927fu(th2, (dte2 == null || (abstractC8918fl = dte2.get(interfaceC8888fH)) == null) ? null : abstractC8918fl.c()));
                }
            });
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
