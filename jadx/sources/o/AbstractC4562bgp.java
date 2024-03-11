package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4483bfP;

/* renamed from: o.bgp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4562bgp {
    @SerializedName("mediaId")
    public abstract String a();

    @SerializedName("subtitleTrackId")
    public abstract String b();

    @SerializedName("preferenceOrder")
    public abstract int c();

    @SerializedName("videoTrackId")
    public abstract String d();

    @SerializedName("audioTrackId")
    public abstract String e();

    public static TypeAdapter<AbstractC4562bgp> a(Gson gson) {
        return new C4483bfP.d(gson);
    }
}
