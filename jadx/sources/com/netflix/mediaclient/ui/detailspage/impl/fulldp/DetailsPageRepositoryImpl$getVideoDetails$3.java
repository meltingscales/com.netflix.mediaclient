package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5198buI;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dyQ;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getVideoDetails$3 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super Result<? extends InterfaceC5198buI>>, Throwable, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    /* synthetic */ Object d;
    int e;

    public DetailsPageRepositoryImpl$getVideoDetails$3(InterfaceC8585dra<? super DetailsPageRepositoryImpl$getVideoDetails$3> interfaceC8585dra) {
        super(3, interfaceC8585dra);
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(dyQ<? super Result<? extends InterfaceC5198buI>> dyq, Throwable th, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        DetailsPageRepositoryImpl$getVideoDetails$3 detailsPageRepositoryImpl$getVideoDetails$3 = new DetailsPageRepositoryImpl$getVideoDetails$3(interfaceC8585dra);
        detailsPageRepositoryImpl$getVideoDetails$3.a = dyq;
        detailsPageRepositoryImpl$getVideoDetails$3.d = th;
        return detailsPageRepositoryImpl$getVideoDetails$3.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            Result.c cVar = Result.e;
            Result b = Result.b(Result.e(C8556dpz.a((Throwable) this.d)));
            this.a = null;
            this.e = 1;
            if (((dyQ) this.a).emit(b, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
