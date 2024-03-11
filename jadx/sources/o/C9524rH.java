package o;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.rH  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9524rH {
    private final int b;
    private final e[] d;
    private final int e;

    private static final int d(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public C9524rH(Map<C9593se, AbstractC9453pq<Object>> map) {
        int d = d(map.size());
        this.e = d;
        this.b = d - 1;
        e[] eVarArr = new e[d];
        for (Map.Entry<C9593se, AbstractC9453pq<Object>> entry : map.entrySet()) {
            C9593se key = entry.getKey();
            int hashCode = key.hashCode() & this.b;
            eVarArr[hashCode] = new e(eVarArr[hashCode], key, entry.getValue());
        }
        this.d = eVarArr;
    }

    public static C9524rH c(HashMap<C9593se, AbstractC9453pq<Object>> hashMap) {
        return new C9524rH(hashMap);
    }

    public AbstractC9453pq<Object> d(JavaType javaType) {
        e eVar = this.d[C9593se.a(javaType) & this.b];
        if (eVar == null) {
            return null;
        }
        if (eVar.c(javaType)) {
            return eVar.d;
        }
        do {
            eVar = eVar.e;
            if (eVar == null) {
                return null;
            }
        } while (!eVar.c(javaType));
        return eVar.d;
    }

    public AbstractC9453pq<Object> d(Class<?> cls) {
        e eVar = this.d[C9593se.c(cls) & this.b];
        if (eVar == null) {
            return null;
        }
        if (eVar.e(cls)) {
            return eVar.d;
        }
        do {
            eVar = eVar.e;
            if (eVar == null) {
                return null;
            }
        } while (!eVar.e(cls));
        return eVar.d;
    }

    public AbstractC9453pq<Object> e(JavaType javaType) {
        e eVar = this.d[C9593se.b(javaType) & this.b];
        if (eVar == null) {
            return null;
        }
        if (eVar.a(javaType)) {
            return eVar.d;
        }
        do {
            eVar = eVar.e;
            if (eVar == null) {
                return null;
            }
        } while (!eVar.a(javaType));
        return eVar.d;
    }

    public AbstractC9453pq<Object> e(Class<?> cls) {
        e eVar = this.d[C9593se.d(cls) & this.b];
        if (eVar == null) {
            return null;
        }
        if (eVar.c(cls)) {
            return eVar.d;
        }
        do {
            eVar = eVar.e;
            if (eVar == null) {
                return null;
            }
        } while (!eVar.c(cls));
        return eVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.rH$e */
    /* loaded from: classes5.dex */
    public static final class e {
        protected final boolean a;
        protected final Class<?> b;
        protected final JavaType c;
        public final AbstractC9453pq<Object> d;
        public final e e;

        public boolean c(Class<?> cls) {
            return this.b == cls && !this.a;
        }

        public boolean e(Class<?> cls) {
            return this.b == cls && this.a;
        }

        public e(e eVar, C9593se c9593se, AbstractC9453pq<Object> abstractC9453pq) {
            this.e = eVar;
            this.d = abstractC9453pq;
            this.a = c9593se.d();
            this.b = c9593se.b();
            this.c = c9593se.a();
        }

        public boolean c(JavaType javaType) {
            return this.a && javaType.equals(this.c);
        }

        public boolean a(JavaType javaType) {
            return !this.a && javaType.equals(this.c);
        }
    }
}
