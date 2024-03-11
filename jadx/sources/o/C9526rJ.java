package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.rJ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9526rJ {
    protected final Class<?> b;
    protected final C9526rJ d;
    private ArrayList<ResolvedRecursiveType> e;

    public C9526rJ(Class<?> cls) {
        this(null, cls);
    }

    private C9526rJ(C9526rJ c9526rJ, Class<?> cls) {
        this.d = c9526rJ;
        this.b = cls;
    }

    public C9526rJ b(Class<?> cls) {
        return new C9526rJ(this, cls);
    }

    public void a(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.e.add(resolvedRecursiveType);
    }

    public void a(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this.e;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().d(javaType);
            }
        }
    }

    public C9526rJ a(Class<?> cls) {
        if (this.b == cls) {
            return this;
        }
        for (C9526rJ c9526rJ = this.d; c9526rJ != null; c9526rJ = c9526rJ.d) {
            if (c9526rJ.b == cls) {
                return c9526rJ;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this.e;
        sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb.append(')');
        for (C9526rJ c9526rJ = this; c9526rJ != null; c9526rJ = c9526rJ.d) {
            sb.append(' ');
            sb.append(c9526rJ.b.getName());
        }
        sb.append(']');
        return sb.toString();
    }
}
