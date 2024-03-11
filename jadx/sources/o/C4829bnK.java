package o;

import android.text.TextUtils;
import androidx.media3.common.Format;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.DownloadableJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC4660bih;
import o.InterfaceC4661bii;
import o.InterfaceC4776bmK;

/* renamed from: o.bnK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4829bnK extends BaseEventJson {
    @SerializedName("abitrate")
    protected Integer U;
    @SerializedName("asePlaybackAllowed")
    protected a V;
    @SerializedName("adlid")
    protected String W;
    @SerializedName("asePlaybackDenied")
    protected List<a> X;
    @SerializedName("cachehit")
    protected boolean Y;
    @SerializedName("cdnid")
    protected Integer Z;
    @SerializedName("actualbw")
    protected Long a;
    @SerializedName("isCharging")
    protected boolean aA;
    @SerializedName("initialAmbientLightValue")
    protected float aB;
    @SerializedName("manifestFetchedTimestamp")
    protected Long aC;
    @SerializedName("manifestCacheSource")
    protected String aD;
    @SerializedName("maxDisplayBrightness")
    protected int aE;
    @SerializedName("mcc")
    protected Integer aF;
    @SerializedName("manifestage")
    protected Long aG;
    @SerializedName("background_data")
    protected CurrentNetworkInfo.DataRestrictionState aH;
    @SerializedName("netcapabilities")
    protected List<String> aI;
    @SerializedName("netLinkDownstreamBandwidthKbps")
    protected Integer aJ;
    @SerializedName("mediaPerformanceClass")
    protected int aK;
    @SerializedName("mnc")
    protected Integer aL;
    @SerializedName("nettype")
    protected CurrentNetworkInfo.NetType aM;
    @SerializedName("pbcid")
    protected String aN;
    @SerializedName("netspec")
    protected CurrentNetworkInfo.NetSpec aO;
    @SerializedName("volume")
    protected int aP;
    @SerializedName("netvpn")
    protected Boolean aQ;
    @SerializedName("playerBrightnessValue")
    protected int aR;
    @SerializedName("playgraphTransition")
    protected boolean aS;
    @SerializedName("prefetchCompleted")
    protected boolean aT;
    @SerializedName("pipeline")
    protected boolean aU;
    @SerializedName("playdelay")
    protected Long aV;
    @SerializedName("rawVideoProfile")
    protected String aW;
    @SerializedName("recoveryError")
    public String aX;
    @SerializedName("sdlid")
    protected String aY;
    @SerializedName("recoveryAttempt")
    public Integer aZ;
    @SerializedName("auxViewables")
    protected List<Long> aa;
    @SerializedName("audioSinkType")
    protected String ab;
    @SerializedName("carrier")
    protected String ac;
    @SerializedName("cronetbw")
    protected Integer ad;
    @SerializedName("cronettcprtt")
    protected Integer ae;
    @SerializedName("clearplay")
    protected boolean af;
    @SerializedName("cronethttprtt")
    protected Integer ag;
    @SerializedName("cdnname")
    protected String ah;
    @SerializedName("deviceerrormap")
    protected C4344bcj ai;
    @SerializedName("deviceerrorstring")
    protected String aj;
    @SerializedName("deviceerrorcode")
    protected String ak;
    @SerializedName("errorcode")
    protected String al;
    @SerializedName("downloadables")
    protected List<DownloadableJson> am;
    @SerializedName("fullDlreports")
    protected Boolean an;
    @SerializedName("errormsg")
    protected String ao;
    @SerializedName("hasasereport")
    protected Boolean ap;
    @SerializedName("groupname")
    protected String aq;
    @SerializedName("errorstring")
    protected String ar;
    @SerializedName("histbw")
    protected Integer as;
    @SerializedName("histage")
    protected Integer at;
    @SerializedName("headerCacheDataVideo")
    protected long au;
    @SerializedName("headerCacheDataAudio")
    protected long av;
    @SerializedName("headerCacheHit")
    protected boolean aw;
    @SerializedName("invalidUiDelay")
    protected Boolean ax;
    @SerializedName("isBranching")
    protected Boolean ay;
    @SerializedName("locationid")
    protected String az;
    @SerializedName("playdelaysdk")
    protected Long ba;
    @SerializedName("trackid")
    protected Long bb;
    @SerializedName("eventlist")
    protected Map<String, Event> bc;
    @SerializedName("systemBrightnessValue")
    protected int bd;
    @SerializedName("subtitleprofile")
    protected String be;
    @SerializedName("usedldl")
    protected boolean bf;
    @SerializedName("vmaf")
    protected Integer bg;
    @SerializedName("vdlid")
    protected String bh;
    @SerializedName("videoStreamProfile")
    protected String bi;
    @SerializedName("effectiveDisplayBrightness")
    private int bj;
    @SerializedName("vbitrate")
    protected Integer bk;
    @SerializedName("uiLabel")
    private String bl;
    @SerializedName("hasContentPlaygraph")
    private Boolean bm;
    @SerializedName("histExp")
    private List bn;
    @SerializedName("adaptiveBrightnessEnabled")
    private boolean bo;
    @SerializedName("birthtime")
    private long bp;
    @SerializedName("closetime")
    private long bu;
    @SerializedName("aaflag")
    protected Boolean c;
    @SerializedName("actualbt")
    protected Long e;

    public C4829bnK a(int i) {
        this.bj = i;
        return this;
    }

    public C4829bnK a(long j) {
        this.bu = j;
        return this;
    }

    public void a() {
        this.ax = Boolean.TRUE;
    }

    public void a(Long l) {
        this.aG = l;
    }

    public C4829bnK b(float f) {
        this.aB = f;
        return this;
    }

    public C4829bnK b(String str) {
        this.ab = str;
        return this;
    }

    public void b(Boolean bool) {
        this.bm = bool;
    }

    public void b(List<Long> list) {
        this.aa = list;
    }

    public C4829bnK c(Long l) {
        this.e = l;
        return this;
    }

    public C4829bnK d(Long l) {
        this.a = l;
        return this;
    }

    public C4829bnK d(boolean z) {
        this.ay = z ? Boolean.TRUE : null;
        return this;
    }

    public void d(String str) {
        this.aD = str;
    }

    public C4829bnK e(int i) {
        this.aE = i;
        return this;
    }

    public C4829bnK e(Long l) {
        this.aV = l;
        return this;
    }

    public C4829bnK e(boolean z) {
        this.bo = z;
        return this;
    }

    public C4829bnK f(int i) {
        this.bd = i;
        return this;
    }

    public C4829bnK f(Long l) {
        this.ba = l;
        return this;
    }

    public C4829bnK f(String str) {
        this.aY = str;
        return this;
    }

    public void f(boolean z) {
        this.bf = z;
    }

    public C4829bnK g(int i) {
        this.aR = i;
        return this;
    }

    public C4829bnK g(String str) {
        this.aW = str;
        return this;
    }

    public C4829bnK h(int i) {
        this.aK = i;
        return this;
    }

    public C4829bnK h(String str) {
        this.bl = str;
        return this;
    }

    public C4829bnK h(boolean z) {
        this.aS = z;
        return this;
    }

    public void i(String str) {
        this.be = str;
    }

    public C4829bnK j(int i) {
        this.aP = i;
        return this;
    }

    public C4829bnK j(String str) {
        this.bi = str;
        return this;
    }

    protected C4829bnK() {
        this.am = new ArrayList();
        this.aU = false;
        this.aK = -1;
    }

    public C4829bnK(String str, String str2, String str3, String str4, String str5, long j) {
        super("startplay", str, str2, str3, str4, str5);
        this.am = new ArrayList();
        this.aU = false;
        this.aK = -1;
        if (C1869aRg.c()) {
            this.c = Boolean.TRUE;
        }
        this.bp = j;
    }

    public void e(long j) {
        this.bb = Long.valueOf(j);
    }

    public void e(InterfaceC4525bgE interfaceC4525bgE) {
        a(interfaceC4525bgE);
        this.aN = interfaceC4525bgE.Y();
        this.af = !interfaceC4525bgE.at();
        this.aC = Long.valueOf(interfaceC4525bgE.r());
    }

    public void a(InterfaceC4525bgE interfaceC4525bgE) {
        for (VideoTrack videoTrack : interfaceC4525bgE.an()) {
            for (Stream stream : videoTrack.streams()) {
                this.am.add(new DownloadableJson(DownloadableJson.Type.VIDEO, stream));
            }
        }
        for (AbstractC4472bfE abstractC4472bfE : interfaceC4525bgE.N()) {
            for (Stream stream2 : abstractC4472bfE.q()) {
                if (abstractC4472bfE.g()) {
                    this.am.add(new DownloadableJson(DownloadableJson.Type.AUDIO, stream2));
                }
            }
        }
    }

    public C4829bnK d(Format format) {
        if (C8168dfL.g(this.bh) && format != null) {
            d(2, format);
        }
        return this;
    }

    public C4829bnK e(Format format) {
        if (C8168dfL.g(this.W) && format != null) {
            d(1, format);
        }
        return this;
    }

    public C4829bnK d(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }

    public long c() {
        Long l = this.z;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public C4829bnK a(InterfaceC4660bih.e eVar) {
        if (eVar != null) {
            this.Z = Integer.valueOf(eVar.m);
            InterfaceC4660bih.d[] dVarArr = eVar.c;
            int length = dVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC4660bih.d dVar = dVarArr[i];
                if (this.Z.intValue() == dVar.b) {
                    this.ah = dVar.j;
                    this.az = dVar.f;
                    break;
                }
                i++;
            }
        }
        return this;
    }

    public void d(int i, Format format) {
        if (i == 2) {
            this.bh = format.id;
            this.bk = Integer.valueOf(format.bitrate / 1000);
            this.bg = Integer.valueOf(C4584bhK.d(format));
        } else if (i == 1) {
            this.W = format.id;
            this.U = Integer.valueOf(format.bitrate / 1000);
        }
    }

    public C4829bnK e(C4974bpx c4974bpx, InterfaceC4776bmK.e eVar) {
        if (c4974bpx == null) {
            a(BaseEventJson.b);
            this.al = null;
            this.ar = null;
            this.ak = null;
            this.aj = null;
            this.ao = null;
        } else {
            a(Logblob.Severity.error);
            this.al = c4974bpx.f();
            this.ar = c4974bpx.h();
            this.ak = c4974bpx.a();
            this.aj = c4974bpx.g();
            this.ao = c4974bpx.e();
            if (this.D == null) {
                this.D = c4974bpx.i();
            }
            C4344bcj.a().b(this.al);
            this.ai = C4344bcj.a();
            d(eVar);
        }
        return this;
    }

    public void i() {
        C4344bcj a2 = C4344bcj.a();
        if (a2 == null || a2.c() <= 0) {
            return;
        }
        this.ai = C4344bcj.a();
    }

    public C4829bnK a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "control";
        }
        this.aq = str;
        return this;
    }

    public C4829bnK a(InterfaceC4661bii.e eVar) {
        if (eVar != null) {
            this.as = eVar.d;
            this.at = eVar.b;
            if (eVar.a != null) {
                if (this.bn == null) {
                    this.bn = new ArrayList();
                }
                for (InterfaceC4661bii.c cVar : eVar.a) {
                    this.bn.add(new C4836bnR(cVar));
                }
            }
        }
        return this;
    }

    public void c(Boolean bool) {
        this.Y = bool.booleanValue();
    }

    public void c(boolean z, long j, long j2) {
        boolean z2 = false;
        this.aw = this.aw || z;
        if (z) {
            this.av = Math.max(j, this.av);
            this.au = Math.max(j2, this.au);
            if (this.aT || (j > 0 && j2 > 0 && this.Y)) {
                z2 = true;
            }
            this.aT = z2;
        }
    }

    public C4829bnK a(Map<String, Event> map, C4831bnM c4831bnM) {
        this.bc = new HashMap(map.size());
        for (Map.Entry<String, Event> entry : map.entrySet()) {
            this.bc.put(entry.getKey(), entry.getValue().b(c4831bnM));
        }
        return this;
    }

    public void a(CurrentNetworkInfo currentNetworkInfo) {
        this.ac = currentNetworkInfo.e();
        this.aF = currentNetworkInfo.b();
        this.aL = currentNetworkInfo.h();
        this.aM = currentNetworkInfo.j();
        this.aO = currentNetworkInfo.f();
        this.aH = currentNetworkInfo.c();
        this.aI = currentNetworkInfo.a();
        this.aJ = currentNetworkInfo.d();
        this.aQ = Boolean.valueOf(currentNetworkInfo.i());
    }

    public C4829bnK d(long j) {
        c(j);
        return this;
    }

    public C4829bnK b(boolean z) {
        this.an = Boolean.valueOf(z);
        return this;
    }

    public C4829bnK a(boolean z) {
        this.ap = Boolean.valueOf(z);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r2.a(true) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C4829bnK e(o.C4343bci r2) {
        /*
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            r1.aA = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4829bnK.e(o.bci):o.bnK");
    }

    public C4829bnK e(C4974bpx c4974bpx, int i) {
        this.aZ = Integer.valueOf(i);
        this.aX = c4974bpx != null ? c4974bpx.c() : "unknown";
        return this;
    }

    public void c(int i) {
        this.ad = Integer.valueOf(i);
    }

    public void b(int i) {
        this.ag = Integer.valueOf(i);
    }

    public void d(int i) {
        this.ae = Integer.valueOf(i);
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson
    public boolean e() {
        return d() == Logblob.Severity.error || Boolean.TRUE.equals(this.q);
    }

    public C4829bnK d(long j, long j2, long j3, String str, long j4) {
        this.V = new a(j, j2, j3, str, j4);
        return this;
    }

    public C4829bnK e(long j, long j2, long j3, String str, long j4) {
        if (this.X == null) {
            this.X = new ArrayList();
        }
        this.X.add(new a(j, j2, j3, str, j4));
        return this;
    }

    /* renamed from: o.bnK$a */
    /* loaded from: classes3.dex */
    public static class a {
        @SerializedName("soffms")
        public long a;
        @SerializedName("required")
        public long b;
        @SerializedName("d")
        public String c;
        @SerializedName("buflmsec")
        public long d;
        @SerializedName("bw")
        public long e;

        public a(long j, long j2, long j3, String str, long j4) {
            this.a = j;
            this.d = j2;
            this.b = j3;
            this.e = j4;
            this.c = str;
        }
    }
}
