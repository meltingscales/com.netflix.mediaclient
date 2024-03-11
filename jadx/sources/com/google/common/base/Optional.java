package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract boolean isPresent();

    Optional() {
    }
}
