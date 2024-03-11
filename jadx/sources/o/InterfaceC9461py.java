package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.py  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9461py {
    Class<? extends InterfaceC9489qZ<?>> a();
}
