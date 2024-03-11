package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.cdx.UserAgentEventsReceiver;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.aNp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1770aNp implements MembersInjector<CdxAgentImpl> {
    private final Provider<UserAgentEventsReceiver> c;
    private final Provider<aGT> e;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(CdxAgentImpl cdxAgentImpl) {
        a(cdxAgentImpl, this.c.get());
        c(cdxAgentImpl, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.cdx.CdxAgentImpl.userAgentEventHandler")
    public static void a(CdxAgentImpl cdxAgentImpl, UserAgentEventsReceiver userAgentEventsReceiver) {
        cdxAgentImpl.userAgentEventHandler = userAgentEventsReceiver;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.cdx.CdxAgentImpl.localDiscovery")
    public static void c(CdxAgentImpl cdxAgentImpl, aGT agt) {
        cdxAgentImpl.localDiscovery = agt;
    }
}
