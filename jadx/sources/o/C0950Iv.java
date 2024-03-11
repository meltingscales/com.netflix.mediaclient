package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/* renamed from: o.Iv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950Iv {
    public static final HO b(HH hh) {
        C8632dsu.c((Object) hh, "");
        JsonElement d = hh.d();
        if (d instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) d;
            if (jsonObject.has("_sentinel")) {
                JsonElement jsonElement = jsonObject.get("$expires");
                Long valueOf = (jsonElement == null || !jsonElement.isJsonPrimitive()) ? null : Long.valueOf(jsonElement.getAsLong());
                if (jsonObject.has("value")) {
                    JsonElement jsonElement2 = jsonObject.get("value");
                    C8632dsu.d(jsonElement2);
                    return new HH(jsonElement2, valueOf, null, null, null, false, 48, null);
                }
                return new HV(valueOf);
            }
            return hh;
        }
        return hh;
    }

    public static final JsonElement e(HZ hz) {
        C8632dsu.c((Object) hz, "");
        if (hz instanceof HH) {
            return ((HH) hz).d();
        }
        return HA.e.a(hz);
    }
}
