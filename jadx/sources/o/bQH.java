package o;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* loaded from: classes4.dex */
public final class bQH extends FragmentStateAdapter {
    public static final d b = new d(null);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 3;
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bQH(bQI bqi) {
        super(bqi);
        C8632dsu.c((Object) bqi, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new bQS();
                }
                throw new IllegalStateException("Unsupported position index " + i + " for this view pager adapter");
            }
            return new bQO();
        }
        return new bQQ();
    }
}
