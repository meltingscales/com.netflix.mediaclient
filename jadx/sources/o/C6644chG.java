package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import o.C6638chA;
import o.C6644chG;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.chG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6644chG extends ConstraintLayout {
    private final ViewGroup b;
    private final InterfaceC6682chs d;
    private final RecyclerView e;

    public final InterfaceC6682chs b() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6644chG(Context context, int i, drO<dpR> dro, drO<dpR> dro2, View view, int i2, boolean z, boolean z2, int i3, MessagingTooltipScreen.Tooltip_Location tooltip_Location, int i4, boolean z3, AbstractC2914ap abstractC2914ap, MessagingTooltipScreen.ScreenType screenType, View view2, boolean z4, Integer num, C1619aI c1619aI, MessagingTooltipScreen.a aVar) {
        super(context);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dro2, "");
        C8632dsu.c((Object) tooltip_Location, "");
        C8632dsu.c((Object) abstractC2914ap, "");
        C8632dsu.c((Object) screenType, "");
        C8632dsu.c((Object) c1619aI, "");
        C8632dsu.c((Object) aVar, "");
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) this, false);
        C8632dsu.d(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.b = viewGroup;
        View findViewById = viewGroup.findViewById(C6638chA.d.c);
        C8632dsu.a(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.e = recyclerView;
        C6687chx c6687chx = new C6687chx(context, this, view, dro2, dro, i2, z, z2, i3, tooltip_Location, i4, z3, screenType, view2, z4, num, c1619aI, viewGroup, recyclerView, aVar, new InterfaceC8612dsa<ViewGroup, Integer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.layouts.MessagingTooltipConstraintLayout$tooltipViewGroupManager$1
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(ViewGroup viewGroup2, Integer num2, Integer num3) {
                b(viewGroup2, num2.intValue(), num3.intValue());
                return dpR.c;
            }

            public final void b(ViewGroup viewGroup2, int i5, int i6) {
                C8632dsu.c((Object) viewGroup2, "");
                C6644chG.this.measureChild(viewGroup2, i5, i6);
            }
        });
        this.d = c6687chx;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(abstractC2914ap.getAdapter());
        c6687chx.b();
        setElevation(getResources().getDimensionPixelSize(C9834xU.a.ah));
        setClickable(true);
        setFocusableInTouchMode(true);
        setTag(Integer.valueOf(C9834xU.g.ai));
        setId(C9834xU.g.af);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C8632dsu.c((Object) windowInsets, "");
        return this.d.d(windowInsets);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.d.b(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return this.d.b(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.d.c(z, i, i2, i3, i4);
    }
}
