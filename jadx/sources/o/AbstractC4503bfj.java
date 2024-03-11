package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4503bfj extends AbstractC4530bgJ {
    private final String a;
    private final String b;
    private final String d;

    @Override // o.AbstractC4530bgJ
    @SerializedName("videoTrackId")
    public String a() {
        return this.b;
    }

    @Override // o.AbstractC4530bgJ
    @SerializedName("timedTextTrackId")
    public String b() {
        return this.d;
    }

    @Override // o.AbstractC4530bgJ
    @SerializedName("audioTrackId")
    public String c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4503bfj(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null videoTrackId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null audioTrackId");
        }
        this.a = str2;
        if (str3 == null) {
            throw new NullPointerException("Null timedTextTrackId");
        }
        this.d = str3;
    }

    public String toString() {
        return "RecommendedMedia{videoTrackId=" + this.b + ", audioTrackId=" + this.a + ", timedTextTrackId=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4530bgJ) {
            AbstractC4530bgJ abstractC4530bgJ = (AbstractC4530bgJ) obj;
            return this.b.equals(abstractC4530bgJ.a()) && this.a.equals(abstractC4530bgJ.c()) && this.d.equals(abstractC4530bgJ.b());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
