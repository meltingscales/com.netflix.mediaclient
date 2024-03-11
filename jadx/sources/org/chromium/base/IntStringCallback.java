package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public interface IntStringCallback {
    @CalledByNative
    void onResult(int i, String str);
}
