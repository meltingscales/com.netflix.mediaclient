package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.concurrent.TimeUnit;
import o.NU;

/* loaded from: classes.dex */
public abstract class NV {
    @SerializedName("firstSeenTime")
    public abstract long c();

    @SerializedName("api")
    public abstract int e();

    public static TypeAdapter<NV> b(Gson gson) {
        return new NU.a(gson);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NV d() {
        return new NU(0, 0L);
    }

    public static NV c(int i) {
        return new NU(i, System.currentTimeMillis());
    }

    public boolean e(int i) {
        return System.currentTimeMillis() <= TimeUnit.DAYS.toMillis((long) i) + c();
    }
}
