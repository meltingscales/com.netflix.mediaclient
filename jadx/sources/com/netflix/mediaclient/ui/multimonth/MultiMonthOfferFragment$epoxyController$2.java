package com.netflix.mediaclient.ui.multimonth;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C6853clD;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final /* synthetic */ class MultiMonthOfferFragment$epoxyController$2 extends FunctionReferenceImpl implements drM<String, dpR> {
    public MultiMonthOfferFragment$epoxyController$2(Object obj) {
        super(1, obj, C6853clD.class, "onSubmitClicked", "onSubmitClicked(Ljava/lang/String;)V", 0);
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        ((C6853clD) this.receiver).a(str);
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(String str) {
        e(str);
        return dpR.c;
    }
}
