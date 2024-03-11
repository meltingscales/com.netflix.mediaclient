package com.apollographql.apollo3.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C9096jD;
import o.InterfaceC7871dIn;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dyQ;

/* loaded from: classes2.dex */
public final class MultipartKt$multipartBodyFlow$2 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super InterfaceC7871dIn>, Throwable, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    int d;
    final /* synthetic */ Ref.ObjectRef<C9096jD> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$multipartBodyFlow$2(Ref.ObjectRef<C9096jD> objectRef, InterfaceC8585dra<? super MultipartKt$multipartBodyFlow$2> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.e = objectRef;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: d */
    public final Object invoke(dyQ<? super InterfaceC7871dIn> dyq, Throwable th, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        MultipartKt$multipartBodyFlow$2 multipartKt$multipartBodyFlow$2 = new MultipartKt$multipartBodyFlow$2(this.e, interfaceC8585dra);
        multipartKt$multipartBodyFlow$2.a = dyq;
        return multipartKt$multipartBodyFlow$2.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dpR dpr;
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            dyQ dyq = (dyQ) this.a;
            Ref.ObjectRef<C9096jD> objectRef = this.e;
            try {
                Result.c cVar = Result.e;
                C9096jD c9096jD = objectRef.d;
                if (c9096jD != null) {
                    c9096jD.close();
                    dpr = dpR.c;
                } else {
                    dpr = null;
                }
                Result.e(dpr);
            } catch (Throwable th) {
                Result.c cVar2 = Result.e;
                Result.e(C8556dpz.a(th));
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
