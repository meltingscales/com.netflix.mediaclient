package o;

import android.text.TextUtils;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.SegmentBase;
import androidx.media3.exoplayer.dash.manifest.UrlTemplate;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.Url;
import com.netflix.mediaclient.service.player.common.NetflixCachedMetadataEntry;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;
import java.util.ArrayList;
import java.util.List;
import o.C4678biz;

/* renamed from: o.bjq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4722bjq {
    protected final LiveMetadata a;
    protected final String b;
    protected final long c;
    protected final String d;
    protected final String e;
    protected final String g;
    protected final AbstractC4529bgI h;
    protected final String i;
    protected final C4729bjx[] j;

    public abstract C4678biz.b a();

    public String b() {
        return this.e;
    }

    protected abstract int f();

    public abstract Representation g();

    public boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4722bjq(String str, String str2, String str3, long j, String str4, List<Url> list, List<AbstractC4534bgN> list2, List<Location> list3, LiveMetadata liveMetadata, AbstractC4529bgI abstractC4529bgI, String str5) {
        this.e = str4;
        this.i = str2;
        this.d = str3;
        this.c = j;
        int size = list.size();
        this.j = new C4729bjx[size];
        for (int i = 0; i < size; i++) {
            this.j[i] = new C4729bjx(str, list.get(i), list2, list3);
        }
        this.a = liveMetadata;
        this.h = abstractC4529bgI;
        this.g = str5;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return C4632biF.b(this.i, this.e, Long.valueOf(this.c));
    }

    public C4668bip[] d() {
        C4668bip[] c4668bipArr = new C4668bip[this.j.length];
        int i = 0;
        while (true) {
            C4729bjx[] c4729bjxArr = this.j;
            if (i >= c4729bjxArr.length) {
                return c4668bipArr;
            }
            c4668bipArr[i] = c4729bjxArr[i].d();
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        C4729bjx[] c4729bjxArr = this.j;
        if (c4729bjxArr == null || c4729bjxArr.length <= 0) {
            return false;
        }
        String b = c4729bjxArr[0].b();
        return b.startsWith("file://") || b.startsWith("/");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Metadata.Entry> c() {
        ArrayList arrayList = new ArrayList();
        if (h()) {
            arrayList.add(new NetflixCachedMetadataEntry(1));
        }
        arrayList.add(new NetflixIdMetadataEntry(this.c, this.i));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SegmentBase.SegmentTemplate b(AbstractC4529bgI abstractC4529bgI) {
        UrlTemplate compile = UrlTemplate.compile(NetflixDataSourceUtil.c(abstractC4529bgI.a().replaceAll("\\$RepresentationID\\$", this.g), this.b, false, f(), true));
        UrlTemplate compile2 = !TextUtils.isEmpty(abstractC4529bgI.e()) ? UrlTemplate.compile(NetflixDataSourceUtil.c(abstractC4529bgI.e().replaceAll("\\$RepresentationID\\$", this.g), this.b, false, f(), true)) : null;
        long parseXsDateTime = Util.parseXsDateTime(abstractC4529bgI.c());
        long g = abstractC4529bgI.g();
        long d = abstractC4529bgI.d();
        if (this.a.o()) {
            long d2 = NetflixDataSourceUtil.d(this.a.a(), this.a.c());
            long b = (abstractC4529bgI.b() * 1000) / abstractC4529bgI.j();
            long j = (d2 - parseXsDateTime) / b;
            g += j;
            long j2 = j * b;
            parseXsDateTime += j2;
            d += (j2 * abstractC4529bgI.j()) / 1000;
        }
        return new SegmentBase.SegmentTemplate(null, abstractC4529bgI.j(), d, g, -1L, abstractC4529bgI.b(), null, 0L, compile2, compile, -9223372036854775807L, Util.msToUs(parseXsDateTime));
    }
}
