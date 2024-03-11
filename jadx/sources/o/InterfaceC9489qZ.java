package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;
import o.InterfaceC9489qZ;

/* renamed from: o.qZ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC9489qZ<T extends InterfaceC9489qZ<T>> {
    AbstractC9543ra b(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    T c(JsonTypeInfo.As as);

    Class<?> d();

    T d(JsonTypeInfo.Id id, InterfaceC9545rc interfaceC9545rc);

    T d(boolean z);

    AbstractC9544rb d(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    T e(Class<?> cls);

    T e(String str);
}
