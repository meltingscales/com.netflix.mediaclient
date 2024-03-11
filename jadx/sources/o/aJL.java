package o;

import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveySelectorViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aJL {
    public static final aJL b = new aJL();

    private aJL() {
    }

    public static final Map<String, String> e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-netflix.context.ui-flavor", "android");
        linkedHashMap.put("x-netflix.context.app-version", str);
        linkedHashMap.put("x-netflix.context.os-version", String.valueOf(C8054ddD.c()));
        linkedHashMap.put("x-netflix.context.form-factor", C8151dev.f() ? DeviceSurveySelectorViewModel.TABLET : "phone");
        if (str2 != null) {
            linkedHashMap.put("x-netflix.context.locales", str2);
        }
        return linkedHashMap;
    }
}
