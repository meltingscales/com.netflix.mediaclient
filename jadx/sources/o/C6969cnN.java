package o;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.ChipGroup;
import o.C6956cnA;

/* renamed from: o.cnN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6969cnN extends ChipGroup {
    public static final c c = new c(null);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6969cnN(Context context) {
        this(context, null, 2, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C6969cnN(Context context, AttributeSet attributeSet, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6969cnN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        b();
        setSingleSelection(true);
        setChipSpacing(context.getResources().getDimensionPixelOffset(C6956cnA.d.c));
    }

    /* renamed from: o.cnN$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    private final void b() {
        setLayoutTransition(new LayoutTransition());
        getLayoutTransition().setDuration(4, 100L);
        getLayoutTransition().enableTransitionType(4);
    }
}
