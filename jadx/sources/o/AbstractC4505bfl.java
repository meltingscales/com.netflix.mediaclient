package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4505bfl extends AbstractC4529bgI {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;
    private final long i;
    private final long j;

    @Override // o.AbstractC4529bgI
    @SerializedName("media")
    public String a() {
        return this.b;
    }

    @Override // o.AbstractC4529bgI
    @SerializedName("duration")
    public long b() {
        return this.d;
    }

    @Override // o.AbstractC4529bgI
    @SerializedName("availabilityStartTime")
    public String c() {
        return this.a;
    }

    @Override // o.AbstractC4529bgI
    @SerializedName("presentationTimeOffset")
    public long d() {
        return this.e;
    }

    @Override // o.AbstractC4529bgI
    @SerializedName("initialization")
    public String e() {
        return this.c;
    }

    @Override // o.AbstractC4529bgI
    @SerializedName("startNumber")
    public long g() {
        return this.i;
    }

    @Override // o.AbstractC4529bgI
    @SerializedName("timescale")
    public long j() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4505bfl(String str, long j, long j2, String str2, String str3, long j3, long j4) {
        if (str == null) {
            throw new NullPointerException("Null availabilityStartTime");
        }
        this.a = str;
        this.e = j;
        this.j = j2;
        if (str2 == null) {
            throw new NullPointerException("Null media");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null initialization");
        }
        this.c = str3;
        this.d = j3;
        this.i = j4;
    }

    public String toString() {
        return "SegmentTemplate{availabilityStartTime=" + this.a + ", presentationTimeOffset=" + this.e + ", timescale=" + this.j + ", media=" + this.b + ", initialization=" + this.c + ", duration=" + this.d + ", startNumber=" + this.i + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4529bgI) {
            AbstractC4529bgI abstractC4529bgI = (AbstractC4529bgI) obj;
            return this.a.equals(abstractC4529bgI.c()) && this.e == abstractC4529bgI.d() && this.j == abstractC4529bgI.j() && this.b.equals(abstractC4529bgI.a()) && this.c.equals(abstractC4529bgI.e()) && this.d == abstractC4529bgI.b() && this.i == abstractC4529bgI.g();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.e;
        long j2 = this.j;
        int i = (int) (j2 ^ (j2 >>> 32));
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        long j3 = this.d;
        long j4 = this.i;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4));
    }
}
