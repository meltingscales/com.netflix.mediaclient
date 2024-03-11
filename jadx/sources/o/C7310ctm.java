package o;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* renamed from: o.ctm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7310ctm extends C9833xT {
    ImageView a;
    AnimationDrawable f;
    C1204Sr g;
    ProgressBar h;

    private C7310ctm(ViewGroup viewGroup) {
        super(viewGroup);
        e(viewGroup);
    }

    private void e(ViewGroup viewGroup) {
        b().a().addView(LayoutInflater.from(viewGroup.getContext()).inflate(com.netflix.mediaclient.ui.R.i.aL, e(), false));
        this.g = (C1204Sr) b().a().findViewById(com.netflix.mediaclient.ui.R.g.fR);
        this.h = (ProgressBar) b().a().findViewById(com.netflix.mediaclient.ui.R.g.fP);
        ImageView imageView = (ImageView) b().a().findViewById(com.netflix.mediaclient.ui.R.g.fO);
        this.a = imageView;
        LayerDrawable layerDrawable = (LayerDrawable) imageView.getContext().getResources().getDrawable(com.netflix.mediaclient.ui.R.e.e);
        this.f = (AnimationDrawable) layerDrawable.getDrawable(1);
        this.a.setImageDrawable(layerDrawable);
    }

    public static C7310ctm a(View view, CharSequence charSequence, int i, int i2, int i3) {
        ViewGroup e = C9833xT.e(view);
        if (e != null) {
            C7310ctm c7310ctm = new C7310ctm(e);
            c7310ctm.d(charSequence);
            c7310ctm.d(i);
            c7310ctm.c(i2);
            c7310ctm.f(i3);
            if (e.getWidth() < c7310ctm.b().b()) {
                c7310ctm.b().setMaxWidth(e.getWidth());
            }
            return c7310ctm;
        }
        return null;
    }

    public void a(int i, boolean z) {
        if (i > 0 && i < 100) {
            this.g.setVisibility(0);
            this.g.setText(C8176dfT.b(i));
            this.a.setVisibility(0);
            if (!this.f.isRunning() && !z) {
                this.f.start();
            }
            i();
            return;
        }
        this.g.setText("");
        this.a.setVisibility(8);
        this.f.stop();
    }

    public void n() {
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.a.setVisibility(8);
        this.f.stop();
    }

    public void m() {
        this.f.stop();
    }

    public void k() {
        this.f.start();
    }

    public void i() {
        this.h.setVisibility(8);
    }

    public void o() {
        if (this.f.isRunning()) {
            return;
        }
        this.h.setVisibility(0);
    }
}
