package com.netflix.mediaclient.ui.upnextfeed.impl.data;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4003bSq;
import o.C7975dbe;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC3993bSg;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class UpNextFeedViewModel$fetchCWTitles$1 extends SuspendLambda implements drM<InterfaceC8585dra<? super C4003bSq>, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ C7975dbe c;
    final /* synthetic */ boolean d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpNextFeedViewModel$fetchCWTitles$1(C7975dbe c7975dbe, int i, boolean z, InterfaceC8585dra<? super UpNextFeedViewModel$fetchCWTitles$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.c = c7975dbe;
        this.a = i;
        this.d = z;
    }

    @Override // o.drM
    /* renamed from: a */
    public final Object invoke(InterfaceC8585dra<? super C4003bSq> interfaceC8585dra) {
        return ((UpNextFeedViewModel$fetchCWTitles$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new UpNextFeedViewModel$fetchCWTitles$1(this.c, this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC3993bSg interfaceC3993bSg;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC3993bSg = this.c.e;
            int i2 = this.a;
            boolean z = this.d;
            this.e = 1;
            obj = interfaceC3993bSg.e(i2, z, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
