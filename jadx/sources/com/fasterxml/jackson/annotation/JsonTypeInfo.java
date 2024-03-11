package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonTypeInfo {

    /* loaded from: classes5.dex */
    public enum As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    @Deprecated
    /* loaded from: classes5.dex */
    public static abstract class a {
    }

    boolean a() default false;

    As b() default As.PROPERTY;

    String c() default "";

    Class<?> d() default JsonTypeInfo.class;

    Id e();

    /* loaded from: classes5.dex */
    public enum Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        CUSTOM(null);
        
        private final String f;

        public String e() {
            return this.f;
        }

        Id(String str) {
            this.f = str;
        }
    }
}
