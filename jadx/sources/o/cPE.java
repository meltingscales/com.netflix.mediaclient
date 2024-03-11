package o;

import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cPE implements MembersInjector<ProfileViewingRestrictionsFragment> {
    private final Provider<InterfaceC1573aGh> a;
    private final Provider<cKD> b;
    private final Provider<C8242dgg> c;
    private final Provider<InterfaceC5984cPr> e;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment) {
        C1092Oj.e(profileViewingRestrictionsFragment, this.a);
        e(profileViewingRestrictionsFragment, this.e.get());
        d(profileViewingRestrictionsFragment, this.b.get());
        e(profileViewingRestrictionsFragment, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment.viewingRestrictionsRepository")
    public static void e(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, InterfaceC5984cPr interfaceC5984cPr) {
        profileViewingRestrictionsFragment.viewingRestrictionsRepository = interfaceC5984cPr;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment.profileLock")
    public static void d(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, cKD ckd) {
        profileViewingRestrictionsFragment.profileLock = ckd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment.cacheHelper")
    public static void e(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, C8242dgg c8242dgg) {
        profileViewingRestrictionsFragment.cacheHelper = c8242dgg;
    }
}
