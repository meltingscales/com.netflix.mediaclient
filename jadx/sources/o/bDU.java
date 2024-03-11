package o;

import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1;
import io.reactivex.Observable;

/* loaded from: classes4.dex */
public final class bDU extends bDV {
    private final aLP a;
    private final BookmarkStore b;
    private final aDB c;
    private final aCG h;
    private final C1567aGb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bDU(aLP alp, aCG acg, aDB adb, C1567aGb c1567aGb, BookmarkStore bookmarkStore) {
        super(alp);
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) bookmarkStore, "");
        this.a = alp;
        this.h = acg;
        this.c = adb;
        this.i = c1567aGb;
        this.b = bookmarkStore;
    }

    @Override // o.bDV, o.InterfaceC3617bEm
    public Observable<bDW> e(String str) {
        C8632dsu.c((Object) str, "");
        return C7675dBe.e(null, new EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1(str, this, null), 1, null);
    }

    @Override // o.bDV, o.InterfaceC3617bEm
    public Observable<bDW> d(ServiceManager serviceManager, String str, String str2, boolean z, String str3) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        return C7675dBe.e(null, new EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1(str, this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARN: Type inference failed for: r1v5, types: [o.dyI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(o.dyI<? super o.bDW> r19, o.InterfaceC5194buE r20, o.InterfaceC8585dra<? super o.dpR> r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bDU.d(o.dyI, o.buE, o.dra):java.lang.Object");
    }

    @Override // o.bDV, o.InterfaceC3617bEm
    public Observable<bDW> d(String str, long j, int i, int i2, String str2, InterfaceC5195buF interfaceC5195buF) {
        C8632dsu.c((Object) str, "");
        return C7675dBe.e(null, new EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1(interfaceC5195buF, str, this, str2, i2, i, j, null), 1, null);
    }
}
