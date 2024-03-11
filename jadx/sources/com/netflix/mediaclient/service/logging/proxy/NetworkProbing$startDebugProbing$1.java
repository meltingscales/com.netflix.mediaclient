package com.netflix.mediaclient.service.logging.proxy;

import android.content.Context;
import com.netflix.mediaclient.service.logging.logblob.StartupErrorTracker;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1991aVv;
import o.C8556dpz;
import o.C8566dqi;
import o.C8569dql;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aVB;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class NetworkProbing$startDebugProbing$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    Object b;
    int c;
    final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkProbing$startDebugProbing$1(Context context, InterfaceC8585dra<? super NetworkProbing$startDebugProbing$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = context;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((NetworkProbing$startDebugProbing$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new NetworkProbing$startDebugProbing$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        List e2;
        List<? extends List<String>> e3;
        List<String> j;
        StartupErrorTracker startupErrorTracker;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            StartupErrorTracker startupErrorTracker2 = StartupErrorTracker.a;
            aVB avb = new aVB(this.e);
            e2 = C8566dqi.e("8.8.8.8");
            e3 = C8566dqi.e(e2);
            j = C8569dql.j("android-appboot.netflix.com", "android.prod.cloud.netflix.com");
            this.b = startupErrorTracker2;
            this.c = 1;
            Object a = avb.a(e3, j, this);
            if (a == e) {
                return e;
            }
            startupErrorTracker = startupErrorTracker2;
            obj = a;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            startupErrorTracker = (StartupErrorTracker) this.b;
            C8556dpz.d(obj);
        }
        startupErrorTracker.e((C1991aVv) obj);
        return dpR.c;
    }
}
