package com.google.firebase.platforminfo;

import o.C8552dpv;

/* loaded from: classes5.dex */
public final class KotlinDetector {
    public static String detectVersion() {
        try {
            return C8552dpv.a.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
