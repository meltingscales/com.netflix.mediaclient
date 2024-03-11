package o;

import android.view.ViewGroup;
import com.netflix.model.leafs.PostPlayItem;
import io.reactivex.subjects.Subject;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public final class cHG extends cHC {
    @Override // o.cHC
    public int o() {
        return cIE.c.ag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cHG(ViewGroup viewGroup, PostPlayItem postPlayItem, Subject<cBO> subject) {
        super(viewGroup, postPlayItem, subject);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) postPlayItem, "");
        C8632dsu.c((Object) subject, "");
    }

    @Override // o.cHC
    public void h() {
        s();
        m().setupTimer(f());
        m().setTimerFinished(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayItemSeamlessVisualTimerUIView$setupTimer$1
            public final void d() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }
        });
    }

    private final void s() {
        if (C8632dsu.c((Object) l().getType(), (Object) "non_sequentialInSameTitle")) {
            C7460cwd n = n();
            if (n != null) {
                m().setText(e().getContext().getString(com.netflix.mediaclient.ui.R.o.km, Integer.valueOf(n.x()), Integer.valueOf(n.aw_())));
                return;
            }
            return;
        }
        m().setText(e().getContext().getString(cIE.a.f13664o));
    }

    @Override // o.cHC
    public void q() {
        m().e();
    }

    @Override // o.cHC
    public void t() {
        m().h();
    }
}
