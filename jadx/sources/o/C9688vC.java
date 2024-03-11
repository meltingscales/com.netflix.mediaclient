package o;

import com.google.gson.JsonElement;

/* renamed from: o.vC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9688vC {
    public static final String c(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        if (jsonElement.isJsonNull()) {
            return null;
        }
        return jsonElement.getAsString();
    }
}
