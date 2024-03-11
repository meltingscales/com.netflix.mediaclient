package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC9413pC;

/* loaded from: classes5.dex */
public class ConfigOverrides implements Serializable {
    private static final long serialVersionUID = 1;
    protected JsonInclude.Value a;
    protected Boolean b;
    protected Boolean c;
    protected Map<Class<?>, MutableConfigOverride> d;
    protected JsonSetter.Value e;
    protected VisibilityChecker<?> f;

    public JsonSetter.Value a() {
        return this.e;
    }

    public void a(VisibilityChecker<?> visibilityChecker) {
        this.f = visibilityChecker;
    }

    public void a(Boolean bool) {
        this.b = bool;
    }

    public Boolean b() {
        return this.c;
    }

    public void c(JsonSetter.Value value) {
        this.e = value;
    }

    public void c(Boolean bool) {
        this.c = bool;
    }

    public JsonInclude.Value d() {
        return this.a;
    }

    public void e(JsonInclude.Value value) {
        this.a = value;
    }

    public VisibilityChecker<?> i() {
        return this.f;
    }

    public ConfigOverrides() {
        this(null, JsonInclude.Value.a(), JsonSetter.Value.b(), VisibilityChecker.Std.b(), null, null);
    }

    protected ConfigOverrides(Map<Class<?>, MutableConfigOverride> map, JsonInclude.Value value, JsonSetter.Value value2, VisibilityChecker<?> visibilityChecker, Boolean bool, Boolean bool2) {
        this.d = map;
        this.a = value;
        this.e = value2;
        this.f = visibilityChecker;
        this.c = bool;
        this.b = bool2;
    }

    public ConfigOverrides c() {
        Map<Class<?>, MutableConfigOverride> e;
        if (this.d == null) {
            e = null;
        } else {
            e = e();
            for (Map.Entry<Class<?>, MutableConfigOverride> entry : this.d.entrySet()) {
                e.put(entry.getKey(), entry.getValue().i());
            }
        }
        return new ConfigOverrides(e, this.a, this.e, this.f, this.c, this.b);
    }

    public AbstractC9413pC c(Class<?> cls) {
        Map<Class<?>, MutableConfigOverride> map = this.d;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public MutableConfigOverride e(Class<?> cls) {
        if (this.d == null) {
            this.d = e();
        }
        MutableConfigOverride mutableConfigOverride = this.d.get(cls);
        if (mutableConfigOverride == null) {
            MutableConfigOverride mutableConfigOverride2 = new MutableConfigOverride();
            this.d.put(cls, mutableConfigOverride2);
            return mutableConfigOverride2;
        }
        return mutableConfigOverride;
    }

    public JsonFormat.Value b(Class<?> cls) {
        MutableConfigOverride mutableConfigOverride;
        JsonFormat.Value d;
        Map<Class<?>, MutableConfigOverride> map = this.d;
        if (map != null && (mutableConfigOverride = map.get(cls)) != null && (d = mutableConfigOverride.d()) != null) {
            return !d.i() ? d.d(this.b) : d;
        }
        Boolean bool = this.b;
        if (bool == null) {
            return JsonFormat.Value.d();
        }
        return JsonFormat.Value.b(bool.booleanValue());
    }

    protected Map<Class<?>, MutableConfigOverride> e() {
        return new HashMap();
    }
}
