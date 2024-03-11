package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.Duration;
import com.yuyakaido.android.cardstackview.internal.CardStackSmoothScroller;
import com.yuyakaido.android.cardstackview.internal.CardStackState;
import o.C8504doa;

/* renamed from: o.doc  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8506doc extends SnapHelper {
    private int b = 0;
    private int e = 0;

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        if (layoutManager instanceof CardStackLayoutManager) {
            CardStackLayoutManager cardStackLayoutManager = (CardStackLayoutManager) layoutManager;
            if (cardStackLayoutManager.findViewByPosition(cardStackLayoutManager.b()) != null) {
                int translationX = (int) view.getTranslationX();
                int translationY = (int) view.getTranslationY();
                if (translationX != 0 || translationY != 0) {
                    C8507dod d = cardStackLayoutManager.d();
                    float abs = Math.abs(translationX) / view.getWidth();
                    float abs2 = Math.abs(translationY) / view.getHeight();
                    int i = this.e;
                    int i2 = this.b;
                    if (i < i2) {
                        i = i2;
                    }
                    Duration b = Duration.b(i);
                    if (b != Duration.Fast) {
                        float f = d.j;
                        if (f >= abs && f >= abs2) {
                            CardStackSmoothScroller cardStackSmoothScroller = new CardStackSmoothScroller(CardStackSmoothScroller.ScrollType.ManualCancel, cardStackLayoutManager);
                            cardStackSmoothScroller.setTargetPosition(cardStackLayoutManager.b());
                            cardStackLayoutManager.startSmoothScroll(cardStackSmoothScroller);
                        }
                    }
                    CardStackState e = cardStackLayoutManager.e();
                    if (d.b.contains(e.b())) {
                        e.i = e.j + 1;
                        cardStackLayoutManager.d(new C8504doa.b().b(d.f.b()).d(b.c).b(d.f.a()).a());
                        this.b = 0;
                        this.e = 0;
                        CardStackSmoothScroller cardStackSmoothScroller2 = new CardStackSmoothScroller(CardStackSmoothScroller.ScrollType.ManualSwipe, cardStackLayoutManager);
                        cardStackSmoothScroller2.setTargetPosition(cardStackLayoutManager.b());
                        cardStackLayoutManager.startSmoothScroll(cardStackSmoothScroller2);
                    } else {
                        CardStackSmoothScroller cardStackSmoothScroller3 = new CardStackSmoothScroller(CardStackSmoothScroller.ScrollType.ManualCancel, cardStackLayoutManager);
                        cardStackSmoothScroller3.setTargetPosition(cardStackLayoutManager.b());
                        cardStackLayoutManager.startSmoothScroll(cardStackSmoothScroller3);
                    }
                }
            }
        }
        return new int[2];
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof CardStackLayoutManager) {
            CardStackLayoutManager cardStackLayoutManager = (CardStackLayoutManager) layoutManager;
            View findViewByPosition = cardStackLayoutManager.findViewByPosition(cardStackLayoutManager.b());
            if (findViewByPosition != null) {
                int translationX = (int) findViewByPosition.getTranslationX();
                int translationY = (int) findViewByPosition.getTranslationY();
                if (translationX == 0 && translationY == 0) {
                    return null;
                }
                return findViewByPosition;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        this.b = Math.abs(i);
        this.e = Math.abs(i2);
        if (layoutManager instanceof CardStackLayoutManager) {
            return ((CardStackLayoutManager) layoutManager).b();
        }
        return -1;
    }
}
