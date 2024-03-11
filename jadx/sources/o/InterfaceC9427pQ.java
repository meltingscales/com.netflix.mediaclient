package o;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* renamed from: o.pQ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC9427pQ {
    AbstractC9452pp<?> a(Class<?> cls, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi);

    AbstractC9452pp<?> b(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp);

    AbstractC9452pp<?> b(Class<? extends AbstractC9454pr> cls, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi);

    AbstractC9452pp<?> c(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp);

    AbstractC9452pp<?> c(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9450pn abstractC9450pn, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp);

    AbstractC9452pp<?> d(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp);

    AbstractC9452pp<?> d(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp);

    AbstractC9452pp<?> d(MapType mapType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9450pn abstractC9450pn, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp);

    AbstractC9452pp<?> e(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi);
}
