package com.netflix.android.kotlinx;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.subjects.Subject;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LifecycleOwnerKt$createSafeManagedStateEventSubject$1 implements DefaultLifecycleObserver {
    final /* synthetic */ Subject<T> d;

    public LifecycleOwnerKt$createSafeManagedStateEventSubject$1(Subject<T> subject) {
        this.d = subject;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        this.d.onComplete();
        super.onDestroy(lifecycleOwner);
    }
}
