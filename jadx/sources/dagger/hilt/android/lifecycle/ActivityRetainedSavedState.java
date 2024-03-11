package dagger.hilt.android.lifecycle;

import dagger.hilt.android.UnstableApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Qualifier
@UnstableApi
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ActivityRetainedSavedState {
}
