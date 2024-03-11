package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9314nJ {
    boolean d() default true;
}
