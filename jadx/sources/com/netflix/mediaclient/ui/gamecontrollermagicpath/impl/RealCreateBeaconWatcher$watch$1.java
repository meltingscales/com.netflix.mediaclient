package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import androidx.activity.ComponentActivity;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3855bNd;
import o.C3875bNx;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC3859bNh;
import o.InterfaceC3862bNk;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes4.dex */
public final class RealCreateBeaconWatcher$watch$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ ComponentActivity c;
    final /* synthetic */ C3875bNx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCreateBeaconWatcher$watch$1(C3875bNx c3875bNx, ComponentActivity componentActivity, InterfaceC8585dra<? super RealCreateBeaconWatcher$watch$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c3875bNx;
        this.c = componentActivity;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((RealCreateBeaconWatcher$watch$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new RealCreateBeaconWatcher$watch$1(this.e, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC3862bNk interfaceC3862bNk;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            C3875bNx.e.getLogTag();
            interfaceC3862bNk = this.e.b;
            dyS<AbstractC3855bNd.c> a = interfaceC3862bNk.a();
            final C3875bNx c3875bNx = this.e;
            final ComponentActivity componentActivity = this.c;
            dyQ<? super AbstractC3855bNd.c> dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealCreateBeaconWatcher$watch$1.1
                @Override // o.dyQ
                /* renamed from: a */
                public final Object emit(AbstractC3855bNd.c cVar, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    InterfaceC3859bNh interfaceC3859bNh;
                    C3875bNx.e.getLogTag();
                    if (cVar != null) {
                        interfaceC3859bNh = C3875bNx.this.d;
                        interfaceC3859bNh.d(componentActivity, MagicPathUiType.c, cVar.b());
                    }
                    return dpR.c;
                }
            };
            this.a = 1;
            if (a.collect(dyq, this) == e) {
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
