package o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.bab  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4230bab {
    @SerializedName("via")
    protected String a;
    @SerializedName("cip")
    protected String b;
    @SerializedName("Via")
    protected String c;
    @SerializedName("server_recv_ts")
    protected long d;
    @SerializedName("Cip")
    protected String e;

    public String c() {
        String str = this.e;
        return str == null ? this.b : str;
    }

    public String e() {
        String str = this.c;
        return str == null ? this.a : str;
    }
}
