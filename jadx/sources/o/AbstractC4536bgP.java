package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.Url;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C4550bgd;

/* renamed from: o.bgP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4536bgP {
    public static final AbstractC4536bgP a = new C4550bgd(1, Collections.singletonMap("0", Url.DUMMY), 0, 0, null, null);

    /* renamed from: o.bgP$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a c(Map<String, String> map);

        public abstract AbstractC4536bgP c();
    }

    @SerializedName("midxSize")
    public abstract int a();

    @SerializedName("liveOcaCapabilities")
    public abstract Map<String, List<String>> b();

    @SerializedName("downloadUrls")
    public abstract Map<String, String> c();

    @SerializedName("representationId")
    public abstract String d();

    @SerializedName("midxOffset")
    public abstract int e();

    @SerializedName("size")
    public abstract int g();

    public abstract a j();

    public static TypeAdapter<AbstractC4536bgP> d(Gson gson) {
        return new C4550bgd.a(gson);
    }
}
