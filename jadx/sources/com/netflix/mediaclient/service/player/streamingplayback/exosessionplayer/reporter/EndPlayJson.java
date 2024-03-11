package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderCounters;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C4343bci;
import o.C4344bcj;
import o.C4443bec;
import o.C4584bhK;
import o.C4788bmW;
import o.C4790bmY;
import o.C4822bnD;
import o.C4825bnG;
import o.InterfaceC4610bhk;
import o.InterfaceC4660bih;
import o.aQG;

/* loaded from: classes3.dex */
public class EndPlayJson extends BaseEventJson {
    @SerializedName("bytesread")
    protected Map<String, Long> U;
    @SerializedName("carrier")
    protected String V;
    @SerializedName("cdnavtp")
    protected List<e> W;
    @SerializedName("batterystat")
    protected C4343bci X;
    @SerializedName("deviceerrormap")
    protected C4344bcj Y;
    @SerializedName("downloadHappened")
    protected boolean Z;
    @SerializedName("audiodecoder")
    protected String a;
    @SerializedName("movieduration")
    protected Long aA;
    @SerializedName("networkdist")
    protected List<j> aB;
    @SerializedName("neuhd")
    protected Double aC;
    @SerializedName("playerstate")
    protected String aD;
    @SerializedName("network-history")
    protected List<f> aE;
    @SerializedName("isAlreadyClosing")
    protected boolean aF;
    @SerializedName("playqualaudio")
    protected h aG;
    @SerializedName("playqualvideo")
    protected h aH;
    @SerializedName("switchAwaySummary")
    protected g aI;
    @SerializedName("rawVideoProfile")
    protected String aJ;
    @SerializedName("avoidseek")
    protected boolean aK;
    @SerializedName("avoidseekpos")
    protected long aL;
    @SerializedName("uiLabel")
    protected String aM;
    @SerializedName("traceEvents")
    protected Map<Long, String> aN;
    @SerializedName("videoStreamProfile")
    protected String aO;
    @SerializedName("videoSinkType")
    protected String aP;
    @SerializedName("videodecoder")
    protected String aQ;
    @SerializedName("cacheSelections")
    private List<C4788bmW> aR;
    @SerializedName("errpb")
    private List<C4790bmY> aS;
    @SerializedName("bifDownloadedBytes")
    private Long aT;
    @SerializedName("hasContentPlaygraph")
    private Boolean aU;
    @SerializedName("didHydrateTracks")
    private Boolean aV;
    @SerializedName("closetime")
    private long aW;
    @SerializedName("errst")
    private List<C4825bnG> aX;
    @SerializedName("erep")
    private List<C4825bnG> aY;
    @SerializedName("birthtime")
    private long aZ;
    @SerializedName("deviceerrorcode")
    protected String aa;
    @SerializedName("cdndldist")
    public List<a> ab;
    @SerializedName("deviceerrorstring")
    protected String ac;
    @SerializedName("droppedframes")
    protected List<Long> ad;
    @SerializedName("dltm")
    protected long ae;
    @SerializedName("endreason")
    public EndReason af;
    @SerializedName("downloadImpact")
    protected boolean ag;
    @SerializedName("downloadProgressCount")
    protected int ah;
    @SerializedName("groupname")
    protected String ai;
    @SerializedName("errorinbuffering")
    protected Boolean aj;
    @SerializedName("errorcode")
    protected String ak;
    @SerializedName("errorstring")
    protected String al;
    @SerializedName("errormsg")
    protected String am;
    @SerializedName("maxBufferAllowedBytes")
    protected Long an;
    @SerializedName("isBranching")
    protected Boolean ao;
    @SerializedName("manualBwChoice")
    protected int ap;
    @SerializedName("isCharging")
    protected boolean aq;
    @SerializedName("isBwAutomaticOn")
    protected boolean ar;
    @SerializedName("maxBufferReachedBytes")
    protected Long as;
    @SerializedName("maxBufferAllowedMs")
    protected Long at;
    @SerializedName("mcc")
    protected Integer au;
    @SerializedName("maxBufferReachedMs")
    protected Long av;
    @SerializedName("metereddist")
    protected b[] aw;
    @SerializedName("necell")
    protected Double ax;
    @SerializedName("nehd")
    protected Double ay;
    @SerializedName("mnc")
    protected Integer az;
    @SerializedName("pbres")
    private List<C4822bnD> ba;
    @SerializedName("audioSinkType")
    protected String c;
    @SerializedName("avtp")
    protected long e;

    /* loaded from: classes3.dex */
    public enum EndReason {
        STOPPED,
        ENDED,
        ERROR,
        PLAYING
    }

    public EndPlayJson a(Double d2) {
        this.aC = d2;
        return this;
    }

    public EndPlayJson a(String str) {
        this.a = str;
        return this;
    }

    public EndPlayJson a(List<f> list) {
        this.aE = list;
        return this;
    }

    public EndPlayJson a(boolean z) {
        this.ao = z ? Boolean.TRUE : null;
        return this;
    }

    public Long a() {
        return this.aA;
    }

    public void a(boolean z, boolean z2, int i2) {
        this.Z = z;
        this.ag = z2;
        this.ah = i2;
    }

    public EndPlayJson b(EndReason endReason) {
        this.af = endReason;
        return this;
    }

    public EndPlayJson b(Double d2) {
        this.ax = d2;
        return this;
    }

    public EndPlayJson b(List<e> list) {
        this.W = list;
        return this;
    }

    public EndPlayJson b(b[] bVarArr) {
        this.aw = bVarArr;
        return this;
    }

    public EndPlayJson c(int i2) {
        this.ap = i2;
        return this;
    }

    public EndPlayJson c(Map<String, Long> map) {
        this.U = map;
        return this;
    }

    public EndPlayJson c(boolean z, long j2) {
        this.aK = z;
        this.aL = j2;
        return this;
    }

    public void c(Boolean bool) {
        this.aU = bool;
    }

    public EndPlayJson d(long j2) {
        this.ae = j2;
        return this;
    }

    public EndPlayJson d(Double d2) {
        this.ay = d2;
        return this;
    }

    public EndPlayJson d(String str) {
        this.c = str;
        return this;
    }

    public EndPlayJson d(Map<Long, String> map) {
        this.aN = map;
        return this;
    }

    public EndPlayJson d(boolean z) {
        this.aF = z;
        return this;
    }

    public EndPlayJson e(long j2) {
        this.e = j2;
        return this;
    }

    public EndPlayJson e(List<j> list) {
        this.aB = list;
        return this;
    }

    public EndPlayJson e(boolean z) {
        this.ar = z;
        return this;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson
    public boolean e() {
        return true;
    }

    public EndPlayJson f(String str) {
        this.aQ = str;
        return this;
    }

    public List<j> f() {
        return this.aB;
    }

    public EndPlayJson g(long j2) {
        this.aW = j2;
        return this;
    }

    public EndPlayJson g(String str) {
        this.aM = str;
        return this;
    }

    public EndPlayJson h(String str) {
        this.aP = str;
        return this;
    }

    public EndPlayJson i(String str) {
        this.aJ = str;
        return this;
    }

    public String i() {
        return this.aM;
    }

    public EndPlayJson j(String str) {
        this.aO = str;
        return this;
    }

    public long g() {
        return this.C.longValue();
    }

    public List<a> c() {
        return new CopyOnWriteArrayList(this.ab);
    }

    protected EndPlayJson() {
        this.ab = new CopyOnWriteArrayList();
        this.af = EndReason.ENDED;
        this.aV = Boolean.FALSE;
    }

    public EndPlayJson(String str, String str2, String str3, String str4, String str5, String str6, long j2) {
        super(str, str2, str3, str4, str5, str6);
        this.ab = new CopyOnWriteArrayList();
        this.af = EndReason.ENDED;
        this.aV = Boolean.FALSE;
        this.aZ = j2;
    }

    public EndPlayJson i(long j2) {
        this.aA = Long.valueOf(j2);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson a(o.C4974bpx r2, com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.State r3, o.InterfaceC4776bmK.e r4) {
        /*
            r1 = this;
            if (r2 != 0) goto L15
            com.netflix.mediaclient.servicemgr.Logblob$Severity r2 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson.b
            r1.a(r2)
            r2 = 0
            r1.ak = r2
            r1.al = r2
            r1.aa = r2
            r1.ac = r2
            r1.am = r2
            r1.aj = r2
            goto L7e
        L15:
            com.netflix.mediaclient.servicemgr.Logblob$Severity r0 = com.netflix.mediaclient.servicemgr.Logblob.Severity.error
            r1.a(r0)
            java.lang.String r0 = r2.f()
            r1.ak = r0
            java.lang.String r0 = r2.h()
            r1.al = r0
            java.lang.String r0 = r2.a()
            r1.aa = r0
            java.lang.String r0 = r2.g()
            r1.ac = r0
            java.lang.String r0 = r2.e()
            r1.am = r0
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson$EndReason r0 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson.EndReason.ERROR
            r1.af = r0
            boolean r0 = r3.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.aj = r0
            int[] r0 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson.AnonymousClass2.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            switch(r3) {
                case 1: goto L5e;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L5b;
                case 5: goto L5b;
                case 6: goto L58;
                case 7: goto L55;
                case 8: goto L55;
                case 9: goto L52;
                default: goto L51;
            }
        L51:
            goto L62
        L52:
            java.lang.String r3 = "transition"
            goto L60
        L55:
            java.lang.String r3 = "repos"
            goto L60
        L58:
            java.lang.String r3 = "paused"
            goto L60
        L5b:
            java.lang.String r3 = "rebuffer"
            goto L60
        L5e:
            java.lang.String r3 = "playing"
        L60:
            r1.aD = r3
        L62:
            o.bcj r3 = o.C4344bcj.a()
            java.lang.String r0 = r1.ak
            r3.b(r0)
            o.bcj r3 = o.C4344bcj.a()
            r1.Y = r3
            java.lang.String r3 = r1.D
            if (r3 != 0) goto L7b
            java.lang.String r2 = r2.i()
            r1.D = r2
        L7b:
            r1.d(r4)
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson.a(o.bpx, com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine$State, o.bmK$e):com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson");
    }

    public EndPlayJson d(CurrentNetworkInfo currentNetworkInfo) {
        if (currentNetworkInfo != null) {
            this.V = currentNetworkInfo.e();
            this.au = currentNetworkInfo.b();
            this.az = currentNetworkInfo.h();
        }
        return this;
    }

    public EndPlayJson a(long j2, PlaylistTimestamp playlistTimestamp) {
        super.c(j2, playlistTimestamp);
        return this;
    }

    public EndPlayJson j(long j2) {
        c(j2);
        return this;
    }

    public EndPlayJson h(long j2) {
        if (this.ak == null && (j2 * 1.0d) / 180000.0d > 1.0d) {
            C4344bcj.a().b();
        }
        this.O = Long.valueOf(j2 / 1000);
        return this;
    }

    public void e(int i2, String str, InterfaceC4610bhk.b bVar, long j2) {
        a aVar;
        Iterator<a> it = this.ab.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.a == i2 && Objects.equals(aVar.e, str)) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new a(i2, str);
            this.ab.add(aVar);
        }
        aVar.a(bVar, j2);
    }

    public EndPlayJson d(DecoderCounters decoderCounters) {
        this.aH = new h(decoderCounters);
        return this;
    }

    public EndPlayJson b(DecoderCounters decoderCounters) {
        this.aG = new h(decoderCounters);
        return this;
    }

    public EndPlayJson d(C4343bci c4343bci) {
        if (!c4343bci.e() || aQG.c()) {
            this.X = c4343bci;
        }
        return this;
    }

    public EndPlayJson a(long j2) {
        this.aT = Long.valueOf(j2);
        return this;
    }

    public EndPlayJson b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "control";
        }
        this.ai = str;
        return this;
    }

    public EndPlayJson b(InterfaceC4660bih.o oVar) {
        this.aI = oVar != null ? new g(oVar) : null;
        return this;
    }

    public EndPlayJson b(long j2, long j3, long j4, long j5) {
        this.av = Long.valueOf(c(this.av, j2));
        this.as = Long.valueOf(c(this.as, j3));
        this.at = Long.valueOf(c(this.at, j4));
        this.an = Long.valueOf(c(this.an, j5));
        return this;
    }

    private static long c(Long l, long j2) {
        return l == null ? j2 : Math.max(l.longValue(), j2);
    }

    public void a(int i2, Format format, Format format2, long j2) {
        if (this.aR == null) {
            this.aR = new ArrayList();
        }
        C4788bmW c4788bmW = new C4788bmW(i2, j2);
        c4788bmW.a(Integer.valueOf(format.bitrate / 1000)).c(Integer.valueOf(format2.bitrate / 1000));
        if (i2 == 2) {
            c4788bmW.b(Integer.valueOf(C4584bhK.d(format))).e(Integer.valueOf(C4584bhK.d(format2)));
        }
        this.aR.add(c4788bmW);
    }

    public EndPlayJson b(boolean z) {
        this.aV = Boolean.valueOf(z);
        return this;
    }

    /* loaded from: classes3.dex */
    public static class e {
        @SerializedName("cdnid")
        protected Integer a;
        @SerializedName("tm")
        protected Long c;
        @SerializedName("avtp")
        protected Long d;
        @SerializedName("pbcid")
        protected String e;

        public e(String str, int i, long j, long j2) {
            this.e = str;
            this.a = Integer.valueOf(i);
            this.d = Long.valueOf(j);
            this.c = Long.valueOf(j2);
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        @SerializedName("cdnid")
        protected int a;
        @SerializedName("dls")
        protected List<d> d = new CopyOnWriteArrayList();
        @SerializedName("pbcid")
        protected String e;

        public a(int i, String str) {
            this.a = i;
            this.e = str;
        }

        public void a(InterfaceC4610bhk.b bVar, long j) {
            d dVar;
            Iterator<d> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                dVar = it.next();
                if (TextUtils.equals(dVar.d, bVar.d)) {
                    break;
                }
            }
            if (dVar == null) {
                dVar = new d(bVar);
                this.d.add(dVar);
            }
            dVar.c += j;
        }
    }

    /* loaded from: classes3.dex */
    public static class d {
        @SerializedName("bitrate")
        protected long a;
        @SerializedName("sdlid")
        protected String b;
        @SerializedName("tm")
        protected long c;
        @SerializedName("dlid")
        protected String d;
        @SerializedName("adlid")
        protected String e;

        public d(InterfaceC4610bhk.b bVar) {
            int i = bVar.b;
            if (i == 1) {
                this.e = bVar.d;
            } else if (i == 2) {
                this.d = bVar.d;
            } else if (i == 3) {
                this.b = bVar.d;
            }
            this.a = bVar.a / 1000;
        }
    }

    /* loaded from: classes3.dex */
    public static class f {
        @SerializedName("Cell")
        protected Integer a;
        @SerializedName("ms")
        protected long b;
        @SerializedName("Expensive")
        protected long c;
        @SerializedName("Online")
        protected int d;
        @SerializedName("soffms")
        protected long e;
        @SerializedName("Wifi")
        protected Integer f;

        public f(long j, long j2, CurrentNetworkInfo currentNetworkInfo) {
            this.e = j2;
            this.b = j2 - j;
            if (currentNetworkInfo == null || currentNetworkInfo.j() == CurrentNetworkInfo.NetType.NONE) {
                this.d = 0;
                return;
            }
            this.d = 1;
            this.c = AnonymousClass2.b[currentNetworkInfo.g().ordinal()] != 1 ? 0L : 1L;
            int i = AnonymousClass2.d[currentNetworkInfo.j().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                this.a = 1;
            } else if (i != 4) {
            } else {
                this.f = 1;
            }
        }
    }

    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CurrentNetworkInfo.NetType.values().length];
            d = iArr;
            try {
                iArr[CurrentNetworkInfo.NetType.GSM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[CurrentNetworkInfo.NetType.CDMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[CurrentNetworkInfo.NetType.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[CurrentNetworkInfo.NetType.WIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[CurrentNetworkInfo.MeteredState.values().length];
            b = iArr2;
            try {
                iArr2[CurrentNetworkInfo.MeteredState.METERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[PlayerStateMachine.State.values().length];
            a = iArr3;
            try {
                iArr3[PlayerStateMachine.State.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[PlayerStateMachine.State.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[PlayerStateMachine.State.TIMEDTEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[PlayerStateMachine.State.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[PlayerStateMachine.State.REBUFFERING.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[PlayerStateMachine.State.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[PlayerStateMachine.State.SEEKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[PlayerStateMachine.State.SKIPPING.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[PlayerStateMachine.State.TRANSITIONING_SEGMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j {
        @SerializedName("dist")
        protected c[] a;
        @SerializedName("nettype")
        protected CurrentNetworkInfo.NetType e;

        public CurrentNetworkInfo.NetType d() {
            return this.e;
        }

        public j(CurrentNetworkInfo.NetType netType, c[] cVarArr) {
            this.e = netType;
            this.a = cVarArr;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends i {
        @SerializedName("netspec")
        protected CurrentNetworkInfo.NetSpec b;

        public c(CurrentNetworkInfo.NetSpec netSpec, long j, long j2) {
            super(j, j2);
            this.b = netSpec;
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends i {
        @SerializedName("state")
        protected CurrentNetworkInfo.MeteredState e;

        public b(CurrentNetworkInfo.MeteredState meteredState, long j, long j2) {
            super(j, j2);
            this.e = meteredState;
        }
    }

    /* loaded from: classes3.dex */
    protected static class i {
        @SerializedName("bytes")
        protected Long c;
        @SerializedName("tm")
        protected Long d;

        public i(long j, long j2) {
            this.d = Long.valueOf(j);
            this.c = Long.valueOf(j2);
        }
    }

    /* loaded from: classes3.dex */
    public static class g {
        @SerializedName("lasat")
        protected long a;
        @SerializedName("vsb")
        protected int b;
        @SerializedName("vsa")
        protected int c;
        @SerializedName("asb")
        protected int d;
        @SerializedName("asa")
        protected int e;
        @SerializedName("vsbt")
        protected List<Long> g;
        @SerializedName("asbt")
        protected List<Long> h;
        @SerializedName("lvsat")
        protected long i;

        public g(InterfaceC4660bih.o oVar) {
            this.a = 0L;
            this.i = 0L;
            this.c = oVar.d;
            this.e = oVar.b;
            this.b = oVar.e;
            this.d = oVar.a;
            this.a = oVar.c;
            this.i = oVar.h;
            this.h = oVar.j;
            this.g = oVar.i;
        }
    }

    /* loaded from: classes3.dex */
    public static class h {
        @SerializedName("frameRate")
        protected Integer a;
        @SerializedName("averagetime")
        protected Integer b;
        @SerializedName("maxaveragetime")
        protected Integer c;
        @SerializedName("highProcessTimeOccurrence")
        protected Integer d;
        @SerializedName("highAverageTimeOccurrence")
        protected Integer e;
        @SerializedName("maxcontinousrendrop")
        protected Integer f;
        @SerializedName("maxaveragetimeindex")
        protected Integer g;
        @SerializedName("maxtimeindex")
        protected Integer h;
        @SerializedName("maxtime")
        protected Integer i;
        @SerializedName("maxTimeOutOfSync")
        protected Integer j;
        @SerializedName("numrendrop")
        protected Integer k;
        @SerializedName("numskip")
        protected Integer l;
        @SerializedName("numren")
        protected Integer m;
        @SerializedName("numdec")
        protected Integer n;
        @SerializedName("numskipkey")

        /* renamed from: o  reason: collision with root package name */
        protected Integer f13223o;
        @SerializedName("videoLagMaxDelta")
        protected List<Long> p;
        @SerializedName("videoLagConsective")
        private List<Integer> q;
        @SerializedName("outOfSync")
        protected Integer r;
        @SerializedName("videoLagPosition")
        protected List<Long> t;

        public h(DecoderCounters decoderCounters) {
            if (decoderCounters != null) {
                decoderCounters.ensureUpdated();
                this.f = Integer.valueOf(decoderCounters.maxConsecutiveDroppedBufferCount);
                this.l = Integer.valueOf(decoderCounters.skippedOutputBufferCount);
                this.k = Integer.valueOf(decoderCounters.droppedBufferCount);
                this.m = Integer.valueOf(decoderCounters.renderedOutputBufferCount);
                this.n = Integer.valueOf(decoderCounters.queuedInputBufferCount);
                this.f13223o = Integer.valueOf(decoderCounters.droppedToKeyframeCount);
                if (decoderCounters instanceof C4443bec) {
                    C4443bec c4443bec = (C4443bec) decoderCounters;
                    this.b = Integer.valueOf(c4443bec.c);
                    this.i = Integer.valueOf(c4443bec.i);
                    this.h = Integer.valueOf(c4443bec.g);
                    this.c = Integer.valueOf(c4443bec.a);
                    this.g = Integer.valueOf(c4443bec.j);
                    this.e = Integer.valueOf(c4443bec.b);
                    this.d = Integer.valueOf(c4443bec.d);
                    this.r = Integer.valueOf(c4443bec.f);
                    this.j = Integer.valueOf(c4443bec.h);
                    this.a = Integer.valueOf(c4443bec.e);
                    this.t = c4443bec.n;
                    this.p = c4443bec.m;
                    this.q = c4443bec.k;
                }
            }
        }
    }

    public EndPlayJson c(List<Long> list) {
        if (list.size() > 0) {
            this.ad = new ArrayList(list);
        }
        return this;
    }

    public EndPlayJson b(C4343bci c4343bci) {
        boolean z = false;
        if (c4343bci != null && c4343bci.a(false)) {
            z = true;
        }
        this.aq = z;
        return this;
    }

    public EndPlayJson b(C4790bmY c4790bmY) {
        if (this.aS == null) {
            this.aS = new CopyOnWriteArrayList();
        }
        this.aS.add(c4790bmY);
        return this;
    }

    public EndPlayJson e(C4822bnD c4822bnD) {
        if (this.ba == null) {
            this.ba = new CopyOnWriteArrayList();
        }
        this.ba.add(c4822bnD);
        return this;
    }

    public EndPlayJson e(C4825bnG c4825bnG) {
        if (this.aY == null) {
            this.aY = new CopyOnWriteArrayList();
        }
        this.aY.add(c4825bnG);
        return this;
    }

    public EndPlayJson d(C4825bnG c4825bnG) {
        if (this.aX == null) {
            this.aX = new CopyOnWriteArrayList();
        }
        this.aX.add(c4825bnG);
        return this;
    }
}
