package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4433beS extends AbstractC4468bfA {
    private final boolean a;
    private final long b;
    private final Map<String, AbstractC4518bfy> c;
    private final long d;
    private final long e;
    private final String f;
    private final List<AbstractC4533bgM> j;

    @Override // o.AbstractC4468bfA
    @SerializedName("is3pVerificationEnabled")
    public boolean a() {
        return this.a;
    }

    @Override // o.AbstractC4468bfA
    @SerializedName(SignupConstants.Field.LANG_ID)
    public long b() {
        return this.e;
    }

    @Override // o.AbstractC4468bfA
    @SerializedName("actionAdEvents")
    public Map<String, AbstractC4518bfy> c() {
        return this.c;
    }

    @Override // o.AbstractC4468bfA
    @SerializedName("startTimeMs")
    public long d() {
        return this.d;
    }

    @Override // o.AbstractC4468bfA
    @SerializedName("endTimeMs")
    public long e() {
        return this.b;
    }

    @Override // o.AbstractC4468bfA
    @SerializedName("thirdPartyVerificationToken")
    public String h() {
        return this.f;
    }

    @Override // o.AbstractC4468bfA
    @SerializedName("timedAdEvents")
    public List<AbstractC4533bgM> j() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4433beS(long j, long j2, boolean z, String str, long j3, List<AbstractC4533bgM> list, Map<String, AbstractC4518bfy> map) {
        this.e = j;
        this.d = j2;
        this.a = z;
        this.f = str;
        this.b = j3;
        if (list == null) {
            throw new NullPointerException("Null timedAdEvents");
        }
        this.j = list;
        if (map == null) {
            throw new NullPointerException("Null actionAdEvents");
        }
        this.c = map;
    }

    public String toString() {
        return "Ad{id=" + this.e + ", startTimeMs=" + this.d + ", is3pVerificationEnabled=" + this.a + ", thirdPartyVerificationToken=" + this.f + ", endTimeMs=" + this.b + ", timedAdEvents=" + this.j + ", actionAdEvents=" + this.c + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4468bfA) {
            AbstractC4468bfA abstractC4468bfA = (AbstractC4468bfA) obj;
            return this.e == abstractC4468bfA.b() && this.d == abstractC4468bfA.d() && this.a == abstractC4468bfA.a() && ((str = this.f) != null ? str.equals(abstractC4468bfA.h()) : abstractC4468bfA.h() == null) && this.b == abstractC4468bfA.e() && this.j.equals(abstractC4468bfA.j()) && this.c.equals(abstractC4468bfA.c());
        }
        return false;
    }

    public int hashCode() {
        long j = this.e;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.d;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int i3 = this.a ? 1231 : 1237;
        String str = this.f;
        int hashCode = str == null ? 0 : str.hashCode();
        long j3 = this.b;
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
