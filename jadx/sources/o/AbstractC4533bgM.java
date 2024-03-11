package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4553bgg;

/* renamed from: o.bgM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4533bgM {
    @SerializedName("timeMs")
    public abstract long a();

    @SerializedName("adEventToken")
    public abstract String d();

    @SerializedName("event")
    public abstract String e();

    public static TypeAdapter<AbstractC4533bgM> c(Gson gson) {
        return new C4553bgg.c(gson);
    }
}
