package o;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* renamed from: o.qx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9513qx implements InterfaceC9532rP {
    protected HashMap<Class<?>, Annotation> a;

    public C9513qx() {
    }

    public static C9513qx c(Class<?> cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new C9513qx(hashMap);
    }

    public C9513qx(HashMap<Class<?>, Annotation> hashMap) {
        this.a = hashMap;
    }

    @Override // o.InterfaceC9532rP
    public <A extends Annotation> A e(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        if (hashMap == null) {
            return null;
        }
        return (A) hashMap.get(cls);
    }

    @Override // o.InterfaceC9532rP
    public boolean b(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    @Override // o.InterfaceC9532rP
    public boolean a(Class<? extends Annotation>[] clsArr) {
        if (this.a != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.a.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C9513qx a(C9513qx c9513qx, C9513qx c9513qx2) {
        HashMap<Class<?>, Annotation> hashMap;
        HashMap<Class<?>, Annotation> hashMap2;
        if (c9513qx == null || (hashMap = c9513qx.a) == null || hashMap.isEmpty()) {
            return c9513qx2;
        }
        if (c9513qx2 == null || (hashMap2 = c9513qx2.a) == null || hashMap2.isEmpty()) {
            return c9513qx;
        }
        HashMap hashMap3 = new HashMap();
        for (Annotation annotation : c9513qx2.a.values()) {
            hashMap3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : c9513qx.a.values()) {
            hashMap3.put(annotation2.annotationType(), annotation2);
        }
        return new C9513qx(hashMap3);
    }

    @Override // o.InterfaceC9532rP
    public int c() {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public boolean e(Annotation annotation) {
        return d(annotation);
    }

    public String toString() {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        return hashMap == null ? "[null]" : hashMap.toString();
    }

    protected final boolean d(Annotation annotation) {
        if (this.a == null) {
            this.a = new HashMap<>();
        }
        Annotation put = this.a.put(annotation.annotationType(), annotation);
        return put == null || !put.equals(annotation);
    }
}
