package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C9137js;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$maybeAsync$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ drM<InterfaceC8585dra<? super dpR>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApolloCacheInterceptor$maybeAsync$2(drM<? super InterfaceC8585dra<? super dpR>, ? extends Object> drm, InterfaceC8585dra<? super ApolloCacheInterceptor$maybeAsync$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = drm;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCacheInterceptor$maybeAsync$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ApolloCacheInterceptor$maybeAsync$2(this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                drM<InterfaceC8585dra<? super dpR>, Object> drm = this.d;
                this.b = 1;
                if (drm.invoke(this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
        } catch (Throwable th) {
            C9137js.d().invoke(new Exception("An exception occurred while writing to the cache asynchronously", th));
        }
        return dpR.c;
    }
}
