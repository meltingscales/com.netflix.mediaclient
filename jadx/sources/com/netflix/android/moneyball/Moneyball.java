package com.netflix.android.moneyball;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import o.C8632dsu;
import o.dsH;
import o.dsT;

/* loaded from: classes2.dex */
public final class Moneyball {
    public static final Moneyball INSTANCE = new Moneyball();
    private static final Gson gson = new Gson();

    public final Gson getGson() {
        return gson;
    }

    private Moneyball() {
    }

    public final FlowMode parseJsonToFlowMode(String str) {
        C8632dsu.c((Object) str, "");
        Object fromJson = gson.fromJson(str, TypeToken.getParameterized(Map.class, String.class, Object.class).getType());
        C8632dsu.a(fromJson, "");
        Map<String, Object> map = (Map) fromJson;
        recursiveSetLongs(map);
        return new FlowMode(map);
    }

    public final void recursiveSetLongs(Map<String, Object> map) {
        long a;
        C8632dsu.c((Object) map, "");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Double) {
                String key = entry.getKey();
                a = dsT.a(((Number) value).doubleValue());
                map.put(key, Long.valueOf(a));
            } else if (dsH.f(value)) {
                Moneyball moneyball = INSTANCE;
                C8632dsu.d(value);
                moneyball.recursiveSetLongs(dsH.d(value));
            }
        }
    }
}
