package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.model.leafs.social.multititle.NotificationGridTitleAction;
import o.C7149cqk;

/* renamed from: o.cqk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7149cqk extends AbstractC7118cqF {
    private final int a;
    private final NotificationGridTitleAction b;
    private final boolean e;

    public final NotificationGridTitleAction a() {
        return this.b;
    }

    public final boolean b() {
        return this.e;
    }

    @Override // o.AbstractC7118cqF
    public int d() {
        return this.a;
    }

    public /* synthetic */ C7149cqk(int i, NotificationGridTitleAction notificationGridTitleAction, boolean z, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 3 : i, notificationGridTitleAction, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7149cqk(int i, NotificationGridTitleAction notificationGridTitleAction, boolean z) {
        super(true);
        C8632dsu.c((Object) notificationGridTitleAction, "");
        this.a = i;
        this.b = notificationGridTitleAction;
        this.e = z;
    }

    /* renamed from: o.cqk$c */
    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.ViewHolder {
        private final NetflixImageView b;
        private String c;
        private TrackingInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7143cqe c7143cqe) {
            super(c7143cqe.d());
            C8632dsu.c((Object) c7143cqe, "");
            NetflixImageView netflixImageView = c7143cqe.e;
            C8632dsu.a(netflixImageView, "");
            this.b = netflixImageView;
            netflixImageView.setOnClickListener(new View.OnClickListener() { // from class: o.cqm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7149cqk.c.d(C7149cqk.c.this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(c cVar, View view) {
            C8632dsu.c((Object) cVar, "");
            cVar.d(cVar.d);
            Context context = cVar.itemView.getContext();
            C8632dsu.a(context, "");
            C1588aGw.e((Activity) C9737vz.e(context, NetflixActivity.class)).c(bEX.b.e(new Intent("android.intent.action.VIEW", Uri.parse(cVar.c))));
        }

        private final void d(TrackingInfo trackingInfo) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.notificationLandingItem, trackingInfo), (Command) new ViewDetailsCommand(), true);
        }

        public final void d(C7149cqk c7149cqk, String str, Integer num, float f, int i, int i2) {
            C8632dsu.c((Object) c7149cqk, "");
            C8632dsu.c((Object) str, "");
            if (num != null) {
                float f2 = 2;
                int intValue = (int) (((num.intValue() - (i2 * f2)) - (i * f2)) / 2.0f);
                this.b.getLayoutParams().width = intValue;
                this.b.getLayoutParams().height = (int) (intValue / f);
            }
            this.b.showImage(new ShowImageRequest().a(str).c(ShowImageRequest.Priority.a));
            this.c = c7149cqk.a().action();
            this.d = CLv2Utils.a(c7149cqk.a().trackingInfo());
        }
    }
}
