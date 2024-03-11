package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4552bgf;

/* renamed from: o.bgO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4535bgO {
    @SerializedName("viewableId")
    public abstract long c();

    public static TypeAdapter<AbstractC4535bgO> b(Gson gson) {
        return new C4552bgf.d(gson);
    }
}
