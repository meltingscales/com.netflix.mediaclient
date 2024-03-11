package o;

import com.netflix.mediaclient.ui.home.HomeFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bSc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3989bSc implements MembersInjector<HomeFragment> {
    private final Provider<InterfaceC1573aGh> c;
    private final Provider<InterfaceC3994bSh> d;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(HomeFragment homeFragment) {
        C1092Oj.e(homeFragment, this.c);
        b(homeFragment, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeFragment.homeTracking")
    public static void b(HomeFragment homeFragment, InterfaceC3994bSh interfaceC3994bSh) {
        homeFragment.homeTracking = interfaceC3994bSh;
    }
}
