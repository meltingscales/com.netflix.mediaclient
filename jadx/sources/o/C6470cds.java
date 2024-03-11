package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;
import o.C6467cdp;
import o.C6470cds;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cds  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6470cds extends C6467cdp {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6470cds(Context context) {
        this(context, 0, null, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6470cds(Context context, int i) {
        this(context, i, null, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.C6467cdp
    protected void d(BillboardSummary billboardSummary) {
        C8632dsu.c((Object) billboardSummary, "");
    }

    @Override // o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public int i() {
        return com.netflix.mediaclient.ui.R.i.l;
    }

    public /* synthetic */ C6470cds(Context context, int i, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : attributeSet, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6470cds(Context context, int i, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.C6467cdp
    protected void b(InterfaceC5180btr interfaceC5180btr, BillboardSummary billboardSummary, final String str) {
        C8632dsu.c((Object) interfaceC5180btr, "");
        C8632dsu.c((Object) billboardSummary, "");
        ViewUtils.d((View) ((C6467cdp) this).c, true);
        BillboardAsset background = billboardSummary.getBackground();
        Integer width = background != null ? background.getWidth() : null;
        BillboardAsset background2 = billboardSummary.getBackground();
        Integer height = background2 != null ? background2.getHeight() : null;
        BillboardAsset background3 = billboardSummary.getBackground();
        if (((dpR) C9726vo.d(width, height, background3 != null ? background3.getUrl() : null, new InterfaceC8612dsa<Integer, Integer, String, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.BillboardLitePhoneView$addBillboardImageViews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Integer num, Integer num2, String str2) {
                d(num.intValue(), num2.intValue(), str2);
                return dpR.c;
            }

            public final void d(int i, int i2, String str2) {
                C8632dsu.c((Object) str2, "");
                C6470cds c6470cds = C6470cds.this;
                c6470cds.c(i, i2, ((C6467cdp) c6470cds).c.getId(), 0.55f);
                ((C6467cdp) C6470cds.this).c.showImage(str2);
                ((C6467cdp) C6470cds.this).c.setContentDescription(str);
            }
        })) == null) {
            j(billboardSummary);
        }
    }
}
