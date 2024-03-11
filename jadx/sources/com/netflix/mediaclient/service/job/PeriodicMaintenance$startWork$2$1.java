package com.netflix.mediaclient.service.job;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import com.netflix.mediaclient.service.job.PeriodicMaintenance;
import com.netflix.mediaclient.service.job.PeriodicMaintenance$startWork$2$1;
import java.util.function.Consumer;
import kotlin.jvm.internal.Lambda;
import o.AbstractApplicationC1040Mh;
import o.C1925aTi;
import o.C8632dsu;
import o.InterfaceC1926aTj;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public final class PeriodicMaintenance$startWork$2$1 extends Lambda implements drM<Boolean, dpR> {
    final /* synthetic */ CallbackToFutureAdapter.Completer<ListenableWorker.Result> b;
    final /* synthetic */ PeriodicMaintenance.e c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicMaintenance$startWork$2$1(PeriodicMaintenance.e eVar, CallbackToFutureAdapter.Completer<ListenableWorker.Result> completer) {
        super(1);
        this.c = eVar;
        this.b = completer;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Boolean bool) {
        d(bool.booleanValue());
        return dpR.c;
    }

    public final void d(boolean z) {
        if (!z) {
            this.c.a();
            return;
        }
        InterfaceC1926aTj h = AbstractApplicationC1040Mh.getInstance().i().h();
        if (h instanceof C1925aTi) {
            final CallbackToFutureAdapter.Completer<ListenableWorker.Result> completer = this.b;
            ((C1925aTi) h).b(new Consumer() { // from class: o.aTD
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PeriodicMaintenance$startWork$2$1.b(CallbackToFutureAdapter.Completer.this, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CallbackToFutureAdapter.Completer completer, Boolean bool) {
        C8632dsu.c((Object) completer, "");
        C8632dsu.c((Object) bool, "");
        PeriodicMaintenance.b bVar = PeriodicMaintenance.d;
        completer.set(ListenableWorker.Result.success());
    }
}
