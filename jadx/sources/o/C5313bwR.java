package o;

import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationStartupListener;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bwR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5313bwR implements MembersInjector<AdsPlanApplicationStartupListener> {
    private final Provider<InterfaceC5304bwI> c;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(AdsPlanApplicationStartupListener adsPlanApplicationStartupListener) {
        d(adsPlanApplicationStartupListener, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationStartupListener.adsPlanApplication")
    public static void d(AdsPlanApplicationStartupListener adsPlanApplicationStartupListener, InterfaceC5304bwI interfaceC5304bwI) {
        adsPlanApplicationStartupListener.adsPlanApplication = interfaceC5304bwI;
    }
}
