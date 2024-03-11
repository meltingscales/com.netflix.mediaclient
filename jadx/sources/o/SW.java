package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class SW extends ConstraintLayout {
    private c b;

    /* loaded from: classes3.dex */
    public interface c {
        void d(Drawable drawable);
    }

    public final void setBackgroundChangeListener(c cVar) {
        C8632dsu.c((Object) cVar, "");
        this.b = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) runnable, "");
        super.scheduleDrawable(drawable, runnable, j);
        postDelayed(new Runnable() { // from class: o.SV
            @Override // java.lang.Runnable
            public final void run() {
                SW.b(SW.this);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SW sw) {
        C8632dsu.c((Object) sw, "");
        c cVar = sw.b;
        if (cVar != null) {
            Drawable background = sw.getBackground();
            C8632dsu.a(background, "");
            cVar.d(background);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        C8632dsu.c((Object) drawable, "");
        super.invalidateDrawable(drawable);
        c cVar = this.b;
        if (cVar != null) {
            Drawable background = getBackground();
            C8632dsu.a(background, "");
            cVar.d(background);
        }
    }
}
