package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;

/* renamed from: o.pE  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9415pE {
    public abstract AbstractC9452pp<?> a(DeserializationConfig deserializationConfig, AbstractC9509qt abstractC9509qt, Class<?> cls);

    public abstract InterfaceC9545rc a(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, Class<?> cls);

    public InterfaceC9535rS<?, ?> b(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, Class<?> cls) {
        return null;
    }

    public InterfaceC9317nM c(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, Class<?> cls) {
        return null;
    }

    public abstract AbstractC9453pq<?> c(SerializationConfig serializationConfig, AbstractC9509qt abstractC9509qt, Class<?> cls);

    public PropertyNamingStrategy d(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, Class<?> cls) {
        return null;
    }

    public Object d(SerializationConfig serializationConfig, AbstractC9465qB abstractC9465qB, Class<?> cls) {
        return null;
    }

    public abstract AbstractC9450pn d(DeserializationConfig deserializationConfig, AbstractC9509qt abstractC9509qt, Class<?> cls);

    public ObjectIdGenerator<?> e(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, Class<?> cls) {
        return null;
    }

    public VirtualBeanPropertyWriter e(MapperConfig<?> mapperConfig, Class<?> cls) {
        return null;
    }

    public ValueInstantiator g(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, Class<?> cls) {
        return null;
    }

    public abstract InterfaceC9489qZ<?> i(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, Class<?> cls);
}
