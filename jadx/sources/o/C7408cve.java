package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouGraphQLRepositoryImpl$fetchBoxArtListForOptIn$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouGraphQLRepositoryImpl$fetchDownloadsForYou$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouGraphQLRepositoryImpl$fetchMovieDetails$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouGraphQLRepositoryImpl$fetchShowDetailsAndSeasons$1;
import io.reactivex.Single;
import java.util.List;
import o.C1332Xp;
import o.C6004cQk;

/* renamed from: o.cve  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7408cve implements InterfaceC7412cvi {
    private final InterfaceC8554dpx a;

    public C7408cve() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<BookmarkStore>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouGraphQLRepositoryImpl$bookmarkStore$2
            @Override // o.drO
            /* renamed from: e */
            public final BookmarkStore invoke() {
                C1332Xp c1332Xp = C1332Xp.b;
                return (BookmarkStore) C1332Xp.b(BookmarkStore.class);
            }
        });
        this.a = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BookmarkStore c() {
        return (BookmarkStore) this.a.getValue();
    }

    @Override // o.InterfaceC7412cvi
    public Single<List<String>> b(InterfaceC5283bvo interfaceC5283bvo, int i) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        return C7680dBj.e(null, new DownloadedForYouGraphQLRepositoryImpl$fetchBoxArtListForOptIn$1(interfaceC5283bvo, i, null), 1, null);
    }

    @Override // o.InterfaceC7412cvi
    public Single<List<InterfaceC5184btv>> d(InterfaceC5283bvo interfaceC5283bvo, int i) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        return C7680dBj.e(null, new DownloadedForYouGraphQLRepositoryImpl$fetchDownloadsForYou$1(interfaceC5283bvo, i, null), 1, null);
    }

    @Override // o.InterfaceC7412cvi
    public Single<C6004cQk.b<InterfaceC5238buw>> c(String str, String str2, boolean z, TaskMode taskMode, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        return C7680dBj.e(null, new DownloadedForYouGraphQLRepositoryImpl$fetchMovieDetails$1(str, null), 1, null);
    }

    @Override // o.InterfaceC7412cvi
    public Single<C6004cQk.b<InterfaceC5227bul>> b(String str, String str2, boolean z, TaskMode taskMode, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        return C7680dBj.e(null, new DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1(str, this, null), 1, null);
    }

    @Override // o.InterfaceC7412cvi
    public Single<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> e(String str, String str2, boolean z, TaskMode taskMode, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        return C7680dBj.e(null, new DownloadedForYouGraphQLRepositoryImpl$fetchShowDetailsAndSeasons$1(str, null), 1, null);
    }
}
