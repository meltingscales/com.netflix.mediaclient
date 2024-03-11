package o;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayAsset;
import com.netflix.model.leafs.PostPlayItem;
import o.C7639czx;
import o.cIE;

/* renamed from: o.czv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7637czv extends AbstractC7635czt {
    private ImageView a;
    private PostPlayItem b;
    private NetflixImageView c;
    private NetflixActivity d;
    private NetflixImageView e;

    @Override // o.AbstractC7635czt
    protected void b() {
    }

    @Override // o.AbstractC7635czt
    protected void c(int i) {
    }

    public C7637czv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C7637czv(Context context) {
        super(context, null);
    }

    @Override // o.AbstractC7635czt
    protected void a() {
        this.e = (NetflixImageView) findViewById(C7639czx.e.r);
        this.a = (ImageView) findViewById(C7639czx.e.B);
        this.c = (NetflixImageView) findViewById(C7639czx.e.v);
    }

    @Override // o.AbstractC7635czt
    public void e(C7641czz c7641czz, PostPlayItem postPlayItem, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType, View.OnClickListener onClickListener, NetflixActivity netflixActivity) {
        this.h = c7641czz;
        this.d = netflixActivity;
        this.b = postPlayItem;
        if (h()) {
            if (this.c != null && postPlayItem.getLogoAsset() != null && !C8168dfL.g(postPlayItem.getLogoAsset().getUrl())) {
                NetflixImageView netflixImageView = this.e;
                if (netflixImageView != null) {
                    netflixImageView.setVisibility(8);
                }
                this.c.showImage(new ShowImageRequest().a(postPlayItem.getLogoAsset().getUrl()).a(true).c(ShowImageRequest.Priority.a));
                this.c.setContentDescription(String.format(netflixActivity.getResources().getString(cIE.a.c), postPlayItem.getTitle()));
                Size d = d(postPlayItem.getLogoAsset());
                this.c.getLayoutParams().height = d.getHeight();
                this.c.getLayoutParams().width = d.getWidth();
            } else {
                this.c.setVisibility(8);
            }
        } else if (this.e != null && postPlayItem.getDisplayArtAsset() != null && !C8168dfL.g(postPlayItem.getDisplayArtAsset().getUrl())) {
            NetflixImageView netflixImageView2 = this.c;
            if (netflixImageView2 != null) {
                netflixImageView2.setVisibility(8);
            }
            this.e.showImage(new ShowImageRequest().a(postPlayItem.getDisplayArtAsset().getUrl()).a(true).c(ShowImageRequest.Priority.a));
            this.e.setContentDescription(String.format(netflixActivity.getResources().getString(cIE.a.c), postPlayItem.getTitle()));
        } else {
            this.e.setVisibility(8);
        }
        if (onClickListener == null) {
            ImageView imageView = this.a;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        setOnClickListener(onClickListener);
        if (this.a != null) {
            if (TextUtils.equals(postPlayItem.getExperienceType(), "nextEpisodeSeamless") || !h()) {
                this.a.setVisibility(0);
            } else {
                this.a.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        PostPlayItem postPlayItem = this.b;
        if (postPlayItem != null && TextUtils.equals(postPlayItem.getExperienceType(), "recommendations")) {
            this.a.setVisibility(z ? 0 : 8);
        }
        super.setSelected(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        super.c();
        if (this.e != null && this.b.getDisplayArtAsset() != null && !C8168dfL.g(this.b.getDisplayArtAsset().getUrl())) {
            this.e.showImage(new ShowImageRequest().a(this.b.getDisplayArtAsset().getUrl()).a(true).c(ShowImageRequest.Priority.a));
            this.e.setContentDescription(String.format(this.d.getResources().getString(cIE.a.c), this.b.getTitle()));
            this.e.setVisibility(0);
        }
        NetflixImageView netflixImageView = this.c;
        if (netflixImageView != null) {
            netflixImageView.setVisibility(8);
        }
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    private Size d(PostPlayAsset postPlayAsset) {
        int i;
        int i2 = 0;
        Size size = new Size(0, 0);
        float f = 1;
        float width = postPlayAsset.getWidth() / postPlayAsset.getHeight();
        int i3 = (width > 0.0f ? 1 : (width == 0.0f ? 0 : -1));
        if (i3 == 0) {
            return size;
        }
        if (i3 == 0) {
            i = 0;
        } else if (width > f) {
            i2 = 606;
            i = (int) (606 / width);
        } else {
            i2 = (int) (342 * width);
            i = 342;
        }
        return new Size(i2, i);
    }

    private boolean h() {
        C7641czz c7641czz = this.h;
        if (c7641czz == null || c7641czz.a() == null) {
            return false;
        }
        return this.h.a().b();
    }
}
