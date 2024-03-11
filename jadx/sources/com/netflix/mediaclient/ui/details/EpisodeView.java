package com.netflix.mediaclient.ui.details;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.util.ViewUtils;
import dagger.hilt.android.AndroidEntryPoint;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import o.C1044Mm;
import o.C8004dcG;
import o.C8054ddD;
import o.C8126deW;
import o.C8141del;
import o.C8168dfL;
import o.C8175dfS;
import o.C8178dfV;
import o.InterfaceC3655bFx;
import o.InterfaceC5176btn;
import o.InterfaceC5194buE;
import o.InterfaceC5227bul;
import o.InterfaceC7303ctf;
import o.bEH;
import o.bFE;
import o.bFI;
import o.bFJ;

@SuppressLint({"ViewConstructor"})
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class EpisodeView extends bFI implements Checkable, bFJ<InterfaceC5227bul, InterfaceC5194buE> {
    private static byte e$ss2$2421 = 24;
    private static int s = 0;
    private static int y = 1;
    public ImageView a;
    protected InterfaceC5227bul b;
    public NetflixImageView c;
    protected TextView d;
    public boolean e;
    private View.OnClickListener f;
    public TextView g;
    private TextView h;
    private final View.OnClickListener i;
    public TextView j;
    private bEH k;
    private boolean l;
    private boolean m;
    private DownloadButton n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13268o;
    @Inject
    public InterfaceC7303ctf offlineApi;
    private Integer p;
    private final int q;
    private ProgressBar r;
    private int t;

    private int g() {
        return 8;
    }

    @Override // o.bFJ
    public boolean b() {
        return this.f13268o;
    }

    @Override // o.bFJ
    public boolean c() {
        return false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.e;
    }

    public EpisodeView(Context context, int i, int i2, bEH beh) {
        this(context, i, beh);
        this.p = Integer.valueOf(i2);
    }

    public EpisodeView(Context context, int i, bEH beh) {
        super(context);
        this.p = null;
        this.i = new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.details.EpisodeView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC5227bul interfaceC5227bul = EpisodeView.this.b;
                if (interfaceC5227bul == null || !interfaceC5227bul.isAvailableToPlay()) {
                    return;
                }
                EpisodeView episodeView = EpisodeView.this;
                episodeView.a(episodeView.b);
            }
        };
        this.q = i;
        this.k = beh;
        i();
    }

    private void i() {
        this.f13268o = true;
        View.inflate(getContext(), this.q, this);
        d();
    }

    public void d() {
        this.h = (TextView) findViewById(R.g.bz);
        this.j = (TextView) findViewById(R.g.bF);
        this.g = (TextView) findViewById(R.g.bG);
        this.a = (ImageView) findViewById(R.g.bC);
        this.n = (DownloadButton) findViewById(R.g.bA);
        this.r = (ProgressBar) findViewById(R.g.bB);
        this.d = (TextView) findViewById(R.g.bJ);
    }

    protected void a(InterfaceC5227bul interfaceC5227bul) {
        bEH beh = this.k;
        if (beh != null) {
            beh.b(interfaceC5227bul);
            return;
        }
        bFE bfe = (bFE) C8141del.d(getContext(), bFE.class);
        if (bfe != null) {
            InterfaceC3655bFx episodeRowListener = bfe.getEpisodeRowListener();
            if (episodeRowListener != null) {
                episodeRowListener.a(interfaceC5227bul);
            } else {
                C1044Mm.d("EpisodeRowView", "No EpisodeRowListener provided: " + getContext());
            }
        } else {
            C1044Mm.j("EpisodeRowView", "Context is not an EpisodeRowListenerProvider, context: " + getContext());
        }
        e(interfaceC5227bul);
    }

    private void e(InterfaceC5227bul interfaceC5227bul) {
        Integer num = this.p;
        if (num != null) {
            CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
            cLv2Utils.e(new Focus(AppView.playButton, cLv2Utils.d(num, interfaceC5227bul.getId(), Integer.valueOf(interfaceC5227bul.x()), Integer.valueOf(interfaceC5227bul.aw_()))), new PlayCommand(null));
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.e);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.e = z;
        boolean z2 = z && this.f13268o;
        TextView textView = this.g;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 8);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 8);
        }
        e();
    }

    public void e() {
        if (this.t <= 0) {
            this.r.setVisibility(8);
            return;
        }
        this.r.setVisibility(0);
        if (this.l) {
            this.r.setProgress(this.t);
            this.r.setSecondaryProgress(0);
            return;
        }
        this.r.setProgress(0);
        this.r.setSecondaryProgress(this.t);
    }

    protected CharSequence d(InterfaceC5227bul interfaceC5227bul) {
        return c(interfaceC5227bul, getContext());
    }

    private static String a(InterfaceC5227bul interfaceC5227bul, Context context) {
        return C8178dfV.d(interfaceC5227bul.aE_().g(), context);
    }

    public static String c(InterfaceC5227bul interfaceC5227bul, Context context) {
        int i = 2 % 2;
        if (interfaceC5227bul.isAvailableToPlay() || interfaceC5227bul.aU_()) {
            return interfaceC5227bul.getTitle();
        }
        if (!C8168dfL.g(interfaceC5227bul.bY_())) {
            return interfaceC5227bul.bY_();
        }
        int i2 = y + 69;
        s = i2 % 128;
        int i3 = i2 % 2;
        String string = context.getString(R.o.eF);
        if (string.startsWith("'!#+")) {
            int i4 = y + 65;
            s = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            u(string.substring(4), objArr);
            String intern = ((String) objArr[0]).intern();
            int i6 = y + 15;
            s = i6 % 128;
            int i7 = i6 % 2;
            return intern;
        }
        return string;
    }

    private void c(InterfaceC5227bul interfaceC5227bul) {
        this.f13268o = interfaceC5227bul.isAvailableToPlay() && C8168dfL.h(interfaceC5227bul.e(ContextualText.TextContext.d).text());
    }

    public void d(InterfaceC5227bul interfaceC5227bul, int i) {
        if (i >= 0) {
            this.t = i;
            return;
        }
        this.t = C8004dcG.e.a(interfaceC5227bul, C8126deW.b((NetflixActivity) C8141del.d(getContext(), NetflixActivity.class)));
    }

    private void g(InterfaceC5227bul interfaceC5227bul) {
        if (this.g == null) {
            return;
        }
        ContextualText e = interfaceC5227bul.e(ContextualText.TextContext.d);
        this.g.setText((interfaceC5227bul.isAvailableToPlay() && C8168dfL.h(e.text())) ? e.text() : "");
        this.g.setVisibility(g());
    }

    private void b(InterfaceC5227bul interfaceC5227bul) {
        ImageView imageView = this.a;
        if (imageView == null) {
            return;
        }
        this.b = interfaceC5227bul;
        imageView.setVisibility(interfaceC5227bul.isAvailableToPlay() ? 0 : 4);
        if (this.c != null && interfaceC5227bul.isAvailableToPlay()) {
            if (this.f == null) {
                this.f = this.i;
            }
            this.c.setOnClickListener(this.f);
            ViewUtils.b(this.c);
            return;
        }
        ViewUtils.b(this.a);
        this.a.setOnClickListener(this.i);
    }

    protected void c(InterfaceC5176btn interfaceC5176btn) {
        if (this.n == null) {
            return;
        }
        NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class);
        if (netflixActivity != null && this.offlineApi.c((Activity) netflixActivity)) {
            this.n.setStateFromPlayable(interfaceC5176btn, netflixActivity);
            if (this.offlineApi.e(this.offlineApi.a().c(interfaceC5176btn.aH_()))) {
                ViewUtils.d((View) this.a, false);
                return;
            }
            return;
        }
        ViewUtils.d((View) this.n, false);
    }

    @Override // o.bFJ
    /* renamed from: d */
    public void c(InterfaceC5227bul interfaceC5227bul, InterfaceC5194buE interfaceC5194buE, int i) {
        boolean z = true;
        boolean z2 = interfaceC5194buE != null && C8168dfL.d(interfaceC5227bul.getId(), interfaceC5194buE.bU_());
        if (!interfaceC5227bul.aU_() && interfaceC5227bul.isAvailableToPlay()) {
            z = false;
        }
        this.m = z;
        this.l = z2;
        setContentDescription(String.format(getResources().getString(R.o.h), Integer.valueOf(interfaceC5227bul.aw_()), interfaceC5227bul.getTitle(), interfaceC5227bul.e(ContextualText.TextContext.d), Integer.valueOf(C8175dfS.c(interfaceC5227bul.aE_().g()))));
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(c(interfaceC5227bul, getContext()));
            this.j.setClickable(false);
        }
        if (this.h != null) {
            LoMoUtils.d(interfaceC5227bul.ce_(), this.h);
        }
        if (this.d != null) {
            String a = interfaceC5227bul.aE_().g() > 0 ? a(interfaceC5227bul, getContext()) : "";
            String bY_ = interfaceC5227bul.bY_();
            if (!C8168dfL.g(bY_)) {
                if (!C8168dfL.g(a)) {
                    this.d.setText(String.format("%s %10s", bY_, a));
                } else {
                    this.d.setText(bY_);
                }
                this.d.setVisibility(0);
            } else if (interfaceC5227bul.isAvailableToPlay()) {
                this.d.setText(a);
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
        }
        g(interfaceC5227bul);
        d(interfaceC5227bul, i);
        b(interfaceC5227bul);
        c(interfaceC5227bul.aE_());
        setChecked(false);
        c(interfaceC5227bul);
    }

    private static void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2421);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
