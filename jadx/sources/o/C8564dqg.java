package o;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.dqg */
/* loaded from: classes.dex */
public class C8564dqg extends C8562dqe {
    public static <T> List<T> p(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        List<T> e = C8567dqj.e(tArr);
        C8632dsu.a(e, "");
        return e;
    }

    /* renamed from: o.dqg$c */
    /* loaded from: classes.dex */
    public static final class c extends dpT<Byte> implements RandomAccess {
        final /* synthetic */ byte[] b;

        c(byte[] bArr) {
            this.b = bArr;
        }

        @Override // o.dpQ, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return c(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // o.dpT, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return d(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // o.dpT, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return b(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // o.dpQ
        public int getSize() {
            return this.b.length;
        }

        @Override // o.dpQ, java.util.Collection
        public boolean isEmpty() {
            return this.b.length == 0;
        }

        public boolean c(byte b) {
            boolean c;
            c = C8563dqf.c(this.b, b);
            return c;
        }

        @Override // o.dpT, java.util.List
        /* renamed from: a */
        public Byte get(int i) {
            return Byte.valueOf(this.b[i]);
        }

        public int d(byte b) {
            int b2;
            b2 = C8563dqf.b(this.b, b);
            return b2;
        }

        public int b(byte b) {
            int h;
            h = C8563dqf.h(this.b, b);
            return h;
        }
    }

    public static final List<Byte> c(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return new c(bArr);
    }

    public static /* synthetic */ Object[] e(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        Object[] d;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        d = d(objArr, objArr2, i, i2, i3);
        return d;
    }

    public static <T> T[] d(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) tArr2, "");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ byte[] a(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        byte[] d;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        d = d(bArr, bArr2, i, i2, i3);
        return d;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ int[] b(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        int[] c2;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        c2 = c(iArr, iArr2, i, i2, i3);
        return c2;
    }

    public static int[] c(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        C8632dsu.c((Object) iArr, "");
        C8632dsu.c((Object) iArr2, "");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static long[] e(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        C8632dsu.c((Object) jArr, "");
        C8632dsu.c((Object) jArr2, "");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static /* synthetic */ float[] a(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        float[] c2;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        c2 = c(fArr, fArr2, i, i2, i3);
        return c2;
    }

    public static float[] c(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        C8632dsu.c((Object) fArr, "");
        C8632dsu.c((Object) fArr2, "");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static char[] e(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        C8632dsu.c((Object) cArr, "");
        C8632dsu.c((Object) cArr2, "");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    public static <T> T[] d(T[] tArr, int i, int i2) {
        C8632dsu.c((Object) tArr, "");
        C8565dqh.e(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        C8632dsu.a(tArr2, "");
        return tArr2;
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        C8632dsu.c((Object) bArr, "");
        C8565dqh.e(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C8632dsu.a(copyOfRange, "");
        return copyOfRange;
    }

    public static /* synthetic */ void c(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        d(objArr, obj, i, i2);
    }

    public static <T> void d(T[] tArr, T t, int i, int i2) {
        C8632dsu.c((Object) tArr, "");
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void b(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        c(iArr, i, i2, i3);
    }

    public static void c(int[] iArr, int i, int i2, int i3) {
        C8632dsu.c((Object) iArr, "");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static /* synthetic */ void e(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        b(jArr, j, i, i2);
    }

    public static void b(long[] jArr, long j, int i, int i2) {
        C8632dsu.c((Object) jArr, "");
        Arrays.fill(jArr, i, i2, j);
    }

    public static <T> T[] a(T[] tArr, T t) {
        C8632dsu.c((Object) tArr, "");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        C8632dsu.d(tArr2);
        return tArr2;
    }

    public static int[] c(int[] iArr, int i) {
        C8632dsu.c((Object) iArr, "");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        C8632dsu.d(copyOf);
        return copyOf;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        C8632dsu.d(copyOf);
        return copyOf;
    }

    public static int[] a(int[] iArr, int[] iArr2) {
        C8632dsu.c((Object) iArr, "");
        C8632dsu.c((Object) iArr2, "");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        C8632dsu.d(copyOf);
        return copyOf;
    }

    public static <T> void r(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void b(T[] tArr, Comparator<? super T> comparator) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) comparator, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void e(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) comparator, "");
        Arrays.sort(tArr, i, i2, comparator);
    }

    public static Integer[] j(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }
}
