package o;

import android.util.Pair;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.cfF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6537cfF {
    private Pair<String, String>[] a;
    private String b;
    private String c;
    private final String e;

    public String a() {
        return this.c;
    }

    public Pair<String, String>[] c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public C6537cfF(JSONObject jSONObject) {
        this.e = "mdxui";
        this.b = C8123deT.a(jSONObject, SignupConstants.Field.VIDEO_TITLE, (String) null);
        this.c = C8123deT.a(jSONObject, "message", (String) null);
        JSONArray c = C8123deT.c(jSONObject, "options");
        if (c == null) {
            C1044Mm.d("mdxui", "Invalid data, no options found!");
            this.a = new Pair[0];
            return;
        }
        this.a = new Pair[c.length()];
        for (int i = 0; i < c.length(); i++) {
            JSONObject jSONObject2 = c.getJSONObject(i);
            this.a[i] = Pair.create(C8123deT.a(jSONObject2, "name", (String) null), C8123deT.a(jSONObject2, NotificationFactory.DATA, (String) null));
        }
    }

    public C6537cfF(String str) {
        this(new JSONObject(str));
    }

    public String toString() {
        return "RemoteDialog [ mTitle=" + this.b + ", mMessage=" + this.c + ", options=" + Arrays.toString(this.a) + "]";
    }
}
