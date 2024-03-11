package o;

import android.content.Context;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.PlaybackContext;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.v2.PostPlayRepositoryImpl$requestPostPlayDetails$1;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.offline.OfflinePostPlayExperience;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import javax.inject.Provider;
import o.C6004cQk;
import o.C8632dsu;
import o.InterfaceC5190buA;
import o.InterfaceC7282ctK;

/* loaded from: classes4.dex */
public final class cBM implements cBP {
    public static final e d = new e(null);
    private final Provider<Boolean> c;

    public cBM(Provider<Boolean> provider) {
        C8632dsu.c((Object) provider, "");
        this.c = provider;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PostPlayRepositoryImpl");
        }
    }

    @Override // o.cBP
    public Single<PostPlayExperience> b(String str, IPlayer.PlaybackType playbackType, VideoType videoType, PlayLocationType playLocationType, boolean z, boolean z2, PlaybackContext playbackContext) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) playbackType, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playLocationType, "");
        C8632dsu.c((Object) playbackContext, "");
        if (playbackType == IPlayer.PlaybackType.OfflinePlayback) {
            PostPlayExperience e2 = e(str, z);
            if (e2 != null) {
                Single<PostPlayExperience> just = Single.just(e2);
                C8632dsu.d(just);
                return just;
            }
            Single<PostPlayExperience> error = Single.error(new Throwable("Offline PostPlay not available"));
            C8632dsu.d(error);
            return error;
        }
        C6004cQk c6004cQk = new C6004cQk();
        Boolean bool = this.c.get();
        C8632dsu.a(bool, "");
        Single<C6004cQk.d<InterfaceC5190buA>> b = c6004cQk.b(str, videoType, playLocationType, true, z2, playbackContext, bool.booleanValue());
        final PostPlayRepositoryImpl$requestPostPlayDetails$1 postPlayRepositoryImpl$requestPostPlayDetails$1 = new drM<C6004cQk.d<InterfaceC5190buA>, PostPlayExperience>() { // from class: com.netflix.mediaclient.ui.player.v2.PostPlayRepositoryImpl$requestPostPlayDetails$1
            @Override // o.drM
            /* renamed from: a */
            public final PostPlayExperience invoke(C6004cQk.d<InterfaceC5190buA> dVar) {
                C8632dsu.c((Object) dVar, "");
                InterfaceC5190buA c = dVar.c();
                if (c != null) {
                    return c.aA();
                }
                return null;
            }
        };
        Single map = b.map(new Function() { // from class: o.cBV
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                PostPlayExperience e3;
                e3 = cBM.e(drM.this, obj);
                return e3;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostPlayExperience e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (PostPlayExperience) drm.invoke(obj);
    }

    private final PostPlayExperience e(String str, boolean z) {
        int trackId;
        int trackId2;
        int trackId3;
        Context d2 = AbstractApplicationC1040Mh.d();
        InterfaceC7282ctK.a aVar = InterfaceC7282ctK.d;
        C8632dsu.d(d2);
        InterfaceC7282ctK d3 = aVar.d(d2);
        C7460cwd b = d3.b(str);
        if (b == null) {
            return null;
        }
        C7460cwd e2 = InterfaceC7303ctf.c.a(d2).e(str);
        boolean z2 = false;
        boolean a = (e2 != null ? e2.getType() : null) == VideoType.MOVIE ? false : d3.a(str, b);
        if (C8632dsu.c((Object) b.aO_(), (Object) (e2 != null ? e2.aO_() : null))) {
            trackId = PlayContextImp.s.getTrackId();
            trackId2 = PlayContextImp.n.getTrackId();
            trackId3 = PlayContextImp.b.getTrackId();
        } else {
            trackId = PlayContextImp.m.getTrackId();
            trackId2 = PlayContextImp.m.getTrackId();
            trackId3 = PlayContextImp.m.getTrackId();
            z2 = true;
        }
        return new OfflinePostPlayExperience(b.aE_(), b.aA(), b.n(), z, trackId, trackId2, trackId3, b.aJ_(), b.getType(), d3.c(b.aH_()), z2, a);
    }
}
