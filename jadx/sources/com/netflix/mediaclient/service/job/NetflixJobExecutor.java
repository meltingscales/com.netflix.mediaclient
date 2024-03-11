package com.netflix.mediaclient.service.job;

import android.content.Context;
import com.netflix.mediaclient.service.job.NetflixJob;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.Multibinds;
import io.reactivex.Completable;
import java.util.Map;
import o.InterfaceC1921aTe;
import o.InterfaceC1929aTm;

/* loaded from: classes.dex */
public interface NetflixJobExecutor {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ExecutorModule {
        @Multibinds
        Map<NetflixJob.NetflixJobId, NetflixJobExecutor> d();
    }

    /* loaded from: classes3.dex */
    public interface a {
        Completable a(Context context, InterfaceC1921aTe interfaceC1921aTe, InterfaceC1929aTm interfaceC1929aTm, boolean z);

        void e(InterfaceC1929aTm interfaceC1929aTm, InterfaceC1921aTe interfaceC1921aTe, boolean z);
    }

    void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId);

    void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId);
}
