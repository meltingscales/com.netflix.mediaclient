package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9356nz {
    Class<? extends ObjectIdGenerator<?>> a();

    Class<?> b() default Object.class;

    Class<? extends InterfaceC9317nM> d() default C9319nO.class;

    String e() default "@id";
}
