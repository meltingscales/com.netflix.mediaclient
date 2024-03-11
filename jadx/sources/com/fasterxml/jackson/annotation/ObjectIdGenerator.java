package com.fasterxml.jackson.annotation;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class ObjectIdGenerator<T> implements Serializable {
    public abstract ObjectIdGenerator<T> a(Class<?> cls);

    public abstract Class<?> a();

    public abstract IdKey b(Object obj);

    public boolean b(String str, Object obj) {
        return false;
    }

    public abstract T c(Object obj);

    public abstract ObjectIdGenerator<T> d(Object obj);

    public boolean e() {
        return false;
    }

    public abstract boolean e(ObjectIdGenerator<?> objectIdGenerator);

    /* loaded from: classes5.dex */
    public static final class IdKey implements Serializable {
        private static final long serialVersionUID = 1;
        public final Object a;
        public final Class<?> b;
        public final Class<?> c;
        private final int e;

        public int hashCode() {
            return this.e;
        }

        public IdKey(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.c = cls;
            this.b = cls2;
            this.a = obj;
            int hashCode = obj.hashCode() + cls.getName().hashCode();
            this.e = cls2 != null ? hashCode ^ cls2.getName().hashCode() : hashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == IdKey.class) {
                IdKey idKey = (IdKey) obj;
                return idKey.a.equals(this.a) && idKey.c == this.c && idKey.b == this.b;
            }
            return false;
        }

        public String toString() {
            Object[] objArr = new Object[3];
            objArr[0] = this.a;
            Class<?> cls = this.c;
            objArr[1] = cls == null ? "NONE" : cls.getName();
            Class<?> cls2 = this.b;
            objArr[2] = cls2 != null ? cls2.getName() : "NONE";
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", objArr);
        }
    }
}
