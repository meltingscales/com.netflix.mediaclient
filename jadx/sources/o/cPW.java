package o;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import javax.inject.Inject;
import o.cPX;

/* loaded from: classes4.dex */
public final class cPW implements cPU {
    public static final d b = new d(null);
    private final Activity d;

    @Inject
    public cPW(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.d = activity;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("RatingImpl");
        }
    }

    @Override // o.cPU
    public cPT c(Context context, ViewGroup viewGroup, Integer num) {
        C8632dsu.c((Object) context, "");
        View inflate = LayoutInflater.from(context).inflate(cPX.e.g, viewGroup, false);
        C8632dsu.d(inflate);
        C5997cQd c5997cQd = (C5997cQd) inflate;
        if (num != null) {
            c5997cQd.setTextSize(num.intValue());
        }
        return c5997cQd;
    }

    @Override // o.cPU
    public cPT e(Context context, ViewGroup viewGroup, Integer num) {
        C8632dsu.c((Object) context, "");
        View inflate = LayoutInflater.from(context).inflate(cPX.e.d, viewGroup, false);
        C8632dsu.d(inflate);
        return (cPZ) inflate;
    }

    @Override // o.cPU
    public DialogFragment c() {
        return new cPQ();
    }
}
