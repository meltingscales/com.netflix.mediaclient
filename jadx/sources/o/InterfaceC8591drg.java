package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.drg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC8591drg {
    String a() default "";

    int[] b() default {};

    int c() default 1;

    String d() default "";

    String e() default "";
}
