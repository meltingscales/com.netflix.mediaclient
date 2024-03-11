package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9307nC {
    String c() default "defaultReference";
}
