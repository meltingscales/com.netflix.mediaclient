package o;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.SegmentBase;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.service.player.common.NetflixCachedMetadataEntry;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import com.netflix.mediaclient.service.player.common.NetflixTimedTextTrackData;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C4678biz;

/* renamed from: o.bjw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4728bjw extends AbstractC4722bjq {
    private final String f;
    private final int k;
    private final NetflixTimedTextTrackData l;
    private final String m;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13615o;

    @Override // o.AbstractC4722bjq
    protected int f() {
        return 3;
    }

    @Override // o.AbstractC4722bjq
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // o.AbstractC4722bjq
    public /* bridge */ /* synthetic */ C4668bip[] d() {
        return super.d();
    }

    @Override // o.AbstractC4722bjq
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4728bjw(String str, String str2, String str3, long j, String str4, List<AbstractC4534bgN> list, List<Location> list2, long j2, NetflixTimedTextTrackData netflixTimedTextTrackData, boolean z, LiveMetadata liveMetadata, AbstractC4529bgI abstractC4529bgI, String str5) {
        super(str, str2, str3, j, str4, netflixTimedTextTrackData.f13215o, list, list2, liveMetadata, abstractC4529bgI, str5);
        this.f = netflixTimedTextTrackData.g;
        this.f13615o = z;
        this.m = netflixTimedTextTrackData.d;
        this.k = netflixTimedTextTrackData.i;
        this.l = netflixTimedTextTrackData;
    }

    @Override // o.AbstractC4722bjq
    public Representation g() {
        String d = NetflixDataSourceUtil.d(this.b, this.e, f(), this.h != null);
        if ("nflx-cmisc".equals(this.f)) {
            NetflixTimedTextTrackData netflixTimedTextTrackData = this.l;
            return new C4684bjE(-1L, d(this.e), d, new SegmentBase.SingleSegmentBase(new RangedUri(d, netflixTimedTextTrackData.f, netflixTimedTextTrackData.h), 1L, 0L, 0L, 0L), e());
        }
        AbstractC4529bgI abstractC4529bgI = this.h;
        if (abstractC4529bgI != null) {
            return Representation.newInstance(-1L, d(this.e), Collections.singletonList(new BaseUrl(d)), b(abstractC4529bgI), null, Collections.emptyList(), Collections.emptyList(), e());
        }
        return new Representation.SingleSegmentRepresentation(-1L, d(this.e), Collections.singletonList(new BaseUrl(d)), new SegmentBase.SingleSegmentBase(new RangedUri(d, 0L, this.k), 1L, 0L, 0L, 0L), null, Collections.emptyList(), Collections.emptyList(), e(), this.k);
    }

    private Format d(String str) {
        String str2;
        String str3;
        String str4 = "application/ttml+xml";
        if ("dfxp-ls-sdh".equals(this.f)) {
            str3 = "tt1p";
        } else if ("imsc1.1".equals(this.f)) {
            str3 = "im2t";
        } else {
            if ("webvtt-lssdh-ios8".equals(this.f)) {
                str2 = "text/vtt";
            } else if (!"nflx-cmisc".equals(this.f)) {
                throw new RuntimeException(this.f + " is not handled");
            } else {
                str2 = "application/nflx-cmisc";
            }
            str4 = str2;
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.l);
        if (h()) {
            arrayList.add(new NetflixCachedMetadataEntry(1));
        }
        Format.Builder metadata = new Format.Builder().setId(str).setContainerMimeType(str4).setSampleMimeType(str4).setCodecs(str3).setSelectionFlags(this.f13615o ? 1 : 0).setRoleFlags(1).setLanguage(this.m).setMetadata(new Metadata(arrayList));
        AbstractC4529bgI abstractC4529bgI = this.h;
        if (abstractC4529bgI != null && abstractC4529bgI.j() != 0) {
            metadata.setSubsampleOffsetUs(b(this.h).getPresentationTimeOffsetUs() * (-1));
        }
        return metadata.build();
    }

    @Override // o.AbstractC4722bjq
    public C4678biz.b a() {
        return new C4678biz.b(0, this.k, e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC4722bjq
    public List<Metadata.Entry> c() {
        ArrayList arrayList = new ArrayList();
        if (h()) {
            arrayList.add(new NetflixCachedMetadataEntry(1));
        }
        arrayList.add(new NetflixIdMetadataEntry(this.c, this.i, this.l.e));
        return arrayList;
    }
}
