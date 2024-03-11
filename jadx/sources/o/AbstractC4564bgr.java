package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4490bfW;

/* renamed from: o.bgr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4564bgr {
    @SerializedName("license")
    public abstract AbstractC4561bgo a();

    @SerializedName("events")
    public abstract AbstractC4561bgo b();

    @SerializedName("stopPlayback")
    public abstract AbstractC4561bgo d();

    @SerializedName("ldl")
    public abstract AbstractC4561bgo e();

    public static TypeAdapter<AbstractC4564bgr> d(Gson gson) {
        return new C4490bfW.b(gson);
    }
}
