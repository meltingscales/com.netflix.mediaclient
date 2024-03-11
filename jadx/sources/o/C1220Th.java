package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Objects;
import o.C9645uM;
import o.C9834xU;
import o.InterfaceC6434cdI;

/* renamed from: o.Th  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1220Th extends NetflixImageView implements InterfaceC6434cdI.c<InterfaceC5223buh>, bDT {
    private boolean a;
    protected View$OnClickListenerC1217Te b;
    protected InterfaceC5223buh c;
    protected String d;
    protected TrackingInfoHolder e;
    private ST i;

    public boolean a() {
        return true;
    }

    public void setClickListener(View$OnClickListenerC1217Te view$OnClickListenerC1217Te) {
        this.b = view$OnClickListenerC1217Te;
    }

    public void setIsHorizontal(boolean z) {
        this.a = z;
    }

    public C1220Th(Context context) {
        super(context);
        this.d = "EMPTY";
        b();
    }

    public C1220Th(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "EMPTY";
        b();
    }

    public C1220Th(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "EMPTY";
        b();
    }

    private void b() {
        setFocusable(true);
        setBackgroundResource(C9834xU.j.K);
        if (getForeground() == null) {
            setForeground(ContextCompat.getDrawable(getContext(), C9645uM.d.e));
        }
        if (isInEditMode()) {
            return;
        }
        this.b = e();
    }

    protected View$OnClickListenerC1217Te e() {
        if (C8171dfO.c()) {
            return new C6487ceI((NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class), this, this, a());
        }
        return new View$OnClickListenerC1217Te((NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class), this);
    }

    private void e(CharSequence charSequence) {
        if (this.i == null) {
            this.i = new ST(getContext());
            bLF.e(getContext(), this.i, Integer.valueOf(BrowseExperience.b().d()));
        }
        this.i.d(charSequence);
        setImageDrawable(this.i);
    }

    @Override // com.netflix.mediaclient.android.widget.NetflixImageView
    public void onViewRecycled() {
        super.onViewRecycled();
        this.b.b(this);
    }

    @Override // o.InterfaceC6434cdI.c
    /* renamed from: e */
    public void c(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z) {
        this.e = trackingInfoHolder;
        this.d = "EMPTY";
        this.c = interfaceC5223buh;
        this.b.d(this, interfaceC5223buh, trackingInfoHolder);
        setVisibility(0);
        setContentDescription(C8140dek.a.a(getContext(), interfaceC5223buh));
        String d = d(interfaceC5223buh, interfaceC5149btM);
        if (C8168dfL.g(d)) {
            clearImage();
            e(interfaceC5223buh.getTitle());
            return;
        }
        showImage(new ShowImageRequest().a(d).j(z).d());
    }

    public String d(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM) {
        if (this.a) {
            return a(interfaceC5223buh);
        }
        if (interfaceC5149btM != null && interfaceC5149btM.getImageUrl() != null) {
            return interfaceC5149btM.getImageUrl();
        }
        return interfaceC5223buh.getBoxshotUrl();
    }

    private String a(InterfaceC5223buh interfaceC5223buh) {
        if (interfaceC5223buh instanceof InterfaceC8366diy) {
            return ((InterfaceC8366diy) interfaceC5223buh).bM_();
        }
        return null;
    }

    @Override // o.bDG
    public PlayContext y_() {
        TrackingInfoHolder trackingInfoHolder = this.e;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder.d(false);
        }
        InterfaceC1598aHf.a("VideoView.getPlayContext has null trackingInfo");
        return new EmptyPlayContext("VideoView", -500);
    }

    @Override // o.bDT
    public TrackingInfoHolder d() {
        TrackingInfoHolder trackingInfoHolder = this.e;
        Objects.requireNonNull(trackingInfoHolder);
        return trackingInfoHolder;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable instanceof ST) {
            this.d = "TEXT";
        } else if (drawable instanceof BitmapDrawable) {
            this.d = "IMAGE";
        } else if (drawable instanceof TransitionDrawable) {
            this.d = "EMPTY";
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap != null) {
            this.d = "IMAGE";
        }
    }

    @Override // o.InterfaceC6434cdI.c
    public boolean c() {
        return isImageContentMissingForPresentationTracking();
    }
}
