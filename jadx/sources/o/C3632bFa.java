package o;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.bFa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3632bFa {
    public final NetflixImageView a;
    public final C1204Sr b;
    public final LinearLayout c;
    public final ImageView d;
    public final EditText e;
    private final View f;
    public final C1204Sr g;
    public final TextInputLayout i;

    private C3632bFa(View view, ImageView imageView, LinearLayout linearLayout, C1204Sr c1204Sr, EditText editText, NetflixImageView netflixImageView, C1204Sr c1204Sr2, TextInputLayout textInputLayout) {
        this.f = view;
        this.d = imageView;
        this.c = linearLayout;
        this.b = c1204Sr;
        this.e = editText;
        this.a = netflixImageView;
        this.g = c1204Sr2;
        this.i = textInputLayout;
    }

    public static C3632bFa b(View view) {
        int i = com.netflix.mediaclient.ui.R.g.bk;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = com.netflix.mediaclient.ui.R.g.bo;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = com.netflix.mediaclient.ui.R.g.bp;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    i = com.netflix.mediaclient.ui.R.g.bl;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText != null) {
                        i = com.netflix.mediaclient.ui.R.g.cy;
                        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                        if (netflixImageView != null) {
                            i = com.netflix.mediaclient.ui.R.g.cG;
                            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr2 != null) {
                                i = com.netflix.mediaclient.ui.R.g.cD;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                if (textInputLayout != null) {
                                    return new C3632bFa(view, imageView, linearLayout, c1204Sr, editText, netflixImageView, c1204Sr2, textInputLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
