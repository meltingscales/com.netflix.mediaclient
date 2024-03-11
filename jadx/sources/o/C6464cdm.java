package o;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;

/* renamed from: o.cdm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6464cdm extends AbstractC6462cdk {
    public static final c d = new c(null);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6464cdm(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6464cdm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6467cdp
    public boolean e(BillboardSummary billboardSummary) {
        C8632dsu.c((Object) billboardSummary, "");
        return true;
    }

    @Override // o.AbstractC6462cdk, o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public int i() {
        return com.netflix.mediaclient.ui.R.i.f13249o;
    }

    @Override // o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public boolean j() {
        return true;
    }

    public /* synthetic */ C6464cdm(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6464cdm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        setGravity(8388611);
    }

    /* renamed from: o.cdm$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.AbstractC6462cdk, com.netflix.mediaclient.ui.lomo.BillboardView
    public int d() {
        int i;
        int b;
        int h;
        int p = C8150deu.p(getContext());
        if (C8150deu.y(getContext())) {
            b = (int) ((p - (getContext().getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.b) * 2)) / 1.778f);
            h = h();
        } else {
            float f = p;
            i = C8657dts.i((int) (C8150deu.l(getContext()) * 0.6f), (int) (f / 1.778f));
            b = C8657dts.b(i, (int) (f * 0.5625f * 0.76f));
            h = h();
        }
        return b + h;
    }

    @Override // o.AbstractC6462cdk
    protected GradientDrawable a(int i) {
        return C6472cdu.b.e(false, i, getContext().getResources().getConfiguration().getLayoutDirection() == 1);
    }

    @Override // o.AbstractC6462cdk
    public BillboardAsset a(BillboardSummary billboardSummary) {
        C8632dsu.c((Object) billboardSummary, "");
        BillboardAsset horizontalBackground = billboardSummary.getHorizontalBackground();
        return (horizontalBackground != null ? horizontalBackground.getUrl() : null) != null ? billboardSummary.getHorizontalBackground() : billboardSummary.getBackground();
    }

    @Override // o.C6467cdp
    protected BillboardAsset c(BillboardSummary billboardSummary) {
        C8632dsu.c((Object) billboardSummary, "");
        return billboardSummary.getHorizontalLogo();
    }
}
