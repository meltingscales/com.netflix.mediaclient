package o;

/* loaded from: classes5.dex */
public final class dvJ {
    public static final /* synthetic */ Object[] a(Object[] objArr, int i) {
        return e(objArr, i);
    }

    public static final int b(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final /* synthetic */ Object[] b(Object[] objArr, int i, int i2, dvG dvg) {
        return e(objArr, i, i2, dvg);
    }

    public static final /* synthetic */ Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        return d(objArr, i, obj, obj2);
    }

    public static final /* synthetic */ Object[] d(Object[] objArr, int i) {
        return b(objArr, i);
    }

    public static final <K, V> Object[] d(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final Object[] e(Object[] objArr, int i, int i2, dvG<?, ?> dvg) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = dvg;
        C8564dqg.d(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final Object[] e(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
