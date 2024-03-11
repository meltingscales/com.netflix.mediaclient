package com.bugsnag.android;

import java.util.Arrays;
import o.C8627dsp;

/* loaded from: classes2.dex */
public enum ThreadSendPolicy {
    ALWAYS,
    UNHANDLED_ONLY,
    NEVER;
    
    public static final e d = new e(null);

    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ThreadSendPolicy[] valuesCustom() {
        ThreadSendPolicy[] valuesCustom = values();
        return (ThreadSendPolicy[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
