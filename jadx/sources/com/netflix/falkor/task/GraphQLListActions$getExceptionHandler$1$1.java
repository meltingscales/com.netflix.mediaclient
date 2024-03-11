package com.netflix.falkor.task;

import com.netflix.mediaclient.android.app.Status;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aLL;
import o.aLO;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class GraphQLListActions$getExceptionHandler$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<aLO<? extends Pair<Boolean, ? extends Status>>, dpR> a;
    int b;
    final /* synthetic */ Throwable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLListActions$getExceptionHandler$1$1(drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm, Throwable th, InterfaceC8585dra<? super GraphQLListActions$getExceptionHandler$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = drm;
        this.e = th;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLListActions$getExceptionHandler$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLListActions$getExceptionHandler$1$1(this.a, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            this.a.invoke(new aLL(this.e));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
