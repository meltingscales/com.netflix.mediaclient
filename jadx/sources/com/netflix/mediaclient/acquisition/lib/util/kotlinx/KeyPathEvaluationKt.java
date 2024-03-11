package com.netflix.mediaclient.acquisition.lib.util.kotlinx;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import java.util.List;
import java.util.Map;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class KeyPathEvaluationKt {
    public static final Object getPathValue(Object obj, List<String> list) {
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            return obj;
        }
        if (obj instanceof Map) {
            return getPathValue((Map<Object, ? extends Object>) obj, list);
        }
        if (obj instanceof List) {
            return getPathValue((List<? extends Object>) obj, list);
        }
        return null;
    }

    public static final Object getPathValue(Object obj, List<String> list, SignupErrorReporter signupErrorReporter) {
        Object B;
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        Object pathValue = getPathValue(obj, list);
        if (pathValue == null) {
            B = C8576dqs.B((List<? extends Object>) list);
            SignupErrorReporter.onDataError$default(signupErrorReporter, SignupConstants.Error.MISSING_FIELD_ERROR, (String) B, null, 4, null);
        }
        return pathValue;
    }

    public static final Object getPathValue(Map<Object, ? extends Object> map, List<String> list) {
        List i;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            return map;
        }
        Object obj = map.get(list.get(0));
        if (obj != null) {
            i = C8576dqs.i(list, 1);
            return getPathValue(obj, i);
        }
        return null;
    }

    public static final Object getPathValue(List<? extends Object> list, List<String> list2) {
        Object f;
        List i;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        if (list2.isEmpty()) {
            return list;
        }
        try {
            f = C8576dqs.f((List<? extends Object>) list, Integer.parseInt(list2.get(0)));
            if (f != null) {
                i = C8576dqs.i(list2, 1);
                return getPathValue(f, i);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
