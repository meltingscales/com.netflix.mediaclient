package androidx.compose.foundation.lazy;

import java.util.List;

/* loaded from: classes.dex */
public interface LazyListLayoutInfo {
    int getTotalItemsCount();

    int getViewportEndOffset();

    List<LazyListItemInfo> getVisibleItemsInfo();
}
