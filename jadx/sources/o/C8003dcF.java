package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import java.util.List;

/* renamed from: o.dcF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8003dcF {
    public static void e() {
        aRP.e(aRJ.class, aRN.class, aRR.class, aRS.class);
    }

    public static void e(Context context) {
        SignInConfigData.Fields fields;
        List<SignInConfigData.NmAbConfig> list;
        SignInConfigData fromJsonString = SignInConfigData.fromJsonString(C8157dfA.e(context, "signInConfigData", (String) null));
        if (fromJsonString == null || (fields = fromJsonString.fields) == null || (list = fields.abAllocations) == null || list.size() == 0) {
            return;
        }
        C1823aPo.d(context, fromJsonString.fields.abAllocations);
    }
}
