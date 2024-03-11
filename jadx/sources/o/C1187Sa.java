package o;

import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.Sa  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1187Sa implements MembersInjector<NetflixBottomNavBar> {
    private final Provider<Set<InterfaceC9934zO>> b;
    private final Provider<cNT> c;
    private final Provider<InterfaceC5844cKl> d;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(NetflixBottomNavBar netflixBottomNavBar) {
        a(netflixBottomNavBar, this.d.get());
        c(netflixBottomNavBar, this.c.get());
        b(netflixBottomNavBar, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixBottomNavBar.profileApi")
    public static void a(NetflixBottomNavBar netflixBottomNavBar, InterfaceC5844cKl interfaceC5844cKl) {
        netflixBottomNavBar.profileApi = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixBottomNavBar.profileSelectionLauncher")
    public static void c(NetflixBottomNavBar netflixBottomNavBar, cNT cnt) {
        netflixBottomNavBar.profileSelectionLauncher = cnt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixBottomNavBar.bottomTabs")
    public static void b(NetflixBottomNavBar netflixBottomNavBar, Set<InterfaceC9934zO> set) {
        netflixBottomNavBar.bottomTabs = set;
    }
}
