package com.netflix.mediaclient.ui.player.v2.interactive;

import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5639cCw;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerInteractiveMomentPresenter$prefetchAssetsForMoment$2$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ServiceManager a;
    final /* synthetic */ HashSet<String> b;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInteractiveMomentPresenter$prefetchAssetsForMoment$2$2(HashSet<String> hashSet, ServiceManager serviceManager, InterfaceC8585dra<? super PlayerInteractiveMomentPresenter$prefetchAssetsForMoment$2$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = hashSet;
        this.a = serviceManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerInteractiveMomentPresenter$prefetchAssetsForMoment$2$2(this.b, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerInteractiveMomentPresenter$prefetchAssetsForMoment$2$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            Iterator<String> it = this.b.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C8632dsu.a(next, "");
                this.a.c(next, AssetType.interactiveContent, C5639cCw.c.a);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
