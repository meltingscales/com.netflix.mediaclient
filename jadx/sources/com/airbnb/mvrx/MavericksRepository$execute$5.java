package com.airbnb.mvrx;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8886fF;
import o.AbstractC8918fl;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8927fu;
import o.C8971gl;
import o.InterfaceC8585dra;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.drX;
import o.dtE;
import o.dwU;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes2.dex */
public final class MavericksRepository$execute$5 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dtE<S, AbstractC8918fl<T>> a;
    int b;
    final /* synthetic */ drX<S, AbstractC8918fl<? extends T>, S> c;
    final /* synthetic */ AbstractC8886fF<S> d;
    final /* synthetic */ drM<InterfaceC8585dra<? super T>, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksRepository$execute$5(drM<? super InterfaceC8585dra<? super T>, ? extends Object> drm, AbstractC8886fF<S> abstractC8886fF, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx, dtE<S, ? extends AbstractC8918fl<? extends T>> dte, InterfaceC8585dra<? super MavericksRepository$execute$5> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = drm;
        this.d = abstractC8886fF;
        this.c = drx;
        this.a = dte;
    }

    public final Object b(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksRepository$execute$5) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MavericksRepository$execute$5(this.e, this.d, this.c, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return b(dwu, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(final Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                drM<InterfaceC8585dra<? super T>, Object> drm = this.e;
                this.b = 1;
                obj = drm.invoke(this);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            AbstractC8886fF<S> abstractC8886fF = this.d;
            final drX<S, AbstractC8918fl<? extends T>, S> drx = this.c;
            abstractC8886fF.d((drM<? super S, ? extends S>) new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$5.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                public final InterfaceC8888fH d(InterfaceC8888fH interfaceC8888fH) {
                    C8632dsu.c((Object) interfaceC8888fH, "");
                    return (InterfaceC8888fH) drx.invoke(interfaceC8888fH, new C8971gl(obj));
                }

                @Override // o.drM
                public /* synthetic */ Object invoke(Object obj2) {
                    return d((InterfaceC8888fH) obj2);
                }
            });
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            AbstractC8886fF<S> abstractC8886fF2 = this.d;
            final drX<S, AbstractC8918fl<? extends T>, S> drx2 = this.c;
            final dtE<S, AbstractC8918fl<T>> dte = this.a;
            abstractC8886fF2.d((drM<? super S, ? extends S>) new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$5.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                public final InterfaceC8888fH a(InterfaceC8888fH interfaceC8888fH) {
                    AbstractC8918fl abstractC8918fl;
                    C8632dsu.c((Object) interfaceC8888fH, "");
                    drX<S, AbstractC8918fl<? extends T>, S> drx3 = drx2;
                    Throwable th2 = th;
                    dtE<S, AbstractC8918fl<T>> dte2 = dte;
                    return (InterfaceC8888fH) drx3.invoke(interfaceC8888fH, new C8927fu(th2, (dte2 == 0 || (abstractC8918fl = (AbstractC8918fl) dte2.get(interfaceC8888fH)) == null) ? null : abstractC8918fl.c()));
                }

                @Override // o.drM
                public /* synthetic */ Object invoke(Object obj2) {
                    return a((InterfaceC8888fH) obj2);
                }
            });
        }
        return dpR.c;
    }
}
