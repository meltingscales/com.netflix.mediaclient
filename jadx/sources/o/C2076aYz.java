package o;

import com.netflix.android.org.json.HTTP;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetSessionMessageType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aYz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2076aYz {
    public static String c() {
        return "sessionAction=createSession\r\n";
    }

    /* renamed from: o.aYz$b */
    /* loaded from: classes3.dex */
    public static class b {
        private AbstractC2063aYm b;
        private TargetSessionMessageType c;

        public AbstractC2063aYm b() {
            return this.b;
        }

        public TargetSessionMessageType e() {
            return this.c;
        }

        public b(TargetSessionMessageType targetSessionMessageType, AbstractC2063aYm abstractC2063aYm) {
            this.c = targetSessionMessageType;
            this.b = abstractC2063aYm;
        }
    }

    public static String e(String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        String c = C2071aYu.c(bArr, str6);
        if (C8168dfL.g(c)) {
            return null;
        }
        String[] strArr = {"action=session", "version=1.0", "fromurl=" + str, "fromuuid=" + AbstractC2065aYo.h(), "fromuserid=" + str2, "touuid=" + str3, "touserid=" + str4, "nonce=" + str5, "ciphertext=" + c};
        String b2 = b(strArr);
        Arrays.sort(strArr);
        String c2 = c(strArr);
        C1044Mm.c("MdxTargetSession", "cform [%s]", c2);
        return b2 + "hmac=" + C2071aYu.e(bArr, c2) + HTTP.CRLF;
    }

    public static b c(JSONObject jSONObject, byte[] bArr, InterfaceC2008aWl interfaceC2008aWl, String str) {
        try {
            String optString = jSONObject.optString(SignupConstants.Error.DEBUG_INFO_ACTION);
            if ("endCastSession".equals(optString)) {
                C1044Mm.c("MdxTargetSession", "handle %s", optString);
                return new b(TargetSessionMessageType.MESSAGE_TYPE_ENDSESSOIN, null);
            } else if (UmaAlert.ICON_ERROR.equals(optString)) {
                C1044Mm.j("MdxTargetSession", "get a session error massage");
                return c(jSONObject);
            } else if (!"session".equals(optString)) {
                C1044Mm.j("MdxTargetSession", "not a session massage %s. BUG!!!", optString);
                return new b(TargetSessionMessageType.MESSAGE_TYPE_ENDSESSOIN, null);
            } else {
                String optString2 = jSONObject.optString("ciphertext");
                if (C8168dfL.g(optString2)) {
                    return null;
                }
                String b2 = C2071aYu.b(bArr, optString2);
                if (C8168dfL.g(b2)) {
                    C1044Mm.d("MdxTargetSession", "appMsg is empty");
                    return null;
                }
                return AbstractC2063aYm.a(C2069aYs.a(b2));
            }
        } catch (JSONException e) {
            C1044Mm.e("MdxTargetSession", "failed to parse session message: %s", jSONObject, e);
            return null;
        }
    }

    private static b c(JSONObject jSONObject) {
        String optString = jSONObject.optString("errorcode");
        String optString2 = jSONObject.optString("errorstring");
        if ("7".equals(optString) || "5".equals(optString) || "9".equals(optString) || "8".equals(optString)) {
            C1044Mm.j("MdxTargetSession", "session error %s, %s, redo pairing", optString, optString2);
            return new b(TargetSessionMessageType.MESSAGE_TYPE_ERROR_BADPAIR, null);
        }
        C1044Mm.j("MdxTargetSession", "session error %s, %s, restart sesssion", optString, optString2);
        return new b(TargetSessionMessageType.MESSAGE_TYPE_ERROR_BADSESSION, null);
    }

    private static String b(String[] strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (C8168dfL.h(str2)) {
                str = str + str2 + HTTP.CRLF;
            }
        }
        return str;
    }

    private static String c(String[] strArr) {
        if (strArr.length >= 1) {
            String str = strArr[0];
            if (C8168dfL.g(c(str))) {
                return null;
            }
            for (int i = 1; i < strArr.length; i++) {
                String c = c(strArr[i]);
                if (C8168dfL.g(c)) {
                    return null;
                }
                str = str + "&" + c;
            }
            return str;
        }
        return null;
    }

    private static String c(String str) {
        String[] split = str.split("=", 2);
        try {
            return split[0] + "=" + URLEncoder.encode(split[1], "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
