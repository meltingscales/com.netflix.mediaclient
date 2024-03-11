package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean a(Throwable th) {
        return ExceptionHelper.d(this, th);
    }

    public Throwable d() {
        return ExceptionHelper.a(this);
    }
}
