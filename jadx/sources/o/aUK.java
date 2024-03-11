package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aUK extends C1973aVd {
    public static final d e = new d(null);
    private final int a;
    private final String b;
    private final String h;

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aUK(String str, int i, String str2, String str3, boolean z) {
        super(str, "play", z);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.a = i;
        this.b = str2;
        this.h = str3;
    }

    @Override // o.C1973aVd
    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trackId", this.a);
        jSONObject.put("params", jSONObject2);
        jSONObject.put("term", this.b);
        jSONObject.put(SignupConstants.Field.VIDEO_ID, this.h);
        return jSONObject;
    }
}
