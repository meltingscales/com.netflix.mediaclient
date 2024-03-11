package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4491bfX;

/* renamed from: o.bgI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4529bgI {
    @SerializedName("media")
    public abstract String a();

    @SerializedName("duration")
    public abstract long b();

    @SerializedName("availabilityStartTime")
    public abstract String c();

    @SerializedName("presentationTimeOffset")
    public abstract long d();

    @SerializedName("initialization")
    public abstract String e();

    @SerializedName("startNumber")
    public abstract long g();

    @SerializedName("timescale")
    public abstract long j();

    public static TypeAdapter<AbstractC4529bgI> e(Gson gson) {
        return new C4491bfX.a(gson);
    }
}
