package o;

import org.json.JSONObject;

/* renamed from: o.aHh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1600aHh {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(JSONObject jSONObject, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
