package o;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* renamed from: o.qk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9500qk extends AbstractC9497qh {
    private final Class<?> d = ConstructorProperties.class;

    @Override // o.AbstractC9497qh
    public Boolean a(AbstractC9509qt abstractC9509qt) {
        Transient d = abstractC9509qt.d(Transient.class);
        if (d != null) {
            return Boolean.valueOf(d.value());
        }
        return null;
    }

    @Override // o.AbstractC9497qh
    public Boolean c(AbstractC9509qt abstractC9509qt) {
        if (abstractC9509qt.d(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // o.AbstractC9497qh
    public PropertyName e(AnnotatedParameter annotatedParameter) {
        ConstructorProperties d;
        AnnotatedWithParams f = annotatedParameter.f();
        if (f == null || (d = f.d((Class<ConstructorProperties>) ConstructorProperties.class)) == null) {
            return null;
        }
        String[] value = d.value();
        int c = annotatedParameter.c();
        if (c < value.length) {
            return PropertyName.b(value[c]);
        }
        return null;
    }
}
