package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.player.v2.PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1;
import com.netflix.mediaclient.ui.player.v2.PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Single;

/* loaded from: classes4.dex */
public final class cBB extends C5611cBv {
    private final C1567aGb c;
    private final aCG d;
    private final aDB e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cBB(aCG acg, aLP alp, aDB adb, C1567aGb c1567aGb) {
        super(alp);
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) c1567aGb, "");
        this.d = acg;
        this.e = adb;
        this.c = c1567aGb;
    }

    private final Single<C5593cBd> d(String str, VideoType videoType, PlayContext playContext, long j, PlayerExtras playerExtras, TaskMode taskMode, boolean z) {
        return C7680dBj.e(null, new PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1(str, this, taskMode, videoType, playContext, j, playerExtras, null), 1, null);
    }

    @Override // o.C5611cBv
    public Single<C5593cBd> b(String str, VideoType videoType, PlayContext playContext, long j, PlayerExtras playerExtras, TaskMode taskMode, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) taskMode, "");
        if (z) {
            return super.b(str, videoType, playContext, j, playerExtras, taskMode, z);
        }
        return d(str, videoType, playContext, j, playerExtras, taskMode, z);
    }

    @Override // o.C5611cBv, o.InterfaceC5604cBo
    public Single<C5593cBd> a(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) taskMode, "");
        return C7680dBj.e(null, new PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1(str, this, playerExtras, taskMode, playContext, null), 1, null);
    }
}
