package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import o.C4477bfJ;

/* renamed from: o.bfF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4473bfF {
    @SerializedName("adBreaks")
    public abstract List<AbstractC4470bfC> b();

    public static TypeAdapter<AbstractC4473bfF> b(Gson gson) {
        return new C4477bfJ.b(gson);
    }
}
