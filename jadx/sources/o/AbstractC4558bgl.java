package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4482bfO;

/* renamed from: o.bgl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4558bgl {
    @SerializedName("playgraph")
    public abstract AbstractC4528bgH b();

    @SerializedName("startIdent")
    @Deprecated
    public abstract AbstractC4535bgO c();

    public static TypeAdapter<AbstractC4558bgl> e(Gson gson) {
        return new C4482bfO.e(gson);
    }
}
