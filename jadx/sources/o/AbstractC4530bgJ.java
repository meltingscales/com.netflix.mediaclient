package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4548bgb;

/* renamed from: o.bgJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4530bgJ {
    @SerializedName("videoTrackId")
    public abstract String a();

    @SerializedName("timedTextTrackId")
    public abstract String b();

    @SerializedName("audioTrackId")
    public abstract String c();

    public static TypeAdapter<AbstractC4530bgJ> a(Gson gson) {
        return new C4548bgb.d(gson);
    }

    public static AbstractC4530bgJ b(String str, String str2, String str3) {
        return new C4548bgb(str, str2, str3);
    }
}
