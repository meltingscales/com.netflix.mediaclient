package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.bLG;

/* loaded from: classes4.dex */
public abstract class bJC extends bLG {
    public static final d d = new d(null);

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("CustomDescriptionVideoModel");
        }
    }

    @Override // o.bLG, o.AbstractC3336ax
    /* renamed from: d */
    public void e(bLG.a aVar) {
        C8632dsu.c((Object) aVar, "");
        super.e(aVar);
        aVar.d().setFocusable(false);
        aVar.d().setContentDescription(null);
        NetflixImageView d2 = aVar.d();
        d2.setOnClickListener(null);
        d2.setClickable(false);
    }
}
