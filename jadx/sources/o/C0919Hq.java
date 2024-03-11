package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.Hq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0919Hq {
    private static final NumberFormat e = NumberFormat.getNumberInstance(Locale.US);
    private static final Charset a = StandardCharsets.UTF_8;

    public static Number c(String str) {
        try {
            return e.parse(str);
        } catch (ParseException e2) {
            InterfaceC1598aHf.a(new C1596aHd().b(ErrorType.n).d(e2));
            return null;
        }
    }

    public static String d(Number number) {
        if ((number instanceof Integer) || (number instanceof Long) || (number instanceof Short) || (number instanceof Byte)) {
            return e.format(number.intValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return e.format(number.floatValue());
        }
        throw new IllegalArgumentException("Unsupported number type: " + number.getClass() + ", value: " + number);
    }
}
