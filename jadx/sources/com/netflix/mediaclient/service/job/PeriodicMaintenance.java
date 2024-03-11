package com.netflix.mediaclient.service.job;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.Constraints;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.netflix.mediaclient.service.job.PeriodicMaintenance;
import java.util.concurrent.TimeUnit;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1938aTv;

/* loaded from: classes3.dex */
public final class PeriodicMaintenance extends ListenableWorker {
    public static final b d = new b(null);
    private final WorkerParameters c;
    private final Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicMaintenance(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) workerParameters, "");
        this.e = context;
        this.c = workerParameters;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("NetflixWorkManager");
        }

        public final void b(InterfaceC1938aTv interfaceC1938aTv, long j) {
            C8632dsu.c((Object) interfaceC1938aTv, "");
            Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            C8632dsu.a(build, "");
            PeriodicWorkRequest build2 = new PeriodicWorkRequest.Builder(PeriodicMaintenance.class, j, TimeUnit.MILLISECONDS).setConstraints(build).build();
            C8632dsu.a(build2, "");
            interfaceC1938aTv.c("maintenance", j, build2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        final /* synthetic */ CallbackToFutureAdapter.Completer<ListenableWorker.Result> e;

        e(CallbackToFutureAdapter.Completer<ListenableWorker.Result> completer) {
            this.e = completer;
        }

        public void a() {
            b bVar = PeriodicMaintenance.d;
            this.e.set(ListenableWorker.Result.success());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(CallbackToFutureAdapter.Completer completer) {
        C8632dsu.c((Object) completer, "");
        e eVar = new e(completer);
        AbstractApplicationC1040Mh.getInstance().i().a(30000L, new PeriodicMaintenance$startWork$2$1(eVar, completer));
        return eVar;
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.Result> startWork() {
        ListenableFuture<ListenableWorker.Result> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: o.aTz
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object d2;
                d2 = PeriodicMaintenance.d(completer);
                return d2;
            }
        });
        C8632dsu.a(future, "");
        return future;
    }
}
