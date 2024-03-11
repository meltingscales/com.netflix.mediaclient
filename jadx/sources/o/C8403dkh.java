package o;

import com.netflix.msl.io.MslEncoderException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.dkh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8403dkh {
    private static final Charset d = Charset.forName("UTF-8");

    public static C8398dkc a(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki, Collection<?> collection) {
        C8398dkc c = abstractC8399dkd.c();
        for (Object obj : collection) {
            if ((obj instanceof byte[]) || (obj instanceof Boolean) || (obj instanceof C8398dkc) || (obj instanceof C8401dkf) || (obj instanceof Number) || (obj instanceof String) || (obj instanceof Map) || (obj instanceof Collection) || (obj instanceof Object[]) || (obj instanceof Enum) || obj == null) {
                c.b(-1, obj);
            } else if (!(obj instanceof InterfaceC8400dke)) {
                throw new MslEncoderException("Class " + obj.getClass().getName() + " is not MSL encoding-compatible.");
            } else {
                c.b(-1, ((InterfaceC8400dke) obj).b(abstractC8399dkd, c8404dki));
            }
        }
        return c;
    }

    public static boolean e(C8401dkf c8401dkf, C8401dkf c8401dkf2) {
        if (c8401dkf == c8401dkf2) {
            return true;
        }
        if (c8401dkf == null || c8401dkf2 == null) {
            return false;
        }
        Set<String> d2 = c8401dkf.d();
        Set<String> d3 = c8401dkf2.d();
        if (d2 == d3 || (d2 != null && d3 != null && d2.size() == d3.size() && d2.equals(d3))) {
            for (String str : d2) {
                Object f = c8401dkf.f(str);
                Object f2 = c8401dkf2.f(str);
                if (f != f2) {
                    if (f != null && f2 != null) {
                        if ((f instanceof byte[]) || (f2 instanceof byte[])) {
                            if (!Arrays.equals(c8401dkf.e(str), c8401dkf2.e(str))) {
                            }
                        } else if ((f instanceof C8401dkf) && (f2 instanceof C8401dkf)) {
                            if (!e((C8401dkf) f, (C8401dkf) f2)) {
                                return false;
                            }
                        } else if ((f instanceof C8398dkc) && (f2 instanceof C8398dkc)) {
                            if (!a((C8398dkc) f, (C8398dkc) f2)) {
                                return false;
                            }
                        } else if ((f instanceof String) || (f2 instanceof String)) {
                            if (!c8401dkf.g(str).equals(c8401dkf2.g(str))) {
                                return false;
                            }
                        } else if (f.getClass() != f2.getClass() || !f.equals(f2)) {
                            return false;
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static int a(C8401dkf c8401dkf) {
        int hashCode;
        if (c8401dkf == null) {
            return -1;
        }
        int i = 0;
        for (String str : c8401dkf.d()) {
            byte[] e = c8401dkf.e(str, (byte[]) null);
            if (e != null) {
                hashCode = Arrays.hashCode(e);
            } else {
                Object f = c8401dkf.f(str);
                if (f instanceof C8401dkf) {
                    hashCode = a((C8401dkf) f);
                } else if (f instanceof C8398dkc) {
                    hashCode = d((C8398dkc) f);
                } else {
                    hashCode = f != null ? f.hashCode() : 1;
                }
            }
            i ^= str.hashCode() + hashCode;
        }
        return i;
    }

    public static boolean a(C8398dkc c8398dkc, C8398dkc c8398dkc2) {
        if (c8398dkc == c8398dkc2) {
            return true;
        }
        if (c8398dkc == null || c8398dkc2 == null || c8398dkc.b() != c8398dkc2.b()) {
            return false;
        }
        for (int i = 0; i < c8398dkc.b(); i++) {
            Object b = c8398dkc.b(i);
            Object b2 = c8398dkc2.b(i);
            if (b != b2) {
                if (b == null || b2 == null) {
                    return false;
                }
                if ((b instanceof byte[]) || (b2 instanceof byte[])) {
                    if (!Arrays.equals(c8398dkc.e(i), c8398dkc2.e(i))) {
                        return false;
                    }
                } else if ((b instanceof C8401dkf) && (b2 instanceof C8401dkf)) {
                    if (!e((C8401dkf) b, (C8401dkf) b2)) {
                        return false;
                    }
                } else if ((b instanceof C8398dkc) && (b2 instanceof C8398dkc)) {
                    if (!a((C8398dkc) b, (C8398dkc) b2)) {
                        return false;
                    }
                } else if ((b instanceof String) || (b2 instanceof String)) {
                    if (!c8398dkc.d(i).equals(c8398dkc2.d(i))) {
                        return false;
                    }
                } else if (b.getClass() != b2.getClass() || !b.equals(b2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int d(C8398dkc c8398dkc) {
        int i;
        int hashCode;
        if (c8398dkc == null) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c8398dkc.b(); i3++) {
            byte[] d2 = c8398dkc.d(i3, null);
            if (d2 != null) {
                i = i2 * 37;
                hashCode = Arrays.hashCode(d2);
            } else {
                Object b = c8398dkc.b(i3);
                if (b instanceof C8401dkf) {
                    i = i2 * 37;
                    hashCode = a((C8401dkf) b);
                } else if (b instanceof C8398dkc) {
                    i = i2 * 37;
                    hashCode = d((C8398dkc) b);
                } else if (b != null) {
                    i = i2 * 37;
                    hashCode = b.hashCode();
                } else {
                    i2 = (i2 * 37) + 1;
                }
            }
            i2 = i + hashCode;
        }
        return i2;
    }
}
