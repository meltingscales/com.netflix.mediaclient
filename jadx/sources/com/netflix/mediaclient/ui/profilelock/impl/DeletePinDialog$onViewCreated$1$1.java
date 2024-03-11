package com.netflix.mediaclient.ui.profilelock.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1393Zr;
import o.C8556dpz;
import o.C8586drb;
import o.C9935zP;
import o.InterfaceC8585dra;
import o.cKA;
import o.cKB;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DeletePinDialog$onViewCreated$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ DeletePinDialog b;
    final /* synthetic */ C9935zP c;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeletePinDialog$onViewCreated$1$1(DeletePinDialog deletePinDialog, C9935zP c9935zP, InterfaceC8585dra<? super DeletePinDialog$onViewCreated$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = deletePinDialog;
        this.c = c9935zP;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DeletePinDialog$onViewCreated$1$1(this.b, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DeletePinDialog$onViewCreated$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        String g;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            cKA e2 = this.b.e();
            g = this.b.g();
            this.e = 1;
            obj = e2.c(g, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C1393Zr.c cVar = (C1393Zr.c) obj;
        DeletePinDialog.a.getLogTag();
        this.b.b(false);
        if (cVar != null) {
            this.c.b(cKB.class, new cKB.d(cVar));
        }
        return dpR.c;
    }
}
