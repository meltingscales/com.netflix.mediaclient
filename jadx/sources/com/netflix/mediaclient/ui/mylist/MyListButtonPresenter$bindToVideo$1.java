package com.netflix.mediaclient.ui.mylist;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C6950cmv;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final /* synthetic */ class MyListButtonPresenter$bindToVideo$1 extends FunctionReferenceImpl implements drM<Throwable, dpR> {
    public MyListButtonPresenter$bindToVideo$1(Object obj) {
        super(1, obj, C6950cmv.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    public final void c(Throwable th) {
        C8632dsu.c((Object) th, "");
        ((C6950cmv) this.receiver).c(th);
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        c(th);
        return dpR.c;
    }
}
