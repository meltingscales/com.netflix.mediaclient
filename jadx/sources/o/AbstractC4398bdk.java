package o;

import android.content.Context;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.net.NetworkRequestType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4398bdk extends AbstractC2103aZz<JSONObject> {
    protected Context e;

    protected abstract String T();

    public AbstractC4398bdk(Context context) {
        this.e = context;
    }

    @Override // o.AbstractC2103aZz, o.aZE
    public void L() {
        k(((aZE) this).i.j().i().toExternalForm());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: c */
    public JSONObject d(C8380djl c8380djl) {
        String c = c8380djl.c();
        if (AbstractC2100aZw.j(c)) {
            C1044Mm.d("nf_bladerunner", "User is not authorized, trying recovery...");
            throw new FalkorException(c);
        }
        return a(c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: f */
    public JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            C1044Mm.e("nf_bladerunner", "error parsing json", e);
            return null;
        }
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        if (j == null) {
            j = new HashMap<>();
        }
        j.put("X-Netflix.Request.NqTracking", T());
        e(j);
        return j;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public final Object y() {
        return NetworkRequestType.PLAY_OTHER;
    }
}
