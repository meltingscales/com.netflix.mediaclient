package o;

import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.util.gfx.ImageLoader;

/* renamed from: o.btc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5165btc {
    private final long a;
    private final VolleyError b;
    private final int c;
    private final ImageLoader.AssetLocationType d;
    private final long e;
    private final String g;

    public final int a() {
        return this.c;
    }

    public final long b() {
        return this.e;
    }

    public final VolleyError c() {
        return this.b;
    }

    public final long d() {
        return this.a;
    }

    public final ImageLoader.AssetLocationType e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5165btc) {
            C5165btc c5165btc = (C5165btc) obj;
            return C8632dsu.c((Object) this.g, (Object) c5165btc.g) && this.e == c5165btc.e && this.a == c5165btc.a && this.d == c5165btc.d && this.c == c5165btc.c && C8632dsu.c(this.b, c5165btc.b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.g;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = Long.hashCode(this.e);
        int hashCode3 = Long.hashCode(this.a);
        ImageLoader.AssetLocationType assetLocationType = this.d;
        int hashCode4 = assetLocationType == null ? 0 : assetLocationType.hashCode();
        int hashCode5 = Integer.hashCode(this.c);
        VolleyError volleyError = this.b;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (volleyError != null ? volleyError.hashCode() : 0);
    }

    public String toString() {
        String str = this.g;
        long j = this.e;
        long j2 = this.a;
        ImageLoader.AssetLocationType assetLocationType = this.d;
        int i = this.c;
        VolleyError volleyError = this.b;
        return "TtrImageData(url=" + str + ", startTimeMillis=" + j + ", endTimeMillis=" + j2 + ", assetLocationType=" + assetLocationType + ", bitmapByteCount=" + i + ", error=" + volleyError + ")";
    }

    public C5165btc(String str, long j, long j2, ImageLoader.AssetLocationType assetLocationType, int i, VolleyError volleyError) {
        this.g = str;
        this.e = j;
        this.a = j2;
        this.d = assetLocationType;
        this.c = i;
        this.b = volleyError;
    }
}
