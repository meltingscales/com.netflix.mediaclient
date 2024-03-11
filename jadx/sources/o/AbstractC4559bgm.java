package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4485bfR;

/* renamed from: o.bgm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4559bgm {
    @SerializedName("offset")
    public abstract int b();

    @SerializedName("size")
    public abstract int c();

    public static TypeAdapter<AbstractC4559bgm> e(Gson gson) {
        return new C4485bfR.b(gson);
    }
}
