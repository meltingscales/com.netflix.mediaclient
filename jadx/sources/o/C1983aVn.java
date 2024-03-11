package o;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.player.bladerunnerclient.PdsEventType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aVn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1983aVn {
    public static void c(Context context, String str, Status status) {
        d(context, C1987aVr.h, str, C8128deY.a(status), C8128deY.d(status));
    }

    private static void d(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(str);
        intent.addCategory(C1987aVr.c);
        intent.putExtra(C1987aVr.d, str2);
        intent.putExtra(C1987aVr.b, str3);
        intent.putExtra(C1987aVr.e, str4);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static NetworkRequestType d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("params")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                String optString = jSONObject2.optString("event");
                if (C8168dfL.h(optString) && C8168dfL.d(optString, PdsEventType.KEEP_ALIVE.d())) {
                    boolean optBoolean = jSONObject2.optBoolean("isBackgrounded", false);
                    C1044Mm.a("nf_pds", "isBackgrounded : %b", Boolean.valueOf(optBoolean));
                    return optBoolean ? NetworkRequestType.PDS_KEEP_ALIVE_BACKGROUND : NetworkRequestType.PDS_KEEP_ALIVE;
                }
            } catch (JSONException e) {
                C1044Mm.e("nf_pds", "exception in getNetworkRequestType ", e);
            }
        }
        return NetworkRequestType.PDS_EVENT;
    }

    public static Set<b> e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i).getJSONObject("params");
                String optString = jSONObject.optString("event");
                b bVar = new b(optString, jSONObject.optBoolean("livecontent"));
                if (C8168dfL.h(optString) && !hashSet.contains(bVar)) {
                    hashSet.add(bVar);
                }
            } catch (JSONException e) {
                C1044Mm.b("nf_pds", e, "unable to parse JSON", new Object[0]);
            }
        }
        return hashSet;
    }

    /* renamed from: o.aVn$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public final String b;
        public final boolean d;

        public b(String str, boolean z) {
            this.b = str;
            this.d = z;
        }

        public boolean equals(Object obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.d == bVar.d && Objects.equals(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.b, Boolean.valueOf(this.d));
        }
    }
}
