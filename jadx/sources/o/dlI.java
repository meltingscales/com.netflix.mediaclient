package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.partner.PService;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class dlI implements MembersInjector<PService> {
    private final Provider<ServiceManager> d;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(PService pService) {
        c(pService, this.d);
    }

    @InjectedFieldSignature("com.netflix.partner.PService.serviceManagerProvider")
    public static void c(PService pService, Provider<ServiceManager> provider) {
        pService.serviceManagerProvider = provider;
    }
}
