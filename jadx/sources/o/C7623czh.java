package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.SeasonRenewal;
import o.C7639czx;
import o.cIE;

/* renamed from: o.czh  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7623czh extends AbstractC7627czl {
    protected int b;
    protected C1215Tc d;
    private final DecelerateInterpolator g;

    @Override // o.AbstractC7627czl
    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7627czl
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7627czl
    public void e() {
    }

    public C7623czh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new DecelerateInterpolator();
        this.b = 10000;
    }

    public C7623czh(Context context) {
        this(context, null);
    }

    @Override // o.AbstractC7627czl
    protected void c() {
        this.d = (C1215Tc) findViewById(C7639czx.e.I);
        ImageView imageView = (ImageView) findViewById(C7639czx.e.B);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // o.AbstractC7627czl
    public void d() {
        NetflixActivity netflixActivity = this.a;
        if (netflixActivity == null || this.d == null || C8150deu.s(netflixActivity) || this.d.getMeasuredWidth() != 0) {
            return;
        }
        this.d.getLayoutParams().height = (int) (C8150deu.l(this.a) * 0.6d);
        this.d.getLayoutParams().width = (int) (this.d.getLayoutParams().height * 1.778f);
        this.d.animate().setStartDelay(1000L).setDuration(this.b).x(this.d.getLayoutParams().height - this.d.getLayoutParams().width).setInterpolator(this.g);
    }

    @Override // o.AbstractC7627czl
    public void a(C7641czz c7641czz, PostPlayItem postPlayItem, NetflixActivity netflixActivity, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType) {
        this.c = c7641czz;
        PostPlayExperience c = c7641czz.c();
        this.a = netflixActivity;
        C1215Tc c1215Tc = this.d;
        if (c1215Tc != null && playLocationType != null) {
            c1215Tc.setCutomCroppingEnabled(true);
            this.d.setCenterHorizontally(true);
        }
        if (a(c)) {
            if (c.getSeasonRenewal().assets() == null || c.getSeasonRenewal().assets().get("BACKGROUND") == null) {
                return;
            }
            this.d.showImage(new ShowImageRequest().a(c.getSeasonRenewal().assets().get("BACKGROUND").url()).c(ShowImageRequest.Priority.a));
            this.d.setContentDescription(String.format(netflixActivity.getResources().getString(cIE.a.c), postPlayItem.getTitle()));
        } else if (postPlayItem.getBackgroundAsset() == null || postPlayItem.getBackgroundAsset().getUrl() == null) {
        } else {
            this.d.showImage(new ShowImageRequest().a(postPlayItem.getBackgroundAsset().getUrl()).c(ShowImageRequest.Priority.a));
            this.d.setContentDescription(String.format(netflixActivity.getResources().getString(cIE.a.c), postPlayItem.getTitle()));
        }
    }

    protected boolean a(PostPlayExperience postPlayExperience) {
        SeasonRenewal seasonRenewal;
        return (postPlayExperience == null || (seasonRenewal = postPlayExperience.getSeasonRenewal()) == null || seasonRenewal.message() == null) ? false : true;
    }
}
