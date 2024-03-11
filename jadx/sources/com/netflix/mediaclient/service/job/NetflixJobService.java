package com.netflix.mediaclient.service.job;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.job.NetflixJobService;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.SingleSubject;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1596aHd;
import o.InterfaceC1598aHf;
import o.InterfaceC1921aTe;
import o.InterfaceC1929aTm;
import o.InterfaceC5091bsH;
import o.aSZ;

@SuppressLint({"SpecifyJobSchedulerIdRange"})
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class NetflixJobService extends aSZ {
    @Inject
    public InterfaceC1929aTm netflixJobScheduler;
    @Inject
    public Map<NetflixJob.NetflixJobId, Provider<NetflixJobExecutor>> rxExecutors;
    @Inject
    public b serviceManagerOwner;
    private final Map<NetflixJob.NetflixJobId, Disposable> a = new HashMap();
    private final Map<NetflixJob.NetflixJobId, JobParameters> d = new HashMap();
    private final c c = new c();

    @Override // o.aSZ, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.serviceManagerOwner.d();
        this.c.b();
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        C1044Mm.a("NetflixJobService", "onStartJob jobId = " + jobParameters.getJobId());
        final NetflixJob.NetflixJobId e = NetflixJob.NetflixJobId.e(jobParameters.getJobId());
        Disposable disposable = this.a.get(e);
        if (disposable != null) {
            disposable.dispose();
        }
        this.a.put(e, this.serviceManagerOwner.e.flatMap(new Function() { // from class: o.aTn
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource d2;
                d2 = NetflixJobService.this.d(e, jobParameters, (ServiceManager) obj);
                return d2;
            }
        }).subscribe(new Consumer() { // from class: o.aTq
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixJobService.this.a(e, jobParameters, (Boolean) obj);
            }
        }, new Consumer() { // from class: o.aTs
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixJobService.this.a(jobParameters, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SingleSource d(NetflixJob.NetflixJobId netflixJobId, JobParameters jobParameters, ServiceManager serviceManager) {
        NetflixJobExecutor a = serviceManager.a(netflixJobId);
        C1044Mm.a("NetflixJobService", "NetflixJobInitializer jobId=" + netflixJobId + " contains=" + this.rxExecutors.containsKey(netflixJobId));
        if (a != null) {
            C1044Mm.a("NetflixJobService", "NetflixJobInitializer via legacyJobParameters jobId=" + netflixJobId);
            this.d.put(netflixJobId, jobParameters);
            a.onNetflixStartJob(netflixJobId);
            return Single.just(Boolean.TRUE);
        } else if (this.rxExecutors.containsKey(netflixJobId)) {
            return b((NetflixJobExecutor.a) this.rxExecutors.get(netflixJobId).get(), serviceManager);
        } else {
            if (netflixJobId == NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE) {
                C1044Mm.a("NetflixJobService", "NetflixJobInitializer reporting finished due to migration.");
                return Single.just(Boolean.FALSE);
            }
            InterfaceC1598aHf.a(new C1596aHd("No job registered for jobId " + netflixJobId).e(true).b(false));
            return Single.just(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NetflixJob.NetflixJobId netflixJobId, JobParameters jobParameters, Boolean bool) {
        C1044Mm.a("NetflixJobService", "job succeeded, jobId = " + netflixJobId);
        if (bool.booleanValue()) {
            return;
        }
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(JobParameters jobParameters, Throwable th) {
        if (th instanceof ServiceManagerUnavailableError) {
            C1044Mm.e("NetflixJobService", "Background job failed to run, service manager error", th);
        } else {
            InterfaceC1598aHf.e("background job failed", th);
        }
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        C1044Mm.a("NetflixJobService", "onStopJob jobId = " + jobParameters.getJobId());
        NetflixJob.NetflixJobId e = NetflixJob.NetflixJobId.e(jobParameters.getJobId());
        Disposable remove = this.a.remove(e);
        if (remove != null) {
            remove.dispose();
        }
        if (this.rxExecutors.containsKey(e)) {
            return false;
        }
        if (!this.serviceManagerOwner.e.hasValue()) {
            C1044Mm.d("NetflixJobService", "Unable to stop job");
            return false;
        }
        NetflixJobExecutor a = ((ServiceManager) this.serviceManagerOwner.e.getValue()).a(e);
        if (a == null) {
            C1044Mm.d("NetflixJobService", "No job registered for jobId " + e);
            return false;
        }
        if (!(a instanceof NetflixJobExecutor.a)) {
            a.onNetflixStopJob(e);
        }
        return false;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        for (Disposable disposable : this.a.values()) {
            disposable.dispose();
        }
        this.a.clear();
        this.c.c();
        this.serviceManagerOwner.c();
    }

    private Single<Boolean> b(final NetflixJobExecutor.a aVar, final ServiceManager serviceManager) {
        final boolean i = AbstractApplicationC1040Mh.getInstance().o().i();
        return Single.just(Boolean.FALSE).observeOn(Schedulers.computation()).flatMap(new Function() { // from class: o.aTt
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource b2;
                b2 = NetflixJobService.this.b(aVar, serviceManager, i, (Boolean) obj);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SingleSource b(NetflixJobExecutor.a aVar, ServiceManager serviceManager, boolean z, Boolean bool) {
        return aVar.a(this, new d(serviceManager), this.netflixJobScheduler, z).toSingleDefault(bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context, NetflixJob.NetflixJobId netflixJobId) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.JOB_COMPLETE").putExtra("JOB_ID", netflixJobId.e()));
    }

    /* loaded from: classes3.dex */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!intent.hasExtra("JOB_ID")) {
                throw new IllegalStateException();
            }
            JobParameters jobParameters = (JobParameters) NetflixJobService.this.d.remove(NetflixJob.NetflixJobId.e(intent.getIntExtra("JOB_ID", -1)));
            if (jobParameters != null) {
                NetflixJobService.this.jobFinished(jobParameters, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            LocalBroadcastManager.getInstance(NetflixJobService.this).registerReceiver(this, new IntentFilter("com.netflix.mediaclient.intent.action.JOB_COMPLETE"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            LocalBroadcastManager.getInstance(NetflixJobService.this).unregisterReceiver(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final ServiceManager c;
        private final SingleSubject<ServiceManager> e = SingleSubject.create();

        @Inject
        public b(ServiceManager serviceManager) {
            this.c = serviceManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.c.c(new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.service.job.NetflixJobService.b.2
                @Override // o.InterfaceC5091bsH
                public void onManagerReady(ServiceManager serviceManager, Status status) {
                    b.this.e.onSuccess(serviceManager);
                }

                @Override // o.InterfaceC5091bsH
                public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                    if (status.e() != null) {
                        b.this.e.onError(new ServiceManagerUnavailableError(status.e()));
                    } else {
                        b.this.e.onError(new ServiceManagerUnavailableError(new StatusException(status)));
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.c.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ServiceManagerUnavailableError extends Exception {
        ServiceManagerUnavailableError(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC1921aTe {
        private final ServiceManager e;

        private d(ServiceManager serviceManager) {
            this.e = serviceManager;
        }
    }
}
