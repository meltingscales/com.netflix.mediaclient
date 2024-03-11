package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC9464qA;

/* loaded from: classes5.dex */
public class SimpleMixInResolver implements AbstractC9464qA.c, Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC9464qA.c a;
    protected Map<ClassKey, Class<?>> d;

    public SimpleMixInResolver(AbstractC9464qA.c cVar) {
        this.a = cVar;
    }

    protected SimpleMixInResolver(AbstractC9464qA.c cVar, Map<ClassKey, Class<?>> map) {
        this.a = cVar;
        this.d = map;
    }

    public SimpleMixInResolver c(AbstractC9464qA.c cVar) {
        return new SimpleMixInResolver(cVar, this.d);
    }

    public void b(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this.d = null;
            return;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
            hashMap.put(new ClassKey(entry.getKey()), entry.getValue());
        }
        this.d = hashMap;
    }

    public void d(Class<?> cls, Class<?> cls2) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(new ClassKey(cls), cls2);
    }

    @Override // o.AbstractC9464qA.c
    /* renamed from: b */
    public SimpleMixInResolver w() {
        AbstractC9464qA.c cVar = this.a;
        return new SimpleMixInResolver(cVar == null ? null : cVar.w(), this.d != null ? new HashMap(this.d) : null);
    }

    @Override // o.AbstractC9464qA.c
    public Class<?> i(Class<?> cls) {
        Map<ClassKey, Class<?>> map;
        AbstractC9464qA.c cVar = this.a;
        Class<?> i = cVar == null ? null : cVar.i(cls);
        return (i != null || (map = this.d) == null) ? i : map.get(new ClassKey(cls));
    }

    public int d() {
        Map<ClassKey, Class<?>> map = this.d;
        if (map == null) {
            return 0;
        }
        return map.size();
    }
}
