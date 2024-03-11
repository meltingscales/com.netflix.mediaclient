package com.netflix.mediaclient.ui.home.impl.lolomo.rows;

import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class CollectionCreator$addCollectionPageEvidence$1$4 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MiniPlayerVideoGroupViewModel a;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionCreator$addCollectionPageEvidence$1$4(MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, InterfaceC8585dra<? super CollectionCreator$addCollectionPageEvidence$1$4> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = miniPlayerVideoGroupViewModel;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CollectionCreator$addCollectionPageEvidence$1$4) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CollectionCreator$addCollectionPageEvidence$1$4(this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.a.k();
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
