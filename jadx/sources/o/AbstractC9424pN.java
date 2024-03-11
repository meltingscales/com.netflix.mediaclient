package o;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* renamed from: o.pN  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9424pN {
    protected static final InterfaceC9427pQ[] a = new InterfaceC9427pQ[0];

    public abstract AbstractC9452pp<?> b(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9452pp<?> b(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9543ra b(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract JavaType c(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract AbstractC9452pp<Object> c(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi, Class<?> cls);

    public abstract AbstractC9452pp<?> c(DeserializationContext deserializationContext, MapLikeType mapLikeType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9450pn d(DeserializationContext deserializationContext, JavaType javaType);

    public abstract AbstractC9452pp<?> d(DeserializationContext deserializationContext, CollectionType collectionType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9452pp<?> d(DeserializationContext deserializationContext, MapType mapType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9452pp<?> d(DeserializationContext deserializationContext, ReferenceType referenceType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9452pp<?> e(DeserializationContext deserializationContext, ArrayType arrayType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9452pp<?> e(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, AbstractC9445pi abstractC9445pi);

    public abstract AbstractC9452pp<Object> f(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi);
}
