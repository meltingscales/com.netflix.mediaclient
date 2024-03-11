package dagger.hilt.android.internal.earlyentrypoint;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface AggregatedEarlyEntryPoint {
    String earlyEntryPoint();
}
