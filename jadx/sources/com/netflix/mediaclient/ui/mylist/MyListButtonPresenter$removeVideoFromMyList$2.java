package com.netflix.mediaclient.ui.mylist;

import com.netflix.mediaclient.android.app.Status;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C6907cmE;
import o.C8632dsu;
import o.aLO;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final /* synthetic */ class MyListButtonPresenter$removeVideoFromMyList$2 extends FunctionReferenceImpl implements drM<aLO<? extends Pair<? extends Boolean, ? extends Status>>, dpR> {
    public MyListButtonPresenter$removeVideoFromMyList$2(Object obj) {
        super(1, obj, C6907cmE.class, "handleResult", "handleResult(Lcom/netflix/mediaclient/repository/Result;)V", 0);
    }

    public final void e(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
        C8632dsu.c((Object) alo, "");
        ((C6907cmE) this.receiver).c(alo);
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(aLO<? extends Pair<? extends Boolean, ? extends Status>> alo) {
        e(alo);
        return dpR.c;
    }
}
