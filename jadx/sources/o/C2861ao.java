package o;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ao  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2861ao extends RecyclerView.AdapterDataObserver {
    private final String c;

    public C2861ao(String str) {
        this.c = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        String str = this.c;
        Log.d(str, "Item range changed. Start: " + i + " Count: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        if (obj == null) {
            onItemRangeChanged(i, i2);
            return;
        }
        String str = this.c;
        Log.d(str, "Item range changed with payloads. Start: " + i + " Count: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        String str = this.c;
        Log.d(str, "Item range inserted. Start: " + i + " Count: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        String str = this.c;
        Log.d(str, "Item range removed. Start: " + i + " Count: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        String str = this.c;
        Log.d(str, "Item moved. From: " + i + " To: " + i2);
    }
}
