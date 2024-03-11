package o;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

/* renamed from: o.qA  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9464qA {

    /* renamed from: o.qA$c */
    /* loaded from: classes5.dex */
    public interface c {
        Class<?> i(Class<?> cls);

        c w();
    }

    public abstract AbstractC9445pi b(DeserializationConfig deserializationConfig, JavaType javaType, c cVar);

    public abstract AbstractC9445pi c(DeserializationConfig deserializationConfig, JavaType javaType, c cVar);

    public abstract AbstractC9445pi d(SerializationConfig serializationConfig, JavaType javaType, c cVar);

    public abstract AbstractC9445pi d(MapperConfig<?> mapperConfig, JavaType javaType, c cVar);

    public abstract AbstractC9445pi e(DeserializationConfig deserializationConfig, JavaType javaType, c cVar);

    public abstract AbstractC9464qA e();
}
