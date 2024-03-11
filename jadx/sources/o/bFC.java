package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.details.EpisodeView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class bFC extends EpisodeView {
    private final int h;
    private final String i;

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bFC(Context context, int i, String str, int i2, int i3, bEH beh) {
        super(context, i, i3, beh);
        C8632dsu.c((Object) context, "");
        this.i = str;
        this.h = i2;
        i();
    }

    private final void i() {
        this.c = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.bx);
        View findViewById = findViewById(com.netflix.mediaclient.ui.R.g.bE);
        int i = getResources().getDisplayMetrics().widthPixels / this.h;
        findViewById.getLayoutParams().width = i;
        findViewById.getLayoutParams().height = (int) (i * 0.5625f);
        findViewById.requestLayout();
        super.d();
    }

    @Override // com.netflix.mediaclient.ui.details.EpisodeView, android.widget.Checkable
    public void setChecked(boolean z) {
        this.e = true;
        TextView textView = this.g;
        if (textView != null) {
            textView.setVisibility(0);
        }
        e();
    }

    @Override // com.netflix.mediaclient.ui.details.EpisodeView
    public CharSequence d(InterfaceC5227bul interfaceC5227bul) {
        C8632dsu.c((Object) interfaceC5227bul, "");
        if (interfaceC5227bul.aU_()) {
            String title = interfaceC5227bul.getTitle();
            C8632dsu.a(title, "");
            return title;
        }
        Context context = getContext();
        int i = com.netflix.mediaclient.ui.R.o.dA;
        int aw_ = interfaceC5227bul.aw_();
        String string = context.getString(i, Integer.valueOf(aw_), interfaceC5227bul.getTitle());
        C8632dsu.a(string, "");
        return string;
    }

    @Override // com.netflix.mediaclient.ui.details.EpisodeView, o.bFJ
    /* renamed from: d */
    public void c(InterfaceC5227bul interfaceC5227bul, InterfaceC5194buE interfaceC5194buE, int i) {
        C8632dsu.c((Object) interfaceC5227bul, "");
        super.c(interfaceC5227bul, interfaceC5194buE, i);
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(d(interfaceC5227bul));
        }
        NetflixImageView netflixImageView = this.c;
        if (netflixImageView != null) {
            netflixImageView.showImage(new ShowImageRequest().a(interfaceC5227bul.ca_()).c(ShowImageRequest.Priority.a));
            netflixImageView.setContentDescription(EpisodeView.c(interfaceC5227bul, getContext()));
        }
        if (C8632dsu.c((Object) interfaceC5227bul.getId(), (Object) this.i) || !interfaceC5227bul.isAvailableToPlay()) {
            this.a.setVisibility(8);
            TextView textView2 = this.j;
            textView2.setTypeface(textView2.getTypeface(), 1);
            return;
        }
        this.a.setVisibility(0);
        TextView textView3 = this.j;
        textView3.setTypeface(textView3.getTypeface(), 0);
    }

    @Override // com.netflix.mediaclient.ui.details.EpisodeView, o.bFJ
    public boolean c() {
        NetflixImageView netflixImageView = this.c;
        if (netflixImageView != null) {
            return netflixImageView.isImageContentMissingForPresentationTracking();
        }
        return false;
    }
}
