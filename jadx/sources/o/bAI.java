package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import o.bAG;

/* loaded from: classes4.dex */
public final class bAI {
    public final TextView b;
    private final TextView c;

    public TextView a() {
        return this.c;
    }

    private bAI(TextView textView, TextView textView2) {
        this.c = textView;
        this.b = textView2;
    }

    public static bAI e(LayoutInflater layoutInflater) {
        return b(layoutInflater, null, false);
    }

    public static bAI b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(bAG.b.f, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return d(inflate);
    }

    public static bAI d(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new bAI(textView, textView);
    }
}
