package o;

import com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cOT implements MembersInjector<ProfileLanguagesFragment> {
    private final Provider<InterfaceC1573aGh> c;
    private final Provider<C8242dgg> d;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(ProfileLanguagesFragment profileLanguagesFragment) {
        C1092Oj.e(profileLanguagesFragment, this.c);
        d(profileLanguagesFragment, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment.cacheHelper")
    public static void d(ProfileLanguagesFragment profileLanguagesFragment, C8242dgg c8242dgg) {
        profileLanguagesFragment.cacheHelper = c8242dgg;
    }
}
