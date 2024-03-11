package o;

import android.content.Context;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;

/* renamed from: o.bqe  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C5008bqe implements NetflixJobExecutor {
    private InterfaceC1929aTm a;
    private Context d;

    public C5008bqe(Context context, InterfaceC1929aTm interfaceC1929aTm) {
        this.d = context;
        this.a = interfaceC1929aTm;
        NetflixJob c = NetflixJob.c();
        if (this.a.d(NetflixJob.NetflixJobId.INSTALL_TOKEN)) {
            return;
        }
        this.a.a(c);
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId) {
        C1044Mm.e("partnerInstallJob", "install token job started");
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId) {
        C1044Mm.e("partnerInstallJob", "install token job stopped");
    }
}
