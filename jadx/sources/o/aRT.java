package o;

import com.google.gson.annotations.SerializedName;
import java.util.Random;

/* loaded from: classes.dex */
public final class aRT {
    @SerializedName("samplePlayEventRepoStats")
    private int a = 1;
    @SerializedName("enabled")
    private boolean c = true;
    private final int b = new Random().nextInt(100) + 1;

    public final boolean c() {
        return this.c;
    }

    public final boolean e() {
        return this.b <= this.a;
    }
}
