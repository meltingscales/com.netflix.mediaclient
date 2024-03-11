package o;

import com.netflix.mediaclient.service.mdx.MdxErrorCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.model.leafs.originals.interactive.Audio;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aWO {
    private String c;
    private aVX d;

    public aWO(aVX avx, String str) {
        this.d = avx;
        this.c = str;
    }

    public void a(JSONObject jSONObject) {
        aVX avx = this.d;
        if (avx != null) {
            MdxErrorCode e = avx.e();
            MdxErrorSubCode b = this.d.b();
            String d = this.d.d();
            String a = this.d.a();
            String c = this.d.c();
            if (e != null) {
                jSONObject.put("errorcode", e.toString());
            }
            if (b != null) {
                jSONObject.put("errorsubcode", b.toString());
            }
            if (C8168dfL.h(d)) {
                jSONObject.put("errorextcode", d);
            }
            if (C8168dfL.h(a)) {
                jSONObject.put("errordisplaycode", a);
            }
            if (C8168dfL.h(c)) {
                jSONObject.put("errordetails", c);
            }
            if (C8168dfL.h(this.c)) {
                jSONObject.put(Audio.TYPE.timeout, this.c);
            }
        }
    }
}
