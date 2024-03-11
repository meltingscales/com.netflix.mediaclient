package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.HashMap;
import java.util.List;
import o.AbstractC9434pX;
import o.C9491qb;

/* loaded from: classes5.dex */
public final class PropertyBasedCreator {
    protected final int b;
    protected final SettableBeanProperty[] c;
    protected final HashMap<String, SettableBeanProperty> d;
    protected final ValueInstantiator e;

    protected PropertyBasedCreator(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        this.e = valueInstantiator;
        if (z) {
            this.d = new CaseInsensitiveMap();
        } else {
            this.d = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this.b = length;
        this.c = new SettableBeanProperty[length];
        if (z2) {
            DeserializationConfig c = deserializationContext.c();
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.j()) {
                    List<PropertyName> d = settableBeanProperty.d(c);
                    if (!d.isEmpty()) {
                        for (PropertyName propertyName : d) {
                            this.d.put(propertyName.c(), settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
            this.c[i] = settableBeanProperty2;
            if (!settableBeanProperty2.j()) {
                this.d.put(settableBeanProperty2.a(), settableBeanProperty2);
            }
        }
    }

    public static PropertyBasedCreator a(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, BeanPropertyMap beanPropertyMap) {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (!settableBeanProperty.s()) {
                settableBeanProperty = settableBeanProperty.d(deserializationContext.c(settableBeanProperty.d(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i] = settableBeanProperty;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, beanPropertyMap.c(), true);
    }

    public static PropertyBasedCreator b(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (!settableBeanProperty.s()) {
                settableBeanProperty = settableBeanProperty.d(deserializationContext.c(settableBeanProperty.d(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i] = settableBeanProperty;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z, false);
    }

    public SettableBeanProperty b(String str) {
        return this.d.get(str);
    }

    public C9491qb d(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new C9491qb(jsonParser, deserializationContext, this.b, objectIdReader);
    }

    public Object e(DeserializationContext deserializationContext, C9491qb c9491qb) {
        Object c = this.e.c(deserializationContext, this.c, c9491qb);
        if (c != null) {
            c = c9491qb.a(deserializationContext, c);
            for (AbstractC9434pX c2 = c9491qb.c(); c2 != null; c2 = c2.e) {
                c2.d(c);
            }
        }
        return c;
    }

    /* loaded from: classes5.dex */
    static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        private static final long serialVersionUID = 1;

        CaseInsensitiveMap() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: a */
        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase());
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(), settableBeanProperty);
        }
    }
}
