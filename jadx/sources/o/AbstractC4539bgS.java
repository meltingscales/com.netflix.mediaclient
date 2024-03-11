package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import o.C4557bgk;

/* renamed from: o.bgS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4539bgS {
    @SerializedName("interactionZonesV2")
    public abstract List<List<Long>> e();

    public static TypeAdapter<AbstractC4539bgS> b(Gson gson) {
        return new C4557bgk.b(gson);
    }
}
