package com.bugsnag.android;

import java.util.Arrays;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public enum ErrorType {
    UNKNOWN(""),
    ANDROID("android"),
    REACTNATIVEJS("reactnativejs"),
    C("c"),
    DART("dart");
    
    public static final b Companion = new b(null);
    private final String desc;

    public static final ErrorType fromDescriptor(String str) {
        return Companion.c(str);
    }

    public final String getDesc$bugsnag_android_core_release() {
        return this.desc;
    }

    ErrorType(String str) {
        this.desc = str;
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final ErrorType c(String str) {
            ErrorType[] valuesCustom;
            for (ErrorType errorType : ErrorType.valuesCustom()) {
                if (C8632dsu.c((Object) errorType.getDesc$bugsnag_android_core_release(), (Object) str)) {
                    return errorType;
                }
            }
            return null;
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ErrorType[] valuesCustom() {
        ErrorType[] valuesCustom = values();
        return (ErrorType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
