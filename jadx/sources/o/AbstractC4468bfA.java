package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C4474bfG;

/* renamed from: o.bfA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4468bfA {
    @SerializedName("is3pVerificationEnabled")
    public abstract boolean a();

    @SerializedName(SignupConstants.Field.LANG_ID)
    public abstract long b();

    @SerializedName("actionAdEvents")
    public abstract Map<String, AbstractC4518bfy> c();

    @SerializedName("startTimeMs")
    public abstract long d();

    @SerializedName("endTimeMs")
    public abstract long e();

    @SerializedName("thirdPartyVerificationToken")
    public abstract String h();

    @SerializedName("timedAdEvents")
    public abstract List<AbstractC4533bgM> j();

    public static TypeAdapter<AbstractC4468bfA> d(Gson gson) {
        return new C4474bfG.d(gson).b(Collections.EMPTY_LIST).b(Collections.EMPTY_MAP);
    }
}
