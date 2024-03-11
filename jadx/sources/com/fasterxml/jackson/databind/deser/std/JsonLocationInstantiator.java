package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* loaded from: classes5.dex */
public class JsonLocationInstantiator extends ValueInstantiator.Base {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean b() {
        return true;
    }

    public JsonLocationInstantiator() {
        super(JsonLocation.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] d(DeserializationConfig deserializationConfig) {
        JavaType b = deserializationConfig.b(Integer.TYPE);
        JavaType b2 = deserializationConfig.b(Long.TYPE);
        return new SettableBeanProperty[]{d("sourceRef", deserializationConfig.b(Object.class), 0), d("byteOffset", b2, 1), d("charOffset", b2, 2), d("lineNr", b, 3), d("columnNr", b, 4)};
    }

    private static CreatorProperty d(String str, JavaType javaType, int i) {
        return new CreatorProperty(PropertyName.b(str), javaType, null, null, null, null, i, null, PropertyMetadata.a);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object d(DeserializationContext deserializationContext, Object[] objArr) {
        return new JsonLocation(objArr[0], d(objArr[1]), d(objArr[2]), a(objArr[3]), a(objArr[4]));
    }

    private static final long d(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    private static final int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }
}
