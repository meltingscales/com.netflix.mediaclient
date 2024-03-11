package o;

import android.view.View;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bGn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3676bGn extends AbstractC3336ax<a> {
    private String b;
    private View.OnClickListener d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.g;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final String i() {
        return this.b;
    }

    public final View.OnClickListener m() {
        return this.d;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.a().showImage(new ShowImageRequest().a(this.b).c(ShowImageRequest.Priority.a));
        NetflixImageView a2 = aVar.a();
        View.OnClickListener onClickListener = this.d;
        a2.setOnClickListener(onClickListener);
        a2.setClickable(onClickListener != null);
    }

    /* renamed from: o.bGn$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(a.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ c = bIF.d(this, C3670bGh.a.b, false, 2, null);

        public final NetflixImageView a() {
            return (NetflixImageView) this.c.getValue(this, b[0]);
        }
    }
}
