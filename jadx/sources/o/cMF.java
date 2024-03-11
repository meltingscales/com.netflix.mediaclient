package o;

import com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.cMC;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cMF implements MembersInjector<MyNetflixRecentlyWatchedMenuFragment> {
    private final Provider<InterfaceC1573aGh> b;
    private final Provider<InterfaceC7303ctf> c;
    private final Provider<cMC.b> d;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment) {
        C1095Om.d(myNetflixRecentlyWatchedMenuFragment, DoubleCheck.lazy(this.b));
        a(myNetflixRecentlyWatchedMenuFragment, this.d.get());
        a(myNetflixRecentlyWatchedMenuFragment, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuFragment.eventHandlerFactory")
    public static void a(MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment, cMC.b bVar) {
        myNetflixRecentlyWatchedMenuFragment.eventHandlerFactory = bVar;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuFragment.offlineApi")
    public static void a(MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment, InterfaceC7303ctf interfaceC7303ctf) {
        myNetflixRecentlyWatchedMenuFragment.offlineApi = interfaceC7303ctf;
    }
}
