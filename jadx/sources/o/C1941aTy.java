package o;

import com.netflix.mediaclient.service.job.NetflixJobService;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.aTy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1941aTy implements Factory<NetflixJobService.b> {
    private final Provider<ServiceManager> e;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public NetflixJobService.b get() {
        return e(this.e.get());
    }

    public static NetflixJobService.b e(ServiceManager serviceManager) {
        return new NetflixJobService.b(serviceManager);
    }
}
