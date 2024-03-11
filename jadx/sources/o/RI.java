package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6434cdI;

/* loaded from: classes3.dex */
public final class RI extends ConstraintLayout implements InterfaceC6434cdI.c<InterfaceC5223buh> {
    private NetflixImageView a;
    private NetflixImageView b;
    private TrackingInfoHolder c;
    private View$OnClickListenerC1217Te e;

    protected final int d() {
        return com.netflix.mediaclient.ui.R.i.ap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RI(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        a();
    }

    private final void a() {
        setFocusable(true);
        setBackgroundResource(C9834xU.j.K);
        View.inflate(getContext(), d(), this);
        this.b = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.ap);
        this.a = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.go);
        this.e = new View$OnClickListenerC1217Te(NetflixActivity.requireNetflixActivity(this), this);
    }

    public String d(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        if (interfaceC5149btM != null) {
            return interfaceC5149btM.getImageUrl();
        }
        return null;
    }

    @Override // o.bDG
    public PlayContext y_() {
        Map d;
        Map k;
        Throwable th;
        PlayContextImp b;
        TrackingInfoHolder trackingInfoHolder = this.c;
        if (trackingInfoHolder == null || (b = TrackingInfoHolder.b(trackingInfoHolder, false, 1, null)) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("VideoView.getPlayContext has null trackingInfo", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            return new EmptyPlayContext("KidsFavoritesVideoView", -500);
        }
        return b;
    }

    @Override // o.InterfaceC6434cdI.c
    public boolean c() {
        NetflixImageView netflixImageView = this.a;
        return !((netflixImageView == null || netflixImageView.isImageContentMissingForPresentationTracking()) ? false : true);
    }

    @Override // o.InterfaceC6434cdI.c
    /* renamed from: a */
    public void c(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.c = trackingInfoHolder;
        setVisibility(0);
        setContentDescription(interfaceC5223buh.getTitle());
        View$OnClickListenerC1217Te view$OnClickListenerC1217Te = this.e;
        if (view$OnClickListenerC1217Te != null) {
            view$OnClickListenerC1217Te.d(this, interfaceC5223buh, trackingInfoHolder);
        }
        d(interfaceC5223buh, interfaceC5149btM, z);
    }

    private final void d(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM, boolean z) {
        boolean g;
        NetflixImageView netflixImageView;
        NetflixImageView netflixImageView2;
        String tcardUrl = interfaceC5149btM != null ? interfaceC5149btM.getTcardUrl() : null;
        if (tcardUrl != null && tcardUrl.length() != 0 && (netflixImageView2 = this.a) != null) {
            netflixImageView2.showImage(new ShowImageRequest().a(tcardUrl).j(z));
        }
        String d = d(interfaceC5223buh, interfaceC5149btM);
        if (d != null) {
            g = C8691duz.g(d);
            if (g || (netflixImageView = this.b) == null) {
                return;
            }
            netflixImageView.showImage(new ShowImageRequest().a(d).j(z));
        }
    }
}
