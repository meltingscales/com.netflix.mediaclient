package com.uber.rxdogtag.autodispose;

import com.uber.autodispose.AutoDispose;
import com.uber.rxdogtag.RxDogTag;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class AutoDisposeConfigurer {
    private static final Set<String> IGNORE_PACKAGES = Collections.singleton(AutoDispose.class.getPackage().getName());

    private AutoDisposeConfigurer() {
    }

    public static void configure(RxDogTag.Builder builder) {
        builder.addObserverHandlers(AutoDisposeObserverHandler.INSTANCE).addIgnoredPackages(IGNORE_PACKAGES);
    }
}
