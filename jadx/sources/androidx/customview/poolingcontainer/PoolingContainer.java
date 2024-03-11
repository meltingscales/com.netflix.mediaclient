package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class PoolingContainer {
    private static final int PoolingContainerListenerHolderTag = R.id.pooling_container_listener_holder_tag;
    private static final int IsPoolingContainerTag = R.id.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(View view, PoolingContainerListener poolingContainerListener) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) poolingContainerListener, "");
        getPoolingContainerListenerHolder(view).addListener(poolingContainerListener);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(View view, PoolingContainerListener poolingContainerListener) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) poolingContainerListener, "");
        getPoolingContainerListenerHolder(view).removeListener(poolingContainerListener);
    }

    public static final boolean isPoolingContainer(View view) {
        C8632dsu.c((Object) view, "");
        Object tag = view.getTag(IsPoolingContainerTag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void setPoolingContainer(View view, boolean z) {
        C8632dsu.c((Object) view, "");
        view.setTag(IsPoolingContainerTag, Boolean.valueOf(z));
    }

    public static final boolean isWithinPoolingContainer(View view) {
        C8632dsu.c((Object) view, "");
        for (ViewParent viewParent : ViewKt.getAncestors(view)) {
            if ((viewParent instanceof View) && isPoolingContainer((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    public static final void callPoolingContainerOnRelease(View view) {
        C8632dsu.c((Object) view, "");
        for (View view2 : ViewKt.getAllViews(view)) {
            getPoolingContainerListenerHolder(view2).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            getPoolingContainerListenerHolder(view).onRelease();
        }
    }

    private static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        int i = PoolingContainerListenerHolderTag;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i);
        if (poolingContainerListenerHolder == null) {
            PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
            view.setTag(i, poolingContainerListenerHolder2);
            return poolingContainerListenerHolder2;
        }
        return poolingContainerListenerHolder;
    }
}
