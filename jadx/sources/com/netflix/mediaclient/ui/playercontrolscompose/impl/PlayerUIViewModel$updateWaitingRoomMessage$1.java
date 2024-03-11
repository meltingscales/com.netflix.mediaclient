package com.netflix.mediaclient.ui.playercontrolscompose.impl;

import dagger.Lazy;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bZB;
import o.cIF;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class PlayerUIViewModel$updateWaitingRoomMessage$1 extends SuspendLambda implements drM<InterfaceC8585dra<? super String>, Object> {
    final /* synthetic */ cIF a;
    final /* synthetic */ int d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerUIViewModel$updateWaitingRoomMessage$1(cIF cif, int i, InterfaceC8585dra<? super PlayerUIViewModel$updateWaitingRoomMessage$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.a = cif;
        this.d = i;
    }

    @Override // o.drM
    /* renamed from: b */
    public final Object invoke(InterfaceC8585dra<? super String> interfaceC8585dra) {
        return ((PlayerUIViewModel$updateWaitingRoomMessage$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerUIViewModel$updateWaitingRoomMessage$1(this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            lazy = this.a.e;
            int i2 = this.d;
            this.e = 1;
            obj = ((bZB) lazy.get()).d(i2, this);
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
