package o;

import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.util.AttributeSet;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.playerui.videoview.api.PlayerState;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;

/* renamed from: o.aKd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1677aKd extends aJY {
    public static final e e = new e(null);
    private long b;
    private InterfaceC5210buU c;
    private final b i;
    private PlaylistMap<?> j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1677aKd(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1677aKd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1677aKd(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.aJY
    protected void d(long j) {
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aJY
    public long f() {
        return -1L;
    }

    public /* synthetic */ C1677aKd(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677aKd(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        this.i = new b();
        this.b = super.f();
    }

    /* renamed from: o.aKd$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private long c = -1;
        private long d = -1;

        public final void a(long j) {
            this.c = j;
        }

        public final void b(long j) {
            this.d = j;
        }

        public final long c() {
            return this.c;
        }

        public final long e() {
            return this.d;
        }

        b() {
        }
    }

    @Override // o.aJY
    public InterfaceC5085bsB c(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, PlayContext playContext, boolean z, String str) {
        IPlaylistControl C;
        C8632dsu.c((Object) interfaceC5097bsN, "");
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        if (S()) {
            e.getLogTag();
            c(InterfaceC4360bcz.b.a().c(j, interfaceC5097bsN, abstractC5100bsQ, playbackExperience, n(), playContext, E(), z, s(), str, G()));
            InterfaceC5085bsB k = k();
            a(k != null ? k.s() : null);
            IPlaylistControl C2 = C();
            if (C2 != null) {
                C2.setSegmentTransitionEndListener(this);
            }
        } else {
            e eVar = e;
            eVar.getLogTag();
            if (this.j != null) {
                c(InterfaceC4360bcz.b.a().e(j, interfaceC5097bsN, abstractC5100bsQ, playbackExperience, this.j, playContext, E(), z, s(), str, G()));
                InterfaceC5085bsB k2 = k();
                if (k2 != null) {
                    a(k2.s());
                    IPlaylistControl C3 = C();
                    if (C3 != null) {
                        C3.setSegmentTransitionEndListener(this);
                    }
                    InterfaceC5210buU interfaceC5210buU = this.c;
                    if (interfaceC5210buU != null && (C = C()) != null) {
                        C.setAdsListener(interfaceC5210buU);
                    }
                }
            } else {
                eVar.getLogTag();
                return null;
            }
        }
        return k();
    }

    @Override // o.aJY
    public void j() {
        super.j();
        a((IPlaylistControl) null);
    }

    @Override // o.aJY, com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public PlaylistMap<?> H() {
        IPlaylistControl C = C();
        if (C != null) {
            return C.H();
        }
        return null;
    }

    @Override // o.aJY, com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public boolean d(PlaylistMap<?> playlistMap) {
        C8632dsu.c((Object) playlistMap, "");
        IPlaylistControl C = C();
        if (C != null) {
            return C.d(playlistMap);
        }
        return false;
    }

    @Override // o.aJY, com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public boolean d(String str, String str2) {
        C8632dsu.c((Object) str, "");
        IPlaylistControl C = C();
        if (C != null) {
            return C.d(str, str2);
        }
        return false;
    }

    @Override // o.aJY, com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public PlaylistTimestamp l() {
        IPlaylistControl C = C();
        if (C != null) {
            return C.l();
        }
        return null;
    }

    @Override // o.aJY, com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void d(PlaylistTimestamp playlistTimestamp) {
        C8632dsu.c((Object) playlistTimestamp, "");
        IPlaylistControl C = C();
        if (C != null) {
            C.d(playlistTimestamp);
        }
    }

    public final void e(PlaylistTimestamp playlistTimestamp, PlaybackExperience playbackExperience, PlayContext playContext) {
        C8632dsu.c((Object) playlistTimestamp, "");
        InterfaceC5085bsB k = k();
        if (k != null) {
            k.d(playbackExperience, playContext);
        }
        b(PlayerState.j);
        IPlaylistControl C = C();
        if (C != null) {
            C.d(playlistTimestamp);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void setAdsListener(InterfaceC5210buU interfaceC5210buU) {
        C8632dsu.c((Object) interfaceC5210buU, "");
        this.c = interfaceC5210buU;
        IPlaylistControl C = C();
        if (C != null) {
            C.setAdsListener(interfaceC5210buU);
        }
    }

    @Override // o.aJY, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IPlaylistControl C;
        C5212buW E_;
        C8632dsu.c((Object) message, "");
        if (message.what == 3) {
            InterfaceC5085bsB k = k();
            if (k != null) {
                long F = k.F();
                long H = k.H();
                if (F >= 0 && H > 0) {
                    if (this.i.c() > 0 && this.i.c() != H) {
                        long c = this.i.c();
                        StringBuilder sb = new StringBuilder();
                        sb.append(c);
                        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(C5103bsT.e("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED", sb.toString(), k.l(), J(), this.i.e(), p().b()));
                        b(true);
                        b(false);
                    }
                    this.i.a(H);
                    this.i.b(F);
                }
            }
            if (this.c != null && (C = C()) != null && (E_ = C.E_()) != null) {
                InterfaceC5210buU interfaceC5210buU = this.c;
                C8632dsu.d(interfaceC5210buU);
                interfaceC5210buU.c(E_.c(), E_.b(), E_.a());
            }
        }
        return super.handleMessage(message);
    }

    public static /* synthetic */ void e(C1677aKd c1677aKd, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            Rect F = c1677aKd.F();
            i = F != null ? F.left : 0;
        }
        if ((i5 & 2) != 0) {
            Rect F2 = c1677aKd.F();
            i2 = F2 != null ? F2.top : 0;
        }
        if ((i5 & 4) != 0) {
            Rect F3 = c1677aKd.F();
            i3 = F3 != null ? F3.right : 0;
        }
        if ((i5 & 8) != 0) {
            Rect F4 = c1677aKd.F();
            i4 = F4 != null ? F4.bottom : 0;
        }
        c1677aKd.e(i, i2, i3, i4);
    }

    public final void e(int i, int i2, int i3, int i4) {
        c(i, i2, i3, i4);
    }

    /* renamed from: o.aKd$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlaylistVideoView");
        }
    }

    public final boolean e(long j, AbstractC5100bsQ abstractC5100bsQ, C5208buS c5208buS, VideoType videoType, PlaybackExperience playbackExperience, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, String str, String str2, boolean z2) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) str, "");
        e.getLogTag();
        a(str2);
        b(str);
        this.j = c5208buS;
        h(j);
        if (e(abstractC5100bsQ, videoType, playbackExperience, playContext, z, z2)) {
            c(playlistTimestamp);
            return P();
        }
        return false;
    }
}
