package com.netflix.mediaclient.clutils;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.netflix.cl.Logger;
import com.netflix.cl.model.RdidAccessState;
import com.netflix.cl.model.context.AppDevicePermissions;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1044Mm;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class LogRdidAccessStateKt$logRdidAccessState$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogRdidAccessStateKt$logRdidAccessState$1(Context context, InterfaceC8585dra<? super LogRdidAccessStateKt$logRdidAccessState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LogRdidAccessStateKt$logRdidAccessState$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LogRdidAccessStateKt$logRdidAccessState$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RdidAccessState rdidAccessState;
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            try {
                if (AdvertisingIdClient.getAdvertisingIdInfo(this.d).isLimitAdTrackingEnabled()) {
                    rdidAccessState = RdidAccessState.denied;
                } else {
                    rdidAccessState = RdidAccessState.approved;
                }
            } catch (Exception e) {
                C1044Mm.e("RdidAccessState", "Unable to access advertisingIdInfo", e);
                rdidAccessState = RdidAccessState.undetermined;
            }
            Logger.INSTANCE.addContext(new AppDevicePermissions(rdidAccessState));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
