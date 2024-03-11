package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayItem;

/* renamed from: o.czt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7635czt extends LinearLayout {
    protected C7641czz h;

    protected abstract void a();

    protected abstract void b();

    public void b(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bH_() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }

    protected abstract void c(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
    }

    public abstract void e(C7641czz c7641czz, PostPlayItem postPlayItem, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType, View.OnClickListener onClickListener, NetflixActivity netflixActivity);

    public AbstractC7635czt(Context context) {
        this(context, null);
    }

    public AbstractC7635czt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC7635czt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(300L).start();
        c(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: o.czt.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (C8054ddD.l(AbstractC7635czt.this.getContext())) {
                    return;
                }
                AbstractC7635czt.this.b();
            }
        }).setDuration(300L).start();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        a();
    }
}
