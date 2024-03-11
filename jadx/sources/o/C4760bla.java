package o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.bla  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4760bla {
    @SerializedName("live-msg-end")
    private final String a;
    @SerializedName("time")
    private final long b;
    @SerializedName("encoder-region")
    private final String c;
    @SerializedName("live-msg-start")
    private final String d;
    @SerializedName("encoder-tag")
    private final String e;

    public C4760bla() {
        this(0L, null, null, null, null, 31, null);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4760bla) {
            C4760bla c4760bla = (C4760bla) obj;
            return this.b == c4760bla.b && C8632dsu.c((Object) this.e, (Object) c4760bla.e) && C8632dsu.c((Object) this.c, (Object) c4760bla.c) && C8632dsu.c((Object) this.d, (Object) c4760bla.d) && C8632dsu.c((Object) this.a, (Object) c4760bla.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.b);
        String str = this.e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.d;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        long j = this.b;
        String str = this.e;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.a;
        return "SideChannelData(timestampMillis=" + j + ", encoderTag=" + str + ", encoderRegion=" + str2 + ", startTime=" + str3 + ", endTime=" + str4 + ")";
    }

    public C4760bla(long j, String str, String str2, String str3, String str4) {
        this.b = j;
        this.e = str;
        this.c = str2;
        this.d = str3;
        this.a = str4;
    }

    public /* synthetic */ C4760bla(long j, String str, String str2, String str3, String str4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? -9223372036854775807L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
