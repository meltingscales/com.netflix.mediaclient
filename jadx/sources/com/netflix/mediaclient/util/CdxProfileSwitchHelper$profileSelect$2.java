package com.netflix.mediaclient.util;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6706ciP;
import o.C8130dea;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.bBI;
import o.cNW;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwZ;

/* loaded from: classes5.dex */
public final class CdxProfileSwitchHelper$profileSelect$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Boolean>, Object> {
    int a;
    final /* synthetic */ InterfaceC5283bvo b;
    private /* synthetic */ Object c;
    final /* synthetic */ C8130dea d;
    final /* synthetic */ InterfaceC5283bvo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CdxProfileSwitchHelper$profileSelect$2(C8130dea c8130dea, InterfaceC5283bvo interfaceC5283bvo, InterfaceC5283bvo interfaceC5283bvo2, InterfaceC8585dra<? super CdxProfileSwitchHelper$profileSelect$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c8130dea;
        this.b = interfaceC5283bvo;
        this.e = interfaceC5283bvo2;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return ((CdxProfileSwitchHelper$profileSelect$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        CdxProfileSwitchHelper$profileSelect$2 cdxProfileSwitchHelper$profileSelect$2 = new CdxProfileSwitchHelper$profileSelect$2(this.d, this.b, this.e, interfaceC8585dra);
        cdxProfileSwitchHelper$profileSelect$2.c = obj;
        return cdxProfileSwitchHelper$profileSelect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C6706ciP c6706ciP;
        boolean z;
        C6706ciP c6706ciP2;
        dwZ d;
        dwZ d2;
        C6706ciP c6706ciP3;
        bBI bbi;
        e = C8586drb.e();
        int i = this.a;
        try {
        } catch (Throwable unused) {
            c6706ciP = this.d.f;
            c6706ciP.e(null);
            C8130dea.b.getLogTag();
            this.d.e();
            z = false;
        }
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.c;
            this.d.g = this.b;
            c6706ciP2 = this.d.f;
            c6706ciP2.c();
            d = C8737dwr.d(dwu, null, null, new CdxProfileSwitchHelper$profileSelect$2$selectProfile$1(this.d, this.b, null), 3, null);
            if (!C8632dsu.c(this.e, this.b)) {
                d2 = C8737dwr.d(dwu, null, null, new CdxProfileSwitchHelper$profileSelect$2$splashScreen$1(this.d, this.b, null), 3, null);
                this.c = d;
                this.a = 1;
                if (d2.b(this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                cNW.b bVar = (cNW.b) obj;
                c6706ciP3 = this.d.f;
                c6706ciP3.e(bVar);
                C8130dea c8130dea = this.d;
                C8632dsu.d(bVar);
                z = c8130dea.d(bVar, this.e);
                this.d.g = null;
                bbi = this.d.i;
                bbi.c(this.b);
                return C8589dre.e(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            d = (dwZ) this.c;
            C8556dpz.d(obj);
        }
        this.c = null;
        this.a = 2;
        obj = d.b(this);
        if (obj == e) {
            return e;
        }
        cNW.b bVar2 = (cNW.b) obj;
        c6706ciP3 = this.d.f;
        c6706ciP3.e(bVar2);
        C8130dea c8130dea2 = this.d;
        C8632dsu.d(bVar2);
        z = c8130dea2.d(bVar2, this.e);
        this.d.g = null;
        bbi = this.d.i;
        bbi.c(this.b);
        return C8589dre.e(z);
    }
}
