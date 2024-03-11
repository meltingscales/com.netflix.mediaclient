package com.netflix.mediaclient.ui.usermarks.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5251bvI;
import o.C5341bwt;
import o.C7969dbY;
import o.C7999dcB;
import o.C8048dcy;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class UserMarksImpl$showCreateUserMarkUI$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ C8048dcy c;
    int d;
    final /* synthetic */ C7969dbY e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMarksImpl$showCreateUserMarkUI$1$1(C8048dcy c8048dcy, String str, C7969dbY c7969dbY, InterfaceC8585dra<? super UserMarksImpl$showCreateUserMarkUI$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c8048dcy;
        this.a = str;
        this.e = c7969dbY;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserMarksImpl$showCreateUserMarkUI$1$1(this.c, this.a, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserMarksImpl$showCreateUserMarkUI$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C5251bvI c5251bvI;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            c5251bvI = this.c.g;
            C5341bwt e2 = C7999dcB.e(C7999dcB.c, this.a, this.e, 0L, 4, null);
            this.d = 1;
            if (c5251bvI.d(e2, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
