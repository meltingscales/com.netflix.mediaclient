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
public class VerticalRowConfigLayoutManager extends RowConfigLayoutManager {
    public static final a c = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalRowConfigLayoutManager(Context context, C1729aMb c1729aMb) {
        super(context, 1, c1729aMb, false, false);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1729aMb, "");
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("VerticalRowConfigLayoutManager");
        }
    }

    @Override // com.netflix.mediaclient.rowconfig.layoutmanager.RowConfigLayoutManager
    protected void b(View view) {
        C8632dsu.c((Object) view, "");
        Pair<Integer, Integer> c2 = c(1);
        int intValue = c2.b().intValue();
        int intValue2 = c2.c().intValue();
        view.setTag(aLX.a.b, Integer.valueOf(intValue));
        view.getLayoutParams().width = -1;
        view.getLayoutParams().height = intValue2;
    }
}
