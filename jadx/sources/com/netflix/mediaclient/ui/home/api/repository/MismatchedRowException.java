package com.netflix.mediaclient.ui.home.api.repository;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class MismatchedRowException extends Exception {
    public MismatchedRowException() {
        this(null, null, 3, null);
    }

    public /* synthetic */ MismatchedRowException(String str, Throwable th, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public MismatchedRowException(String str, Throwable th) {
        super(str, th);
    }
}
