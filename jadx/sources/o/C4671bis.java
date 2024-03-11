package o;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bis  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4671bis {
    private SharedPreferences.Editor a;
    private SharedPreferences d;
    private final long e;

    private String e() {
        return "media_cache_evicted_bytes";
    }

    public C4671bis(long j) {
        SharedPreferences sharedPreferences = ((Context) C1332Xp.b(Context.class)).getSharedPreferences("nfxpref", 0);
        this.d = sharedPreferences;
        this.a = sharedPreferences.edit();
        this.e = j;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mediaCacheSize", this.e);
            jSONObject.put("mediaCacheEvictedBytes", d());
        } catch (JSONException e) {
            C1044Mm.b("nf_cache", e, "unable to convert to json", new Object[0]);
        }
        return jSONObject;
    }

    private long d() {
        long j;
        synchronized (this) {
            String e = e();
            j = this.d.getLong(e, 0L);
            this.a.putLong(e, 0L);
            this.a.apply();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j) {
        synchronized (this) {
            String e = e();
            this.a.putLong(e, this.d.getLong(e, 0L) + j);
            this.a.apply();
        }
    }
}
