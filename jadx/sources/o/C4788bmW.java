package o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.bmW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4788bmW {
    @SerializedName("pts")
    protected long a;
    @SerializedName("postCacheInitBitrate")
    protected Integer b;
    @SerializedName("lastCacheVMAF")
    protected Integer c;
    @SerializedName("postCacheVMAF")
    protected Integer d;
    @SerializedName("lastCacheBitrate")
    protected Integer e;
    @SerializedName("trackType")
    protected int h;

    public C4788bmW a(Integer num) {
        this.b = num;
        return this;
    }

    public C4788bmW b(Integer num) {
        this.d = num;
        return this;
    }

    public C4788bmW c(Integer num) {
        this.e = num;
        return this;
    }

    public C4788bmW e(Integer num) {
        this.c = num;
        return this;
    }

    public C4788bmW(int i, long j) {
        this.a = j;
        this.h = i;
    }
}
