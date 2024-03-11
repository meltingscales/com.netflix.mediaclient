package o;

import com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment;
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
public final class cRS implements MembersInjector<SearchSuggestionOnNapaFragment> {
    private final Provider<InterfaceC3645bFn> b;
    private final Provider<InterfaceC6083cTf> c;
    private final Provider<bNN> d;
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment) {
        C1092Oj.e(searchSuggestionOnNapaFragment, this.e);
        e(searchSuggestionOnNapaFragment, this.b.get());
        b(searchSuggestionOnNapaFragment, DoubleCheck.lazy(this.d));
        b(searchSuggestionOnNapaFragment, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment.detailsPagePrefetcher")
    public static void e(SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment, InterfaceC3645bFn interfaceC3645bFn) {
        searchSuggestionOnNapaFragment.detailsPagePrefetcher = interfaceC3645bFn;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment.gameModels")
    public static void b(SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment, Lazy<bNN> lazy) {
        searchSuggestionOnNapaFragment.gameModels = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment.searchRepositoryFactory")
    public static void b(SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment, InterfaceC6083cTf interfaceC6083cTf) {
        searchSuggestionOnNapaFragment.searchRepositoryFactory = interfaceC6083cTf;
    }
}
