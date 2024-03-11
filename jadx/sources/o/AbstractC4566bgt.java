package o;

import android.os.SystemClock;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.NccpAudioSource;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.RecommendedMediaData;
import com.netflix.mediaclient.media.SubtitleTrackData;
import com.netflix.mediaclient.media.SubtitleTrackDataImpl;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.ManifestLimitedLicense;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.media.subtitles.NccpSubtitle;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.C4489bfV;
import org.json.JSONObject;

/* renamed from: o.bgt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4566bgt implements InterfaceC4525bgE {
    private transient PlayerPrefetchSource a;
    private transient PlayerManifestData b;
    private transient a c;
    private transient int d;
    private transient long e = B();

    @SerializedName("viewableType")
    public abstract String A();

    @SerializedName("video_tracks")
    public abstract List<VideoTrack> C();

    @SerializedName("watermarkInfo")
    public abstract Watermark D();

    public long O() {
        return this.e;
    }

    @SerializedName("auxiliaryManifests")
    public abstract List<AbstractC4566bgt> a();

    @Override // o.InterfaceC4525bgE
    public PlayerPrefetchSource ah() {
        return this.a;
    }

    @SerializedName("cdnResponseData")
    public abstract AbstractC4554bgh b();

    @SerializedName("auxiliaryManifestToken")
    public abstract String c();

    @Override // o.InterfaceC4525bgE
    public void c(PlayerPrefetchSource playerPrefetchSource) {
        this.a = playerPrefetchSource;
    }

    @SerializedName("audio_tracks")
    public abstract List<AbstractC4472bfE> d();

    @SerializedName("adverts")
    public abstract AbstractC4473bfF e();

    @Override // o.InterfaceC4525bgE
    @SerializedName("choiceMap")
    public abstract AbstractC4556bgj f();

    @SerializedName("duration")
    public abstract long g();

    @SerializedName("defaultTrackOrderList")
    public abstract List<AbstractC4562bgp> h();

    @SerializedName("eligibleABTests")
    public abstract Map<String, String> i();

    @Override // o.InterfaceC4525bgE
    @SerializedName("contentPlaygraph")
    public abstract AbstractC4558bgl j();

    @SerializedName("locations")
    public abstract List<Location> k();

    @SerializedName("expiration")
    public abstract long l();

    @SerializedName("isAd")
    public abstract Boolean m();

    @Override // o.InterfaceC4525bgE
    @SerializedName("liveMetadata")
    public abstract LiveMetadata n();

    @SerializedName("links")
    public abstract AbstractC4564bgr o();

    @SerializedName("maxRecommendedAudioRank")
    public abstract Integer p();

    @SerializedName("maxRecommendedTextRank")
    public abstract Integer q();

    @Override // o.InterfaceC4525bgE
    @SerializedName("timestamp")
    public abstract long r();

    @SerializedName("movieId")
    public abstract long s();

    @SerializedName("media")
    public abstract List<AbstractC4567bgu> t();

    @SerializedName("servers")
    public abstract List<AbstractC4534bgN> u();

    @SerializedName("recommendedMedia")
    public abstract AbstractC4530bgJ v();

    @SerializedName("playbackContextId")
    public abstract String w();

    @Override // o.InterfaceC4525bgE
    @SerializedName("steeringAdditionalInfo")
    public abstract AbstractC4532bgL x();

    @Override // o.InterfaceC4525bgE
    @SerializedName("timedtexttracks")
    public abstract List<AbstractC4537bgQ> y();

    @Override // o.InterfaceC4525bgE
    @SerializedName("trickplays")
    public abstract List<AbstractC4541bgU> z();

    public static TypeAdapter<AbstractC4566bgt> e(Gson gson) {
        return new C4489bfV.d(gson).a(SystemClock.elapsedRealtime()).e(Collections.emptyList()).c(Collections.emptyList()).d(Collections.emptyList()).a(Collections.emptyList()).b(Collections.emptyList()).c(Boolean.FALSE);
    }

    public static AbstractC4566bgt a(long j, List<AbstractC4537bgQ> list, List<AbstractC4567bgu> list2, AbstractC4554bgh abstractC4554bgh, long j2, List<AbstractC4541bgU> list3, List<AbstractC4472bfE> list4, List<VideoTrack> list5, AbstractC4564bgr abstractC4564bgr, List<AbstractC4562bgp> list6, String str, long j3, Watermark watermark, long j4, AbstractC4556bgj abstractC4556bgj, List<AbstractC4534bgN> list7, List<Location> list8, byte[] bArr, String str2, String str3, AbstractC4561bgo abstractC4561bgo, JSONObject jSONObject, AbstractC4530bgJ abstractC4530bgJ, int i, int i2) {
        C4489bfV c4489bfV = new C4489bfV(j, list, list2, abstractC4554bgh, j2, list3, list4, list5, abstractC4564bgr, list6, str, j3, watermark, j4, abstractC4556bgj, list7, list8, null, abstractC4530bgJ, Integer.valueOf(i), Integer.valueOf(i2), null, null, null, null, null, null, Boolean.FALSE, null);
        a aVar = new a();
        ((AbstractC4566bgt) c4489bfV).c = aVar;
        aVar.e = bArr;
        ((AbstractC4566bgt) c4489bfV).c.c = str2;
        ((AbstractC4566bgt) c4489bfV).c.b = str3;
        ((AbstractC4566bgt) c4489bfV).c.a = abstractC4561bgo;
        ((AbstractC4566bgt) c4489bfV).c.d = jSONObject;
        return c4489bfV;
    }

    public long I() {
        return at() ? 900000L : 7200000L;
    }

    @Override // o.InterfaceC4525bgE
    public Long aa() {
        return Long.valueOf(s());
    }

    @Override // o.InterfaceC4525bgE
    public byte[] R() {
        for (VideoTrack videoTrack : C()) {
            AbstractC4560bgn drmHeader = videoTrack.drmHeader();
            if (drmHeader != null) {
                return drmHeader.e();
            }
        }
        return null;
    }

    @Override // o.InterfaceC4525bgE
    public String ac() {
        return w();
    }

    @Override // o.InterfaceC4525bgE
    public String Y() {
        AbstractC4554bgh b = b();
        if (b != null) {
            return b.d();
        }
        return null;
    }

    @Override // o.InterfaceC4525bgE
    public boolean at() {
        return R() != null;
    }

    @Override // o.InterfaceC4525bgE
    public long P() {
        return g();
    }

    @Override // o.InterfaceC4525bgE
    public AudioSubtitleDefaultOrderInfo[] G() {
        if (h() == null) {
            return null;
        }
        int size = h().size();
        AudioSubtitleDefaultOrderInfo[] audioSubtitleDefaultOrderInfoArr = new AudioSubtitleDefaultOrderInfo[size];
        for (int i = 0; i < size; i++) {
            audioSubtitleDefaultOrderInfoArr[i] = new AudioSubtitleDefaultOrderInfo(h().get(i), r());
        }
        return audioSubtitleDefaultOrderInfoArr;
    }

    @Override // o.InterfaceC4525bgE
    public RecommendedMediaData ag() {
        if (v() != null) {
            return new RecommendedMediaData(v().a(), v().c(), v().b(), r());
        }
        return null;
    }

    @Override // o.InterfaceC4525bgE
    public int T() {
        if (p() != null) {
            return p().intValue();
        }
        return 0;
    }

    @Override // o.InterfaceC4525bgE
    public int Z() {
        if (q() != null) {
            return q().intValue();
        }
        return 0;
    }

    @Override // o.InterfaceC4525bgE
    public PlayerManifestData V() {
        AbstractC4472bfE abstractC4472bfE;
        if (this.b == null) {
            String contentProfile = (d() == null || d().isEmpty() || (abstractC4472bfE = d().get(0)) == null || abstractC4472bfE.q() == null || abstractC4472bfE.q().isEmpty()) ? null : abstractC4472bfE.q().get(0).contentProfile();
            if (C() != null && !C().isEmpty()) {
                VideoTrack videoTrack = C().get(0);
                this.b = new PlayerManifestData(aa().longValue(), g(), aB(), c(videoTrack.profile()) ? 10000 : 2000, contentProfile, videoTrack.profile(), videoTrack.flavor(), C(), (ax() == null || F() == null) ? false : true, n() != null ? !n().b() : false);
                C1044Mm.e("nf_manifest", "LiveMetaData:" + n());
            }
        }
        return this.b;
    }

    @Override // o.InterfaceC4525bgE
    public List<VideoTrack> an() {
        C1044Mm.e("nf_manifest", "getVideoTracks");
        if (this.d > 0) {
            ArrayList arrayList = new ArrayList();
            for (VideoTrack videoTrack : C()) {
                if (videoTrack.maxHeight() <= this.d) {
                    arrayList.add(videoTrack);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Stream stream : videoTrack.streams()) {
                        if (stream.resH() <= this.d) {
                            arrayList2.add(stream);
                        }
                    }
                    arrayList.add(videoTrack.toBuilder().streams(arrayList2).build());
                }
            }
            return arrayList;
        }
        return C();
    }

    @Override // o.InterfaceC4525bgE
    public List<AbstractC4534bgN> aj() {
        return u();
    }

    @Override // o.InterfaceC4525bgE
    public List<Location> W() {
        return k();
    }

    @Override // o.InterfaceC4525bgE
    public List<AbstractC4472bfE> N() {
        return d();
    }

    @Override // o.InterfaceC4525bgE
    public List<AbstractC4537bgQ> ai() {
        return y();
    }

    @Override // o.InterfaceC4525bgE
    public List<AbstractC4562bgp> L() {
        return h();
    }

    @Override // o.InterfaceC4525bgE
    public List<AbstractC4567bgu> ab() {
        return t();
    }

    @Override // o.InterfaceC4525bgE
    public Subtitle[] am() {
        int size = y().size();
        Subtitle[] subtitleArr = new Subtitle[size];
        for (int i = 0; i < size; i++) {
            subtitleArr[i] = NccpSubtitle.newInstance(y().get(i), i);
        }
        return subtitleArr;
    }

    @Override // o.InterfaceC4525bgE
    public List<SubtitleTrackData> ak() {
        ArrayList arrayList = new ArrayList(y().size());
        for (int i = 0; i < y().size(); i++) {
            arrayList.add(new SubtitleTrackDataImpl(y().get(i), i));
        }
        return arrayList;
    }

    @Override // o.InterfaceC4525bgE
    public C4540bgT[] ao() {
        int size = z().size();
        C4540bgT[] c4540bgTArr = new C4540bgT[size];
        for (int i = 0; i < size; i++) {
            c4540bgTArr[i] = new C4540bgT(z().get(i));
        }
        return c4540bgTArr;
    }

    @Override // o.InterfaceC4525bgE
    public AudioSource[] M() {
        int size = d().size();
        AudioSource[] audioSourceArr = new AudioSource[size];
        for (int i = 0; i < size; i++) {
            audioSourceArr[i] = NccpAudioSource.newInstance(d().get(i), i, true);
        }
        return audioSourceArr;
    }

    @Override // o.InterfaceC4525bgE
    public String ad() {
        for (VideoTrack videoTrack : C()) {
            if (videoTrack.flavor() != null) {
                return videoTrack.flavor();
            }
        }
        return null;
    }

    @Override // o.InterfaceC4525bgE
    public String aq() {
        for (VideoTrack videoTrack : C()) {
            if (videoTrack.profile() != null) {
                return videoTrack.profile();
            }
        }
        return null;
    }

    @Override // o.InterfaceC4525bgE
    public boolean aw() {
        return B() >= this.e;
    }

    @Override // o.InterfaceC4525bgE
    public long al() {
        return this.e - B();
    }

    public int ae() {
        PlayerPrefetchSource playerPrefetchSource = this.a;
        if (playerPrefetchSource != null) {
            return playerPrefetchSource.b();
        }
        return Integer.MAX_VALUE;
    }

    @Override // o.InterfaceC4525bgE
    public long X() {
        return l();
    }

    private String[] aB() {
        List<VideoTrack> an = an();
        HashSet hashSet = new HashSet();
        for (Stream stream : an.get(0).streams()) {
            hashSet.add(Integer.valueOf(stream.bitrate()));
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        String[] strArr = new String[hashSet.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = ((Integer) arrayList.get(i)).toString();
        }
        return strArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(InterfaceC4525bgE interfaceC4525bgE) {
        if (interfaceC4525bgE instanceof AbstractC4566bgt) {
            AbstractC4566bgt abstractC4566bgt = (AbstractC4566bgt) interfaceC4525bgE;
            int ae = ae() - abstractC4566bgt.ae();
            if (ae != 0) {
                return ae > 0 ? -1 : 1;
            }
            int i = ((O() - abstractC4566bgt.O()) > 0L ? 1 : ((O() - abstractC4566bgt.O()) == 0L ? 0 : -1));
            if (i != 0) {
                return i > 0 ? 1 : -1;
            }
            return 0;
        }
        return 0;
    }

    @Override // o.InterfaceC4525bgE
    public String S() {
        if (o().a() == null) {
            return null;
        }
        return o().a().d();
    }

    @Override // o.InterfaceC4525bgE
    public String Q() {
        if (o().e() == null) {
            return null;
        }
        return o().e().d();
    }

    @Override // o.InterfaceC4525bgE
    public AbstractC4564bgr U() {
        return o();
    }

    @Override // o.InterfaceC4525bgE
    public Watermark ar() {
        return D();
    }

    private boolean c(String str) {
        str.hashCode();
        return str.equals("VP9") || str.equals("AVC-HP");
    }

    @Override // o.InterfaceC4525bgE
    public StreamProfileType ap() {
        StreamProfileType c;
        for (VideoTrack videoTrack : C()) {
            String flavor = videoTrack.flavor();
            if (flavor == null || !flavor.equals("cmaf-live")) {
                flavor = videoTrack.profile();
            }
            if (flavor != null && (c = C4327bcS.c(flavor)) != null && c != StreamProfileType.i) {
                return c;
            }
        }
        return StreamProfileType.c;
    }

    @Override // o.InterfaceC4525bgE
    public PlaylistMap af() {
        if (f() != null) {
            return C4527bgG.c(f(), g());
        }
        return null;
    }

    @Override // o.InterfaceC4525bgE
    public byte[] ay() {
        a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        return aVar.e;
    }

    @Override // o.InterfaceC4525bgE
    public String ax() {
        a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        return aVar.c;
    }

    @Override // o.InterfaceC4525bgE
    public String F() {
        a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    @Override // o.InterfaceC4525bgE
    public String E() {
        a aVar = this.c;
        if (aVar == null || aVar.a == null) {
            return null;
        }
        return this.c.a.d();
    }

    public void b(long j) {
        if (j == -1) {
            j = B() + I();
        }
        this.e = j;
    }

    @Override // o.InterfaceC4525bgE
    public ManifestLimitedLicense as() {
        for (VideoTrack videoTrack : C()) {
            if (videoTrack.license() != null) {
                return videoTrack.license();
            }
        }
        return null;
    }

    @Override // o.InterfaceC4525bgE
    public List<? extends InterfaceC4525bgE> J() {
        return a();
    }

    @Override // o.InterfaceC4525bgE
    public String K() {
        return c();
    }

    public static long B() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bgt$a */
    /* loaded from: classes.dex */
    public static final class a {
        private AbstractC4561bgo a;
        private String b;
        private String c;
        private JSONObject d;
        private byte[] e;

        private a() {
        }
    }

    @Override // o.InterfaceC4525bgE
    public AbstractC4473bfF H() {
        return e();
    }

    @Override // o.InterfaceC4525bgE
    public boolean av() {
        return m().booleanValue();
    }

    @Override // o.InterfaceC4525bgE
    public boolean au() {
        return "SUPPLEMENTAL".equalsIgnoreCase(A());
    }

    @Override // o.InterfaceC4525bgE
    public boolean az() {
        return (e() == null || e().b().isEmpty()) ? false : true;
    }

    @Override // o.InterfaceC4525bgE
    public InterfaceC4525bgE d(List<AbstractC4534bgN> list, List<Location> list2) {
        return new C4489bfV(s(), ai(), t(), b(), g(), z(), d(), C(), o(), h(), w(), r(), D(), O(), f(), list, list2, i(), v(), p(), q(), j(), a(), c(), e(), A(), n(), m(), x());
    }
}
