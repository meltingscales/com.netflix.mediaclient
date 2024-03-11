package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9313nI {

    /* renamed from: o.nI$e */
    /* loaded from: classes.dex */
    public @interface e {
        String a() default "";

        Class<?> c();
    }

    e[] c();
}
