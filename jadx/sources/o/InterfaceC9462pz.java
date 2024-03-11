package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.InterfaceC9535rS;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.pz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9462pz {
    Class<? extends InterfaceC9535rS> a() default InterfaceC9535rS.e.class;

    Class<?> b() default Void.class;

    Class<?> c() default Void.class;

    Class<? extends AbstractC9452pp> d() default AbstractC9452pp.d.class;

    Class<?> e() default Void.class;

    Class<? extends InterfaceC9535rS> f() default InterfaceC9535rS.e.class;

    Class<? extends AbstractC9450pn> h() default AbstractC9450pn.d.class;

    Class<? extends AbstractC9452pp> i() default AbstractC9452pp.d.class;

    Class<?> j() default Void.class;
}
