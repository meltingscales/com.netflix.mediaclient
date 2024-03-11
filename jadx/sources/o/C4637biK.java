package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.cache.SegmentAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.cache.SegmentHolderList;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.biK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4637biK implements PlaylistMap.e {
    public final SegmentHolderList a;
    final List<C4656bid> b;
    SegmentAsePlayerState c;
    long d;
    final String e;
    final long f;
    int g;
    C4637biK h;
    public int i;
    final PlaylistMap j;
    final a k;
    public final C5209buT l;
    public final C5209buT m;
    final long n;

    /* renamed from: o  reason: collision with root package name */
    final List<C4656bid> f13600o;
    private long p;
    private long q;
    private long r;
    private C4726bju s;
    private long t;
    private long x;
    private long y;

    /* renamed from: o.biK$a */
    /* loaded from: classes3.dex */
    public interface a {
        void c(C4637biK c4637biK);
    }

    public SegmentAsePlayerState a() {
        return this.c;
    }

    public void a(int i) {
        this.g = i;
    }

    public long b() {
        return this.q + this.y;
    }

    public void b(C4726bju c4726bju) {
        this.s = c4726bju;
    }

    public void c(long j) {
        this.r = j;
    }

    public void d(SegmentAsePlayerState segmentAsePlayerState) {
        this.c = segmentAsePlayerState;
    }

    public void e(long j) {
        this.p = j;
    }

    public long f() {
        return this.p;
    }

    public long g() {
        return this.d;
    }

    public int k() {
        return this.t < this.x ? 1 : 2;
    }

    public C4726bju l() {
        return this.s;
    }

    public long n() {
        return this.r;
    }

    public int o() {
        return this.g;
    }

    public C4637biK(a aVar, PlaylistMap playlistMap, C5209buT c5209buT, long j, String str, long j2) {
        this.a = new SegmentHolderList();
        this.f13600o = new ArrayList();
        this.b = new ArrayList();
        this.k = aVar;
        this.j = playlistMap;
        this.n = j;
        this.e = str;
        this.l = c5209buT;
        C5209buT a2 = playlistMap.a(str);
        this.m = a2;
        long j3 = a2.c;
        j3 = j3 > 0 ? j3 + 1 : j3;
        this.r = androidx.media3.common.C.msToUs(a2 instanceof C5273bve ? j3 + ((C5273bve) a2).h : j3);
        this.p = androidx.media3.common.C.msToUs(a2.b);
        this.f = j2;
        this.d = a2.a;
        C5213buX[] f = c5209buT.f();
        int length = f.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C5213buX c5213buX = f[i];
            if (this.e.equals(c5213buX.d)) {
                long j4 = c5213buX.b;
                if (j4 >= 0) {
                    this.d = j4;
                }
            } else {
                i++;
            }
        }
        s();
    }

    public C4637biK(a aVar, PlaylistMap playlistMap, C4637biK c4637biK, long j, String str, long j2) {
        this(aVar, playlistMap, c4637biK.m, j, str, j2);
        this.h = c4637biK;
    }

    public boolean s() {
        C5213buX[] f;
        for (C5213buX c5213buX : this.l.f()) {
            if (this.e.equals(c5213buX.d)) {
                int i = this.i;
                int i2 = c5213buX.e;
                if (i != i2) {
                    this.i = i2;
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void q() {
        this.f13600o.clear();
        this.b.clear();
        this.q = 0L;
        this.t = 0L;
        this.y = 0L;
        this.x = 0L;
        this.a.g();
    }

    public long e() {
        return this.r + d();
    }

    public long d() {
        return Math.min(this.t, this.x);
    }

    public long c() {
        Iterator<C4637biK> it = this.a.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().c();
        }
        return j;
    }

    public long j() {
        long d = d();
        C4637biK c4637biK = this.h;
        return d + (c4637biK == null ? 0L : c4637biK.j());
    }

    public long h() {
        long b = b();
        C4637biK c4637biK = this.h;
        return b + (c4637biK == null ? 0L : c4637biK.h());
    }

    public long i() {
        return (d() + this.a.b()) * (100 - o());
    }

    public void b(C4635biI c4635biI) {
        long j = this.r;
        long j2 = c4635biI.type == 1 ? this.t : this.x;
        long durationUs = c4635biI.getDurationUs();
        long bytesLoaded = c4635biI.bytesLoaded();
        C4656bid c4656bid = new C4656bid(j + j2, durationUs, c4635biI.dataSpec.position, bytesLoaded);
        int b = c4635biI.b();
        if (b == 1) {
            this.b.add(c4656bid);
            this.t += durationUs;
            this.q += bytesLoaded;
        } else if (b != 2) {
        } else {
            this.f13600o.add(c4656bid);
            this.x += durationUs;
            this.y += bytesLoaded;
        }
    }

    public boolean r() {
        C4726bju c4726bju = this.s;
        if (c4726bju == null || !c4726bju.l()) {
            long d = d();
            if (d != 0 || this.p > 0) {
                return androidx.media3.common.C.usToMs(d) > this.f || e() >= this.p;
            }
            return false;
        }
        return true;
    }

    public List<C4656bid> b(int i) {
        List<C4656bid> unmodifiableList = Collections.unmodifiableList(i == 1 ? this.b : this.f13600o);
        if (this.h == null) {
            return unmodifiableList;
        }
        ArrayList arrayList = new ArrayList(this.h.b(i));
        arrayList.addAll(unmodifiableList);
        return arrayList;
    }

    public void e(C4637biK c4637biK) {
        this.a.add(c4637biK);
    }

    public C4973bpw m() {
        return new C4973bpw(this.e, o(), androidx.media3.common.C.usToMs(this.t), androidx.media3.common.C.usToMs(this.x), this.q, this.y);
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap.e
    public void p() {
        this.k.c(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{segment=");
        sb.append(this.e);
        sb.append(", buffered=");
        sb.append(androidx.media3.common.C.usToMs(d()));
        sb.append("ms, duration=");
        long j = this.p;
        sb.append(j < 0 ? "unknown" : Long.valueOf(androidx.media3.common.C.usToMs(j) - this.m.c));
        sb.append("ms, originalWeight=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
