package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.dki  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8404dki {
    private final String a;
    private final String f;
    private static Map<String, C8404dki> e = new HashMap();
    private static final char[] c = "0123456789ABCDEF".toCharArray();
    public static final C8404dki b = new C8404dki(JsonFactory.FORMAT_NAME_JSON, new byte[]{123});
    public static final C8404dki d = new C8404dki(CBORFactory.FORMAT_NAME, new byte[]{-39, -39, -9});

    public String d() {
        return this.f;
    }

    protected C8404dki(String str, byte[] bArr) {
        this.f = str;
        this.a = d(bArr);
        synchronized (e) {
            e.put(str, this);
        }
    }

    public static C8404dki c(String str) {
        return e.get(str);
    }

    public static C8404dki a(byte[] bArr) {
        String d2 = d(Arrays.copyOf(bArr, Math.min(bArr.length, 3)));
        for (C8404dki c8404dki : e.values()) {
            if (d2.startsWith(c8404dki.a)) {
                return c8404dki;
            }
        }
        return null;
    }

    public String toString() {
        return d();
    }

    public int hashCode() {
        return this.f.hashCode() ^ this.a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8404dki) {
            C8404dki c8404dki = (C8404dki) obj;
            return this.f.equals(c8404dki.f) && this.a == c8404dki.a;
        }
        return false;
    }

    public static String d(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = c;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
