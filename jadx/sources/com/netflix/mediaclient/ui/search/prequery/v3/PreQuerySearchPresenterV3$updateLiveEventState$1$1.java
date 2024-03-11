package com.netflix.mediaclient.ui.search.prequery.v3;

import com.netflix.android.org.json.zip.JSONzip;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6051cSd;
import o.C6063cSp;
import o.C6089cTl;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bZK;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class PreQuerySearchPresenterV3$updateLiveEventState$1$1 extends SuspendLambda implements drX<bZK, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    /* synthetic */ Object d;
    final /* synthetic */ C6051cSd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreQuerySearchPresenterV3$updateLiveEventState$1$1(C6051cSd c6051cSd, InterfaceC8585dra<? super PreQuerySearchPresenterV3$updateLiveEventState$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c6051cSd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PreQuerySearchPresenterV3$updateLiveEventState$1$1 preQuerySearchPresenterV3$updateLiveEventState$1$1 = new PreQuerySearchPresenterV3$updateLiveEventState$1$1(this.e, interfaceC8585dra);
        preQuerySearchPresenterV3$updateLiveEventState$1$1.d = obj;
        return preQuerySearchPresenterV3$updateLiveEventState$1$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(bZK bzk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PreQuerySearchPresenterV3$updateLiveEventState$1$1) create(bzk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C6089cTl c6089cTl;
        C6063cSp c6063cSp;
        C6089cTl a;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            bZK bzk = (bZK) this.d;
            c6089cTl = this.e.f;
            if (c6089cTl != null) {
                c6063cSp = this.e.g;
                a = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : null, (r27 & 512) != 0 ? c6089cTl.a : bzk, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
                c6063cSp.d(a);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
