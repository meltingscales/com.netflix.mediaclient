package o;

import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.pG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9417pG {
    Class<? extends ValueInstantiator> d();
}
