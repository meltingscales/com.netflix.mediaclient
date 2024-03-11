package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: o.qD  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9467qD {
    static final Class<?>[] c = new Class[0];
    final Class<?>[] d;
    final String e;

    public String d() {
        return this.e;
    }

    public C9467qD(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public C9467qD(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public C9467qD(String str, Class<?>[] clsArr) {
        this.e = str;
        this.d = clsArr == null ? c : clsArr;
    }

    public int b() {
        return this.d.length;
    }

    public String toString() {
        return this.e + "(" + this.d.length + "-args)";
    }

    public int hashCode() {
        return this.e.hashCode() + this.d.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C9467qD.class) {
            C9467qD c9467qD = (C9467qD) obj;
            if (this.e.equals(c9467qD.e)) {
                Class<?>[] clsArr = c9467qD.d;
                int length = this.d.length;
                if (clsArr.length != length) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    if (clsArr[i] != this.d[i]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
