package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.android.org.json.zip.JSONzip;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3729bIm;
import o.C3732bIp;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.bZK;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes6.dex */
public final class ShowViewModel$observeLiveState$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ C3732bIp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$observeLiveState$1(C3732bIp c3732bIp, InterfaceC8585dra<? super ShowViewModel$observeLiveState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c3732bIp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ShowViewModel$observeLiveState$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ShowViewModel$observeLiveState$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyS f;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            f = this.d.f();
            final C3732bIp c3732bIp = this.d;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$observeLiveState$1.4
                @Override // o.dyQ
                /* renamed from: e */
                public final Object emit(final bZK bzk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    C3732bIp.this.b(new drM<C3729bIm, C3729bIm>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$observeLiveState$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: a */
                        public final C3729bIm invoke(C3729bIm c3729bIm) {
                            C3729bIm c;
                            C8632dsu.c((Object) c3729bIm, "");
                            c = c3729bIm.c((r28 & 1) != 0 ? c3729bIm.h : null, (r28 & 2) != 0 ? c3729bIm.i : null, (r28 & 4) != 0 ? c3729bIm.n : false, (r28 & 8) != 0 ? c3729bIm.f : null, (r28 & 16) != 0 ? c3729bIm.a : null, (r28 & 32) != 0 ? c3729bIm.b : null, (r28 & 64) != 0 ? c3729bIm.c : null, (r28 & 128) != 0 ? c3729bIm.e : null, (r28 & JSONzip.end) != 0 ? c3729bIm.g : null, (r28 & 512) != 0 ? c3729bIm.m : null, (r28 & 1024) != 0 ? c3729bIm.l : null, (r28 & 2048) != 0 ? c3729bIm.d : bZK.this, (r28 & 4096) != 0 ? c3729bIm.j : null);
                            return c;
                        }
                    });
                    return dpR.c;
                }
            };
            this.b = 1;
            if (f.collect(dyq, this) == e) {
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
