package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ContextAttributes {
    public abstract ContextAttributes a(Object obj, Object obj2);

    public abstract Object c(Object obj);

    public static ContextAttributes a() {
        return Impl.e();
    }

    /* loaded from: classes5.dex */
    public static class Impl extends ContextAttributes implements Serializable {
        protected static final Impl c = new Impl(Collections.emptyMap());
        protected static final Object e = new Object();
        private static final long serialVersionUID = 1;
        protected transient Map<Object, Object> a;
        protected final Map<?, ?> b;

        public static ContextAttributes e() {
            return c;
        }

        protected Impl(Map<?, ?> map) {
            this.b = map;
            this.a = null;
        }

        protected Impl(Map<?, ?> map, Map<Object, Object> map2) {
            this.b = map;
            this.a = map2;
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public Object c(Object obj) {
            Object obj2;
            Map<Object, Object> map = this.a;
            if (map == null || (obj2 = map.get(obj)) == null) {
                return this.b.get(obj);
            }
            if (obj2 == e) {
                return null;
            }
            return obj2;
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public ContextAttributes a(Object obj, Object obj2) {
            if (obj2 == null) {
                if (!this.b.containsKey(obj)) {
                    Map<Object, Object> map = this.a;
                    if (map != null && map.containsKey(obj)) {
                        this.a.remove(obj);
                    }
                    return this;
                }
                obj2 = e;
            }
            Map<Object, Object> map2 = this.a;
            if (map2 == null) {
                return b(obj, obj2);
            }
            map2.put(obj, obj2);
            return this;
        }

        protected ContextAttributes b(Object obj, Object obj2) {
            HashMap hashMap = new HashMap();
            if (obj2 == null) {
                obj2 = e;
            }
            hashMap.put(obj, obj2);
            return new Impl(this.b, hashMap);
        }
    }
}
