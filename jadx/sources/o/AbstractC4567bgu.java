package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C4487bfT;

/* renamed from: o.bgu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4567bgu {
    @SerializedName(SignupConstants.Field.LANG_ID)
    public abstract String a();

    public static TypeAdapter<AbstractC4567bgu> c(Gson gson) {
        return new C4487bfT.b(gson);
    }
}
