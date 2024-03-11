package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C4680bjA;
import o.C4831bnM;
import o.C4855bnk;
import o.C4973bpw;

/* loaded from: classes3.dex */
public class TransitionJson extends BaseEventJson {
    @SerializedName("auxSrcmidType")
    private String U;
    @SerializedName("auxSrcmid")
    private Long V;
    @SerializedName("discard")
    private Map<String, b> W;
    @SerializedName("delayToTransition")
    private long X;
    @SerializedName("nextExitPositionAtRequest")
    private Long Y;
    private final transient C4831bnM Z;
    @SerializedName("atTransition")
    private e a;
    @SerializedName("seamlessRequested")
    private Boolean aa;
    @SerializedName("durationOfTransition")
    private Long ab;
    @SerializedName("hasContentPlaygraph")
    private Boolean ac;
    @SerializedName("srcsegmentduration")
    private Long ad;
    @SerializedName("srcoffset")
    private Long ae;
    @SerializedName("srcsegment")
    private String af;
    @SerializedName("srcadBreakLocationMs")
    private Long ag;
    @SerializedName("srcmid")
    private Long ah;
    @SerializedName("transitionType")
    private TransitionType ai;
    @SerializedName("srcxid")
    private String ak;
    @SerializedName("isBranching")
    protected Boolean c;
    @SerializedName("atRequest")
    private e e;

    /* loaded from: classes3.dex */
    public enum TransitionType {
        SEAMLESS,
        SKIP,
        RESET,
        LONG
    }

    public TransitionJson a(Long l) {
        this.ad = l;
        return this;
    }

    public TransitionJson a(boolean z) {
        this.c = z ? Boolean.TRUE : null;
        return this;
    }

    public Long a() {
        return this.ae;
    }

    public void b(Boolean bool) {
        this.ac = bool;
    }

    public Long c() {
        return this.ad;
    }

    public TransitionJson e(Long l) {
        this.Y = l;
        return this;
    }

    public TransitionJson(String str, String str2, String str3, String str4, String str5) {
        super("transition", str, str2, str3, str4, str5);
        this.Z = new C4831bnM();
    }

    public TransitionJson e(long j) {
        c(j);
        return this;
    }

    public TransitionJson e(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public TransitionJson d(String str) {
        if (!TextUtils.equals(this.T, str)) {
            this.ak = str;
        }
        return this;
    }

    public TransitionJson c(C4680bjA c4680bjA) {
        if (c4680bjA != null) {
            this.ah = Long.valueOf(c4680bjA.a());
            this.af = c4680bjA.e();
            this.U = C4855bnk.a.d(c4680bjA.c());
            if (c4680bjA.c() != SegmentType.a) {
                this.V = Long.valueOf(c4680bjA.b());
                this.ag = c4680bjA.d();
            }
        }
        return this;
    }

    public TransitionJson d(C4680bjA c4680bjA) {
        if (c4680bjA != null) {
            super.b(Long.valueOf(c4680bjA.a()));
            this.K = c4680bjA.e();
            this.h = C4855bnk.a.d(c4680bjA.c());
            if (c4680bjA.c() != SegmentType.a) {
                this.i = Long.valueOf(c4680bjA.b());
                this.j = c4680bjA.d();
            }
        }
        return this;
    }

    public TransitionJson d(long j) {
        this.ae = Long.valueOf(j);
        return this;
    }

    public TransitionJson e(boolean z) {
        this.aa = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.TransitionJson$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[IPlaylistControl.SegmentTransitionType.values().length];
            b = iArr;
            try {
                iArr[IPlaylistControl.SegmentTransitionType.SEAMLESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[IPlaylistControl.SegmentTransitionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[IPlaylistControl.SegmentTransitionType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TransitionJson d(IPlaylistControl.SegmentTransitionType segmentTransitionType) {
        int i = AnonymousClass5.b[segmentTransitionType.ordinal()];
        if (i == 1) {
            this.ai = TransitionType.SEAMLESS;
        } else if (i == 2) {
            this.ai = TransitionType.RESET;
        } else if (i == 3) {
            this.ai = TransitionType.LONG;
        }
        return this;
    }

    public TransitionJson a(long j) {
        this.ab = Long.valueOf(j);
        return this;
    }

    public TransitionJson g() {
        this.X = this.Z.c();
        return this;
    }

    public TransitionJson e(List<C4973bpw> list, String str) {
        this.K = str;
        if (list == null) {
            return this;
        }
        this.W = new HashMap();
        for (C4973bpw c4973bpw : list) {
            if (c4973bpw.c.equals(str)) {
                this.e = new e(c4973bpw);
            } else if (!c4973bpw.d()) {
                this.W.put(c4973bpw.c, new b(c4973bpw));
            }
        }
        return this;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson
    /* renamed from: b */
    public TransitionJson e(long j, IAsePlayerState iAsePlayerState) {
        if (iAsePlayerState != null) {
            this.a = new e(j, iAsePlayerState);
        }
        return this;
    }

    public boolean f() {
        Boolean bool = this.aa;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* loaded from: classes3.dex */
    static class b {
        @SerializedName("abuflmsec")
        protected final long a;
        @SerializedName("vbuflbytes")
        protected final long b;
        @SerializedName("vbuflmsec")
        protected final long c;
        @SerializedName("weight")
        protected final long d;
        @SerializedName("abuflbytes")
        protected final long e;

        public b(C4973bpw c4973bpw) {
            this.d = c4973bpw.j;
            this.c = c4973bpw.b;
            this.e = c4973bpw.e;
            this.b = c4973bpw.a;
            this.a = c4973bpw.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class e {
        @SerializedName("vbuflbytes")
        private final long a;
        @SerializedName("abuflmsec")
        private final long b;
        @SerializedName("abuflbytes")
        private final long c;
        @SerializedName("weight")
        private Long d;
        @SerializedName("vbuflmsec")
        private final long e;

        public e(C4973bpw c4973bpw) {
            this.e = c4973bpw.b;
            this.a = c4973bpw.a;
            this.c = c4973bpw.e;
            this.b = c4973bpw.d;
            this.d = Long.valueOf(c4973bpw.j);
        }

        public e(long j, IAsePlayerState iAsePlayerState) {
            this.b = Math.max(j, iAsePlayerState.a(1));
            this.e = Math.max(j, iAsePlayerState.a(2));
            this.c = iAsePlayerState.b(1);
            this.a = iAsePlayerState.b(2);
        }
    }
}
