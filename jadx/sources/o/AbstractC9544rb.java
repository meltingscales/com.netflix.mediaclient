package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.rb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9544rb {
    public abstract JsonTypeInfo.As a();

    public abstract WritableTypeId b(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);

    public abstract AbstractC9544rb b(BeanProperty beanProperty);

    public abstract WritableTypeId c(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);

    public abstract String d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.rb$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            b = iArr;
            try {
                iArr[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WritableTypeId d(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i = AnonymousClass5.b[a().ordinal()];
        if (i == 1) {
            writableTypeId.d = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.a = d();
        } else if (i == 2) {
            writableTypeId.d = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.a = d();
        } else if (i == 3) {
            writableTypeId.d = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.a = d();
        } else if (i == 4) {
            writableTypeId.d = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        } else if (i == 5) {
            writableTypeId.d = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        } else {
            C9448pl.e();
        }
        return writableTypeId;
    }

    public WritableTypeId e(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId d = d(obj, jsonToken);
        d.e = obj2;
        return d;
    }

    public WritableTypeId b(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId d = d(obj, jsonToken);
        d.c = cls;
        return d;
    }
}
