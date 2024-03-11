package o;

import com.netflix.mediaclient.ui.settings.SettingsFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cVy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6156cVy implements MembersInjector<SettingsFragment> {
    private final Provider<InterfaceC7407cvd> a;
    private final Provider<InterfaceC7221csC> b;
    private final Provider<C8308dht> c;
    private final Provider<aGT> d;
    private final Provider<bZN> e;
    private final Provider<InterfaceC7303ctf> f;
    private final Provider<InterfaceC7089cpd> g;
    private final Provider<InterfaceC7091cpf> h;
    private final Provider<InterfaceC7306cti> i;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(SettingsFragment settingsFragment) {
        b(settingsFragment, this.f.get());
        d(settingsFragment, this.i.get());
        e(settingsFragment, this.a.get());
        c(settingsFragment, this.b.get());
        a(settingsFragment, this.g.get());
        d(settingsFragment, this.h.get());
        d(settingsFragment, this.c.get());
        d(settingsFragment, this.d.get());
        b(settingsFragment, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.offlineApi")
    public static void b(SettingsFragment settingsFragment, InterfaceC7303ctf interfaceC7303ctf) {
        settingsFragment.offlineApi = interfaceC7303ctf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.offlineActivityApi")
    public static void d(SettingsFragment settingsFragment, InterfaceC7306cti interfaceC7306cti) {
        settingsFragment.offlineActivityApi = interfaceC7306cti;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.downloadedForYou")
    public static void e(SettingsFragment settingsFragment, InterfaceC7407cvd interfaceC7407cvd) {
        settingsFragment.downloadedForYou = interfaceC7407cvd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.downloadsFeatures")
    public static void c(SettingsFragment settingsFragment, InterfaceC7221csC interfaceC7221csC) {
        settingsFragment.downloadsFeatures = interfaceC7221csC;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.notificationPermissionHelper")
    public static void a(SettingsFragment settingsFragment, InterfaceC7089cpd interfaceC7089cpd) {
        settingsFragment.notificationPermissionHelper = interfaceC7089cpd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.notificationPermissionLaunchHelper")
    public static void d(SettingsFragment settingsFragment, InterfaceC7091cpf interfaceC7091cpf) {
        settingsFragment.notificationPermissionLaunchHelper = interfaceC7091cpf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.adChoicesHelper")
    public static void d(SettingsFragment settingsFragment, C8308dht c8308dht) {
        settingsFragment.adChoicesHelper = c8308dht;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.localDiscovery")
    public static void d(SettingsFragment settingsFragment, aGT agt) {
        settingsFragment.localDiscovery = agt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.settings.SettingsFragment.localDiscoveryConsentUi")
    public static void b(SettingsFragment settingsFragment, bZN bzn) {
        settingsFragment.localDiscoveryConsentUi = bzn;
    }
}
