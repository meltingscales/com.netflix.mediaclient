package o;

import android.content.Context;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.util.SntpClient;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.LanguageChoice;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.media.RecommendedMediaData;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackConfig;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.common.NetflixTimedTextTrackData;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o.C4678biz;

/* renamed from: o.bjt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4725bjt {
    private Context a;
    private AudioSubtitleDefaultOrderInfo[] b;
    protected final InterfaceC4525bgE c;
    private b[] d;
    private final String e;
    private String f;
    private final byte[] g;
    private Long h;
    private LanguageChoice i;
    private final long j;
    private final StreamProfileType k;
    private b[] l;
    private b[] m;
    private PreferredLanguageData n;

    /* renamed from: o  reason: collision with root package name */
    private String f13612o;
    private RecommendedMediaData p;

    public C4725bjt(InterfaceC4525bgE interfaceC4525bgE, Context context, PreferredLanguageData preferredLanguageData) {
        this.a = context;
        this.c = interfaceC4525bgE;
        this.n = preferredLanguageData;
        this.j = interfaceC4525bgE.P();
        this.h = interfaceC4525bgE.aa();
        this.k = interfaceC4525bgE.ap();
        this.g = interfaceC4525bgE.R();
        this.b = interfaceC4525bgE.G();
        this.p = interfaceC4525bgE.ag();
        LanguageChoice b2 = b(this.a);
        this.i = b2;
        String str = null;
        this.e = (b2 == null || b2.getAudio() == null) ? null : this.i.getAudio().getNewTrackId();
        LanguageChoice languageChoice = this.i;
        if (languageChoice != null && languageChoice.getSubtitle() != null) {
            str = this.i.getSubtitle().getNewTrackId();
        }
        this.f = str;
    }

    public C4726bju c() {
        a(this.c);
        return b();
    }

    private LanguageChoice b(Context context) {
        Subtitle[] am = this.c.am();
        AudioSource[] M = this.c.M();
        C1044Mm.e("DashManifestConverter", "Create localization manager");
        return new C8314dhz(context, am, M, this.p, this.c.ax() != null, this.n).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjt$b */
    /* loaded from: classes3.dex */
    public class b {
        private final String a;
        private final boolean c;
        private final int d;
        private final List<AbstractC4722bjq> e;

        b(C4725bjt c4725bjt, String str, AbstractC4472bfE abstractC4472bfE, List<AbstractC4534bgN> list, List<Location> list2, LiveMetadata liveMetadata) {
            b bVar = this;
            LiveMetadata liveMetadata2 = liveMetadata;
            C4725bjt.this = c4725bjt;
            bVar.a = abstractC4472bfE.n();
            String r = abstractC4472bfE.r();
            List<Stream> q = abstractC4472bfE.q();
            bVar.d = 1;
            bVar.c = false;
            bVar.e = new ArrayList(q.size());
            for (Stream stream : q) {
                if (stream.isValid()) {
                    bVar.e.add(new C4723bjr(str, bVar.a, stream, r, list, list2, c4725bjt.h.longValue(), c4725bjt.j, c4725bjt.e, abstractC4472bfE.s(), abstractC4472bfE.h(), abstractC4472bfE.k(), liveMetadata, liveMetadata2 != null ? liveMetadata2.a(stream.downloadableId()) : null));
                }
                bVar = this;
                liveMetadata2 = liveMetadata;
            }
        }

        b(C4725bjt c4725bjt, String str, VideoTrack videoTrack, List<AbstractC4534bgN> list, List<Location> list2, LiveMetadata liveMetadata) {
            AbstractC4529bgI abstractC4529bgI;
            b bVar = this;
            LiveMetadata liveMetadata2 = liveMetadata;
            C4725bjt.this = c4725bjt;
            bVar.a = videoTrack.newTrackId();
            List<Stream> streams = videoTrack.streams();
            bVar.d = 2;
            boolean z = videoTrack.drmHeader() != null;
            bVar.c = z;
            bVar.e = new ArrayList(streams.size());
            String trackId = videoTrack.trackId();
            AbstractC4529bgI abstractC4529bgI2 = null;
            DrmInitData drmInitData = z ? new DrmInitData(new DrmInitData.SchemeData(c(), null, "video/mp4", c4725bjt.g)) : null;
            for (Stream stream : streams) {
                if (stream.isValid()) {
                    abstractC4529bgI = abstractC4529bgI2;
                    bVar.e.add(new C4727bjv(str, bVar.a, trackId, stream, list, list2, c4725bjt.h.longValue(), c4725bjt.j, drmInitData, c4725bjt.k, videoTrack, liveMetadata, liveMetadata2 != null ? liveMetadata2.a(stream.downloadableId()) : abstractC4529bgI2));
                } else {
                    abstractC4529bgI = abstractC4529bgI2;
                }
                bVar = this;
                liveMetadata2 = liveMetadata;
                abstractC4529bgI2 = abstractC4529bgI;
            }
        }

        b(String str, AbstractC4537bgQ abstractC4537bgQ, List<AbstractC4534bgN> list, List<Location> list2, LiveMetadata liveMetadata) {
            String m = abstractC4537bgQ.m();
            this.a = m;
            this.d = 3;
            this.c = false;
            Map<String, String> s = abstractC4537bgQ.s();
            Map<String, AbstractC4536bgP> t = abstractC4537bgQ.t();
            if (t != null && !t.isEmpty() && s != null && !s.isEmpty()) {
                String b = C4731bjz.b(t.keySet(), s.keySet(), abstractC4537bgQ.h(), liveMetadata != null);
                if (b != null) {
                    String str2 = s.get(b);
                    AbstractC4536bgP abstractC4536bgP = t.get(b);
                    if (abstractC4536bgP != null && abstractC4536bgP.c() != null && !abstractC4536bgP.c().isEmpty()) {
                        NetflixTimedTextTrackData netflixTimedTextTrackData = new NetflixTimedTextTrackData(C4725bjt.this.h.longValue(), abstractC4537bgQ, b);
                        this.e = Collections.singletonList(new C4728bjw(str, m, null, C4725bjt.this.h.longValue(), str2, list, list2, C4725bjt.this.j, netflixTimedTextTrackData, netflixTimedTextTrackData.e().equals(C4725bjt.this.f), liveMetadata, liveMetadata != null ? liveMetadata.a(str2) : null, abstractC4536bgP.d()));
                        return;
                    }
                }
            }
            this.e = Collections.emptyList();
        }

        private UUID c() {
            return InterfaceC4605bhf.d;
        }

        AdaptationSet e(int i) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC4722bjq abstractC4722bjq : this.e) {
                if (!this.c || !abstractC4722bjq.j()) {
                    arrayList.add(abstractC4722bjq.g());
                } else {
                    C1044Mm.c("DashManifestConverter", "skip stream %s", abstractC4722bjq);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new AdaptationSet(i, this.d, arrayList, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
        }

        Map<String, C4668bip[]> e() {
            HashMap hashMap = new HashMap();
            for (AbstractC4722bjq abstractC4722bjq : this.e) {
                hashMap.put(abstractC4722bjq.b(), abstractC4722bjq.d());
            }
            return hashMap;
        }

        Map<String, C4678biz.b> d() {
            HashMap hashMap = new HashMap();
            for (AbstractC4722bjq abstractC4722bjq : this.e) {
                hashMap.put(abstractC4722bjq.b(), abstractC4722bjq.a());
            }
            return hashMap;
        }
    }

    private void a(InterfaceC4525bgE interfaceC4525bgE) {
        e(interfaceC4525bgE);
    }

    private void e(InterfaceC4525bgE interfaceC4525bgE) {
        List<VideoTrack> an = interfaceC4525bgE.an();
        List<AbstractC4472bfE> N = interfaceC4525bgE.N();
        List<AbstractC4537bgQ> y = interfaceC4525bgE.y();
        List<Location> W = interfaceC4525bgE.W();
        List<AbstractC4534bgN> aj = interfaceC4525bgE.aj();
        LiveMetadata n = interfaceC4525bgE.n();
        int size = an.size();
        this.m = new b[size];
        int i = 0;
        while (i < size) {
            int i2 = i;
            this.m[i2] = new b(this, interfaceC4525bgE.Y(), an.get(i), aj, W, n);
            i = i2 + 1;
        }
        int size2 = N.size();
        this.d = new b[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            this.d[i3] = new b(this, interfaceC4525bgE.Y(), N.get(i3), aj, W, n);
        }
        int size3 = y.size();
        this.l = new b[size3];
        for (int i4 = 0; i4 < size3; i4++) {
            AbstractC4537bgQ abstractC4537bgQ = y.get(i4);
            this.l[i4] = new b(interfaceC4525bgE.Y(), abstractC4537bgQ, aj, W, n);
            if (abstractC4537bgQ.s().isEmpty()) {
                this.f13612o = abstractC4537bgQ.m();
            }
        }
    }

    private C4726bju b() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        long j6;
        int i;
        long j7;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        b[] bVarArr = this.m;
        int length = bVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            AdaptationSet e = bVarArr[i2].e(i3);
            if (e != null) {
                arrayList.add(e);
            }
            i2++;
            i3++;
        }
        b[] bVarArr2 = this.d;
        int length2 = bVarArr2.length;
        int i4 = 0;
        while (i4 < length2) {
            AdaptationSet e2 = bVarArr2[i4].e(i3);
            if (e2 != null) {
                arrayList.add(e2);
            }
            i4++;
            i3++;
        }
        b[] bVarArr3 = this.l;
        if (bVarArr3 != null) {
            int length3 = bVarArr3.length;
            int i5 = 0;
            while (i5 < length3) {
                AdaptationSet e3 = bVarArr3[i5].e(i3);
                if (e3 != null) {
                    arrayList.add(e3);
                }
                i5++;
                i3++;
            }
        }
        AbstractC4564bgr U = this.c.U();
        String d = (U == null || U.b() == null) ? null : U.b().d();
        long j8 = this.c.n() != null ? -9223372036854775807L : this.j;
        LiveMetadata n = this.c.n();
        if (n != null) {
            SntpClient.setNtpHost("time.google.com");
            long j9 = -9223372036854775807L;
            long j10 = 0;
            for (Map.Entry<String, AbstractC4529bgI> entry : n.h().entrySet()) {
                long parseXsDateTime = Util.parseXsDateTime(entry.getValue().c());
                if (j9 == -9223372036854775807L || j9 < parseXsDateTime) {
                    j9 = parseXsDateTime;
                }
                if (j10 == 0 && entry.getValue().j() != 0) {
                    j10 = entry.getValue().d() / entry.getValue().j();
                }
            }
            long millis = TimeUnit.DAYS.toMillis(3L);
            long d2 = n.f() ? NetflixDataSourceUtil.d(n.a(), n.c()) : -9223372036854775807L;
            long d3 = n.j() ? NetflixDataSourceUtil.d(n.d(), n.c()) : -9223372036854775807L;
            int g = this.c.n().g();
            if (d3 != -9223372036854775807L) {
                j8 = d3 - d2;
                z3 = false;
            } else {
                z3 = true;
            }
            j3 = d2;
            z2 = n.b();
            j4 = d3;
            i = g;
            j6 = Config_FastProperty_PlaybackConfig.useLiveEventOffset() ? n.c() : 0L;
            j = 2000;
            j5 = j8;
            j7 = j9;
            j2 = millis;
            z = z3;
        } else {
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
            j3 = -9223372036854775807L;
            j4 = -9223372036854775807L;
            j5 = j8;
            z = false;
            z2 = false;
            j6 = 0;
            i = 0;
            j7 = -9223372036854775807L;
        }
        ArrayList arrayList2 = new ArrayList();
        long j11 = j2;
        arrayList2.add(new Period(Long.toString(this.h.longValue()), 0L, arrayList));
        return new C4726bju(j7, j5, j, z, j11, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, null, null, null, null, arrayList2, d(), a(), this.k, this.h, this.c.Y(), this.c.ax(), this.c.F(), d, this.f13612o, this.i, this.c.H(), this.c.ac(), j3, j4, z2, j6, i, this.c.x() != null ? this.c.x().a() : null);
    }

    private C4666bin d() {
        HashMap hashMap = new HashMap();
        for (b bVar : this.m) {
            hashMap.putAll(bVar.e());
        }
        for (b bVar2 : this.d) {
            hashMap.putAll(bVar2.e());
        }
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar3 : bVarArr) {
                hashMap.putAll(bVar3.e());
            }
        }
        return new C4666bin(hashMap);
    }

    private C4678biz a() {
        HashMap hashMap = new HashMap();
        for (b bVar : this.m) {
            hashMap.putAll(bVar.d());
        }
        for (b bVar2 : this.d) {
            hashMap.putAll(bVar2.d());
        }
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar3 : bVarArr) {
                hashMap.putAll(bVar3.d());
            }
        }
        return new C4678biz(hashMap);
    }

    public static long c(DashManifest dashManifest) {
        try {
            return Long.parseLong(dashManifest.getPeriod(0).id);
        } catch (Exception e) {
            C1044Mm.b("DashManifestConverter", e, "unable to extract playableId from manifest", new Object[0]);
            return -1L;
        }
    }
}
