package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import o.C4549bgc;

/* renamed from: o.bgL  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4532bgL {
    @SerializedName("streamingClientConfig")
    public abstract JsonObject a();

    @SerializedName("additionalGroupNames")
    public abstract List<String> e();

    public static TypeAdapter<AbstractC4532bgL> c(Gson gson) {
        return new C4549bgc.d(gson).c(Collections.emptyList());
    }
}
