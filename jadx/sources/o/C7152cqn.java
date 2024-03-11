package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import o.C7142cqd;
import o.C7152cqn;

/* renamed from: o.cqn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7152cqn extends AbstractC7118cqF {
    private final int a;
    private final CharSequence b;
    private final String c;
    private final TrackingInfo d;

    public C7152cqn() {
        this(0, null, null, null, 15, null);
    }

    public final CharSequence a() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    @Override // o.AbstractC7118cqF
    public int d() {
        return this.a;
    }

    public final TrackingInfo e() {
        return this.d;
    }

    public /* synthetic */ C7152cqn(int i, String str, String str2, TrackingInfo trackingInfo, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : trackingInfo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7152cqn(int i, CharSequence charSequence, String str, TrackingInfo trackingInfo) {
        super(false, 1, null);
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) str, "");
        this.a = i;
        this.b = charSequence;
        this.c = str;
        this.d = trackingInfo;
    }

    /* renamed from: o.cqn$d */
    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.ViewHolder {
        private TrackingInfo b;
        private String c;
        private final C1203Sq d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final View view) {
            super(view);
            C8632dsu.c((Object) view, "");
            C1203Sq c1203Sq = (C1203Sq) view.findViewById(C7142cqd.b.e);
            this.d = c1203Sq;
            c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cqo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7152cqn.d.b(view, this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(View view, d dVar, View view2) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) dVar, "");
            Context context = view.getContext();
            C8632dsu.a(context, "");
            C1588aGw.e((Activity) C9737vz.e(context, NetflixActivity.class)).c(bEX.b.e(new Intent("android.intent.action.VIEW", Uri.parse(dVar.c))));
            dVar.b(dVar.b);
        }

        private final void b(TrackingInfo trackingInfo) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.notificationLandingItem, trackingInfo), (Command) new ViewDetailsCommand(), true);
        }

        public final void e(C7152cqn c7152cqn) {
            C8632dsu.c((Object) c7152cqn, "");
            this.d.setText(c7152cqn.a());
            this.c = c7152cqn.c();
            this.b = c7152cqn.e();
        }
    }
}
