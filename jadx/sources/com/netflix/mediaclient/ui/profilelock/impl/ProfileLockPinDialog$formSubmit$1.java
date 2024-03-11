package com.netflix.mediaclient.ui.profilelock.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1397Zv;
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
public final class ProfileLockPinDialog$formSubmit$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9935zP a;
    final /* synthetic */ String c;
    int d;
    final /* synthetic */ ProfileLockPinDialog e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLockPinDialog$formSubmit$1(ProfileLockPinDialog profileLockPinDialog, String str, C9935zP c9935zP, InterfaceC8585dra<? super ProfileLockPinDialog$formSubmit$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = profileLockPinDialog;
        this.c = str;
        this.a = c9935zP;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileLockPinDialog$formSubmit$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileLockPinDialog$formSubmit$1(this.e, this.c, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            cKA f = this.e.f();
            String h = this.e.h();
            String str = this.c;
            this.d = 1;
            obj = f.d(h, str, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C1397Zv.b bVar = (C1397Zv.b) obj;
        ProfileLockPinDialog.a.getLogTag();
        if (bVar != null) {
            this.a.b(cKB.class, new cKB.b(bVar));
        }
        return dpR.c;
    }
}
