package o;

import com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig"})
/* renamed from: o.cNj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5923cNj implements MembersInjector<ProfileDetailsFragment> {
    private final Provider<Boolean> a;
    private final Provider<cKD> b;
    private final Provider<InterfaceC5958cOs> c;
    private final Provider<Boolean> d;
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ProfileDetailsFragment profileDetailsFragment) {
        C1092Oj.e(profileDetailsFragment, this.e);
        c(profileDetailsFragment, this.c.get());
        a(profileDetailsFragment, this.b.get());
        a(profileDetailsFragment, this.a);
        d(profileDetailsFragment, this.d);
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.lolopi")
    public static void c(ProfileDetailsFragment profileDetailsFragment, InterfaceC5958cOs interfaceC5958cOs) {
        profileDetailsFragment.lolopi = interfaceC5958cOs;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.profileLock")
    public static void a(ProfileDetailsFragment profileDetailsFragment, cKD ckd) {
        profileDetailsFragment.profileLock = ckd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.profileLockEnabled")
    public static void a(ProfileDetailsFragment profileDetailsFragment, Provider<Boolean> provider) {
        profileDetailsFragment.profileLockEnabled = provider;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.viewingRestrictionsEnabled")
    public static void d(ProfileDetailsFragment profileDetailsFragment, Provider<Boolean> provider) {
        profileDetailsFragment.viewingRestrictionsEnabled = provider;
    }
}
