package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C4476bfI;

/* renamed from: o.bfC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4470bfC {
    @SerializedName("ads")
    public abstract List<AbstractC4468bfA> a();

    @SerializedName("locationMs")
    public abstract long b();

    @SerializedName("actionAdBreakEvents")
    public abstract Map<String, AbstractC4518bfy> c();

    @SerializedName("auditPingUrl")
    public abstract String d();

    @SerializedName("adBreakToken")
    public abstract String e();

    public static TypeAdapter<AbstractC4470bfC> c(Gson gson) {
        return new C4476bfI.c(gson).a(Collections.EMPTY_MAP);
    }

    public List<AbstractC4468bfA> j() {
        return a() == null ? Collections.EMPTY_LIST : a();
    }

    public boolean f() {
        return a() != null;
    }
}
