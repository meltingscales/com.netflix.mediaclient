package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
public interface MenuHost {
    void addMenuProvider(MenuProvider menuProvider);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state);

    void removeMenuProvider(MenuProvider menuProvider);
}
