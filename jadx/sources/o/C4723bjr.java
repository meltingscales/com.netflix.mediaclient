package o;

import android.annotation.SuppressLint;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.service.player.common.NetflixCachedMetadataEntry;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bjr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4723bjr extends C4727bjv {
    private final int k;
    private final int m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13611o;

    @Override // o.C4727bjv, o.AbstractC4722bjq
    protected int f() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4723bjr(String str, String str2, Stream stream, String str3, List<AbstractC4534bgN> list, List<Location> list2, long j, long j2, String str4, int i, String str5, int i2, LiveMetadata liveMetadata, AbstractC4529bgI abstractC4529bgI) {
        super(str, str2, str3, stream, list, list2, j, j2, null, null, null, liveMetadata, abstractC4529bgI);
        this.n = i;
        this.f13611o = str5;
        this.m = i2;
        this.k = str2.equals(str4) ? 1 : 0;
    }

    @Override // o.C4727bjv
    @SuppressLint({"InlinedApi"})
    protected Format c(String str) {
        String str2 = "audio/mp4a-latm";
        String str3 = null;
        if (C8168dfL.h(this.l)) {
            if (this.l.startsWith("heaac-")) {
                str3 = "mp4a.40.5";
            } else if (this.l.startsWith("ddplus-")) {
                str2 = "audio/eac3";
            } else if (this.l.startsWith("xheaac-")) {
                str3 = "mp4a.40.42";
            }
        }
        return new Format.Builder().setId(str).setContainerMimeType("audio/mp4").setSampleMimeType(str2).setCodecs(str3).setAverageBitrate(this.f * 1000).setChannelCount(this.n).setSampleRate(VoipConfiguration.MAX_SAMPLERATE_48K).setSelectionFlags(this.k).setRoleFlags(1).setLanguage(this.f13611o).setMetadata(new Metadata(c())).build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4727bjv, o.AbstractC4722bjq
    public List<Metadata.Entry> c() {
        ArrayList arrayList = new ArrayList();
        if (h()) {
            arrayList.add(new NetflixCachedMetadataEntry(1));
        }
        arrayList.add(new NetflixIdMetadataEntry(this.c, this.i, this.m));
        return arrayList;
    }
}
