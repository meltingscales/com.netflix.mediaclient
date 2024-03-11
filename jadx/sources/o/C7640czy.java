package o;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.originals.interactive.Action;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.C7639czx;
import o.C8175dfS;
import o.cIE;

/* renamed from: o.czy  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7640czy extends LinearLayout {
    private static byte e$ss2$2619 = 24;
    private static int p = 0;
    private static int s = 1;
    private TextView a;
    protected LinearLayout b;
    private List<C7624czi> c;
    protected TextView d;
    protected C7641czz e;
    private PlayLocationType f;
    private TextView g;
    private TextView h;
    private C7630czo i;
    private TextView j;
    private TextView k;
    private PostPlayItem l;
    private IPlayerFragment m;
    private NetflixActivity n;

    /* renamed from: o  reason: collision with root package name */
    private LinearLayout f13796o;
    private LinearLayout q;
    private TextView r;
    private TextView t;

    public List<C7624czi> g() {
        return this.c;
    }

    public C7640czy(Context context) {
        this(context, null);
    }

    public C7640czy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7640czy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ArrayList(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.i = (C7630czo) findViewById(cIE.b.bj);
        this.q = (LinearLayout) findViewById(C7639czx.e.z);
        this.j = (TextView) findViewById(C7639czx.e.q);
        this.t = (TextView) findViewById(C7639czx.e.D);
        this.f13796o = (LinearLayout) findViewById(C7639czx.e.A);
        this.g = (TextView) findViewById(C7639czx.e.R);
        this.r = (TextView) findViewById(C7639czx.e.E);
        this.h = (TextView) findViewById(C7639czx.e.y);
        this.a = (TextView) findViewById(C7639czx.e.p);
        this.d = (TextView) findViewById(C7639czx.e.C);
        this.b = (LinearLayout) findViewById(C7639czx.e.s);
        this.k = (TextView) findViewById(C7639czx.e.t);
    }

    public void f() {
        C7630czo c7630czo = this.i;
        if (c7630czo != null) {
            c7630czo.a();
        }
    }

    public void h() {
        C7630czo c7630czo = this.i;
        if (c7630czo != null) {
            c7630czo.b();
        }
    }

    public void j() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).i();
        }
    }

    public void i() {
        for (C7624czi c7624czi : g()) {
            c7624czi.e(false);
        }
    }

    public void d(C7641czz c7641czz, PostPlayItem postPlayItem, NetflixActivity netflixActivity, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType) {
        this.e = c7641czz;
        this.l = postPlayItem;
        this.n = netflixActivity;
        this.m = iPlayerFragment;
        this.f = playLocationType;
        d(false, false);
        if (this.d != null) {
            String k = k();
            if (k != null && !m()) {
                this.d.setText(k);
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
        }
        boolean equals = TextUtils.equals(postPlayItem.getExperienceType(), Action.ActionType.NEXT_EPISODE);
        if (this.i != null && postPlayItem.isAutoPlay() && equals) {
            C8175dfS.d dVar = new C8175dfS.d(netflixActivity);
            dVar.d(postPlayItem.getAutoPlaySeconds());
            this.i.b(postPlayItem, dVar);
            this.i.setVisibility(0);
        }
        if (this.q != null) {
            b(false);
        }
        if (this.f13796o != null) {
            e(postPlayItem);
        }
    }

    private String k() {
        PostPlayItem postPlayItem = this.l;
        if (postPlayItem == null || TextUtils.equals(postPlayItem.getExperienceType(), "episodicTeaser")) {
            return null;
        }
        if (TextUtils.equals(this.l.getExperienceType(), Action.ActionType.NEXT_EPISODE)) {
            return this.l.getSynopsis();
        }
        if (this.l.getAncestorSynopsis() != null) {
            return this.l.getAncestorSynopsis();
        }
        return this.l.getSynopsis();
    }

    private void d(boolean z, boolean z2) {
        String format;
        this.b.removeAllViews();
        PostPlayItem postPlayItem = this.l;
        if (postPlayItem == null || !d(postPlayItem) || this.f.equals(PlayLocationType.MDX)) {
            return;
        }
        int size = C8150deu.h() ? this.l.getActions().size() : Math.min(this.l.getActions().size(), 2);
        for (int i = 0; i < size; i++) {
            PostPlayAction postPlayAction = this.l.getActions().get(i);
            if (postPlayAction == null || postPlayAction.getType() == null || postPlayAction.getName() == null) {
                if (postPlayAction == null) {
                    format = String.format(Locale.US, "Post Play: Skipping Rendering CTA since action is NULL, for ID: %d , item type: %s, postplay experience type : %s ", this.l.getVideoId(), this.l.getType(), this.l.getExperienceType());
                } else {
                    format = String.format(Locale.US, "Post Play: Skipping Rendering CTA since action type is: %s, action name: %s for ID: %d , item type: %s, postplay experience type : %s ", postPlayAction.getType(), postPlayAction.getName(), this.l.getVideoId(), this.l.getType(), this.l.getExperienceType());
                }
                InterfaceC1598aHf.a(new C1596aHd(format).b(false));
            } else {
                View inflate = this.n.getLayoutInflater().inflate(d(postPlayAction, i, z), (ViewGroup) this.b, false);
                this.b.addView(inflate);
                this.c.add(new C7624czi(this.n, this.m, postPlayAction, this.f, inflate, this.e, this.l));
            }
        }
    }

    private boolean d(PostPlayItem postPlayItem) {
        return !TextUtils.equals(postPlayItem.getExperienceType(), Action.ActionType.NEXT_EPISODE);
    }

    private void b(boolean z) {
        String a = a(this.l);
        String c = c(this.l);
        boolean z2 = m() && !z;
        if (a == null || z2) {
            TextView textView = this.k;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.k;
            if (textView2 != null) {
                textView2.setText(a);
                this.k.setVisibility(0);
            } else {
                TextView textView3 = this.t;
                if (textView3 != null) {
                    textView3.setText(a);
                    this.t.setVisibility(0);
                }
            }
        }
        TextView textView4 = this.t;
        if (textView4 != null) {
            if (c != null) {
                textView4.setText(c);
                this.t.setVisibility(0);
            } else {
                textView4.setVisibility(8);
            }
        }
        if (this.j != null) {
            if (this.l.hasNewBadge()) {
                LoMoUtils.c(this.l.getBadgeKeys(), this.j);
                this.j.setVisibility(0);
                return;
            }
            this.j.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r13.getMatchPercentage() > 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.netflix.model.leafs.PostPlayItem r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7640czy.e(com.netflix.model.leafs.PostPlayItem):void");
    }

    protected String a(PostPlayItem postPlayItem) {
        String ancestorTitle;
        PostPlayAction playAction = postPlayItem.getPlayAction();
        if (postPlayItem.isEpisodeNumberHidden()) {
            ancestorTitle = getContext().getResources().getString(com.netflix.mediaclient.ui.R.o.fM, postPlayItem.getAncestorTitle(), postPlayItem.getTitle());
        } else if (TextUtils.equals(postPlayItem.getExperienceType(), Action.ActionType.NEXT_EPISODE) && TextUtils.equals(postPlayItem.getType(), PostPlayItem.POST_PLAY_ITEM_EPISODE) && playAction != null) {
            String seasonSequenceAbbr = playAction.getSeasonSequenceAbbr();
            if (C8168dfL.g(seasonSequenceAbbr)) {
                ancestorTitle = getContext().getResources().getString(com.netflix.mediaclient.ui.R.o.fM, postPlayItem.getAncestorTitle(), postPlayItem.getTitle());
            } else {
                ancestorTitle = getContext().getResources().getString(com.netflix.mediaclient.ui.R.o.fO, postPlayItem.getAncestorTitle(), seasonSequenceAbbr, Integer.valueOf(playAction.getEpisode()), postPlayItem.getTitle());
            }
        } else {
            ancestorTitle = postPlayItem.getAncestorTitle();
        }
        return ancestorTitle == null ? postPlayItem.getTitle() : ancestorTitle;
    }

    private String c(PostPlayItem postPlayItem) {
        if (C8168dfL.g(postPlayItem.getSupplementalMessage()) || postPlayItem.getExperienceType().contains(Action.ActionType.NEXT_EPISODE) || postPlayItem.getExperienceType().contains("recommendations")) {
            return null;
        }
        return postPlayItem.getSupplementalMessage();
    }

    private static String d(Context context, PostPlayItem postPlayItem) {
        char c;
        String type = postPlayItem.getType();
        type.hashCode();
        int hashCode = type.hashCode();
        if (hashCode == -906335517) {
            if (type.equals("season")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -905838985) {
            if (hashCode == 3529469 && type.equals("show")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (type.equals("series")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                return postPlayItem.getSeasonsLabel();
            }
            return C8178dfV.d(postPlayItem.getRuntime(), context);
        }
        return postPlayItem.getEpisodes() + " episodes";
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        c();
    }

    public void b() {
        for (C7624czi c7624czi : this.c) {
            c7624czi.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        for (C7624czi c7624czi : this.c) {
            c7624czi.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        b(true);
        String k = k();
        TextView textView = this.d;
        if (textView != null) {
            if (k != null) {
                textView.setText(k);
                this.d.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        d(true, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        for (C7624czi c7624czi : this.c) {
            c7624czi.e();
        }
    }

    private int d(PostPlayAction postPlayAction, int i, boolean z) {
        boolean z2 = !z && m();
        return ("mylist".equals(postPlayAction.getType()) || "playlist".equals(postPlayAction.getType())) ? (i != 0 || z2) ? cIE.c.Y : cIE.c.ab : (i != 0 || z2) ? cIE.c.aa : cIE.c.ac;
    }

    private boolean m() {
        C7641czz c7641czz = this.e;
        if (c7641czz == null || c7641czz.a() == null) {
            return false;
        }
        return this.e.a().b();
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2619);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
