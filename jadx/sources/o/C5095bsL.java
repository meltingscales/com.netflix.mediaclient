package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.PostPlayItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bsL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5095bsL {
    private b[] b;
    private String c;

    public b[] c() {
        return this.b;
    }

    /* renamed from: o.bsL$b */
    /* loaded from: classes4.dex */
    public class b {
        private String b;
        private String d;

        public String a() {
            return this.d;
        }

        b(String str, String str2) {
            this.d = str;
            this.b = str2;
        }

        public boolean c() {
            String str = this.b;
            if (str != null) {
                return str.contains(PostPlayItem.POST_PLAY_ITEM_EPISODE);
            }
            return false;
        }
    }

    public C5095bsL(String str) {
        C1044Mm.a(C5095bsL.class.getSimpleName(), str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = jSONObject.optString("state");
            JSONObject jSONObject2 = jSONObject.getJSONObject(SignupConstants.Field.VIDEO_TITLE);
            String optString = jSONObject2.optString(SignupConstants.Field.LANG_ID);
            String optString2 = jSONObject2.optString("type");
            this.b = r3;
            b[] bVarArr = {new b(optString, optString2)};
        } catch (JSONException e) {
            String simpleName = C5095bsL.class.getSimpleName();
            C1044Mm.d(simpleName, "JSON error " + str);
            InterfaceC1598aHf.e("MdxPostplayState failed to parse PostPlay JSON: " + str, e);
        }
    }

    public boolean d() {
        return "POST_PLAY_COUNTDOWN".equals(this.c);
    }

    public boolean e() {
        return "POST_PLAY_PROMPT".equals(this.c);
    }
}
