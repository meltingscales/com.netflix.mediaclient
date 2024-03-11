package dagger.hilt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@GeneratesRootInput
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface InstallIn {
    Class<?>[] value();
}
