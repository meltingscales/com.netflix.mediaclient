package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4471bfD;

/* renamed from: o.bfy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4518bfy {
    @SerializedName("adEventToken")
    public abstract String c();

    @SerializedName("event")
    public abstract String d();

    public static TypeAdapter<AbstractC4518bfy> e(Gson gson) {
        return new C4471bfD.e(gson);
    }
}
