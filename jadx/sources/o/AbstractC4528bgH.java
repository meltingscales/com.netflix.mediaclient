package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.C4493bfZ;

/* renamed from: o.bgH  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4528bgH {
    @SerializedName("initialSegment")
    public abstract String a();

    @SerializedName("segments")
    public abstract Map<String, AbstractC4531bgK> c();

    public static TypeAdapter<AbstractC4528bgH> e(Gson gson) {
        return new C4493bfZ.c(gson);
    }
}
