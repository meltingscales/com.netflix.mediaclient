package o;

import android.content.Context;
import android.util.Base64;
import android.util.Pair;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cfB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6533cfB {
    private static int a = 0;
    private static int c = 1;
    private static byte e$ss2$124 = 24;
    private final String b = "nf_mdx";
    private final C6581cfx[] d;
    private C6581cfx e;

    public C6581cfx[] a() {
        return this.d;
    }

    public C6581cfx d() {
        return this.e;
    }

    public C6533cfB(Pair<String, String>[] pairArr, String str, boolean z) {
        pairArr = pairArr == null ? new Pair[0] : pairArr;
        if (z) {
            C1044Mm.e("nf_mdx", "Include all targets");
            this.d = d(pairArr, str);
        } else {
            C1044Mm.e("nf_mdx", "Include ONLY remote targets");
            this.d = e(pairArr, str);
        }
        if (this.e == null) {
            C6581cfx[] c6581cfxArr = this.d;
            if (c6581cfxArr.length > 0) {
                this.e = c6581cfxArr[0];
            }
        }
    }

    private C6581cfx[] e(Pair<String, String>[] pairArr, String str) {
        C6581cfx[] c6581cfxArr = new C6581cfx[pairArr.length];
        for (int i = 0; i < pairArr.length; i++) {
            C6581cfx a2 = C6581cfx.a(pairArr[i]);
            c6581cfxArr[i] = a2;
            if (a2.d().equals(str)) {
                this.e = c6581cfxArr[i];
            }
        }
        return c6581cfxArr;
    }

    private C6581cfx[] d(Pair<String, String>[] pairArr, String str) {
        C6581cfx[] c6581cfxArr = new C6581cfx[pairArr.length + 1];
        int i = 0;
        c6581cfxArr[0] = C6581cfx.a();
        while (i < pairArr.length) {
            int i2 = i + 1;
            C6581cfx a2 = C6581cfx.a(pairArr[i]);
            c6581cfxArr[i2] = a2;
            if (a2.d().equals(str)) {
                this.e = c6581cfxArr[i2];
            }
            i = i2;
        }
        return c6581cfxArr;
    }

    public C6581cfx c(int i) {
        C6581cfx[] c6581cfxArr = this.d;
        if (c6581cfxArr != null && c6581cfxArr.length > i) {
            C6581cfx c6581cfx = c6581cfxArr[i];
            this.e = c6581cfx;
            return c6581cfx;
        }
        C1044Mm.d("nf_mdx", "Target NOT found! This should NOT happen!");
        return null;
    }

    public List<String> a(Context context) {
        if (this.d == null) {
            C1044Mm.d("nf_mdx", "We should never be here. No targets!");
        }
        return d(context, this.d);
    }

    private static List<String> d(Context context, C6581cfx[] c6581cfxArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (c6581cfxArr != null) {
            int length = c6581cfxArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = c + 3;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    c6581cfxArr[i2].e();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                C6581cfx c6581cfx = c6581cfxArr[i2];
                if (c6581cfx.e()) {
                    String string = context.getString(com.netflix.mediaclient.ui.R.o.dZ);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        f(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                    }
                    arrayList.add(string);
                } else {
                    arrayList.add(c6581cfx.b());
                }
                i2++;
                int i4 = a + 89;
                c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 5;
                }
            }
        }
        return arrayList;
    }

    public int b() {
        int i = 0;
        while (true) {
            C6581cfx[] c6581cfxArr = this.d;
            if (i < c6581cfxArr.length) {
                if (c6581cfxArr[i].e()) {
                    C1044Mm.e("nf_mdx", "Local device found on position " + i);
                    return i;
                }
                i++;
            } else {
                C1044Mm.d("nf_mdx", "We do NOT have local device from Mobile UI");
                return 0;
            }
        }
    }

    public int e(String str) {
        if (C8168dfL.g(str)) {
            C1044Mm.d("nf_mdx", "getDevicePositionByUUID:: Given UUID is null!");
            return 0;
        }
        int i = 0;
        while (true) {
            C6581cfx[] c6581cfxArr = this.d;
            if (i < c6581cfxArr.length) {
                if (str.equals(c6581cfxArr[i].d())) {
                    C1044Mm.e("nf_mdx", "getDevicePositionByUUID:: given device found on position " + i);
                    return i;
                }
                i++;
            } else {
                C1044Mm.d("nf_mdx", "Selected device not found!");
                return 0;
            }
        }
    }

    public JSONObject c() {
        if (this.d == null) {
            return null;
        }
        try {
            return new JSONObject().put("castDeviceList", new JSONArray(new Gson().toJson(this.d)));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$124);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
