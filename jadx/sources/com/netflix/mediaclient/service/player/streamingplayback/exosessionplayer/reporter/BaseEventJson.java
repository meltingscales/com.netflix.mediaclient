package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.os.SystemClock;
import androidx.media3.common.Timeline;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import o.C4680bjA;
import o.C4855bnk;
import o.C8170dfN;
import o.InterfaceC4776bmK;

/* loaded from: classes3.dex */
public abstract class BaseEventJson {
    public static final transient Logblob.Severity b = Logblob.Severity.info;
    @SerializedName("playbackoffline")
    protected Boolean A;
    @SerializedName("oxid")
    protected String B;
    @SerializedName("mid")
    public Long C;
    @SerializedName("playbackcontextid")
    public String D;
    @SerializedName("pxid")
    protected String E;
    @SerializedName("scClockDriftMs")
    public Long F;
    @SerializedName("playertype")
    protected String G;
    @SerializedName("playbackprogressive")
    public Boolean H;
    @SerializedName("scClockMs")
    public Long I;
    @SerializedName("soff")

    /* renamed from: J  reason: collision with root package name */
    protected Long f13221J;
    @SerializedName("segment")
    protected String K;
    @SerializedName("segmentoffset")
    protected Long L;
    @SerializedName("soffms")
    public Long M;
    @SerializedName("tbuflbytes")
    protected Long N;
    @SerializedName("totaltime")
    public Long O;
    @SerializedName("tbuflmsec")
    protected Long P;
    @SerializedName("type")
    protected String Q;
    @SerializedName("vbuflbytes")
    protected Long R;
    @SerializedName("vbuflmsec")
    protected Long S;
    @SerializedName("xid")
    protected String T;
    private transient Logblob.Severity a = b;
    @SerializedName("abuflbytes")
    protected Long d;
    @SerializedName("allsessioninfo")
    protected a f;
    @SerializedName("abuflmsec")
    protected Long g;
    @SerializedName("auxMidType")
    public String h;
    @SerializedName("auxMid")
    public Long i;
    @SerializedName("adBreakLocationMs")
    public Long j;
    @SerializedName("auxPlaybackcontextid")
    protected String k;
    @SerializedName("dxid")
    protected String l;
    @SerializedName("intenttoplayatedge")
    public Boolean m;
    @SerializedName("isdvr")
    public Boolean n;
    @SerializedName("dynamicClockCorrectionMs")

    /* renamed from: o  reason: collision with root package name */
    public Long f13222o;
    @SerializedName("basemediadecodetimeoffset")
    public Long p;
    @SerializedName("islive")
    public Boolean q;
    @SerializedName("liveEdgeMs")
    public Long r;
    @SerializedName("encodingpipelinetime")
    public Long s;
    @SerializedName("devicepts")
    public Long t;
    @SerializedName("manifestHasAds")
    protected Boolean u;
    @SerializedName("presentationtimeoffset")
    public Long v;
    @SerializedName("livestage")
    public LiveStage w;
    @SerializedName("moff")
    protected Long x;
    @SerializedName("auxOffsetms")
    protected long y;
    @SerializedName("moffms")
    public Long z;

    public void a(Logblob.Severity severity) {
        this.a = severity;
    }

    public void a(String str, String str2) {
        Boolean bool;
        this.B = str;
        this.l = str2;
        if (str == null || str2 == null) {
            this.G = "exoplayer";
            bool = null;
        } else {
            this.G = "exoplayer_offline";
            bool = Boolean.TRUE;
        }
        this.A = bool;
    }

    public BaseEventJson b(Long l) {
        if (this.C == null) {
            this.C = l;
        }
        return this;
    }

    public String b() {
        return this.T;
    }

    public void b(long j) {
        this.y = j;
    }

    public void c(String str) {
        this.k = str;
    }

    public Logblob.Severity d() {
        return this.a;
    }

    public void e(String str) {
        this.D = str;
    }

    public boolean e() {
        return false;
    }

    public String j() {
        return this.Q;
    }

    public boolean h() {
        return Boolean.TRUE.equals(this.A);
    }

    public BaseEventJson() {
    }

    public BaseEventJson(String str, String str2, String str3, String str4, String str5, String str6) {
        this.Q = str;
        this.E = str2;
        this.T = str3;
        a(str4, str5);
        e(str6);
    }

    public void b(C4680bjA c4680bjA) {
        if (c4680bjA == null || c4680bjA.c() == SegmentType.a || this.h != null) {
            return;
        }
        this.h = C4855bnk.a.d(c4680bjA.c());
        this.i = Long.valueOf(c4680bjA.b());
        this.j = c4680bjA.d();
    }

    public void c(boolean z) {
        this.u = Boolean.valueOf(z);
    }

    public void c(long j) {
        this.M = Long.valueOf(j);
        this.f13221J = Long.valueOf(j / 1000);
    }

    public void c(long j, PlaylistTimestamp playlistTimestamp) {
        this.z = Long.valueOf(j);
        this.x = Long.valueOf(j / 1000);
        if (playlistTimestamp != null) {
            this.K = playlistTimestamp.a;
            this.L = Long.valueOf(playlistTimestamp.e);
        }
    }

    public BaseEventJson e(long j, IAsePlayerState iAsePlayerState) {
        if (iAsePlayerState != null) {
            this.g = Long.valueOf(Math.max(j, iAsePlayerState.a(1)));
            this.S = Long.valueOf(Math.max(j, iAsePlayerState.a(2)));
            if (this.g.longValue() > this.S.longValue()) {
                this.S = Long.valueOf(j);
            } else {
                this.g = Long.valueOf(j);
            }
            this.d = Long.valueOf(iAsePlayerState.b(1));
            this.R = Long.valueOf(iAsePlayerState.b(2));
            long a2 = iAsePlayerState.a(3);
            if (a2 >= 0) {
                this.P = Long.valueOf(Math.max(j, a2));
                this.N = Long.valueOf(iAsePlayerState.b(3));
            }
        }
        return this;
    }

    public void e(Timeline.Window window, LiveEventState liveEventState, boolean z, long j, long j2) {
        if (window != null && window.isDynamic) {
            this.q = Boolean.TRUE;
            this.w = LiveStage.b(liveEventState);
            this.s = Long.valueOf(window.getCurrentUnixTimeMs());
            this.m = Boolean.valueOf(z);
            long j3 = window.presentationStartTimeMs;
            if (j3 != -9223372036854775807L) {
                this.v = Long.valueOf(j3);
            }
            Long l = this.z;
            if (l != null) {
                this.t = Long.valueOf(l.longValue() + window.windowStartTimeMs);
                if (window.presentationStartTimeMs != -9223372036854775807L) {
                    this.p = Long.valueOf(this.z.longValue() + window.presentationStartTimeMs);
                }
                this.r = Long.valueOf((this.s.longValue() - this.z.longValue()) - window.windowStartTimeMs);
            }
            if (j != -9223372036854775807L) {
                this.I = Long.valueOf(SystemClock.elapsedRealtime() + j + j2);
                this.F = Long.valueOf(this.s.longValue() - this.I.longValue());
            }
        } else if (window != null) {
            this.n = Boolean.TRUE;
        }
        if (j2 != 0) {
            this.f13222o = Long.valueOf(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LiveEventState.values().length];
            a = iArr;
            try {
                iArr[LiveEventState.EVENT_WAITING_ROOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LiveEventState.EVENT_LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LiveEventState.EVENT_THANK_YOU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    protected enum LiveStage {
        START_SLATE,
        LIVE_EVENT,
        END_SLATE;

        public static LiveStage b(LiveEventState liveEventState) {
            if (liveEventState == null) {
                return null;
            }
            int i = AnonymousClass2.a[liveEventState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return END_SLATE;
                }
                return LIVE_EVENT;
            }
            return START_SLATE;
        }
    }

    public void d(InterfaceC4776bmK.e eVar) {
        long j;
        d dVar;
        if (eVar == null) {
            return;
        }
        InterfaceC4776bmK.b e = eVar.e();
        List<InterfaceC4776bmK.b> c = eVar.c();
        if (e == null && c.isEmpty()) {
            return;
        }
        List list = (List) c.stream().map(new Function() { // from class: o.bmS
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                BaseEventJson.d d2;
                d2 = BaseEventJson.d((InterfaceC4776bmK.b) obj);
                return d2;
            }
        }).collect(Collectors.toList());
        if (e == null || e.c() == null) {
            j = -1;
            dVar = null;
        } else {
            j = C8170dfN.d() - e.c().longValue();
            dVar = new d(e);
        }
        this.f = new a(j, list, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d d(InterfaceC4776bmK.b bVar) {
        return new d(bVar);
    }

    /* loaded from: classes3.dex */
    static class a {
        @SerializedName("timeSinceLastClose")
        long c;
        @SerializedName("othersessioninfolist")
        List<d> d;
        @SerializedName("lastclosedsession")
        d e;

        public a(long j, List<d> list, d dVar) {
            this.c = j;
            this.d = list;
            this.e = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class d {
        @SerializedName(SignupConstants.Field.AGE)
        protected Long b;
        @SerializedName("pxid")
        protected String e;

        public d(InterfaceC4776bmK.b bVar) {
            if (bVar != null) {
                this.e = bVar.a();
                this.b = Long.valueOf(bVar.b());
            }
        }
    }
}
