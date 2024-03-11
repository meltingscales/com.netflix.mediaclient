package o;

import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: o.bya  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5428bya implements InterfaceC5436byi {
    private final ViewPager2 b;
    private final ProgressBar e;

    public C5428bya(ViewPager2 viewPager2, ProgressBar progressBar) {
        C8632dsu.c((Object) viewPager2, "");
        C8632dsu.c((Object) progressBar, "");
        this.b = viewPager2;
        this.e = progressBar;
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: o.bya.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i, float f, int i2) {
                int b;
                ProgressBar progressBar2 = C5428bya.this.e;
                b = dsT.b(i + f + 0.2d);
                progressBar2.setProgress((b * C5428bya.this.e.getMax()) / C5428bya.this.b());
            }
        });
    }

    @Override // o.InterfaceC5436byi
    public boolean e(boolean z) {
        int currentItem = this.b.getCurrentItem();
        if (currentItem != 0 || z) {
            if (b() == currentItem + 1 && z) {
                return false;
            }
            this.b.setCurrentItem(currentItem + (z ? 1 : -1));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        RecyclerView.Adapter adapter = this.b.getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }
}
