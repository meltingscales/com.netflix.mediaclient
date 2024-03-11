package o;

import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.aIo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1634aIo implements MembersInjector<NetflixActivityBase> {
    private final Provider<InterfaceC1643aIx> c;
    private final Provider<ServiceManager> d;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(NetflixActivityBase netflixActivityBase) {
        d(netflixActivityBase, this.d.get());
        a(netflixActivityBase, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase.serviceManagerInstance")
    public static void d(NetflixActivityBase netflixActivityBase, ServiceManager serviceManager) {
        netflixActivityBase.serviceManagerInstance = serviceManager;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase.serviceManagerController")
    public static void a(NetflixActivityBase netflixActivityBase, InterfaceC1643aIx interfaceC1643aIx) {
        netflixActivityBase.serviceManagerController = interfaceC1643aIx;
    }
}
