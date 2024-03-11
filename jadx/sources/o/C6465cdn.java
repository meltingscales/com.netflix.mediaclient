package o;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;

/* renamed from: o.cdn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6465cdn extends AbstractC6462cdk {
    private View d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6465cdn(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6465cdn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.AbstractC6462cdk, o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public int i() {
        return com.netflix.mediaclient.ui.R.i.m;
    }

    @Override // o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public boolean j() {
        return false;
    }

    public /* synthetic */ C6465cdn(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6465cdn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        setGravity(49);
    }

    @Override // o.AbstractC6462cdk, o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public void b() {
        super.b();
        View findViewById = findViewById(com.netflix.mediaclient.ui.R.g.gs);
        C8632dsu.a(findViewById, "");
        this.d = findViewById;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6462cdk, o.C6467cdp
    public void b(InterfaceC5180btr interfaceC5180btr, BillboardSummary billboardSummary, String str) {
        C8632dsu.c((Object) interfaceC5180btr, "");
        C8632dsu.c((Object) billboardSummary, "");
        View view = this.d;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        view.setVisibility(e(billboardSummary) ? 0 : 8);
        super.b(interfaceC5180btr, billboardSummary, str);
    }

    @Override // o.AbstractC6462cdk
    public BillboardAsset a(BillboardSummary billboardSummary) {
        C8632dsu.c((Object) billboardSummary, "");
        return billboardSummary.getBackground();
    }

    @Override // o.AbstractC6462cdk
    protected GradientDrawable a(int i) {
        return C6472cdu.b.e(true, i, getContext().getResources().getConfiguration().getLayoutDirection() == 1);
    }
}
