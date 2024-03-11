package com.yuyakaido.android.cardstackview.internal;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.internal.CardStackState;
import o.C8504doa;
import o.dnU;
import o.dnX;
import o.dnY;

/* loaded from: classes5.dex */
public class CardStackSmoothScroller extends RecyclerView.SmoothScroller {
    private CardStackLayoutManager a;
    private ScrollType e;

    /* loaded from: classes5.dex */
    public enum ScrollType {
        AutomaticSwipe,
        AutomaticRewind,
        ManualSwipe,
        ManualCancel
    }

    public CardStackSmoothScroller(ScrollType scrollType, CardStackLayoutManager cardStackLayoutManager) {
        this.e = scrollType;
        this.a = cardStackLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (this.e == ScrollType.AutomaticRewind) {
            dnX dnx = this.a.d().g;
            action.update(-b(dnx), -a(dnx), dnx.c(), dnx.a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        int i = AnonymousClass4.d[this.e.ordinal()];
        if (i == 1) {
            C8504doa c8504doa = this.a.d().f;
            action.update(-b(c8504doa), -a(c8504doa), c8504doa.c(), c8504doa.a());
        } else if (i == 2 || i == 3) {
            dnX dnx = this.a.d().g;
            action.update(translationX, translationY, dnx.c(), dnx.a());
        } else if (i != 4) {
        } else {
            C8504doa c8504doa2 = this.a.d().f;
            action.update((-translationX) * 10, (-translationY) * 10, c8504doa2.c(), c8504doa2.a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStart() {
        dnU a = this.a.a();
        CardStackState e = this.a.e();
        int i = AnonymousClass4.d[this.e.ordinal()];
        if (i == 1) {
            e.b(CardStackState.Status.AutomaticSwipeAnimating);
            a.c(this.a.c(), this.a.b(), this.a.d().f.b());
        } else if (i == 2 || i == 3) {
            e.b(CardStackState.Status.RewindAnimating);
        } else if (i != 4) {
        } else {
            e.b(CardStackState.Status.ManualSwipeAnimating);
            a.c(this.a.c(), this.a.b(), e.b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        dnU a = this.a.a();
        int i = AnonymousClass4.d[this.e.ordinal()];
        if (i == 2) {
            a.c();
            a.c(this.a.c(), this.a.b());
        } else if (i != 3) {
        } else {
            a.e();
        }
    }

    private int b(dnY dny) {
        int i;
        CardStackState e = this.a.e();
        int i2 = AnonymousClass4.e[dny.b().ordinal()];
        if (i2 == 1) {
            i = -e.f;
        } else if (i2 != 2) {
            return 0;
        } else {
            i = e.f;
        }
        return i * 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yuyakaido.android.cardstackview.internal.CardStackSmoothScroller$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Direction.values().length];
            e = iArr;
            try {
                iArr[Direction.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[Direction.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[Direction.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[Direction.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ScrollType.values().length];
            d = iArr2;
            try {
                iArr2[ScrollType.AutomaticSwipe.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[ScrollType.AutomaticRewind.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[ScrollType.ManualCancel.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[ScrollType.ManualSwipe.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private int a(dnY dny) {
        int i;
        CardStackState e = this.a.e();
        int i2 = AnonymousClass4.e[dny.b().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return e.b / 4;
        }
        if (i2 == 3) {
            i = -e.b;
        } else if (i2 != 4) {
            return 0;
        } else {
            i = e.b;
        }
        return i * 2;
    }
}
