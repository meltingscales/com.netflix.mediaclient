package o;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import o.InterfaceC4661bii;

/* renamed from: o.bnR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4836bnR {
    @SerializedName("histMatch")
    public HashMap<String, String> a;
    @SerializedName("agemin")
    public Integer b;
    @SerializedName("histniqr")
    protected Double c;
    @SerializedName("agemax")
    public Integer d;
    @SerializedName("bw")
    public Integer e;
    @SerializedName("name")
    public String f;
    @SerializedName("histp50")
    protected Integer g;
    @SerializedName("histp75")
    protected Integer h;
    @SerializedName("lt")
    protected Integer i;
    @SerializedName("histp25")
    protected Integer j;
    @SerializedName("samples")
    public Integer n;

    protected C4836bnR() {
    }

    public C4836bnR(InterfaceC4661bii.c cVar) {
        this.f = cVar.n;
        this.e = cVar.d;
        this.b = cVar.b;
        this.a = cVar.c;
        this.n = cVar.f;
        this.c = cVar.g;
        this.j = cVar.h;
        this.g = cVar.i;
        this.h = cVar.j;
        this.d = cVar.e;
        this.i = cVar.k;
    }
}
