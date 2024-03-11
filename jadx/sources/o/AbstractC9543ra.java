package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

/* renamed from: o.ra  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9543ra {
    public abstract Class<?> a();

    public abstract Object a(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract Object b(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract String b();

    public abstract JsonTypeInfo.As c();

    public abstract Object d(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract AbstractC9543ra d(BeanProperty beanProperty);

    public abstract InterfaceC9545rc d();

    public abstract Object e(JsonParser jsonParser, DeserializationContext deserializationContext);

    public static Object e(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        return a(jsonParser, deserializationContext, javaType.h());
    }

    public static Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) {
        JsonToken f = jsonParser.f();
        if (f == null) {
            return null;
        }
        int i = AnonymousClass5.d[f.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (cls.isAssignableFrom(Boolean.class)) {
                            return Boolean.TRUE;
                        }
                    } else if (i == 5 && cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.FALSE;
                    }
                } else if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jsonParser.p());
                }
            } else if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(jsonParser.u());
            }
        } else if (cls.isAssignableFrom(String.class)) {
            return jsonParser.A();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ra$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonToken.values().length];
            d = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[JsonToken.VALUE_TRUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[JsonToken.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
