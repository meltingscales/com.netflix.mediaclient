package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cRN implements MembersInjector<SearchResultsOnNapaFrag> {
    private final Provider<InterfaceC1270Vf> a;
    private final Provider<aDB> b;
    private final Provider<InterfaceC3645bFn> c;
    private final Provider<bZI> d;
    private final Provider<bNN> e;
    private final Provider<PlaybackLauncher> f;
    private final Provider<InterfaceC6083cTf> h;
    private final Provider<InterfaceC1573aGh> j;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(SearchResultsOnNapaFrag searchResultsOnNapaFrag) {
        C1092Oj.e(searchResultsOnNapaFrag, this.j);
        a(searchResultsOnNapaFrag, this.a.get());
        a(searchResultsOnNapaFrag, this.c.get());
        b(searchResultsOnNapaFrag, DoubleCheck.lazy(this.d));
        d(searchResultsOnNapaFrag, DoubleCheck.lazy(this.e));
        a(searchResultsOnNapaFrag, DoubleCheck.lazy(this.f));
        d(searchResultsOnNapaFrag, this.h.get());
        d(searchResultsOnNapaFrag, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag.clock")
    public static void a(SearchResultsOnNapaFrag searchResultsOnNapaFrag, InterfaceC1270Vf interfaceC1270Vf) {
        searchResultsOnNapaFrag.clock = interfaceC1270Vf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag.detailsPagePrefetcher")
    public static void a(SearchResultsOnNapaFrag searchResultsOnNapaFrag, InterfaceC3645bFn interfaceC3645bFn) {
        searchResultsOnNapaFrag.detailsPagePrefetcher = interfaceC3645bFn;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag.liveStateManager")
    public static void b(SearchResultsOnNapaFrag searchResultsOnNapaFrag, Lazy<bZI> lazy) {
        searchResultsOnNapaFrag.liveStateManager = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag.gameModels")
    public static void d(SearchResultsOnNapaFrag searchResultsOnNapaFrag, Lazy<bNN> lazy) {
        searchResultsOnNapaFrag.gameModels = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag.playbackLauncher")
    public static void a(SearchResultsOnNapaFrag searchResultsOnNapaFrag, Lazy<PlaybackLauncher> lazy) {
        searchResultsOnNapaFrag.playbackLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag.searchRepositoryFactory")
    public static void d(SearchResultsOnNapaFrag searchResultsOnNapaFrag, InterfaceC6083cTf interfaceC6083cTf) {
        searchResultsOnNapaFrag.searchRepositoryFactory = interfaceC6083cTf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag.graphQLArtworkParams")
    public static void d(SearchResultsOnNapaFrag searchResultsOnNapaFrag, aDB adb) {
        searchResultsOnNapaFrag.graphQLArtworkParams = adb;
    }
}
