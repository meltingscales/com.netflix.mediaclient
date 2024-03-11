package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9352nv {
    boolean c() default true;
}
