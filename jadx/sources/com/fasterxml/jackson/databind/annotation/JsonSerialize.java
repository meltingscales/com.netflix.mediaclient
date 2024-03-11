package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.AbstractC9453pq;
import o.InterfaceC9535rS;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonSerialize {

    @Deprecated
    /* loaded from: classes5.dex */
    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    /* loaded from: classes5.dex */
    public enum Typing {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class<? extends InterfaceC9535rS> a() default InterfaceC9535rS.e.class;

    Class<? extends AbstractC9453pq> b() default AbstractC9453pq.d.class;

    Class<? extends InterfaceC9535rS> c() default InterfaceC9535rS.e.class;

    Class<?> d() default Void.class;

    Class<?> e() default Void.class;

    Typing f() default Typing.DEFAULT_TYPING;

    Class<? extends AbstractC9453pq> g() default AbstractC9453pq.d.class;

    Class<? extends AbstractC9453pq> h() default AbstractC9453pq.d.class;

    Class<?> i() default Void.class;

    @Deprecated
    Inclusion j() default Inclusion.DEFAULT_INCLUSION;

    Class<? extends AbstractC9453pq> m() default AbstractC9453pq.d.class;
}
