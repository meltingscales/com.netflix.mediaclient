package com.netflix.mediaclient.ui.mylist.impl.viewmodel;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.mylist.impl.MyListActivity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7003cnv;
import o.C7010coB;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class MyListActivityModel$canShowMyListGamesPopover$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Boolean>, Object> {
    int b;
    final /* synthetic */ C7010coB d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListActivityModel$canShowMyListGamesPopover$2(C7010coB c7010coB, InterfaceC8585dra<? super MyListActivityModel$canShowMyListGamesPopover$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c7010coB;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MyListActivityModel$canShowMyListGamesPopover$2(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return ((MyListActivityModel$canShowMyListGamesPopover$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C7003cnv c7003cnv;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            c7003cnv = this.d.a;
            return C8589dre.e(!c7003cnv.d() && (NetflixActivity.isTutorialOn() || MyListActivity.e.d()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
