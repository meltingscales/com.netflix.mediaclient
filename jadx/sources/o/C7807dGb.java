package o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.dGb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7807dGb {
    private final Map<String, String> b;
    private final String c;

    public final String c() {
        return this.c;
    }

    public C7807dGb(String str, Map<String, String> map) {
        String str2;
        C8632dsu.d((Object) str, "");
        C8632dsu.d(map, "");
        this.c = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                C8632dsu.b(locale, "");
                str2 = key.toLowerCase(locale);
                C8632dsu.b(str2, "");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C8632dsu.b(unmodifiableMap, "");
        this.b = unmodifiableMap;
    }

    public final String b() {
        return this.b.get("realm");
    }

    public final Charset e() {
        String str = this.b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C8632dsu.b(forName, "");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C8632dsu.b(charset, "");
        return charset;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7807dGb) {
            C7807dGb c7807dGb = (C7807dGb) obj;
            if (C8632dsu.c((Object) c7807dGb.c, (Object) this.c) && C8632dsu.c(c7807dGb.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.c.hashCode() + 899) * 31) + this.b.hashCode();
    }

    public String toString() {
        return this.c + " authParams=" + this.b;
    }
}
