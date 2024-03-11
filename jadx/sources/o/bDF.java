package o;

import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class bDF implements ViewTreeObserver.OnPreDrawListener {
    private ImageView a;
    private e c;

    /* loaded from: classes4.dex */
    public interface e {
        void a();
    }

    public final void e() {
        this.a = null;
        this.c = null;
    }

    public bDF(ImageView imageView, e eVar) {
        C8632dsu.c((Object) imageView, "");
        C8632dsu.c((Object) eVar, "");
        this.a = imageView;
        this.c = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        ImageView imageView = this.a;
        if (imageView != null && (viewTreeObserver = imageView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        e eVar = this.c;
        if (eVar != null) {
            eVar.a();
        }
        e();
        return true;
    }
}
