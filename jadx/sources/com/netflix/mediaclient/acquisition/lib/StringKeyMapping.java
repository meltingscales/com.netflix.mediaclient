package com.netflix.mediaclient.acquisition.lib;

import java.util.Map;
import o.dpD;
import o.dqF;

/* loaded from: classes3.dex */
public final class StringKeyMapping {
    public static final StringKeyMapping INSTANCE = new StringKeyMapping();
    private static final Map<String, Integer> keyResourceMap = dqF.e(dpD.a("generic_retryable_failure", Integer.valueOf(R.string.generic_retryable_failure)));

    public final Map<String, Integer> getKeyResourceMap() {
        return keyResourceMap;
    }

    private StringKeyMapping() {
    }
}
