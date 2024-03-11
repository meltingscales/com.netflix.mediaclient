package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.dcw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8046dcw implements MembersInjector<UserMarksFragment> {
    private final Provider<InterfaceC1573aGh> a;
    private final Provider<PlaybackLauncher> c;
    private final Provider<InterfaceC1126Pr> e;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(UserMarksFragment userMarksFragment) {
        C1092Oj.e(userMarksFragment, this.a);
        e(userMarksFragment, DoubleCheck.lazy(this.c));
        e(userMarksFragment, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.playbackLauncher")
    public static void e(UserMarksFragment userMarksFragment, Lazy<PlaybackLauncher> lazy) {
        userMarksFragment.playbackLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.socialSharing")
    public static void e(UserMarksFragment userMarksFragment, InterfaceC1126Pr interfaceC1126Pr) {
        userMarksFragment.socialSharing = interfaceC1126Pr;
    }
}
