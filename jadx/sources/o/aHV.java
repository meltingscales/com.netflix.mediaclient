package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C1615aHw;

/* loaded from: classes.dex */
public abstract class aHV {

    /* loaded from: classes.dex */
    static abstract class d {
        abstract d a(int i);

        abstract aHV a();

        abstract d e(int i);
    }

    protected abstract d a();

    @SerializedName("retryAfterSeconds")
    public abstract int b();

    @SerializedName("maxRetries")
    public abstract int d();

    public static TypeAdapter<aHV> a(Gson gson) {
        return new C1615aHw.a(gson).d(-1).a(-1);
    }

    public static aHV a(aHV ahv, aHV ahv2) {
        d dVar;
        if (ahv2 == null) {
            return ahv;
        }
        if (ahv2.d() == -1 || ahv2.d() == ahv.d()) {
            dVar = null;
        } else {
            dVar = ahv.a();
            dVar.a(ahv2.d());
        }
        if (ahv2.b() != -1 && ahv2.b() != ahv.b()) {
            if (dVar == null) {
                dVar = ahv.a();
            }
            dVar.e(ahv2.b());
        }
        return dVar == null ? ahv : dVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aHV c() {
        return new C1615aHw(-1, -1);
    }
}
