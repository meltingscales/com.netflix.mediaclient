package com.netflix.android.widgetry.widget;

import java.util.Locale;

/* loaded from: classes2.dex */
public interface TrackedLayoutManager {
    void a(String str);

    String c();

    /* loaded from: classes2.dex */
    public static class TrackedLayoutManagerException extends RuntimeException {
        public TrackedLayoutManagerException(IndexOutOfBoundsException indexOutOfBoundsException, String str) {
            super(String.format(Locale.US, "%s in %s", indexOutOfBoundsException.getMessage(), str), indexOutOfBoundsException);
        }
    }
}
