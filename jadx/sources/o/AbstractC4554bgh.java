package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4480bfM;

/* renamed from: o.bgh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4554bgh {
    @SerializedName("pbcid")
    public abstract String d();

    public static TypeAdapter<AbstractC4554bgh> d(Gson gson) {
        return new C4480bfM.b(gson);
    }
}
