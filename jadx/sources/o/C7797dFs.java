package o;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* renamed from: o.dFs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7797dFs {
    public static final JsonDecodingException c(int i, String str) {
        C8632dsu.c((Object) str, "");
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException a(int i, String str, CharSequence charSequence) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charSequence, "");
        return c(i, str + "\nJSON input: " + ((Object) b(charSequence, i)));
    }

    public static final JsonEncodingException e(Number number, String str) {
        C8632dsu.c((Object) number, "");
        C8632dsu.c((Object) str, "");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) b(str, 0, 1, null)));
    }

    public static final Void e(dEU deu, Number number) {
        C8632dsu.c((Object) deu, "");
        C8632dsu.c((Object) number, "");
        dEU.d(deu, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    public static final JsonEncodingException b(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return new JsonEncodingException("Value of type '" + interfaceC7707dCj.d() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC7707dCj.b() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(Number number, String str, String str2) {
        C8632dsu.c((Object) number, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return c(-1, d(number, str, str2));
    }

    private static final String d(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) b(str2, 0, 1, null));
    }

    public static final JsonDecodingException a(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return c(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) b(str2, 0, 1, null)));
    }

    static /* synthetic */ CharSequence b(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return b(charSequence, i);
    }

    private static final CharSequence b(CharSequence charSequence, int i) {
        int b;
        int i2;
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i3 = i - 30;
        int i4 = i + 30;
        String str = i3 <= 0 ? "" : ".....";
        String str2 = i4 >= charSequence.length() ? "" : ".....";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        b = C8657dts.b(i3, 0);
        i2 = C8657dts.i(i4, charSequence.length());
        sb.append(charSequence.subSequence(b, i2).toString());
        sb.append(str2);
        return sb.toString();
    }
}
