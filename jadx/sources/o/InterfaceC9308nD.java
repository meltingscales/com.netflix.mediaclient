package o;

import com.fasterxml.jackson.annotation.OptBoolean;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.nD  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9308nD {
    OptBoolean a() default OptBoolean.TRUE;
}
