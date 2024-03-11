package com.google.android.datatransport;

/* loaded from: classes2.dex */
public interface Transport<T> {
    void send(Event<T> event);
}
