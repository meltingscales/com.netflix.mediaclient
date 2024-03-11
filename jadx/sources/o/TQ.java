package o;

import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;

/* loaded from: classes.dex */
public interface TQ {
    void a(long j);

    boolean c(NetflixDataRequest netflixDataRequest);

    void e();

    void e(NetflixJob.NetflixJobId netflixJobId, NetflixJobExecutor netflixJobExecutor);
}
