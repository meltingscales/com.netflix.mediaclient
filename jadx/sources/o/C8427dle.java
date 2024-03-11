package o;

import java.util.regex.Pattern;

/* renamed from: o.dle  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8427dle {
    private static final Pattern b = Pattern.compile("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$");
    private static b c = new C8430dlh();

    /* renamed from: o.dle$b */
    /* loaded from: classes.dex */
    public interface b {
        String a(byte[] bArr);

        byte[] a(String str);
    }

    public static void b(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Base64 implementation cannot be null.");
        }
        c = bVar;
    }

    public static String e(byte[] bArr) {
        return c.a(bArr);
    }

    public static byte[] e(String str) {
        return c.a(str);
    }
}
