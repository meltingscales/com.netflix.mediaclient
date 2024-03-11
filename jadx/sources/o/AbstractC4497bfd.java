package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4497bfd extends AbstractC4562bgp {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;

    @Override // o.AbstractC4562bgp
    @SerializedName("mediaId")
    public String a() {
        return this.b;
    }

    @Override // o.AbstractC4562bgp
    @SerializedName("subtitleTrackId")
    public String b() {
        return this.e;
    }

    @Override // o.AbstractC4562bgp
    @SerializedName("preferenceOrder")
    public int c() {
        return this.d;
    }

    @Override // o.AbstractC4562bgp
    @SerializedName("videoTrackId")
    public String d() {
        return this.a;
    }

    @Override // o.AbstractC4562bgp
    @SerializedName("audioTrackId")
    public String e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4497bfd(String str, String str2, String str3, String str4, int i) {
        if (str == null) {
            throw new NullPointerException("Null videoTrackId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null audioTrackId");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null subtitleTrackId");
        }
        this.e = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mediaId");
        }
        this.b = str4;
        this.d = i;
    }

    public String toString() {
        return "DefaultTrackOrder{videoTrackId=" + this.a + ", audioTrackId=" + this.c + ", subtitleTrackId=" + this.e + ", mediaId=" + this.b + ", preferenceOrder=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4562bgp) {
            AbstractC4562bgp abstractC4562bgp = (AbstractC4562bgp) obj;
            return this.a.equals(abstractC4562bgp.d()) && this.c.equals(abstractC4562bgp.e()) && this.e.equals(abstractC4562bgp.b()) && this.b.equals(abstractC4562bgp.a()) && this.d == abstractC4562bgp.c();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.c.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d;
    }
}
