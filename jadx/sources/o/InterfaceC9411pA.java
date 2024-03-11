package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.pA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9411pA {
    String b() default "build";

    String d() default "with";

    /* renamed from: o.pA$d */
    /* loaded from: classes5.dex */
    public static class d {
        public final String a;
        public final String b;

        public d(InterfaceC9411pA interfaceC9411pA) {
            this(interfaceC9411pA.b(), interfaceC9411pA.d());
        }

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }
}
