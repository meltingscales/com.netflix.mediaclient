package com.netflix.mediaclient.ui.multimonth;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C6853clD;
import o.C6861clL;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final /* synthetic */ class MultiMonthOfferFragment$epoxyController$1 extends FunctionReferenceImpl implements drM<C6861clL, dpR> {
    public MultiMonthOfferFragment$epoxyController$1(Object obj) {
        super(1, obj, C6853clD.class, "onOfferSelected", "onOfferSelected(Lcom/netflix/mediaclient/ui/multimonth/OfferChoice;)V", 0);
    }

    public final void a(C6861clL c6861clL) {
        C8632dsu.c((Object) c6861clL, "");
        ((C6853clD) this.receiver).c(c6861clL);
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(C6861clL c6861clL) {
        a(c6861clL);
        return dpR.c;
    }
}
