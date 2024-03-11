package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.C4479bfL;

/* renamed from: o.bgj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4556bgj {
    @SerializedName("segments")
    public abstract Map<String, AbstractC4531bgK> a();

    @SerializedName("initialSegment")
    public abstract String b();

    @SerializedName("viewableId")
    public abstract long c();

    public static TypeAdapter<AbstractC4556bgj> e(Gson gson) {
        return new C4479bfL.a(gson);
    }
}
