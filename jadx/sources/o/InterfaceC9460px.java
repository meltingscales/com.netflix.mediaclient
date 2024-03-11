package o;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.px  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9460px {
    Class<? extends PropertyNamingStrategy> a() default PropertyNamingStrategy.class;
}
