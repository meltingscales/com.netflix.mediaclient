package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOffer;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData;
import java.util.List;

/* loaded from: classes5.dex */
public final class cWV extends FrameLayout {
    private final C1193Sg a;
    private final bEN b;
    private final C1204Sr d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cWV(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cWV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cWV(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ cWV(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cWV(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        bEN c = bEN.c(LayoutInflater.from(context), this, true);
        C8632dsu.a(c, "");
        this.b = c;
        C1193Sg c1193Sg = c.c;
        C8632dsu.a(c1193Sg, "");
        this.a = c1193Sg;
        C1204Sr c1204Sr = c.a;
        C8632dsu.a(c1204Sr, "");
        this.d = c1204Sr;
    }

    public final void setUma(UmaAlert umaAlert) {
        C1333Xq d;
        UmaMultiMonthOfferData viewData;
        List<UmaMultiMonthOfferChoice> offerChoices;
        UmaMultiMonthOfferChoice umaMultiMonthOfferChoice;
        C8632dsu.c((Object) umaAlert, "");
        UmaMultiMonthOffer multiMonthOffer = umaAlert.multiMonthOffer();
        boolean z = false;
        int i = 50;
        if (multiMonthOffer != null && (viewData = multiMonthOffer.viewData()) != null && (offerChoices = viewData.offerChoices()) != null) {
            boolean z2 = offerChoices.size() == 1;
            if (offerChoices.size() > 0 && (umaMultiMonthOfferChoice = offerChoices.get(0)) != null) {
                i = umaMultiMonthOfferChoice.discountPercentage();
            }
            z = z2;
        }
        if (z) {
            d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.ht);
        } else {
            d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.hv);
        }
        this.d.setText(d.d("percent", Integer.valueOf(i)).c());
    }

    public final void setCtaButtonListener(View.OnClickListener onClickListener) {
        C8632dsu.c((Object) onClickListener, "");
        setOnClickListener(onClickListener);
    }

    public final void setDismissButtonListener(View.OnClickListener onClickListener) {
        C8632dsu.c((Object) onClickListener, "");
        this.a.setOnClickListener(onClickListener);
    }
}
