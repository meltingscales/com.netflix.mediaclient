package com.netflix.mediaclient.rowconfig.layoutmanager;

import android.content.Context;
import android.view.View;
import kotlin.Pair;
import o.C1045Mp;
import o.C1729aMb;
import o.C8627dsp;
import o.C8632dsu;
import o.aLX;

/* loaded from: classes3.dex */
public final class HorizontalRowConfigLayoutManager extends RowConfigLayoutManager {
    public static final c e = new c(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalRowConfigLayoutManager(Context context, C1729aMb c1729aMb) {
        super(context, 0, c1729aMb, false, false, 24, null);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1729aMb, "");
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("HorizontalRowConfigLayoutManager");
        }
    }

    @Override // com.netflix.mediaclient.rowconfig.layoutmanager.RowConfigLayoutManager
    protected void b(View view) {
        C8632dsu.c((Object) view, "");
        Integer num = (Integer) view.getTag(aLX.a.h);
        int intValue = num != null ? num.intValue() : 1;
        if (intValue < 1) {
            throw new IllegalStateException("row_config_span should be greater than or equal to 1");
        }
        Pair<Integer, Integer> c2 = c(intValue);
        int intValue2 = c2.b().intValue();
        int intValue3 = c2.c().intValue();
        view.getLayoutParams().width = intValue2;
        view.getLayoutParams().height = intValue3;
    }
}
