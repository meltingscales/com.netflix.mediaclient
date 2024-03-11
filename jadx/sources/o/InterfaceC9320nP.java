package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9320nP {
    String a() default "";

    boolean b() default true;

    String e() default "";
}
