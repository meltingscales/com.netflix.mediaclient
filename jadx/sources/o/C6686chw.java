package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.ui.messaging.impl.MessagingEpoxyController;
import o.AbstractC6684chu;
import o.C6686chw;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.chw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6686chw extends AbstractC6684chu<a> {

    /* renamed from: o.chw$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC6684chu.d {
        private View b;
        private final C6688chy d;

        @Override // o.AbstractC6684chu.d
        public View b() {
            return this.b;
        }

        public final C6688chy e() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MessagingEpoxyController messagingEpoxyController, C6688chy c6688chy) {
            super(messagingEpoxyController);
            C8632dsu.c((Object) messagingEpoxyController, "");
            C8632dsu.c((Object) c6688chy, "");
            this.d = c6688chy;
            this.b = c6688chy;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6684chu
    /* renamed from: c */
    public a e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, MessagingEpoxyController messagingEpoxyController) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) layoutInflater, "");
        C8632dsu.c((Object) messagingEpoxyController, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        return new a(messagingEpoxyController, new C6688chy(requireContext, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingTrayFrag$createHolder$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                c(view);
                return dpR.c;
            }

            public final void c(View view) {
                C8632dsu.c((Object) view, "");
                C6686chw.this.dismiss();
            }
        }, messagingEpoxyController));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6684chu
    /* renamed from: e */
    public void a(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.e().open();
    }

    public final void m() {
        C6688chy e;
        a d = d();
        if (d == null || (e = d.e()) == null) {
            return;
        }
        e.close();
    }
}
