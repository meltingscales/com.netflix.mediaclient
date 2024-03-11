package o;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.SegmentBase;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.SegmentVmaf;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry;
import com.netflix.mediaclient.service.player.common.NetflixSegmentVmafMetadataEntry;
import com.netflix.mediaclient.service.player.common.NetflixVMAFMetadataEntry;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;
import java.util.Collections;
import java.util.List;
import o.C4678biz;

/* renamed from: o.bjv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4727bjv extends AbstractC4722bjq {
    private int B;
    private int C;
    protected final int f;
    private int k;
    protected final String l;
    private int m;
    private final long n;

    /* renamed from: o  reason: collision with root package name */
    private final DrmInitData f13614o;
    private int p;
    private int q;
    private int r;
    private final float s;
    private final int t;
    private int u;
    private final StreamProfileType v;
    private int w;
    private int x;
    private final List<SegmentVmaf> y;
    private int z;

    private boolean i() {
        return this.x > 0;
    }

    @Override // o.AbstractC4722bjq
    protected int f() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4727bjv(String str, String str2, String str3, Stream stream, List<AbstractC4534bgN> list, List<Location> list2, long j, long j2, DrmInitData drmInitData, StreamProfileType streamProfileType, VideoTrack videoTrack, LiveMetadata liveMetadata, AbstractC4529bgI abstractC4529bgI) {
        super(str, str2, str3, j, stream.downloadableId(), stream.urls(), list, list2, liveMetadata, abstractC4529bgI, stream.representationId());
        this.x = -1;
        this.u = -1;
        this.r = -1;
        this.p = -1;
        this.z = -1;
        this.k = -1;
        this.m = -1;
        this.C = -1;
        this.w = -1;
        this.n = j2;
        this.f = stream.bitrate();
        this.l = stream.contentProfile();
        this.v = streamProfileType;
        this.y = stream.segmentVmaf();
        if (stream.moov() != null && stream.sidx() != null) {
            AbstractC4559bgm moov = stream.moov();
            AbstractC4559bgm sidx = stream.sidx();
            C1044Mm.c("DashManifestConverter", "stream has moov: %s, sidx: %s", moov, sidx);
            this.r = moov.b();
            this.p = moov.c();
            this.x = sidx.b();
            this.u = sidx.c();
        }
        this.B = stream.resW() > 0 ? stream.resW() : -1;
        this.q = stream.resH() > 0 ? stream.resH() : -1;
        this.z = stream.vmaf() > 0 ? stream.vmaf() : -1;
        int framerateValue = stream.framerateValue();
        int framerateScale = stream.framerateScale();
        this.s = (framerateValue <= 0 || framerateScale <= 0) ? -1.0f : framerateValue / framerateScale;
        this.f13614o = drmInitData;
        this.t = stream.peakBitrate() > 0 ? stream.peakBitrate() : -1;
        if (videoTrack != null) {
            this.k = videoTrack.getCroppedWidth();
            this.m = videoTrack.getCroppedHeight();
            this.C = videoTrack.getAspectRatioWidth();
            this.w = videoTrack.getAspectRatioHeight();
        }
    }

    @Override // o.AbstractC4722bjq
    public Representation g() {
        SegmentBase singleSegmentBase;
        SegmentBase singleSegmentBase2;
        String d = NetflixDataSourceUtil.d(this.b, this.e, f(), this.h != null);
        String a = NetflixDataSourceUtil.a(this.b, this.e, f(), this.h != null);
        AbstractC4529bgI abstractC4529bgI = this.h;
        if (abstractC4529bgI != null) {
            singleSegmentBase2 = b(abstractC4529bgI);
        } else if (i()) {
            singleSegmentBase2 = new SegmentBase.SingleSegmentBase(new RangedUri(a, 0L, this.r + this.p + this.u), 1L, 0L, this.r + this.p, this.u);
        } else {
            long b = NetflixDataSourceUtil.b(this.n, this.v);
            singleSegmentBase = new SegmentBase.SingleSegmentBase(new RangedUri(a, 0L, b), 1L, 0L, 0L, b);
            return Representation.newInstance(-1L, c(this.e), Collections.singletonList(new BaseUrl(d)), singleSegmentBase, null, Collections.emptyList(), Collections.emptyList(), e());
        }
        singleSegmentBase = singleSegmentBase2;
        return Representation.newInstance(-1L, c(this.e), Collections.singletonList(new BaseUrl(d)), singleSegmentBase, null, Collections.emptyList(), Collections.emptyList(), e());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.media3.common.Format c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.l
            boolean r0 = o.C8168dfL.h(r0)
            if (r0 == 0) goto L3c
            java.lang.String r0 = r2.l
            java.lang.String r1 = "hevc-dv5"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L15
            java.lang.String r0 = "video/dolby-vision"
            goto L3e
        L15:
            java.lang.String r0 = r2.l
            java.lang.String r1 = "hevc-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L22
            java.lang.String r0 = "video/hevc"
            goto L3e
        L22:
            java.lang.String r0 = r2.l
            java.lang.String r1 = "vp9-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L3e
        L2f:
            java.lang.String r0 = r2.l
            java.lang.String r1 = "av1-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "video/av01"
            goto L3e
        L3c:
            java.lang.String r0 = "video/avc"
        L3e:
            androidx.media3.common.Format$Builder r1 = new androidx.media3.common.Format$Builder
            r1.<init>()
            androidx.media3.common.Format$Builder r3 = r1.setId(r3)
            java.lang.String r1 = "video/mp4"
            androidx.media3.common.Format$Builder r3 = r3.setContainerMimeType(r1)
            androidx.media3.common.Format$Builder r3 = r3.setSampleMimeType(r0)
            int r0 = r2.f
            int r0 = r0 * 1000
            androidx.media3.common.Format$Builder r3 = r3.setAverageBitrate(r0)
            int r0 = r2.B
            androidx.media3.common.Format$Builder r3 = r3.setWidth(r0)
            int r0 = r2.q
            androidx.media3.common.Format$Builder r3 = r3.setHeight(r0)
            float r0 = r2.s
            androidx.media3.common.Format$Builder r3 = r3.setFrameRate(r0)
            androidx.media3.common.DrmInitData r0 = r2.f13614o
            androidx.media3.common.Format$Builder r3 = r3.setDrmInitData(r0)
            androidx.media3.common.Metadata r0 = new androidx.media3.common.Metadata
            java.util.List r1 = r2.c()
            r0.<init>(r1)
            androidx.media3.common.Format$Builder r3 = r3.setMetadata(r0)
            boolean r0 = o.aRA.h()
            if (r0 == 0) goto L99
            o.bjy r0 = o.C4730bjy.a
            java.lang.String r1 = r2.l
            java.lang.String r0 = r0.c(r1)
            r3.setCodecs(r0)
            int r0 = r2.t
            r1 = -1
            if (r0 == r1) goto L99
            int r0 = r0 * 1000
            r3.setPeakBitrate(r0)
        L99:
            androidx.media3.common.Format r3 = r3.build()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4727bjv.c(java.lang.String):androidx.media3.common.Format");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC4722bjq
    public List<Metadata.Entry> c() {
        List<Metadata.Entry> c = super.c();
        if (this.z != -1) {
            c.add(new NetflixVMAFMetadataEntry(this.z));
        }
        if (!this.y.isEmpty()) {
            c.add(new NetflixSegmentVmafMetadataEntry(this.y));
        }
        int i = this.k;
        if (i > 0 || this.m > 0 || this.w > 0 || this.C > 0) {
            c.add(new NetflixCroppingMetadataEntry(i, this.m, this.C, this.w));
        }
        return c;
    }

    @Override // o.AbstractC4722bjq
    public C4678biz.b a() {
        if (i()) {
            return new C4678biz.b(0, this.r + this.p + this.u, e());
        }
        return new C4678biz.b(0, NetflixDataSourceUtil.b(this.n, this.v), e());
    }

    @Override // o.AbstractC4722bjq
    public boolean j() {
        return C8168dfL.h(this.l) && (this.l.startsWith("nodrm-h264") || this.l.startsWith("none-h264"));
    }

    public String toString() {
        return "NfStream{downloadableId='" + this.e + "', bitrateKbps=" + this.f + ", contentProfile='" + this.l + "'}";
    }
}
