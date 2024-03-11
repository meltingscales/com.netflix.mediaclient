package o;

import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.service.player.PlayerAgentRepositoryImpl$clearAllManifestLicense$1;
import com.netflix.mediaclient.service.player.PlayerAgentRepositoryImpl$createVideoGroup$1;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import o.AbstractC5100bsQ;
import o.C4358bcx;
import o.C8632dsu;
import o.InterfaceC4342bch;
import o.InterfaceC4360bcz;
import o.dpR;

/* renamed from: o.bcC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4311bcC implements InterfaceC4360bcz {
    public static final d e = new d(null);

    /* renamed from: o.bcC$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlayerAgentRepositoryImpl");
        }
    }

    @Override // o.InterfaceC4360bcz
    public void e(VideoResolutionRange videoResolutionRange) {
        C8632dsu.c((Object) videoResolutionRange, "");
        C8166dfJ.e("PlayerAgent", false);
        if (AbstractApplicationC1040Mh.getInstance().i().r()) {
            g().c(videoResolutionRange);
        } else {
            C4358bcx.d.a(videoResolutionRange);
        }
    }

    @Override // o.InterfaceC4360bcz
    public void b(List<C5102bsS> list) {
        C8632dsu.c((Object) list, "");
        C8166dfJ.e("PlayerAgent", false);
        C4358bcx f = f();
        if (f != null) {
            f.e(list);
        } else {
            e.getLogTag();
        }
    }

    @Override // o.InterfaceC4360bcz
    public Single<AbstractC5100bsQ> b() {
        Single e2;
        C8166dfJ.e("PlayerAgent", false);
        e2 = C4314bcF.e();
        final PlayerAgentRepositoryImpl$createVideoGroup$1 playerAgentRepositoryImpl$createVideoGroup$1 = new drM<C4358bcx, AbstractC5100bsQ>() { // from class: com.netflix.mediaclient.service.player.PlayerAgentRepositoryImpl$createVideoGroup$1
            @Override // o.drM
            /* renamed from: d */
            public final AbstractC5100bsQ invoke(C4358bcx c4358bcx) {
                C8632dsu.c((Object) c4358bcx, "");
                return c4358bcx.c().e();
            }
        };
        Single<AbstractC5100bsQ> map = e2.map(new Function() { // from class: o.bcB
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                AbstractC5100bsQ b;
                b = C4311bcC.b(drM.this, obj);
                return b;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5100bsQ b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (AbstractC5100bsQ) drm.invoke(obj);
    }

    @Override // o.InterfaceC4360bcz
    public void a(AbstractC5100bsQ abstractC5100bsQ) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8166dfJ.e("PlayerAgent", false);
        m().b(abstractC5100bsQ);
    }

    @Override // o.InterfaceC4360bcz
    public InterfaceC5085bsB e(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, long j2, PlayContext playContext, long j3, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        C8166dfJ.e("PlayerAgent", false);
        InterfaceC5085bsB c = m().c(j, interfaceC5097bsN, abstractC5100bsQ, playbackExperience, j2, playContext, j3, z, z2, str, preferredLanguageData);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC4360bcz
    public InterfaceC5085bsB c(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, long j2, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        C8166dfJ.e("PlayerAgent", false);
        return m().a(j, interfaceC5097bsN, abstractC5100bsQ, playbackExperience, j2, playContext, playlistTimestamp, z, z2, str, preferredLanguageData);
    }

    @Override // o.InterfaceC4360bcz
    public InterfaceC5085bsB e(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, PlaylistMap<?> playlistMap, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        C8166dfJ.e("PlayerAgent", false);
        C4352bcr m = m();
        C8632dsu.d(playlistMap);
        InterfaceC5085bsB d2 = m.d(j, interfaceC5097bsN, abstractC5100bsQ, playbackExperience, playlistMap, playContext, playlistTimestamp, z, z2, str, preferredLanguageData);
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC4360bcz
    public InterfaceC5085bsB c(C4355bcu c4355bcu) {
        C8632dsu.c((Object) c4355bcu, "");
        C8166dfJ.e("PlayerAgent", false);
        InterfaceC5085bsB e2 = m().e(c4355bcu);
        if (e2 != null) {
            return e2;
        }
        throw new IllegalStateException("createPlaybackSession2 can't create session");
    }

    @Override // o.InterfaceC4360bcz
    public InterfaceC5085bsB c() {
        C4358bcx f = f();
        if (f != null) {
            return f.c().d();
        }
        e.getLogTag();
        return null;
    }

    @Override // o.InterfaceC4360bcz
    public InterfaceC4360bcz.e d() {
        C4358bcx f = f();
        if (f != null) {
            return f.c().b();
        }
        e.getLogTag();
        return null;
    }

    @Override // o.InterfaceC4360bcz
    public boolean j() {
        return c() != null;
    }

    @Override // o.InterfaceC4360bcz
    public boolean i() {
        InterfaceC5085bsB c = c();
        return (c == null || c.l() == IPlayer.PlaybackType.OfflinePlayback || c.z()) ? false : true;
    }

    @Override // o.InterfaceC4360bcz
    public void a(long j, InterfaceC4342bch.c cVar) {
        C8632dsu.c((Object) cVar, "");
        C4358bcx f = f();
        if (f != null) {
            f.e(j, cVar);
        } else {
            e.getLogTag();
        }
    }

    @Override // o.InterfaceC4360bcz
    public void h() {
        C4314bcF.c().subscribe();
    }

    @Override // o.InterfaceC4360bcz
    public Completable a() {
        Single e2;
        e2 = C4314bcF.e();
        final PlayerAgentRepositoryImpl$clearAllManifestLicense$1 playerAgentRepositoryImpl$clearAllManifestLicense$1 = new drM<C4358bcx, dpR>() { // from class: com.netflix.mediaclient.service.player.PlayerAgentRepositoryImpl$clearAllManifestLicense$1
            public final void d(C4358bcx c4358bcx) {
                c4358bcx.e();
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4358bcx c4358bcx) {
                d(c4358bcx);
                return dpR.c;
            }
        };
        Completable ignoreElement = e2.doOnSuccess(new Consumer() { // from class: o.bcA
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4311bcC.d(drM.this, obj);
            }
        }).ignoreElement();
        C8632dsu.a(ignoreElement, "");
        return ignoreElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final C4358bcx g() {
        C4358bcx f = f();
        if (f != null) {
            return f;
        }
        throw new IllegalStateException();
    }

    private final C4358bcx f() {
        return (C4358bcx) AbstractApplicationC1040Mh.getInstance().i().m();
    }

    private final C4352bcr m() {
        C4358bcx g = g();
        if (!g.isReady()) {
            throw new IllegalStateException("Player Agent API called when agent is not ready");
        }
        return g.c();
    }
}
