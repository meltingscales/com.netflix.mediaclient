package com.netflix.mediaclient.ui.home.impl.games;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC4034bTu;
import o.C4037bTx;
import o.C8556dpz;
import o.C8586drb;
import o.C9935zP;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GameHandleViewModel$fetchHandle$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ C4037bTx c;
    int d;
    final /* synthetic */ C9935zP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameHandleViewModel$fetchHandle$2(C4037bTx c4037bTx, boolean z, boolean z2, C9935zP c9935zP, InterfaceC8585dra<? super GameHandleViewModel$fetchHandle$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c4037bTx;
        this.b = z;
        this.a = z2;
        this.e = c9935zP;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GameHandleViewModel$fetchHandle$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GameHandleViewModel$fetchHandle$2(this.c, this.b, this.a, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object a;
        C9935zP c9935zP;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            C4037bTx c4037bTx = this.c;
            boolean z = this.b;
            this.d = 1;
            a = c4037bTx.a(z, this);
            if (a == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        if (this.a && (c9935zP = this.e) != null) {
            c9935zP.b(AbstractC4034bTu.class, AbstractC4034bTu.d.d);
        }
        return dpR.c;
    }
}
