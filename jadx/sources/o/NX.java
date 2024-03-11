package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.NT;

/* loaded from: classes.dex */
public abstract class NX {

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract NX b();

        public abstract e e(NV nv);
    }

    public abstract e a();

    @SerializedName("osInfo")
    public abstract NV d();

    public static NX c(String str) {
        NX nx = (NX) ((Gson) C1332Xp.b(Gson.class)).fromJson(str, (Class<Object>) NX.class);
        return nx == null ? c() : nx;
    }

    public String b() {
        return ((Gson) C1332Xp.b(Gson.class)).toJson(this);
    }

    private static NX c() {
        return new NT(NV.d());
    }

    public static TypeAdapter<NX> e(Gson gson) {
        return new NT.a(gson);
    }
}
