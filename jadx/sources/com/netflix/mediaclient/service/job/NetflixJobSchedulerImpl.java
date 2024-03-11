package com.netflix.mediaclient.service.job;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.netflix.mediaclient.service.job.NetflixJob;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1044Mm;
import o.InterfaceC1929aTm;

@Singleton
/* loaded from: classes3.dex */
public class NetflixJobSchedulerImpl implements InterfaceC1929aTm {
    private final Context e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface SchedulerModule {
        @Binds
        InterfaceC1929aTm c(NetflixJobSchedulerImpl netflixJobSchedulerImpl);
    }

    @Inject
    public NetflixJobSchedulerImpl(@ApplicationContext Context context) {
        this.e = context;
    }

    @Override // o.InterfaceC1929aTm
    public boolean d(NetflixJob.NetflixJobId netflixJobId) {
        return a(netflixJobId) != null;
    }

    @Override // o.InterfaceC1929aTm
    public void a(NetflixJob netflixJob) {
        if (netflixJob.j()) {
            throw new IllegalArgumentException("Please use schedulePeriodicJobIfPeriodChanged for periodic job.");
        }
        b(netflixJob);
    }

    @Override // o.InterfaceC1929aTm
    public void d(NetflixJob netflixJob) {
        if (!netflixJob.j()) {
            throw new IllegalArgumentException("Please use schedulePeriodicJobIfPeriodChanged for periodic job.");
        }
        JobInfo a = a(netflixJob.b());
        if (a != null && a.isPeriodic() && a.getIntervalMillis() == netflixJob.g()) {
            C1044Mm.a("NetflixJobScheduler", "Not rescheduling repeating job, jobId = " + netflixJob.b());
            return;
        }
        b(netflixJob);
    }

    @Override // o.InterfaceC1929aTm
    public void b(NetflixJob.NetflixJobId netflixJobId) {
        C1044Mm.a("NetflixJobScheduler", "cancelJob jobId = " + netflixJobId);
        d().cancel(netflixJobId.e());
    }

    @Override // o.InterfaceC1929aTm
    public void e(NetflixJob.NetflixJobId netflixJobId, boolean z) {
        C1044Mm.a("NetflixJobScheduler", "onJobFinished jobId = " + netflixJobId);
        NetflixJobService.c(this.e, netflixJobId);
    }

    private JobInfo a(NetflixJob.NetflixJobId netflixJobId) {
        return d().getPendingJob(netflixJobId.e());
    }

    private void b(NetflixJob netflixJob) {
        C1044Mm.a("NetflixJobScheduler", "scheduleJob jobId = " + netflixJob.b());
        JobScheduler d = d();
        d.cancel(netflixJob.b().e());
        JobInfo.Builder builder = new JobInfo.Builder(netflixJob.b().e(), new ComponentName(this.e, NetflixJobService.class));
        if (netflixJob.m()) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (netflixJob.j()) {
            builder.setPeriodic(netflixJob.g());
        } else if (netflixJob.d() > 0) {
            builder.setMinimumLatency(netflixJob.d());
        }
        builder.setRequiresCharging(netflixJob.i());
        builder.setRequiresDeviceIdle(netflixJob.h());
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setRequiresBatteryNotLow(netflixJob.f());
        }
        d.schedule(builder.build());
    }

    private JobScheduler d() {
        return (JobScheduler) this.e.getSystemService("jobscheduler");
    }
}
