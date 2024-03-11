package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cdx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6475cdx implements MembersInjector<BillboardView> {
    private final Provider<PlaybackLauncher> a;
    private final Provider<InterfaceC3656bFy> b;
    private final Provider<InterfaceC3661bGc> c;
    private final Provider<InterfaceC3643bFl> e;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(BillboardView billboardView) {
        d(billboardView, this.b.get());
        a(billboardView, DoubleCheck.lazy(this.e));
        c(billboardView, DoubleCheck.lazy(this.c));
        e(billboardView, DoubleCheck.lazy(this.a));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.BillboardView.detailsUtil")
    public static void d(BillboardView billboardView, InterfaceC3656bFy interfaceC3656bFy) {
        billboardView.detailsUtil = interfaceC3656bFy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.BillboardView.detailsActivityApi")
    public static void a(BillboardView billboardView, Lazy<InterfaceC3643bFl> lazy) {
        billboardView.detailsActivityApi = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.BillboardView.detailsPage")
    public static void c(BillboardView billboardView, Lazy<InterfaceC3661bGc> lazy) {
        billboardView.detailsPage = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.BillboardView.playbackLauncher")
    public static void e(BillboardView billboardView, Lazy<PlaybackLauncher> lazy) {
        billboardView.playbackLauncher = lazy;
    }
}
