package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9310nF {
    boolean d() default false;

    String[] e() default {};
}
