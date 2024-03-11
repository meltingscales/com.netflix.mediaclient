package o;

import java.lang.reflect.Array;
import java.util.List;

/* renamed from: o.sa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9589sa {
    private C9536rT<Object[]> a;
    private int b;
    private Object[] c;
    private C9536rT<Object[]> d;

    public int e() {
        return this.b;
    }

    public Object[] a() {
        d();
        Object[] objArr = this.c;
        if (objArr == null) {
            Object[] objArr2 = new Object[12];
            this.c = objArr2;
            return objArr2;
        }
        return objArr;
    }

    public Object[] c(Object[] objArr, int i) {
        d();
        Object[] objArr2 = this.c;
        if (objArr2 == null || objArr2.length < i) {
            this.c = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.c, 0, i);
        return this.c;
    }

    public Object[] c(Object[] objArr) {
        C9536rT<Object[]> c9536rT = new C9536rT<>(objArr, null);
        if (this.a == null) {
            this.d = c9536rT;
            this.a = c9536rT;
        } else {
            this.d.b(c9536rT);
            this.d = c9536rT;
        }
        int length = objArr.length;
        this.b += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public Object[] b(Object[] objArr, int i) {
        int i2 = this.b + i;
        Object[] objArr2 = new Object[i2];
        c(objArr2, i2, objArr, i);
        d();
        return objArr2;
    }

    public <T> T[] a(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.b + i;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        c(tArr, i2, objArr, i);
        d();
        return tArr;
    }

    public void a(Object[] objArr, int i, List<Object> list) {
        int i2;
        C9536rT<Object[]> c9536rT = this.a;
        while (true) {
            i2 = 0;
            if (c9536rT == null) {
                break;
            }
            Object[] b = c9536rT.b();
            int length = b.length;
            while (i2 < length) {
                list.add(b[i2]);
                i2++;
            }
            c9536rT = c9536rT.d();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        d();
    }

    public int c() {
        Object[] objArr = this.c;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    protected void d() {
        C9536rT<Object[]> c9536rT = this.d;
        if (c9536rT != null) {
            this.c = c9536rT.b();
        }
        this.d = null;
        this.a = null;
        this.b = 0;
    }

    protected final void c(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (C9536rT<Object[]> c9536rT = this.a; c9536rT != null; c9536rT = c9536rT.d()) {
            Object[] b = c9536rT.b();
            int length = b.length;
            System.arraycopy(b, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 == i) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
    }
}
