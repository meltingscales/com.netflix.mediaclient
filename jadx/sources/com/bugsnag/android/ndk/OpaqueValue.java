package com.bugsnag.android.ndk;

import java.io.StringWriter;
import java.util.Collection;
import java.util.Map;
import o.C8608drx;
import o.C8627dsp;
import o.C8632dsu;
import o.C8674dui;
import o.C9246lv;
import o.dpR;

/* loaded from: classes5.dex */
public final class OpaqueValue {
    public static final c e = new c(null);
    private final String a;

    public final String getJson() {
        return this.a;
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        private final boolean a(String str) {
            if (str.length() >= 64) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 127) {
                    byte[] bytes = str.getBytes(C8674dui.i);
                    C8632dsu.a(bytes, "");
                    return bytes.length < 64;
                }
            }
            return true;
        }

        private final String d(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                new C9246lv(stringWriter).c(obj, true);
                dpR dpr = dpR.c;
                C8608drx.a(stringWriter, null);
                return stringWriter.toString();
            } finally {
            }
        }

        public final Object e(Object obj) {
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj;
            }
            boolean z = obj instanceof String;
            if (z && a((String) obj)) {
                return obj;
            }
            if (z || (obj instanceof Map) || (obj instanceof Collection) || (obj instanceof Object[])) {
                return new OpaqueValue(d(obj));
            }
            return null;
        }
    }

    public OpaqueValue(String str) {
        this.a = str;
    }
}
