package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class JDKValueInstantiators {
    public static ValueInstantiator d(DeserializationConfig deserializationConfig, Class<?> cls) {
        if (cls == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return ArrayListInstantiator.b;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new ConstantValueInstantiator(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new ConstantValueInstantiator(list);
            }
            return null;
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls == LinkedHashMap.class) {
                return LinkedHashMapInstantiator.c;
            }
            if (cls == HashMap.class) {
                return HashMapInstantiator.c;
            }
            Map map = Collections.EMPTY_MAP;
            if (map.getClass() == cls) {
                return new ConstantValueInstantiator(map);
            }
            return null;
        } else {
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static class ArrayListInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final ArrayListInstantiator b = new ArrayListInstantiator();
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean g() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean i() {
            return true;
        }

        public ArrayListInstantiator() {
            super(ArrayList.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object e(DeserializationContext deserializationContext) {
            return new ArrayList();
        }
    }

    /* loaded from: classes5.dex */
    static class HashMapInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final HashMapInstantiator c = new HashMapInstantiator();
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean g() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean i() {
            return true;
        }

        public HashMapInstantiator() {
            super(HashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object e(DeserializationContext deserializationContext) {
            return new HashMap();
        }
    }

    /* loaded from: classes5.dex */
    static class LinkedHashMapInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final LinkedHashMapInstantiator c = new LinkedHashMapInstantiator();
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean g() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean i() {
            return true;
        }

        public LinkedHashMapInstantiator() {
            super(LinkedHashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object e(DeserializationContext deserializationContext) {
            return new LinkedHashMap();
        }
    }

    /* loaded from: classes5.dex */
    static class ConstantValueInstantiator extends ValueInstantiator.Base implements Serializable {
        private static final long serialVersionUID = 2;
        protected final Object b;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object e(DeserializationContext deserializationContext) {
            return this.b;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean g() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean i() {
            return true;
        }

        public ConstantValueInstantiator(Object obj) {
            super(obj.getClass());
            this.b = obj;
        }
    }
}
