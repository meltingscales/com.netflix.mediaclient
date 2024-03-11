package o;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import io.reactivex.subjects.Subject;
import o.C7639czx;
import o.InterfaceC7282ctK;
import o.cHC;

/* renamed from: o.cxd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7513cxd extends C7632czq {
    private C7460cwd A;
    private InterfaceC5731cGg C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7513cxd(PlayerFragmentV2 playerFragmentV2, C7631czp c7631czp) {
        super(playerFragmentV2, c7631czp);
        C8632dsu.c((Object) playerFragmentV2, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C7632czq
    public void c(LayoutInflater layoutInflater, PostPlayItem postPlayItem, boolean z, boolean z2, boolean z3, AbstractC7627czl abstractC7627czl, int i) {
        InterfaceC5160btX aj;
        if (postPlayItem != null) {
            PostPlayExperience postPlayExperience = this.s;
            if (C8632dsu.c((Object) (postPlayExperience != null ? postPlayExperience.getType() : null), (Object) "nextEpisodeSeamless")) {
                if (this.A == null) {
                    InterfaceC7282ctK.a aVar = InterfaceC7282ctK.d;
                    NetflixActivity netflixActivity = this.m;
                    C8632dsu.a(netflixActivity, "");
                    InterfaceC7282ctK d = aVar.d(netflixActivity);
                    PlayerFragmentV2 playerFragmentV2 = this.f13302o;
                    this.A = d.d((playerFragmentV2 == null || (aj = playerFragmentV2.aj()) == null) ? null : aj.aH_());
                }
                PlayerFragmentV2 playerFragmentV22 = this.f13302o;
                Subject<cBO> g = playerFragmentV22 != null ? playerFragmentV22.g() : null;
                if (g != null) {
                    PostPlayExperience postPlayExperience2 = this.s;
                    if (postPlayExperience2 != null) {
                        cHC.e eVar = cHC.d;
                        LinearLayout linearLayout = this.j;
                        C8632dsu.a(linearLayout, "");
                        this.C = eVar.a(linearLayout, postPlayItem, g, postPlayExperience2.getAutoplay());
                    }
                    InterfaceC5731cGg interfaceC5731cGg = this.C;
                    if (interfaceC5731cGg != null) {
                        ((cHC) interfaceC5731cGg).a(this.A);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        super.c(layoutInflater, postPlayItem, z, z2, z3, abstractC7627czl, i);
    }

    @Override // o.C7632czq, com.netflix.mediaclient.ui.player.PostPlay
    public boolean o() {
        InterfaceC5160btX aj;
        InterfaceC7282ctK.a aVar = InterfaceC7282ctK.d;
        NetflixActivity netflixActivity = this.m;
        C8632dsu.a(netflixActivity, "");
        InterfaceC7282ctK d = aVar.d(netflixActivity);
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        return d.e((playerFragmentV2 == null || (aj = playerFragmentV2.aj()) == null) ? null : aj.aH_());
    }

    @Override // o.C7632czq, com.netflix.mediaclient.ui.player.PostPlay
    public void l() {
        PostPlayExperience postPlayExperience = this.s;
        if (C8632dsu.c((Object) (postPlayExperience != null ? postPlayExperience.getType() : null), (Object) "nextEpisodeSeamless")) {
            Logger.INSTANCE.logEvent(new Presented(AppView.nextEpisodeButton, Boolean.FALSE, C7638czw.d.d(this.s)));
        } else {
            super.l();
        }
    }

    @Override // o.C7632czq, com.netflix.mediaclient.ui.player.PostPlay
    public void c(boolean z) {
        super.c(z);
        InterfaceC5731cGg interfaceC5731cGg = this.C;
        if (interfaceC5731cGg != null) {
            interfaceC5731cGg.d(interfaceC5731cGg.i(), this.d.a());
        }
    }

    @Override // o.C7632czq, com.netflix.mediaclient.ui.player.PostPlay
    public void k() {
        super.k();
        InterfaceC5731cGg interfaceC5731cGg = this.C;
        if (interfaceC5731cGg != null) {
            interfaceC5731cGg.c();
        }
    }

    @Override // o.C7632czq, com.netflix.mediaclient.ui.player.PostPlay, o.InterfaceC7450cwT
    public void a() {
        InterfaceC5731cGg interfaceC5731cGg;
        super.a();
        if (this.s == null || (interfaceC5731cGg = this.C) == null) {
            return;
        }
        interfaceC5731cGg.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C7632czq
    public int a(boolean z, boolean z2, boolean z3) {
        boolean e;
        InterfaceC5160btX aj;
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        String aC_ = (playerFragmentV2 == null || (aj = playerFragmentV2.aj()) == null) ? null : aj.aC_();
        C7460cwd c7460cwd = this.A;
        e = C8691duz.e(aC_, c7460cwd != null ? c7460cwd.aC_() : null, false, 2, null);
        return !e ? C7639czx.c.e : super.a(z, z2, z3);
    }
}
