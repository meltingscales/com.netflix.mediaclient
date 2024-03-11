package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C4492bfY;

/* renamed from: o.bgN  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4534bgN {
    @SerializedName(SignupConstants.Field.LANG_ID)
    public abstract int a();

    @SerializedName("lowgrade")
    public abstract boolean b();

    @SerializedName("name")
    public abstract String c();

    @SerializedName(SignupConstants.Error.DEBUG_FIELD_KEY)
    public abstract String d();

    @SerializedName("rank")
    public abstract int e();

    @SerializedName("type")
    public abstract String f();

    public static TypeAdapter<AbstractC4534bgN> e(Gson gson) {
        return new C4492bfY.e(gson);
    }

    public static AbstractC4534bgN a(boolean z, String str, int i, int i2, String str2, String str3) {
        return new C4492bfY(z, str, i, i2, str2, str3);
    }

    public static AbstractC4534bgN c(int i, List<AbstractC4534bgN> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        AbstractC4534bgN abstractC4534bgN = list.get(0);
        for (AbstractC4534bgN abstractC4534bgN2 : list) {
            if (abstractC4534bgN2.a() == i) {
                return abstractC4534bgN2;
            }
        }
        return abstractC4534bgN;
    }
}
