package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4501bfh extends AbstractC4566bgt {
    private final Watermark B;
    private final String C;
    private final List<VideoTrack> D;
    private final String a;
    private final List<AbstractC4566bgt> b;
    private final AbstractC4554bgh c;
    private final List<AbstractC4472bfE> d;
    private final AbstractC4473bfF e;
    private final long f;
    private final AbstractC4556bgj g;
    private final Map<String, String> h;
    private final AbstractC4558bgl i;
    private final List<AbstractC4562bgp> j;
    private final LiveMetadata k;
    private final long l;
    private final AbstractC4564bgr m;
    private final Boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Location> f13587o;
    private final Integer p;
    private final long q;
    private final Integer r;
    private final long s;
    private final List<AbstractC4567bgu> t;
    private final List<AbstractC4534bgN> u;
    private final AbstractC4532bgL v;
    private final AbstractC4530bgJ w;
    private final String x;
    private final List<AbstractC4537bgQ> y;
    private final List<AbstractC4541bgU> z;

    @Override // o.AbstractC4566bgt
    @SerializedName("viewableType")
    public String A() {
        return this.C;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("video_tracks")
    public List<VideoTrack> C() {
        return this.D;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("watermarkInfo")
    public Watermark D() {
        return this.B;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("auxiliaryManifests")
    public List<AbstractC4566bgt> a() {
        return this.b;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("cdnResponseData")
    public AbstractC4554bgh b() {
        return this.c;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("auxiliaryManifestToken")
    public String c() {
        return this.a;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("audio_tracks")
    public List<AbstractC4472bfE> d() {
        return this.d;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("adverts")
    public AbstractC4473bfF e() {
        return this.e;
    }

    @Override // o.AbstractC4566bgt, o.InterfaceC4525bgE
    @SerializedName("choiceMap")
    public AbstractC4556bgj f() {
        return this.g;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("duration")
    public long g() {
        return this.f;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("defaultTrackOrderList")
    public List<AbstractC4562bgp> h() {
        return this.j;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("eligibleABTests")
    public Map<String, String> i() {
        return this.h;
    }

    @Override // o.AbstractC4566bgt, o.InterfaceC4525bgE
    @SerializedName("contentPlaygraph")
    public AbstractC4558bgl j() {
        return this.i;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("locations")
    public List<Location> k() {
        return this.f13587o;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("expiration")
    public long l() {
        return this.l;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("isAd")
    public Boolean m() {
        return this.n;
    }

    @Override // o.AbstractC4566bgt, o.InterfaceC4525bgE
    @SerializedName("liveMetadata")
    public LiveMetadata n() {
        return this.k;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("links")
    public AbstractC4564bgr o() {
        return this.m;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("maxRecommendedAudioRank")
    public Integer p() {
        return this.r;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("maxRecommendedTextRank")
    public Integer q() {
        return this.p;
    }

    @Override // o.AbstractC4566bgt, o.InterfaceC4525bgE
    @SerializedName("timestamp")
    public long r() {
        return this.q;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("movieId")
    public long s() {
        return this.s;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("media")
    public List<AbstractC4567bgu> t() {
        return this.t;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("servers")
    public List<AbstractC4534bgN> u() {
        return this.u;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("recommendedMedia")
    public AbstractC4530bgJ v() {
        return this.w;
    }

    @Override // o.AbstractC4566bgt
    @SerializedName("playbackContextId")
    public String w() {
        return this.x;
    }

    @Override // o.AbstractC4566bgt, o.InterfaceC4525bgE
    @SerializedName("steeringAdditionalInfo")
    public AbstractC4532bgL x() {
        return this.v;
    }

    @Override // o.AbstractC4566bgt, o.InterfaceC4525bgE
    @SerializedName("timedtexttracks")
    public List<AbstractC4537bgQ> y() {
        return this.y;
    }

    @Override // o.AbstractC4566bgt, o.InterfaceC4525bgE
    @SerializedName("trickplays")
    public List<AbstractC4541bgU> z() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4501bfh(long j, List<AbstractC4537bgQ> list, List<AbstractC4567bgu> list2, AbstractC4554bgh abstractC4554bgh, long j2, List<AbstractC4541bgU> list3, List<AbstractC4472bfE> list4, List<VideoTrack> list5, AbstractC4564bgr abstractC4564bgr, List<AbstractC4562bgp> list6, String str, long j3, Watermark watermark, long j4, AbstractC4556bgj abstractC4556bgj, List<AbstractC4534bgN> list7, List<Location> list8, Map<String, String> map, AbstractC4530bgJ abstractC4530bgJ, Integer num, Integer num2, AbstractC4558bgl abstractC4558bgl, List<AbstractC4566bgt> list9, String str2, AbstractC4473bfF abstractC4473bfF, String str3, LiveMetadata liveMetadata, Boolean bool, AbstractC4532bgL abstractC4532bgL) {
        this.s = j;
        if (list == null) {
            throw new NullPointerException("Null timedtexttracks");
        }
        this.y = list;
        this.t = list2;
        this.c = abstractC4554bgh;
        this.f = j2;
        if (list3 == null) {
            throw new NullPointerException("Null trickplays");
        }
        this.z = list3;
        if (list4 == null) {
            throw new NullPointerException("Null audioTracks");
        }
        this.d = list4;
        if (list5 == null) {
            throw new NullPointerException("Null videoTracks");
        }
        this.D = list5;
        if (abstractC4564bgr == null) {
            throw new NullPointerException("Null links");
        }
        this.m = abstractC4564bgr;
        this.j = list6;
        if (str == null) {
            throw new NullPointerException("Null playbackContextId");
        }
        this.x = str;
        this.q = j3;
        this.B = watermark;
        this.l = j4;
        this.g = abstractC4556bgj;
        if (list7 == null) {
            throw new NullPointerException("Null servers");
        }
        this.u = list7;
        if (list8 == null) {
            throw new NullPointerException("Null locations");
        }
        this.f13587o = list8;
        this.h = map;
        this.w = abstractC4530bgJ;
        this.r = num;
        this.p = num2;
        this.i = abstractC4558bgl;
        this.b = list9;
        this.a = str2;
        this.e = abstractC4473bfF;
        this.C = str3;
        this.k = liveMetadata;
        this.n = bool;
        this.v = abstractC4532bgL;
    }

    public String toString() {
        return "NfManifest{movieId=" + this.s + ", timedtexttracks=" + this.y + ", media=" + this.t + ", cdnResponseData=" + this.c + ", duration=" + this.f + ", trickplays=" + this.z + ", audioTracks=" + this.d + ", videoTracks=" + this.D + ", links=" + this.m + ", defaultTrackOrderList=" + this.j + ", playbackContextId=" + this.x + ", manifestFetchedTime=" + this.q + ", watermark=" + this.B + ", expiryTimeInEndPointTime=" + this.l + ", choiceMap=" + this.g + ", servers=" + this.u + ", locations=" + this.f13587o + ", eligibleABTests=" + this.h + ", recommendedMedia=" + this.w + ", maxRecommendedAudioRank=" + this.r + ", maxRecommendedTextRank=" + this.p + ", contentPlaygraph=" + this.i + ", auxiliaryManifests=" + this.b + ", auxiliaryManifestToken=" + this.a + ", adverts=" + this.e + ", viewableType=" + this.C + ", liveMetadata=" + this.k + ", isAd=" + this.n + ", steeringAdditionalInfo=" + this.v + "}";
    }

    public boolean equals(Object obj) {
        List<AbstractC4567bgu> list;
        AbstractC4554bgh abstractC4554bgh;
        List<AbstractC4562bgp> list2;
        Watermark watermark;
        AbstractC4556bgj abstractC4556bgj;
        Map<String, String> map;
        AbstractC4530bgJ abstractC4530bgJ;
        Integer num;
        Integer num2;
        AbstractC4558bgl abstractC4558bgl;
        List<AbstractC4566bgt> list3;
        String str;
        AbstractC4473bfF abstractC4473bfF;
        String str2;
        LiveMetadata liveMetadata;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4566bgt) {
            AbstractC4566bgt abstractC4566bgt = (AbstractC4566bgt) obj;
            if (this.s == abstractC4566bgt.s() && this.y.equals(abstractC4566bgt.y()) && ((list = this.t) != null ? list.equals(abstractC4566bgt.t()) : abstractC4566bgt.t() == null) && ((abstractC4554bgh = this.c) != null ? abstractC4554bgh.equals(abstractC4566bgt.b()) : abstractC4566bgt.b() == null) && this.f == abstractC4566bgt.g() && this.z.equals(abstractC4566bgt.z()) && this.d.equals(abstractC4566bgt.d()) && this.D.equals(abstractC4566bgt.C()) && this.m.equals(abstractC4566bgt.o()) && ((list2 = this.j) != null ? list2.equals(abstractC4566bgt.h()) : abstractC4566bgt.h() == null) && this.x.equals(abstractC4566bgt.w()) && this.q == abstractC4566bgt.r() && ((watermark = this.B) != null ? watermark.equals(abstractC4566bgt.D()) : abstractC4566bgt.D() == null) && this.l == abstractC4566bgt.l() && ((abstractC4556bgj = this.g) != null ? abstractC4556bgj.equals(abstractC4566bgt.f()) : abstractC4566bgt.f() == null) && this.u.equals(abstractC4566bgt.u()) && this.f13587o.equals(abstractC4566bgt.k()) && ((map = this.h) != null ? map.equals(abstractC4566bgt.i()) : abstractC4566bgt.i() == null) && ((abstractC4530bgJ = this.w) != null ? abstractC4530bgJ.equals(abstractC4566bgt.v()) : abstractC4566bgt.v() == null) && ((num = this.r) != null ? num.equals(abstractC4566bgt.p()) : abstractC4566bgt.p() == null) && ((num2 = this.p) != null ? num2.equals(abstractC4566bgt.q()) : abstractC4566bgt.q() == null) && ((abstractC4558bgl = this.i) != null ? abstractC4558bgl.equals(abstractC4566bgt.j()) : abstractC4566bgt.j() == null) && ((list3 = this.b) != null ? list3.equals(abstractC4566bgt.a()) : abstractC4566bgt.a() == null) && ((str = this.a) != null ? str.equals(abstractC4566bgt.c()) : abstractC4566bgt.c() == null) && ((abstractC4473bfF = this.e) != null ? abstractC4473bfF.equals(abstractC4566bgt.e()) : abstractC4566bgt.e() == null) && ((str2 = this.C) != null ? str2.equals(abstractC4566bgt.A()) : abstractC4566bgt.A() == null) && ((liveMetadata = this.k) != null ? liveMetadata.equals(abstractC4566bgt.n()) : abstractC4566bgt.n() == null) && ((bool = this.n) != null ? bool.equals(abstractC4566bgt.m()) : abstractC4566bgt.m() == null)) {
                AbstractC4532bgL abstractC4532bgL = this.v;
                if (abstractC4532bgL == null) {
                    if (abstractC4566bgt.x() == null) {
                        return true;
                    }
                } else if (abstractC4532bgL.equals(abstractC4566bgt.x())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        long j = this.s;
        int i2 = (int) (j ^ (j >>> 32));
        int hashCode2 = this.y.hashCode();
        List<AbstractC4567bgu> list = this.t;
        int hashCode3 = list == null ? 0 : list.hashCode();
        AbstractC4554bgh abstractC4554bgh = this.c;
        int hashCode4 = abstractC4554bgh == null ? 0 : abstractC4554bgh.hashCode();
        long j2 = this.f;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        int hashCode5 = this.z.hashCode();
        int hashCode6 = this.d.hashCode();
        int hashCode7 = this.D.hashCode();
        int hashCode8 = this.m.hashCode();
        List<AbstractC4562bgp> list2 = this.j;
        int hashCode9 = list2 == null ? 0 : list2.hashCode();
        int hashCode10 = this.x.hashCode();
        long j3 = this.q;
        int i4 = (int) (j3 ^ (j3 >>> 32));
        Watermark watermark = this.B;
        if (watermark == null) {
            i = hashCode4;
            hashCode = 0;
        } else {
            hashCode = watermark.hashCode();
            i = hashCode4;
        }
        long j4 = this.l;
        int i5 = (int) ((j4 >>> 32) ^ j4);
        AbstractC4556bgj abstractC4556bgj = this.g;
        int hashCode11 = abstractC4556bgj == null ? 0 : abstractC4556bgj.hashCode();
        int hashCode12 = this.u.hashCode();
        int hashCode13 = this.f13587o.hashCode();
        Map<String, String> map = this.h;
        int hashCode14 = map == null ? 0 : map.hashCode();
        AbstractC4530bgJ abstractC4530bgJ = this.w;
        int hashCode15 = abstractC4530bgJ == null ? 0 : abstractC4530bgJ.hashCode();
        Integer num = this.r;
        int hashCode16 = num == null ? 0 : num.hashCode();
        Integer num2 = this.p;
        int hashCode17 = num2 == null ? 0 : num2.hashCode();
        AbstractC4558bgl abstractC4558bgl = this.i;
        int hashCode18 = abstractC4558bgl == null ? 0 : abstractC4558bgl.hashCode();
        List<AbstractC4566bgt> list3 = this.b;
        int hashCode19 = list3 == null ? 0 : list3.hashCode();
        String str = this.a;
        int hashCode20 = str == null ? 0 : str.hashCode();
        AbstractC4473bfF abstractC4473bfF = this.e;
        int hashCode21 = abstractC4473bfF == null ? 0 : abstractC4473bfF.hashCode();
        String str2 = this.C;
        int hashCode22 = str2 == null ? 0 : str2.hashCode();
        LiveMetadata liveMetadata = this.k;
        int hashCode23 = liveMetadata == null ? 0 : liveMetadata.hashCode();
        Boolean bool = this.n;
        int hashCode24 = bool == null ? 0 : bool.hashCode();
        AbstractC4532bgL abstractC4532bgL = this.v;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((i2 ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ i3) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ i4) * 1000003) ^ hashCode) * 1000003) ^ i5) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ hashCode15) * 1000003) ^ hashCode16) * 1000003) ^ hashCode17) * 1000003) ^ hashCode18) * 1000003) ^ hashCode19) * 1000003) ^ hashCode20) * 1000003) ^ hashCode21) * 1000003) ^ hashCode22) * 1000003) ^ hashCode23) * 1000003) ^ hashCode24) * 1000003) ^ (abstractC4532bgL == null ? 0 : abstractC4532bgL.hashCode());
    }
}
