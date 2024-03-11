package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nB  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9306nB {
    boolean c() default true;
}
