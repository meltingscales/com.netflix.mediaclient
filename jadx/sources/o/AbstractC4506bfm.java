package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4506bfm extends AbstractC4534bgN {
    private final String a;
    private final int b;
    private final String c;
    private final boolean d;
    private final int e;
    private final String g;

    @Override // o.AbstractC4534bgN
    @SerializedName(SignupConstants.Field.LANG_ID)
    public int a() {
        return this.e;
    }

    @Override // o.AbstractC4534bgN
    @SerializedName("lowgrade")
    public boolean b() {
        return this.d;
    }

    @Override // o.AbstractC4534bgN
    @SerializedName("name")
    public String c() {
        return this.c;
    }

    @Override // o.AbstractC4534bgN
    @SerializedName(SignupConstants.Error.DEBUG_FIELD_KEY)
    public String d() {
        return this.a;
    }

    @Override // o.AbstractC4534bgN
    @SerializedName("rank")
    public int e() {
        return this.b;
    }

    @Override // o.AbstractC4534bgN
    @SerializedName("type")
    public String f() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4506bfm(boolean z, String str, int i, int i2, String str2, String str3) {
        this.d = z;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        this.b = i;
        this.e = i2;
        if (str2 == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str2;
        if (str3 == null) {
            throw new NullPointerException("Null type");
        }
        this.g = str3;
    }

    public String toString() {
        return "Server{lowgrade=" + this.d + ", name=" + this.c + ", rank=" + this.b + ", id=" + this.e + ", key=" + this.a + ", type=" + this.g + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4534bgN) {
            AbstractC4534bgN abstractC4534bgN = (AbstractC4534bgN) obj;
            return this.d == abstractC4534bgN.b() && this.c.equals(abstractC4534bgN.c()) && this.b == abstractC4534bgN.e() && this.e == abstractC4534bgN.a() && this.a.equals(abstractC4534bgN.d()) && this.g.equals(abstractC4534bgN.f());
        }
        return false;
    }

    public int hashCode() {
        int i = this.d ? 1231 : 1237;
        int hashCode = this.c.hashCode();
        int i2 = this.b;
        return ((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ this.e) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.g.hashCode();
    }
}
