package o;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.ViewAudioSubtitlesSelectorCommand;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.selectionsdialog.LanguageSelectionEpoxyController;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.util.ViewUtils;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import java.util.Map;
import o.C1226Tn;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Tn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1226Tn extends NetflixDialogFrag {
    protected C1223Tk a;
    protected Language b;
    protected TG c;
    private final CompositeDisposable f = new CompositeDisposable();
    private bEQ g;
    private boolean h;
    private c i;
    private boolean j;
    private boolean m;
    private Long n;
    public static final b e = new b(null);
    public static final int d = 8;

    /* renamed from: o.Tn$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(Language language);

        void e();
    }

    public static final C1226Tn d(Language language, boolean z, c cVar) {
        return e.e(language, z, cVar);
    }

    protected final void c(Language language) {
        C8632dsu.c((Object) language, "");
        this.b = language;
    }

    protected final void c(C1223Tk c1223Tk) {
        C8632dsu.c((Object) c1223Tk, "");
        this.a = c1223Tk;
    }

    protected final void e(TG tg) {
        C8632dsu.c((Object) tg, "");
        this.c = tg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h() {
        return this.h;
    }

    /* renamed from: o.Tn$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("LanguageSelectionsDialog");
        }

        public final C1226Tn e(Language language, boolean z, c cVar) {
            C1226Tn c1226Tn;
            C8632dsu.c((Object) language, "");
            if (!z) {
                c1226Tn = new C1229Tq();
            } else {
                c1226Tn = new C1226Tn();
            }
            Bundle bundle = new Bundle();
            bundle.putString("CurrentLanguageExtra", language.toJsonString());
            bundle.putBoolean("isOfflineOrFromMdx", z);
            c1226Tn.setArguments(bundle);
            c1226Tn.i = cVar;
            c1226Tn.setStyle(2, com.netflix.mediaclient.ui.R.l.m);
            return c1226Tn;
        }
    }

    /* renamed from: o.Tn$a */
    /* loaded from: classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Window window;
            view.removeOnLayoutChangeListener(this);
            Dialog dialog = C1226Tn.this.getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            ViewUtils.a(window);
        }
    }

    public final Language g() {
        Language language = this.b;
        if (language != null) {
            return language;
        }
        C8632dsu.d("");
        return null;
    }

    public final C1223Tk d() {
        C1223Tk c1223Tk = this.a;
        if (c1223Tk != null) {
            return c1223Tk;
        }
        C8632dsu.d("");
        return null;
    }

    public final TG f() {
        TG tg = this.c;
        if (tg != null) {
            return tg;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j();
    }

    public final void j() {
        Map d2;
        Map k;
        Throwable th;
        dpR dpr;
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                Language restoreLanguage = Language.restoreLanguage(arguments.getString("CurrentLanguageExtra"));
                C8632dsu.a(restoreLanguage, "");
                c(restoreLanguage);
                this.h = arguments.getBoolean("isOfflineOrFromMdx");
            } catch (JSONException unused) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("LanguageSelectionsDialog: Error restoring language.", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            InterfaceC1593aHa.c.a("LanguageSelectionsDialog: No args received in setup() method");
        }
        AudioSource currentAudioSource = g().getCurrentAudioSource();
        Subtitle currentSubtitle = g().getCurrentSubtitle();
        g().setSelectedAudio(currentAudioSource);
        g().setSelectedSubtitle(currentSubtitle);
        b();
        a();
        if ((g().getSelectedAudio() == null || !g().getSelectedAudio().isAllowedSubtitle(g().getSelectedSubtitle())) && (!f().i().isEmpty())) {
            g().setSelectedSubtitle(f().i().get(0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.ao, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        if (ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                ViewUtils.a(window);
            }
        } else {
            view.addOnLayoutChangeListener(new a());
        }
        bEQ e2 = bEQ.e(view);
        this.g = e2;
        C8632dsu.a(e2, "");
        e2.d.setOnClickListener(new View.OnClickListener() { // from class: o.To
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1226Tn.e(C1226Tn.this, view2);
            }
        });
        e2.c.setOnClickListener(new View.OnClickListener() { // from class: o.Tr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1226Tn.d(C1226Tn.this, view2);
            }
        });
        if (g().getCurrentAudioSource() != null) {
            C1223Tk d2 = d();
            AudioSource currentAudioSource = g().getCurrentAudioSource();
            C8632dsu.a(currentAudioSource, "");
            d2.a(currentAudioSource);
        }
        i();
        final LanguageSelectionEpoxyController languageSelectionEpoxyController = new LanguageSelectionEpoxyController(new drO<dpR>() { // from class: com.netflix.mediaclient.android.widget.selectionsdialog.LanguageSelectionDialogBase$onViewCreated$subtitleEpoxyController$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                C1226Tn.this.m = true;
            }
        });
        languageSelectionEpoxyController.setData(f());
        C3020ar adapter = languageSelectionEpoxyController.getAdapter();
        C8632dsu.a(adapter, "");
        e2.g.setAdapter(adapter);
        b(f().j());
        LanguageSelectionEpoxyController languageSelectionEpoxyController2 = new LanguageSelectionEpoxyController(new drO<dpR>() { // from class: com.netflix.mediaclient.android.widget.selectionsdialog.LanguageSelectionDialogBase$onViewCreated$audioSelectionEpoxyController$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                C1226Tn.this.j = true;
                C1226Tn.this.m = true;
                C1226Tn.this.g().setSelectedAudio(C1226Tn.this.d().b());
                if (!C1226Tn.this.d().b().isAllowedSubtitle(C1226Tn.this.f().b())) {
                    C1226Tn.this.f().d(0);
                    C1226Tn.this.g().setSelectedSubtitle(C1226Tn.this.f().b());
                    languageSelectionEpoxyController.setData(C1226Tn.this.f());
                }
                CLv2Utils.d(new ViewAudioSubtitlesSelectorCommand());
                C1226Tn.this.k();
            }
        });
        languageSelectionEpoxyController2.setData(d());
        C3020ar adapter2 = languageSelectionEpoxyController2.getAdapter();
        C8632dsu.a(adapter2, "");
        e2.b.setAdapter(adapter2);
        a(d().j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C1226Tn c1226Tn, View view) {
        C8632dsu.c((Object) c1226Tn, "");
        c1226Tn.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1226Tn c1226Tn, View view) {
        C8632dsu.c((Object) c1226Tn, "");
        c1226Tn.o();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.g = null;
    }

    private final bEQ n() {
        bEQ beq = this.g;
        if (beq != null) {
            return beq;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public void a(int i) {
        RecyclerView.LayoutManager layoutManager = n().b.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(i);
        }
    }

    public void b(int i) {
        RecyclerView.LayoutManager layoutManager = n().g.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(i);
        }
    }

    private final void o() {
        c cVar;
        if (this.j) {
            g().setSelectedAudio(d().b());
        }
        if (this.m) {
            e();
        }
        if ((this.j || this.m) && (cVar = this.i) != null) {
            cVar.a(g());
        }
        dismiss();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public void dismiss() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.e();
        }
        this.f.clear();
        m();
        super.dismiss();
    }

    public void a() {
        List G;
        List<Subtitle> usedSubtitles = g().getUsedSubtitles();
        C8632dsu.a(usedSubtitles, "");
        G = C8576dqs.G(usedSubtitles);
        e(new TG(G));
    }

    public void b() {
        List u;
        AudioSource[] altAudios = g().getAltAudios();
        C8632dsu.a(altAudios, "");
        u = C8563dqf.u(altAudios);
        c(new C1223Tk(u));
    }

    public void i() {
        f().d(g().getCurrentSubtitle());
    }

    public void e() {
        Subtitle f = f().f();
        if (f != null) {
            g().setSelectedSubtitle(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        m();
        this.n = Logger.INSTANCE.startSession(new Presentation(AppView.audioSubtitlesSelector, l()));
    }

    private final void m() {
        Long l = this.n;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.n = null;
        }
    }

    private final TrackingInfo l() {
        JSONObject jSONObject = new JSONObject();
        d().c(jSONObject);
        f().c(jSONObject);
        return C1281Vq.d(jSONObject);
    }
}
