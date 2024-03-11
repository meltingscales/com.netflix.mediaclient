package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonProperty {

    /* loaded from: classes5.dex */
    public enum Access {
        AUTO,
        READ_ONLY,
        WRITE_ONLY,
        READ_WRITE
    }

    String a() default "";

    int b() default -1;

    Access c() default Access.AUTO;

    String d() default "";

    boolean e() default false;
}
