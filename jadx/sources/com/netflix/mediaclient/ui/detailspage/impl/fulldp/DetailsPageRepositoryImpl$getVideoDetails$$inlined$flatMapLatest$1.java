package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.WatchQueryMode;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1362Yt;
import o.C3701bHl;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.C9083ir;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super C8954gU<C1362Yt.C1368g>>, ImageResolutionClass, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    int b;
    final /* synthetic */ C3701bHl c;
    /* synthetic */ Object d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1(InterfaceC8585dra interfaceC8585dra, C3701bHl c3701bHl, String str) {
        super(3, interfaceC8585dra);
        this.c = c3701bHl;
        this.e = str;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: a */
    public final Object invoke(dyQ<? super C8954gU<C1362Yt.C1368g>> dyq, ImageResolutionClass imageResolutionClass, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        DetailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1 detailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1 = new DetailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1(interfaceC8585dra, this.c, this.e);
        detailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1.a = dyq;
        detailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1.d = imageResolutionClass;
        return detailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C1362Yt e2;
        Object a;
        dyQ dyq;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ dyq2 = (dyQ) this.a;
            e2 = this.c.e(this.e, (ImageResolutionClass) this.d);
            C3701bHl c3701bHl = this.c;
            this.a = dyq2;
            this.d = e2;
            this.b = 1;
            a = c3701bHl.a(e2, this);
            if (a == e) {
                return e;
            }
            dyq = dyq2;
            obj = a;
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            e2 = (C1362Yt) this.d;
            dyq = (dyQ) this.a;
            C8556dpz.d(obj);
        }
        C8954gU c8954gU = (C8954gU) obj;
        dyS a2 = dyR.a(dyR.c(c8954gU), (InterfaceC8612dsa) new DetailsPageRepositoryImpl$getVideoDetails$1$1(this.c, e2, C9083ir.c(c8954gU) ? WatchQueryMode.d : WatchQueryMode.e, null));
        this.a = null;
        this.d = null;
        this.b = 2;
        if (dyR.e(dyq, a2, this) == e) {
            return e;
        }
        return dpR.c;
    }
}
