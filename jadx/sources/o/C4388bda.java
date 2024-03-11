package o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bda  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4388bda extends C4393bdf {
    private final boolean d;
    private final String e;

    public C4388bda(boolean z, String str) {
        this.d = z;
        this.e = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4393bdf
    public JSONObject d() {
        JSONObject d = super.d();
        try {
            d.put("downloadCompleted", this.d);
            if (C8168dfL.h(this.e)) {
                d.put("secureStop", this.e);
            }
        } catch (JSONException e) {
            C1044Mm.b("nf_msl_volley_bladerunner", e, "error creating params", new Object[0]);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.C4393bdf
    public final String a() {
        return b(d()).toString();
    }
}
