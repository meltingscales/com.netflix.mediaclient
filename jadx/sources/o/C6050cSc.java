package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cSc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6050cSc implements MembersInjector<PreQuerySearchFragmentV3> {
    private final Provider<aDB> a;
    private final Provider<InterfaceC6083cTf> b;
    private final Provider<bNN> c;
    private final Provider<PlaybackLauncher> d;
    private final Provider<bZI> e;
    private final Provider<InterfaceC1573aGh> i;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(PreQuerySearchFragmentV3 preQuerySearchFragmentV3) {
        C1092Oj.e(preQuerySearchFragmentV3, this.i);
        a(preQuerySearchFragmentV3, this.b.get());
        b(preQuerySearchFragmentV3, DoubleCheck.lazy(this.e));
        e(preQuerySearchFragmentV3, DoubleCheck.lazy(this.c));
        a(preQuerySearchFragmentV3, DoubleCheck.lazy(this.d));
        d(preQuerySearchFragmentV3, this.a.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3.searchRepositoryFactory")
    public static void a(PreQuerySearchFragmentV3 preQuerySearchFragmentV3, InterfaceC6083cTf interfaceC6083cTf) {
        preQuerySearchFragmentV3.searchRepositoryFactory = interfaceC6083cTf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3.liveStateManager")
    public static void b(PreQuerySearchFragmentV3 preQuerySearchFragmentV3, Lazy<bZI> lazy) {
        preQuerySearchFragmentV3.liveStateManager = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3.gameModels")
    public static void e(PreQuerySearchFragmentV3 preQuerySearchFragmentV3, Lazy<bNN> lazy) {
        preQuerySearchFragmentV3.gameModels = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3.playbackLauncher")
    public static void a(PreQuerySearchFragmentV3 preQuerySearchFragmentV3, Lazy<PlaybackLauncher> lazy) {
        preQuerySearchFragmentV3.playbackLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3.graphQLArtworkParams")
    public static void d(PreQuerySearchFragmentV3 preQuerySearchFragmentV3, aDB adb) {
        preQuerySearchFragmentV3.graphQLArtworkParams = adb;
    }
}
