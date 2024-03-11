package o;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes5.dex */
public final class dEG {
    private static final InterfaceC7707dCj b = C7738dDn.a("kotlinx.serialization.json.JsonUnquotedLiteral", C7706dCi.b(dsE.b));

    public static final InterfaceC7707dCj a() {
        return b;
    }

    public static final dET b(String str) {
        if (str == null) {
            return dEQ.INSTANCE;
        }
        return new dEJ(str, true, null, 4, null);
    }

    public static final dET e(dEI dei) {
        C8632dsu.c((Object) dei, "");
        dET det = dei instanceof dET ? (dET) dei : null;
        if (det != null) {
            return det;
        }
        d(dei, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final dEP c(dEI dei) {
        C8632dsu.c((Object) dei, "");
        dEP dep = dei instanceof dEP ? (dEP) dei : null;
        if (dep != null) {
            return dep;
        }
        d(dei, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final dEB d(dEI dei) {
        C8632dsu.c((Object) dei, "");
        dEB deb = dei instanceof dEB ? (dEB) dei : null;
        if (deb != null) {
            return deb;
        }
        d(dei, "JsonArray");
        throw new KotlinNothingValueException();
    }

    public static final int i(dET det) {
        C8632dsu.c((Object) det, "");
        try {
            long f = new dFI(det.d()).f();
            if (-2147483648L > f || f > 2147483647L) {
                throw new NumberFormatException(det.d() + " is not an Int");
            }
            return (int) f;
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final long f(dET det) {
        C8632dsu.c((Object) det, "");
        try {
            return new dFI(det.d()).f();
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final double e(dET det) {
        C8632dsu.c((Object) det, "");
        return Double.parseDouble(det.d());
    }

    public static final float b(dET det) {
        C8632dsu.c((Object) det, "");
        return Float.parseFloat(det.d());
    }

    public static final boolean c(dET det) {
        C8632dsu.c((Object) det, "");
        Boolean e = dFK.e(det.d());
        if (e != null) {
            return e.booleanValue();
        }
        throw new IllegalStateException(det + " does not represent a Boolean");
    }

    public static final Boolean d(dET det) {
        C8632dsu.c((Object) det, "");
        return dFK.e(det.d());
    }

    public static final String a(dET det) {
        C8632dsu.c((Object) det, "");
        if (det instanceof dEQ) {
            return null;
        }
        return det.d();
    }

    private static final Void d(dEI dei, String str) {
        throw new IllegalArgumentException("Element " + dsA.a(dei.getClass()) + " is not a " + str);
    }
}
