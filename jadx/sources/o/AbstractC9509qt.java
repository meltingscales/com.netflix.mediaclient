package o;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* renamed from: o.qt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9509qt {
    public abstract JavaType a();

    public abstract boolean a(Class<?> cls);

    public abstract boolean a(Class<? extends Annotation>[] clsArr);

    public abstract AnnotatedElement b();

    public abstract String d();

    public abstract <A extends Annotation> A d(Class<A> cls);

    public abstract Class<?> e();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
