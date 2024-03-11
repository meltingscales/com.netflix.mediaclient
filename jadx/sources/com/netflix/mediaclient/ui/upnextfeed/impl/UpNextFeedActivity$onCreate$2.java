package com.netflix.mediaclient.ui.upnextfeed.impl;

import java.util.Optional;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5155btS;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
final class UpNextFeedActivity$onCreate$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ UpNextFeedActivity b;
    int c;
    Object d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpNextFeedActivity$onCreate$2(UpNextFeedActivity upNextFeedActivity, InterfaceC8585dra<? super UpNextFeedActivity$onCreate$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = upNextFeedActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UpNextFeedActivity$onCreate$2(this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UpNextFeedActivity$onCreate$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        UpNextFeedActivity upNextFeedActivity;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            UpNextFeedActivity upNextFeedActivity2 = this.b;
            this.d = upNextFeedActivity2;
            this.c = 1;
            Object a = upNextFeedActivity2.c().get().a(this);
            if (a == e) {
                return e;
            }
            upNextFeedActivity = upNextFeedActivity2;
            obj = a;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            upNextFeedActivity = (UpNextFeedActivity) this.d;
            C8556dpz.d(obj);
        }
        upNextFeedActivity.d((InterfaceC5155btS) ((Optional) obj).get());
        return dpR.c;
    }
}
