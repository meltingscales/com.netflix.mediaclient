package o;

import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.Url;
import java.util.List;

/* renamed from: o.bip  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4668bip {
    private final String a;
    public final int b;
    private final boolean c;
    private final int d;
    private final String e;
    private final String f;
    private final boolean g;
    private final int h;
    private final boolean i;
    private final String j;
    private final int k;
    private final int l;
    private final String m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private long f13605o;

    public int a() {
        return this.d;
    }

    public String b() {
        return this.f;
    }

    public void b(long j) {
        this.f13605o = j;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.h;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.n;
    }

    public long g() {
        return this.f13605o;
    }

    public int h() {
        return this.k;
    }

    public int i() {
        return this.l;
    }

    public int j() {
        return this.b;
    }

    public boolean k() {
        return this.i;
    }

    public boolean l() {
        return this.c;
    }

    public String m() {
        return this.m;
    }

    public boolean o() {
        return this.g;
    }

    public static C4668bip e(String str, Url url, List<AbstractC4534bgN> list, List<Location> list2) {
        return new C4668bip(str, url, list, list2);
    }

    public C4668bip(String str, Url url, List<AbstractC4534bgN> list, List<Location> list2) {
        this.m = url.url();
        int cdnId = url.cdnId();
        this.d = cdnId;
        this.a = String.valueOf(cdnId);
        List<String> liveOcaCapabilities = url.liveOcaCapabilities();
        this.i = liveOcaCapabilities.contains("LIVE");
        this.g = liveOcaCapabilities.contains("DVR") || liveOcaCapabilities.contains("DVR_PROXY");
        AbstractC4534bgN c = AbstractC4534bgN.c(cdnId, list);
        this.e = c != null ? c.c() : null;
        this.h = c != null ? c.e() : 0;
        this.j = c != null ? c.f() : null;
        this.c = c != null ? c.b() : true;
        String d = c != null ? c.d() : null;
        this.f = d;
        Location location = Location.getLocation(d, list2);
        this.k = location != null ? location.rank() : 0;
        this.l = location != null ? location.level() : 0;
        this.b = location != null ? location.weight() : 0;
        this.f13605o = -1L;
        this.n = str;
    }

    public String toString() {
        return "NetflixLocationInfo{url='" + this.m + "', cdnId='" + this.a + "', cdnName='" + this.e + "', cdnRank=" + this.h + ", cdnType='" + this.j + "', cdnLowgrade=" + this.c + ", locationId='" + this.f + "', locationRank=" + this.k + ", locationLevel=" + this.l + ", locationWeight=" + this.b + ", locationRegisteredTs=" + this.f13605o + '}';
    }
}
