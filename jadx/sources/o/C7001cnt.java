package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cnt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7001cnt implements MembersInjector<MyListFragment> {
    private final Provider<bNR> a;
    private final Provider<C6923cmU> b;
    private final Provider<InterfaceC1573aGh> c;
    private final Provider<bNS> d;
    private final Provider<PlaybackLauncher> e;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(MyListFragment myListFragment) {
        C1092Oj.e(myListFragment, this.c);
        d(myListFragment, DoubleCheck.lazy(this.e));
        b(myListFragment, this.d.get());
        e(myListFragment, this.a.get());
        b(myListFragment, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mylist.impl.MyListFragment.playbackLauncher")
    public static void d(MyListFragment myListFragment, Lazy<PlaybackLauncher> lazy) {
        myListFragment.playbackLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mylist.impl.MyListFragment.gamesInstallationAndLaunch")
    public static void b(MyListFragment myListFragment, bNS bns) {
        myListFragment.gamesInstallationAndLaunch = bns;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mylist.impl.MyListFragment.gamesTab")
    public static void e(MyListFragment myListFragment, bNR bnr) {
        myListFragment.gamesTab = bnr;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mylist.impl.MyListFragment.myListEditMenuProvider")
    public static void b(MyListFragment myListFragment, C6923cmU c6923cmU) {
        myListFragment.myListEditMenuProvider = c6923cmU;
    }
}
