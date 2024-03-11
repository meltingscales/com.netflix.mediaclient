package com.netflix.mediaclient.service.fcm;

import android.content.Context;
import android.os.Bundle;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.netflix.mediaclient.service.pushnotification.PushJobServiceUtils;
import o.C1044Mm;
import o.C8627dsp;
import o.C8632dsu;
import o.aSJ;

/* loaded from: classes6.dex */
public final class FcmJobWorker extends Worker {
    public static final d b = new d(null);
    public static final int c = 8;
    private final Context a;
    private final WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmJobWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) workerParameters, "");
        this.a = context;
        this.d = workerParameters;
    }

    /* loaded from: classes6.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        C1044Mm.e("nf_fcm_job", "Performing long running task in scheduled job");
        WorkerParameters workerParameters = this.d;
        if (workerParameters == null) {
            C1044Mm.d("nf_fcm_job", "job parameters null - drop");
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            C8632dsu.a(failure, "");
            return failure;
        }
        Bundle b2 = aSJ.a.b(workerParameters, "nf_fcm_job");
        if (b2 == null || b2.isEmpty()) {
            C1044Mm.d("nf_fcm_job", "bundle bad - drop");
            ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
            C8632dsu.a(failure2, "");
            return failure2;
        }
        C1044Mm.e("nf_fcm_job", "binding to NetflixService from job service");
        Context applicationContext = getApplicationContext();
        C8632dsu.a(applicationContext, "");
        if (applicationContext.bindService(PushJobServiceUtils.Companion.getNetflixServiceIntent(applicationContext), new PushJobServiceUtils.NetflixServiceConnection(b2), 1)) {
            ListenableWorker.Result success = ListenableWorker.Result.success();
            C8632dsu.d(success);
            return success;
        }
        C1044Mm.d("nf_fcm_job", "FcmJobService could not bind to NetflixService!");
        ListenableWorker.Result failure3 = ListenableWorker.Result.failure();
        C8632dsu.d(failure3);
        return failure3;
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        C1044Mm.e("nf_fcm_job", "Stopping job worker.");
    }
}
