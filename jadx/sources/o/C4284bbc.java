package o;

import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import o.InterfaceC4525bgE;

/* renamed from: o.bbc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4284bbc {
    @SerializedName("level")
    public String b;
    @SerializedName("maxHeight")
    public int c;
    @SerializedName("maxWidth")
    public int e;

    public C4284bbc(String str) {
        this.b = str;
    }

    public static C4284bbc c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (C4284bbc) C8118deO.a().fromJson(str, (Class<Object>) C4284bbc.class);
        } catch (JsonParseException unused) {
            return null;
        }
    }

    public static String b(C4284bbc c4284bbc) {
        if (c4284bbc == null) {
            return null;
        }
        try {
            return C8118deO.a().toJson(c4284bbc);
        } catch (JsonParseException unused) {
            return null;
        }
    }

    public static boolean b(C4284bbc c4284bbc, String str) {
        if (c4284bbc == null || str == null) {
            return false;
        }
        if ("L1".equals(c4284bbc.b) && "L3".equals(str)) {
            return true;
        }
        return "L3".equals(c4284bbc.b) && "L1".equals(str);
    }

    public void d(InterfaceC4525bgE.c cVar) {
        this.e = cVar.d;
        this.c = cVar.b;
    }
}
