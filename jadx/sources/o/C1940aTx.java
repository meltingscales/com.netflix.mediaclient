package o;

import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.job.NetflixJobService;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Map;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.aTx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1940aTx implements MembersInjector<NetflixJobService> {
    private final Provider<InterfaceC1929aTm> a;
    private final Provider<Map<NetflixJob.NetflixJobId, Provider<NetflixJobExecutor>>> d;
    private final Provider<NetflixJobService.b> e;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(NetflixJobService netflixJobService) {
        a(netflixJobService, this.e.get());
        a(netflixJobService, this.a.get());
        c(netflixJobService, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.job.NetflixJobService.serviceManagerOwner")
    public static void a(NetflixJobService netflixJobService, Object obj) {
        netflixJobService.serviceManagerOwner = (NetflixJobService.b) obj;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.job.NetflixJobService.netflixJobScheduler")
    public static void a(NetflixJobService netflixJobService, InterfaceC1929aTm interfaceC1929aTm) {
        netflixJobService.netflixJobScheduler = interfaceC1929aTm;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.job.NetflixJobService.rxExecutors")
    public static void c(NetflixJobService netflixJobService, Map<NetflixJob.NetflixJobId, Provider<NetflixJobExecutor>> map) {
        netflixJobService.rxExecutors = map;
    }
}
