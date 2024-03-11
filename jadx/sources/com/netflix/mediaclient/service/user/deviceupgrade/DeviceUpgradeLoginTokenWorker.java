package com.netflix.mediaclient.service.user.deviceupgrade;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C1052Mw;
import o.C8246dgk;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.aCI;
import o.dwQ;
import o.dwU;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class DeviceUpgradeLoginTokenWorker extends Worker {
    public static final c a = new c(null);
    private final dwU b;
    private final C8246dgk c;
    private final Context d;
    private final dwQ e;
    private final aCI f;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface b {
        dwQ E();

        aCI W();

        C8246dgk q();

        dwU x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpgradeLoginTokenWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) workerParameters, "");
        this.d = context;
        this.b = ((b) EntryPointAccessors.fromApplication(context, b.class)).x();
        this.e = ((b) EntryPointAccessors.fromApplication(context, b.class)).E();
        this.c = ((b) EntryPointAccessors.fromApplication(context, b.class)).q();
        this.f = ((b) EntryPointAccessors.fromApplication(context, b.class)).W();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        a("work_started");
        C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        C8632dsu.a(i, "");
        if (i.r()) {
            b(i.k());
        } else {
            i.t().subscribe(new e(i));
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        C8632dsu.a(success, "");
        return success;
    }

    /* loaded from: classes4.dex */
    public static final class e implements CompletableObserver {
        final /* synthetic */ C1052Mw b;

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
        }

        e(C1052Mw c1052Mw) {
            this.b = c1052Mw;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            DeviceUpgradeLoginTokenWorker.this.b(this.b.k());
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            C8632dsu.c((Object) th, "");
            DeviceUpgradeLoginTokenWorker.this.a("can_not_initialize_nfAgent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(UserAgent userAgent) {
        if (userAgent == null || !userAgent.v()) {
            return;
        }
        C8737dwr.c(this.b, this.e, null, new DeviceUpgradeLoginTokenWorker$maybeStoreNewToken$1(this, null), 2, null);
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DeviceUpgradeTokenWorker");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        c cVar = a;
        cVar.getLogTag();
        Logger logger = Logger.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SignupConstants.Field.LANG_ID, cVar.getLogTag());
        jSONObject.put("status", str);
        logger.logEvent(new DebugEvent(jSONObject));
    }
}
