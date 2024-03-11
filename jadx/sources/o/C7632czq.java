package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;
import com.netflix.mediaclient.ui.player.PostPlay;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.subjects.Subject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C7639czx;
import o.C8175dfS;
import o.cIE;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.czq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7632czq extends PostPlay {
    private final DecelerateInterpolator A;
    private TextView B;
    private int C;
    protected List<AbstractC7635czt> D;
    private cGO E;
    private InterfaceC7594czE F;
    private final AtomicBoolean G;
    private InterfaceC5731cGg H;
    private List<AbstractC7627czl> I;
    private AbstractC5765cHn z;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.czq$c */
    /* loaded from: classes4.dex */
    public interface c {
        boolean aO();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(boolean z, boolean z2, boolean z3) {
        return z ? C7639czx.c.j : z2 ? C7639czx.c.f : z3 ? C7639czx.c.g : C7639czx.c.c;
    }

    public C7632czq(PlayerFragmentV2 playerFragmentV2, C7631czp c7631czp) {
        super(playerFragmentV2);
        this.C = -1;
        this.A = new DecelerateInterpolator();
        this.G = new AtomicBoolean(true);
        this.D = new ArrayList(5);
        this.I = new ArrayList(5);
        this.w = c7631czp;
        A();
    }

    private void A() {
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 == null) {
            C1044Mm.d("nf_postplay", "init() - called with null PlayerFragment!");
            return;
        }
        this.y = false;
        this.F = c(playerFragmentV2.getContext()) ? new C7595czF(this.f13302o) : null;
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public boolean o() {
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        InterfaceC5160btX aj = playerFragmentV2 == null ? null : playerFragmentV2.aj();
        boolean z = aj != null && aj.M();
        if (this.k) {
            return !z && super.o();
        }
        return super.o();
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void u() {
        PlayerFragmentV2 playerFragmentV2;
        int i;
        String string;
        if (this.s == null) {
            C1044Mm.d("nf_postplay", "We do not have any data! Do nothing!");
        } else if (this.m.isFinishing()) {
            C1044Mm.d("nf_postplay", "Activity for playback is already not valid! Do nothing!");
        } else {
            PlayerFragmentV2 playerFragmentV22 = this.f13302o;
            if (playerFragmentV22 == null || !playerFragmentV22.bn_()) {
                C1044Mm.d("nf_postplay", "Player fragment is null, do nothing!");
                return;
            }
            LayoutInflater layoutInflater = this.m.getLayoutInflater();
            boolean A = this.m.getServiceManager().A();
            this.a.removeAllViews();
            this.j.removeAllViews();
            if (this.B != null) {
                if (this.s.getExperienceTitle().size() != 0 && this.s.getExperienceTitle().get(0).getDisplayText() != null) {
                    string = this.s.getExperienceTitle().get(0).getDisplayText();
                } else {
                    string = "recommendations".equals(this.s.getType()) ? this.m.getResources().getString(cIE.a.l) : "";
                }
                this.B.setText(string);
                this.B.setVisibility(string.isEmpty() ? 8 : 0);
            }
            boolean equalsIgnoreCase = "twoUpChoicepoint".equalsIgnoreCase(this.s.getType());
            boolean equalsIgnoreCase2 = "preview3".equalsIgnoreCase(this.s.getType());
            boolean z = (this.s.getItems().size() <= 1 || equalsIgnoreCase || equalsIgnoreCase2) ? false : true;
            boolean equals = TextUtils.equals(this.s.getType(), "nextEpisodeSeamless");
            this.t.setOnClickListener(new View.OnClickListener() { // from class: o.czm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7632czq.this.e(view);
                }
            });
            int i2 = z ? C7639czx.c.a : C7639czx.c.b;
            if (!equalsIgnoreCase2) {
                B();
                int i3 = 0;
                for (PostPlayItem postPlayItem : this.s.getItems()) {
                    this.l = (AbstractC7627czl) layoutInflater.inflate(i2, (ViewGroup) this.a, false);
                    if (b(postPlayItem)) {
                        C8175dfS.d d2 = d(this.s.getAutoplaySeconds());
                        C7630czo c7630czo = (C7630czo) this.l.findViewById(cIE.b.bj);
                        if (c7630czo != null) {
                            if (d2 != null) {
                                c7630czo.b(postPlayItem, d2);
                                c7630czo.setVisibility(0);
                            } else {
                                c7630czo.setVisibility(8);
                            }
                        }
                    }
                    this.a.addView(this.l);
                    this.l.a(this.u, postPlayItem, this.m, this.f13302o, PlayLocationType.POST_PLAY);
                    this.l.getLayoutParams().width = C8150deu.p(this.m);
                    this.I.add(this.l);
                    if (equalsIgnoreCase || p()) {
                        i = i2;
                    } else {
                        i = i2;
                        c(layoutInflater, postPlayItem, A, z, equals, this.l, i3);
                    }
                    i3++;
                    i2 = i;
                }
            }
            if (equalsIgnoreCase2) {
                cHL chl = new cHL(this.c, this.s, this.f13302o.g(), this.f13302o.ah(), this.m);
                this.z = chl;
                chl.g();
            } else if (equalsIgnoreCase) {
                this.z = new cHJ(this.j, this.s, this.f13302o.g());
            }
            if (p() && !equalsIgnoreCase2) {
                Subject<cBO> g = this.f13302o.g();
                PostPlayItem seasonRenewalPostPlayItem = this.s.getSeasonRenewalPostPlayItem();
                if (g != null && seasonRenewalPostPlayItem != null) {
                    this.E = new cGO(this.j, g, this.s.getSeasonRenewal(), seasonRenewalPostPlayItem, b() && C6692ciB.a.b());
                }
            }
            if (this.s.getAutoplay() && this.s.getAutoplaySeconds() > 0 && !A && (playerFragmentV2 = this.f13302o) != null && !playerFragmentV2.f()) {
                q();
            } else if (!equalsIgnoreCase && !p()) {
                C();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        g();
    }

    private void C() {
        PlayerFragmentV2 playerFragmentV2;
        if (this.m.getServiceManager().A() || (playerFragmentV2 = this.f13302o) == null || playerFragmentV2.f()) {
            return;
        }
        for (PostPlayItem postPlayItem : this.s.getItems()) {
            PostPlayAction playTrailerAction = postPlayItem.getPlayTrailerAction();
            if (playTrailerAction != null && playTrailerAction.isAutoPlay() && playTrailerAction.getAutoplaySeconds() > 0) {
                q();
                return;
            }
        }
    }

    private void B() {
        this.a.getLayoutParams().width = C8150deu.p(this.m) * (this.s.getItems() == null ? 1 : this.s.getItems().size());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(LayoutInflater layoutInflater, PostPlayItem postPlayItem, boolean z, boolean z2, boolean z3, AbstractC7627czl abstractC7627czl, int i) {
        PlayerFragmentV2 playerFragmentV2;
        if (postPlayItem != null && this.s.getType().equals("nextEpisodeSeamless") && (playerFragmentV2 = this.f13302o) != null && playerFragmentV2.g() != null) {
            this.H = cHC.d.a(this.j, postPlayItem, this.f13302o.g(), this.s.getAutoplay());
            return;
        }
        AbstractC7635czt abstractC7635czt = (AbstractC7635czt) layoutInflater.inflate(a(z, z3, z2), (ViewGroup) this.j, false);
        e(abstractC7635czt, postPlayItem, z, z2, i);
        this.j.addView(abstractC7635czt);
        this.D.add(abstractC7635czt);
    }

    protected void e(AbstractC7635czt abstractC7635czt, PostPlayItem postPlayItem, boolean z, boolean z2, int i) {
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 != null) {
            if (z) {
                abstractC7635czt.e(this.u, postPlayItem, playerFragmentV2, PlayLocationType.POST_PLAY, new d(this.m), this.m);
            } else if (z2) {
                abstractC7635czt.e(this.u, postPlayItem, playerFragmentV2, PlayLocationType.POST_PLAY, e(i), this.m);
            } else if (postPlayItem == null) {
                InterfaceC1598aHf.a("Postplay dp action is null ");
            } else {
                PostPlayAction playAction = postPlayItem.getPlayAction();
                if (playAction != null) {
                    NetflixActivity netflixActivity = this.m;
                    PlayLocationType playLocationType = PlayLocationType.POST_PLAY;
                    abstractC7635czt.e(this.u, postPlayItem, playerFragmentV2, playLocationType, new C7624czi(netflixActivity, playerFragmentV2, playAction, playLocationType, null, this.u, postPlayItem).c(), this.m);
                }
            }
        }
    }

    protected a e(int i) {
        return new a(i, Collections.singletonList(this.j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.czq$d */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        NetflixActivity b;

        public d(NetflixActivity netflixActivity) {
            this.b = netflixActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("nextUrl", "/getstarted");
            this.b.setResult(21, intent);
            this.b.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.czq$a */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        List<LinearLayout> b;
        int e;

        public a(int i, List<LinearLayout> list) {
            this.e = i;
            this.b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!(view instanceof C7637czv)) {
                InterfaceC1598aHf.a("Listener should be attached to PostPlayItemBasic view, it was attached to " + view);
                return;
            }
            C7632czq.this.C = e((C7637czv) view);
            for (LinearLayout linearLayout : this.b) {
                int i = 0;
                while (i < linearLayout.getChildCount()) {
                    linearLayout.getChildAt(i).setSelected(i == C7632czq.this.C);
                    i++;
                }
            }
            if (C7632czq.this.G.getAndSet(false)) {
                C1044Mm.e("nf_postplay", "Video was full size, scale down");
                C7632czq.this.y();
            }
            C7632czq.this.b(this.e, true);
        }

        private int e(C7637czv c7637czv) {
            for (LinearLayout linearLayout : this.b) {
                for (int i = 0; i < linearLayout.getChildCount(); i++) {
                    if (linearLayout.getChildAt(i) == c7637czv) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }

    protected int b(int i) {
        return C8150deu.p(this.m) * (-1) * i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, boolean z) {
        if (this.m.isFinishing()) {
            return;
        }
        int b = b(C8310dhv.a() ? 4 - i : i);
        if (z) {
            this.a.animate().setDuration(250L).x(b).setInterpolator(this.A);
        } else {
            this.a.animate().cancel();
            this.a.setX(b);
        }
        if (this.s.getItems().get(i) != null) {
            this.C = i;
            return;
        }
        C1044Mm.d("nf_postplay", "PostPlay not found for index " + i);
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void k() {
        if (this.d != null && this.s != null && t()) {
            this.d.e();
            for (AbstractC7635czt abstractC7635czt : this.D) {
                abstractC7635czt.j();
            }
            for (AbstractC7627czl abstractC7627czl : this.I) {
                abstractC7627czl.b();
            }
        }
        for (AbstractC7635czt abstractC7635czt2 : this.D) {
            abstractC7635czt2.e();
        }
        AbstractC5765cHn abstractC5765cHn = this.z;
        if (abstractC5765cHn != null && (abstractC5765cHn instanceof cHL)) {
            abstractC5765cHn.c();
        }
        a(false);
        cGO cgo = this.E;
        if (cgo != null) {
            cgo.c();
        }
        InterfaceC5731cGg interfaceC5731cGg = this.H;
        if (interfaceC5731cGg != null) {
            interfaceC5731cGg.c();
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void c(boolean z) {
        PostPlayExperience postPlayExperience;
        if (this.d != null && this.s != null && t()) {
            this.d.d();
            for (AbstractC7635czt abstractC7635czt : this.D) {
                abstractC7635czt.d(this.d.a());
            }
            for (AbstractC7627czl abstractC7627czl : this.I) {
                abstractC7627czl.e();
            }
        }
        if (z && (postPlayExperience = this.s) != null && "preview3".equals(postPlayExperience.getType())) {
            ((cHL) this.z).d(0);
        } else if (this.p) {
            C1044Mm.e("nf_postplay", "Second time postplay ");
            PostPlayExperience postPlayExperience2 = this.s;
            if (postPlayExperience2 == null || !TextUtils.equals("nextEpisodeSeamless", postPlayExperience2.getType())) {
                y();
            }
            PostPlayExperience postPlayExperience3 = this.s;
            if (postPlayExperience3 != null && "preview3".equals(postPlayExperience3.getType())) {
                ((cHL) this.z).d(0);
            }
            for (AbstractC7635czt abstractC7635czt2 : this.D) {
                abstractC7635czt2.c();
            }
        } else {
            for (AbstractC7635czt abstractC7635czt3 : this.D) {
                abstractC7635czt3.c();
            }
            for (AbstractC7635czt abstractC7635czt4 : this.D) {
                if (z) {
                    abstractC7635czt4.bH_();
                }
            }
            View findViewById = this.m.findViewById(C7639czx.e.f13795o);
            if (findViewById != null) {
                findViewById.setOnClickListener(null);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: o.czq.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        PostPlayExperience postPlayExperience4;
                        PlayerFragmentV2 playerFragmentV2;
                        if (C1877aRo.j() && (postPlayExperience4 = C7632czq.this.s) != null && "nextEpisodeSeamless".equals(postPlayExperience4.getType()) && (playerFragmentV2 = C7632czq.this.f13302o) != null && !playerFragmentV2.j()) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("ab55877Action", "exitPlayback");
                                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
                            } catch (JSONException unused) {
                            }
                        }
                        C7632czq.this.k();
                        C7632czq.this.e(true);
                    }
                });
            }
            C1044Mm.e("nf_postplay", "First time postplay");
        }
        if (this.z != null) {
            C8175dfS.d dVar = this.d;
            if (dVar != null) {
                dVar.d(this.s.getAutoplaySeconds());
            }
            this.z.a();
        }
        cGO cgo = this.E;
        if (cgo != null) {
            this.d = null;
            cgo.i();
        }
        InterfaceC5731cGg interfaceC5731cGg = this.H;
        if (interfaceC5731cGg != null) {
            interfaceC5731cGg.d(interfaceC5731cGg.i(), this.d.a());
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void a(int i) {
        for (AbstractC7635czt abstractC7635czt : this.D) {
            abstractC7635czt.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        InterfaceC7594czE interfaceC7594czE = this.F;
        if (interfaceC7594czE != null) {
            if (interfaceC7594czE.b()) {
                a(true);
            }
            this.F.c();
        }
    }

    private void D() {
        InterfaceC7594czE interfaceC7594czE = this.F;
        if (interfaceC7594czE != null) {
            interfaceC7594czE.c(null);
            a(false);
            this.G.set(false);
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void a(boolean z) {
        super.a(z);
        if (z) {
            for (AbstractC7627czl abstractC7627czl : this.I) {
                abstractC7627czl.d();
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay, o.InterfaceC7450cwT
    public void i() {
        if (j()) {
            return;
        }
        super.i();
        if (this.y) {
            return;
        }
        PostPlayExperience postPlayExperience = this.s;
        if (postPlayExperience == null || !TextUtils.equals("nextEpisodeSeamless", postPlayExperience.getType())) {
            D();
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay, o.InterfaceC7450cwT
    public void a() {
        super.a();
        if (this.s != null) {
            a(true);
            if ("recommendations".equals(this.s.getType())) {
                this.B.setVisibility(8);
                if (this.j.getChildCount() > 1 && (this.j.getChildAt(0) instanceof C7637czv) && this.C == -1) {
                    ((C7637czv) this.j.getChildAt(0)).setSelected(true);
                    this.C = 0;
                }
            }
            InterfaceC5731cGg interfaceC5731cGg = this.H;
            if (interfaceC5731cGg != null) {
                interfaceC5731cGg.g();
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void r() {
        this.B = (TextView) this.m.findViewById(cIE.b.bh);
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay, o.InterfaceC7450cwT
    public void d() {
        super.d();
        k();
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void l() {
        if ("nextEpisodeSeamless".equals(this.s.getType())) {
            TrackingInfo d2 = C7638czw.d.d(this.s);
            if (d2 != null) {
                CLv2Utils.b(false, AppView.nextEpisodeButton, d2, null);
                return;
            }
            return;
        }
        super.l();
    }

    @Override // com.netflix.mediaclient.ui.player.PostPlay
    public void w() {
        super.w();
    }

    private boolean c(Context context) {
        return ((c) EntryPointAccessors.fromApplication(context, c.class)).aO();
    }
}
