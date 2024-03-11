package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;

/* renamed from: o.czl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7627czl extends FrameLayout {
    protected NetflixActivity a;
    protected C7641czz c;
    protected PostPlayExperience e;

    public abstract void a();

    public abstract void a(C7641czz c7641czz, PostPlayItem postPlayItem, NetflixActivity netflixActivity, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    protected abstract void c();

    public abstract void d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e();

    public void setPostPlayExperience(PostPlayExperience postPlayExperience) {
        this.e = postPlayExperience;
    }

    public AbstractC7627czl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AbstractC7627czl(Context context) {
        this(context, null);
    }

    public AbstractC7627czl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        c();
    }
}
