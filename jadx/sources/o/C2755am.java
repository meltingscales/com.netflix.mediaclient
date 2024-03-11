package o;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: o.am  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2755am {
    final DiffUtil.DiffResult a;
    final List<? extends AbstractC3073as<?>> b;
    final List<? extends AbstractC3073as<?>> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2755am d(List<? extends AbstractC3073as<?>> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C2755am(list, list, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2755am a(List<? extends AbstractC3073as<?>> list) {
        return new C2755am(Collections.EMPTY_LIST, list, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2755am b(List<? extends AbstractC3073as<?>> list) {
        return new C2755am(list, Collections.EMPTY_LIST, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2755am e(List<? extends AbstractC3073as<?>> list, List<? extends AbstractC3073as<?>> list2, DiffUtil.DiffResult diffResult) {
        return new C2755am(list, list2, diffResult);
    }

    private C2755am(List<? extends AbstractC3073as<?>> list, List<? extends AbstractC3073as<?>> list2, DiffUtil.DiffResult diffResult) {
        this.d = list;
        this.b = list2;
        this.a = diffResult;
    }

    public void e(RecyclerView.Adapter adapter) {
        d(new AdapterListUpdateCallback(adapter));
    }

    public void d(ListUpdateCallback listUpdateCallback) {
        DiffUtil.DiffResult diffResult = this.a;
        if (diffResult != null) {
            diffResult.dispatchUpdatesTo(listUpdateCallback);
        } else if (this.b.isEmpty() && !this.d.isEmpty()) {
            listUpdateCallback.onRemoved(0, this.d.size());
        } else if (this.b.isEmpty() || !this.d.isEmpty()) {
        } else {
            listUpdateCallback.onInserted(0, this.b.size());
        }
    }
}
