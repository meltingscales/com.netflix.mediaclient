package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayItem;
import o.C7639czx;

/* renamed from: o.czj  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7625czj extends AbstractC7627czl {
    private C7623czh b;
    private NetflixImageView d;
    private C7640czy h;

    public C7625czj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C7625czj(Context context) {
        super(context, null);
    }

    @Override // o.AbstractC7627czl
    protected void c() {
        this.b = (C7623czh) findViewById(C7639czx.e.n);
        this.h = (C7640czy) findViewById(C7639czx.e.u);
        this.d = (NetflixImageView) findViewById(C7639czx.e.x);
    }

    @Override // o.AbstractC7627czl
    public void a(C7641czz c7641czz, PostPlayItem postPlayItem, NetflixActivity netflixActivity, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType) {
        this.c = c7641czz;
        this.b.a(c7641czz, postPlayItem, netflixActivity, iPlayerFragment, playLocationType);
        this.h.d(c7641czz, postPlayItem, netflixActivity, iPlayerFragment, playLocationType);
        if (postPlayItem.getLogoAsset() == null || C8168dfL.g(postPlayItem.getLogoAsset().getUrl())) {
            return;
        }
        this.d.showImage(new ShowImageRequest().a(postPlayItem.getLogoAsset().getUrl()).a(true).c(ShowImageRequest.Priority.a));
        this.d.setContentDescription(postPlayItem.getAncestorTitle());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7627czl
    public void e() {
        C7640czy c7640czy = this.h;
        if (c7640czy != null) {
            c7640czy.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7627czl
    public void b() {
        C7640czy c7640czy = this.h;
        if (c7640czy != null) {
            c7640czy.h();
        }
    }

    @Override // o.AbstractC7627czl
    public void d() {
        C7623czh c7623czh = this.b;
        if (c7623czh != null) {
            c7623czh.d();
        }
    }

    @Override // o.AbstractC7627czl
    public void a() {
        this.h.b();
    }
}
