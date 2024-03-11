package com.netflix.falkor;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.netflix.android.volley.VolleyError;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C0946Ir;
import o.C1044Mm;
import o.C1332Xp;

/* loaded from: classes3.dex */
public final class FalkorException extends VolleyError {
    private static String d = "FalkorException";
    private e[] a;
    public final Map<String, String> c;
    public final String e;
    private boolean g;

    /* loaded from: classes3.dex */
    public class e {
        @SerializedName("message")
        String c;
        @SerializedName(Ease.ANIMATION_EASE_TYPE.PATH)
        List<String> e;
    }

    public FalkorException b(boolean z) {
        this.g = z;
        return this;
    }

    public boolean b() {
        return this.g;
    }

    public FalkorException(String str) {
        super(str);
        this.g = true;
        this.e = null;
        this.c = null;
    }

    public FalkorException(Throwable th) {
        super(th);
        this.g = true;
        this.e = null;
        this.c = null;
    }

    public FalkorException(String str, Throwable th) {
        super(str, th);
        this.g = true;
        this.e = null;
        this.c = null;
    }

    public FalkorException(String str, String str2, JsonObject jsonObject, Map<String, String> map) {
        super(str);
        this.g = true;
        this.e = str2;
        this.c = map;
        c(jsonObject);
    }

    private void c(JsonObject jsonObject) {
        if (C0946Ir.a(jsonObject)) {
            try {
                this.a = (e[]) ((Gson) C1332Xp.b(Gson.class)).fromJson(jsonObject.getAsJsonArray("errors").toString(), (Class<Object>) e[].class);
            } catch (Exception e2) {
                C1044Mm.e(d, e2, "can't parse error object", new Object[0]);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
        if (r1.equals("deviceConfig") == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.mediaclient.StatusCode a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.falkor.FalkorException.a(java.lang.String):com.netflix.mediaclient.StatusCode");
    }

    private static boolean i(String str) {
        return str.contains("wrong state".toLowerCase());
    }

    private static boolean b(String str) {
        return str.contains("failurereason=invalidcountry".toLowerCase());
    }

    private static boolean e(String str) {
        return str.contains("failurereason=insufficientdata".toLowerCase());
    }

    public static boolean c(String str) {
        return str.contains("NON_MEMBER_FAULT".toLowerCase(Locale.US)) || str.contains("not authorized") || str.contains("unauthorized");
    }

    private static boolean d(String str) {
        return str.contains("deleted profile".toLowerCase());
    }

    private static boolean g(String str) {
        return str.contains("nullpointerexception".toLowerCase());
    }

    private static boolean h(String str) {
        return str.contains("map error".toLowerCase());
    }

    private static boolean j(String str) {
        return str.contains("cache miss".toLowerCase()) || str.contains("mapgetcachedlistclient failed".toLowerCase()) || str.contains("cachemiss".toLowerCase());
    }
}
