package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.ps  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9455ps {

    /* renamed from: o.ps$d */
    /* loaded from: classes.dex */
    public @interface d {
        JsonInclude.Include a() default JsonInclude.Include.NON_NULL;

        boolean b() default false;

        String c() default "";

        String d();

        String e() default "";
    }

    /* renamed from: o.ps$e */
    /* loaded from: classes.dex */
    public @interface e {
        String a() default "";

        Class<?> b() default Object.class;

        String c() default "";

        boolean d() default false;

        JsonInclude.Include e() default JsonInclude.Include.NON_NULL;

        Class<? extends VirtualBeanPropertyWriter> j();
    }

    e[] a() default {};

    d[] c() default {};

    boolean d() default false;
}
