package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* renamed from: o.rF  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC9522rF {
    AbstractC9453pq<?> a(SerializationConfig serializationConfig, MapLikeType mapLikeType, AbstractC9445pi abstractC9445pi, AbstractC9453pq<Object> abstractC9453pq, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq2);

    AbstractC9453pq<?> b(SerializationConfig serializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi);

    AbstractC9453pq<?> b(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, AbstractC9445pi abstractC9445pi, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq);

    AbstractC9453pq<?> b(SerializationConfig serializationConfig, MapType mapType, AbstractC9445pi abstractC9445pi, AbstractC9453pq<Object> abstractC9453pq, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq2);

    AbstractC9453pq<?> c(SerializationConfig serializationConfig, ArrayType arrayType, AbstractC9445pi abstractC9445pi, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq);

    AbstractC9453pq<?> d(SerializationConfig serializationConfig, ReferenceType referenceType, AbstractC9445pi abstractC9445pi, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq);

    AbstractC9453pq<?> e(SerializationConfig serializationConfig, CollectionType collectionType, AbstractC9445pi abstractC9445pi, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq);
}
