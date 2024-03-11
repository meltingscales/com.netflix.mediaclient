package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import o.C8621dsj;

/* renamed from: o.dqf */
/* loaded from: classes.dex */
public class C8563dqf extends C8564dqg {

    /* renamed from: o.dqf$c */
    /* loaded from: classes.dex */
    public static final class c<T> implements Iterable<T>, dsK {
        final /* synthetic */ Object[] d;

        public c(Object[] objArr) {
            this.d = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C8621dsj.b(this.d);
        }
    }

    /* renamed from: o.dqf$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements dtQ<T> {
        final /* synthetic */ Object[] c;

        public b(Object[] objArr) {
            this.c = objArr;
        }

        @Override // o.dtQ
        public Iterator<T> iterator() {
            return C8621dsj.b(this.c);
        }
    }

    public static <T> boolean i(T[] tArr, T t) {
        int g;
        C8632dsu.c((Object) tArr, "");
        g = g(tArr, t);
        return g >= 0;
    }

    public static boolean c(byte[] bArr, byte b2) {
        int b3;
        C8632dsu.c((Object) bArr, "");
        b3 = b(bArr, b2);
        return b3 >= 0;
    }

    public static boolean e(short[] sArr, short s) {
        int d;
        C8632dsu.c((Object) sArr, "");
        d = d(sArr, s);
        return d >= 0;
    }

    public static boolean h(int[] iArr, int i) {
        int g;
        C8632dsu.c((Object) iArr, "");
        g = g(iArr, i);
        return g >= 0;
    }

    public static boolean b(long[] jArr, long j) {
        int d;
        C8632dsu.c((Object) jArr, "");
        d = d(jArr, j);
        return d >= 0;
    }

    public static boolean c(char[] cArr, char c2) {
        C8632dsu.c((Object) cArr, "");
        return d(cArr, c2) >= 0;
    }

    public static <T> T x(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static <T> T y(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static <T> T c(T[] tArr, int i) {
        int w;
        C8632dsu.c((Object) tArr, "");
        if (i >= 0) {
            w = w(tArr);
            if (i <= w) {
                return tArr[i];
            }
        }
        return null;
    }

    public static Integer j(int[] iArr, int i) {
        int g;
        C8632dsu.c((Object) iArr, "");
        if (i >= 0) {
            g = g(iArr);
            if (i <= g) {
                return Integer.valueOf(iArr[i]);
            }
        }
        return null;
    }

    public static <T> int g(T[] tArr, T t) {
        C8632dsu.c((Object) tArr, "");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C8632dsu.c(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int b(byte[] bArr, byte b2) {
        C8632dsu.c((Object) bArr, "");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b2 == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int d(short[] sArr, short s) {
        C8632dsu.c((Object) sArr, "");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int g(int[] iArr, int i) {
        C8632dsu.c((Object) iArr, "");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int d(long[] jArr, long j) {
        C8632dsu.c((Object) jArr, "");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(char[] cArr, char c2) {
        C8632dsu.c((Object) cArr, "");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c2 == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T B(T[] tArr) {
        int w;
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        w = w(tArr);
        return tArr[w];
    }

    public static int l(int[] iArr) {
        int g;
        C8632dsu.c((Object) iArr, "");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        g = g(iArr);
        return iArr[g];
    }

    public static <T> int f(T[] tArr, T t) {
        C8632dsu.c((Object) tArr, "");
        if (t == null) {
            int length = tArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (tArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (C8632dsu.c(t, tArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    public static int h(byte[] bArr, byte b2) {
        C8632dsu.c((Object) bArr, "");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (b2 == bArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    public static <T> T A(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static Integer o(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static Boolean b(boolean[] zArr) {
        C8632dsu.c((Object) zArr, "");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    public static Character d(char[] cArr) {
        C8632dsu.c((Object) cArr, "");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static char e(char[] cArr) {
        C8632dsu.c((Object) cArr, "");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T z(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static <T> List<T> e(T[] tArr, int i) {
        int b2;
        C8632dsu.c((Object) tArr, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        b2 = C8657dts.b(tArr.length - i, 0);
        return i(tArr, b2);
    }

    public static <T> List<T> u(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return (List) e(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C e(T[] tArr, C c2) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) c2, "");
        for (T t : tArr) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static List<Byte> c(byte[] bArr, C8654dtp c8654dtp) {
        byte[] c2;
        List<Byte> i;
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) c8654dtp, "");
        if (c8654dtp.b()) {
            i = C8569dql.i();
            return i;
        }
        c2 = C8564dqg.c(bArr, c8654dtp.h().intValue(), c8654dtp.g().intValue() + 1);
        return C8564dqg.c(c2);
    }

    public static <T> T[] d(T[] tArr, C8654dtp c8654dtp) {
        Object[] d;
        Object[] d2;
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) c8654dtp, "");
        if (c8654dtp.b()) {
            d2 = C8564dqg.d(tArr, 0, 0);
            return (T[]) d2;
        }
        d = C8564dqg.d(tArr, c8654dtp.h().intValue(), c8654dtp.g().intValue() + 1);
        return (T[]) d;
    }

    public static byte[] b(byte[] bArr, C8654dtp c8654dtp) {
        byte[] c2;
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) c8654dtp, "");
        if (c8654dtp.b()) {
            return new byte[0];
        }
        c2 = C8564dqg.c(bArr, c8654dtp.h().intValue(), c8654dtp.g().intValue() + 1);
        return c2;
    }

    public static final <T> List<T> i(T[] tArr, int i) {
        List<T> e;
        List<T> D;
        List<T> i2;
        C8632dsu.c((Object) tArr, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            i2 = C8569dql.i();
            return i2;
        } else {
            int length = tArr.length;
            if (i >= length) {
                D = D(tArr);
                return D;
            } else if (i == 1) {
                e = C8566dqi.e(tArr[length - 1]);
                return e;
            } else {
                ArrayList arrayList = new ArrayList(i);
                for (int i3 = length - i; i3 < length; i3++) {
                    arrayList.add(tArr[i3]);
                }
                return arrayList;
            }
        }
    }

    public static <T> C8654dtp v(T[] tArr) {
        int w;
        C8632dsu.c((Object) tArr, "");
        w = w(tArr);
        return new C8654dtp(0, w);
    }

    public static C8654dtp i(int[] iArr) {
        int g;
        C8632dsu.c((Object) iArr, "");
        g = g(iArr);
        return new C8654dtp(0, g);
    }

    public static <T> int w(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return tArr.length - 1;
    }

    public static int g(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        return iArr.length - 1;
    }

    public static int b(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        return jArr.length - 1;
    }

    public static int[] a(Integer[] numArr) {
        C8632dsu.c((Object) numArr, "");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static long[] c(Long[] lArr) {
        C8632dsu.c((Object) lArr, "");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    public static <T, C extends Collection<? super T>> C d(T[] tArr, C c2) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) c2, "");
        for (T t : tArr) {
            c2.add(t);
        }
        return c2;
    }

    public static <T> List<T> D(T[] tArr) {
        List<T> i;
        List<T> e;
        List<T> C;
        C8632dsu.c((Object) tArr, "");
        int length = tArr.length;
        if (length == 0) {
            i = C8569dql.i();
            return i;
        } else if (length == 1) {
            e = C8566dqi.e(tArr[0]);
            return e;
        } else {
            C = C(tArr);
            return C;
        }
    }

    public static <T> List<T> C(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return new ArrayList(C8569dql.g(tArr));
    }

    public static List<Integer> m(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static <T> Set<T> G(T[] tArr) {
        Set<T> e;
        Set<T> a;
        int e2;
        Collection d;
        C8632dsu.c((Object) tArr, "");
        int length = tArr.length;
        if (length == 0) {
            e = dqN.e();
            return e;
        } else if (length == 1) {
            a = dqP.a(tArr[0]);
            return a;
        } else {
            e2 = dqD.e(tArr.length);
            d = d(tArr, new LinkedHashSet(e2));
            return (Set) d;
        }
    }

    public static <T> Iterable<C8578dqu<T>> I(final T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return new C8582dqy(new drO<Iterator<? extends T>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final Iterator<T> invoke() {
                return C8621dsj.b(tArr);
            }
        });
    }

    public static final <T, A extends Appendable> A b(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) a, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C8683dur.b(a, t, drm);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <A extends Appendable> A a(int[] iArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super Integer, ? extends CharSequence> drm) {
        C8632dsu.c((Object) iArr, "");
        C8632dsu.c((Object) a, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (drm != null) {
                a.append(drm.invoke(Integer.valueOf(i3)));
            } else {
                a.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String d(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM drm, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            drm = null;
        }
        return a(objArr, charSequence, str, str2, i3, charSequence5, drm);
    }

    public static final <T> String a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        String sb = ((StringBuilder) b(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, drm)).toString();
        C8632dsu.a(sb, "");
        return sb;
    }

    public static /* synthetic */ String c(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM drm, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            drm = null;
        }
        return d(iArr, charSequence, str, str2, i3, charSequence5, drm);
    }

    public static final String d(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super Integer, ? extends CharSequence> drm) {
        C8632dsu.c((Object) iArr, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        String sb = ((StringBuilder) a(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, drm)).toString();
        C8632dsu.a(sb, "");
        return sb;
    }

    public static <T> Iterable<T> t(T[] tArr) {
        List i;
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 0) {
            i = C8569dql.i();
            return i;
        }
        return new c(tArr);
    }

    public static <T> dtQ<T> s(T[] tArr) {
        dtQ<T> d;
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 0) {
            d = dtY.d();
            return d;
        }
        return new b(tArr);
    }

    public static int k(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
