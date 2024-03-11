package o;

import com.netflix.mediaclient.ui.profiles.SwitchProfileSheetFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cOm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5953cOm implements MembersInjector<SwitchProfileSheetFragment> {
    private final Provider<InterfaceC1573aGh> a;
    private final Provider<C5898cMl> c;
    private final Provider<InterfaceC5844cKl> e;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(SwitchProfileSheetFragment switchProfileSheetFragment) {
        C1095Om.d(switchProfileSheetFragment, DoubleCheck.lazy(this.a));
        e(switchProfileSheetFragment, this.e.get());
        d(switchProfileSheetFragment, DoubleCheck.lazy(this.c));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.SwitchProfileSheetFragment.profileApi")
    public static void e(SwitchProfileSheetFragment switchProfileSheetFragment, InterfaceC5844cKl interfaceC5844cKl) {
        switchProfileSheetFragment.profileApi = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.SwitchProfileSheetFragment.myNetflixMenuHelper")
    public static void d(SwitchProfileSheetFragment switchProfileSheetFragment, Lazy<C5898cMl> lazy) {
        switchProfileSheetFragment.myNetflixMenuHelper = lazy;
    }
}
