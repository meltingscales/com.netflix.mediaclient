package o;

import com.netflix.mediaclient.ui.profiles.AddProfileFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cLE implements MembersInjector<AddProfileFragment> {
    private final Provider<InterfaceC5958cOs> a;
    private final Provider<InterfaceC1573aGh> d;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(AddProfileFragment addProfileFragment) {
        C1092Oj.e(addProfileFragment, this.d);
        d(addProfileFragment, this.a.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.AddProfileFragment.lolopi")
    public static void d(AddProfileFragment addProfileFragment, InterfaceC5958cOs interfaceC5958cOs) {
        addProfileFragment.lolopi = interfaceC5958cOs;
    }
}
