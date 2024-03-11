package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9351nu {
    boolean c() default true;
}
