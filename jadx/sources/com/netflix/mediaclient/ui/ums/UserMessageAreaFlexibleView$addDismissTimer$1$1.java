package com.netflix.mediaclient.ui.ums;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6201cXp;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class UserMessageAreaFlexibleView$addDismissTimer$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C6201cXp a;
    int c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMessageAreaFlexibleView$addDismissTimer$1$1(long j, C6201cXp c6201cXp, InterfaceC8585dra<? super UserMessageAreaFlexibleView$addDismissTimer$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = j;
        this.a = c6201cXp;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserMessageAreaFlexibleView$addDismissTimer$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserMessageAreaFlexibleView$addDismissTimer$1$1(this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            long j = this.d;
            this.c = 1;
            if (C8749dxc.b(j, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.a.e(true);
        return dpR.c;
    }
}
