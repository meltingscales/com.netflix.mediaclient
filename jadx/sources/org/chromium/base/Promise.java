package org.chromium.base;

import android.os.Handler;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public class Promise<T> {
    private int mState = 0;
    private final List<Callback<T>> mFulfillCallbacks = new LinkedList();
    private final List<Callback<Exception>> mRejectCallbacks = new LinkedList();
    private final Thread mThread = Thread.currentThread();
    private final Handler mHandler = new Handler();

    /* loaded from: classes6.dex */
    public static class UnhandledRejectionException extends RuntimeException {
    }
}
