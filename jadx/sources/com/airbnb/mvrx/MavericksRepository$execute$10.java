package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8886fF;
import o.AbstractC8918fl;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8971gl;
import o.InterfaceC8585dra;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.drX;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class MavericksRepository$execute$10<T> extends SuspendLambda implements drX<T, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<S, AbstractC8918fl<? extends T>, S> a;
    int b;
    /* synthetic */ Object d;
    final /* synthetic */ AbstractC8886fF<S> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksRepository$execute$10(AbstractC8886fF<S> abstractC8886fF, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx, InterfaceC8585dra<? super MavericksRepository$execute$10> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = abstractC8886fF;
        this.a = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksRepository$execute$10 mavericksRepository$execute$10 = new MavericksRepository$execute$10(this.e, this.a, interfaceC8585dra);
        mavericksRepository$execute$10.d = obj;
        return mavericksRepository$execute$10;
    }

    public final Object d(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksRepository$execute$10) create(t, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.drX
    public /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return d(obj, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            final Object obj2 = this.d;
            AbstractC8886fF<S> abstractC8886fF = this.e;
            final drX<S, AbstractC8918fl<? extends T>, S> drx = this.a;
            abstractC8886fF.d((drM<? super S, ? extends S>) new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$10.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                public final InterfaceC8888fH c(InterfaceC8888fH interfaceC8888fH) {
                    C8632dsu.c((Object) interfaceC8888fH, "");
                    return (InterfaceC8888fH) drx.invoke(interfaceC8888fH, new C8971gl(obj2));
                }

                @Override // o.drM
                public /* synthetic */ Object invoke(Object obj3) {
                    return c((InterfaceC8888fH) obj3);
                }
            });
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
