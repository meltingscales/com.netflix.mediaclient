package o;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.context.VoiceInput;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.action.ThrottleSearch;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C6035cRo;
import o.C9834xU;

/* renamed from: o.cUw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6127cUw extends NetflixActionBar {
    private static final Interpolator f = PathInterpolatorCompat.create(0.23f, 1.0f, 0.32f, 1.0f);
    protected ProgressBar c;
    public SearchView d;
    protected View e;
    private EditText g;
    private Activity h;
    private Long i;
    private Long j;
    private ImageView k;
    private boolean l;
    private final AtomicBoolean m;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13702o;

    protected int B() {
        return C6035cRo.e.a;
    }

    public final SearchView w() {
        return this.d;
    }

    public View y() {
        return this.e;
    }

    public C6127cUw(NetflixActivity netflixActivity, SQ sq, boolean z) {
        super(netflixActivity, sq, z, null);
        this.m = new AtomicBoolean(false);
        this.f13702o = false;
        this.i = null;
        this.j = null;
        this.l = InterfaceC6068cSu.c(netflixActivity).a();
        K();
        L();
        C9697vL.a(this.d, netflixActivity);
        E();
        C9697vL.d(this.d, A());
        C9697vL.b(this.d, D());
        M();
        a(new View.OnFocusChangeListener() { // from class: o.cUw.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z2) {
                C6127cUw.this.d(z2);
            }
        });
        this.h = netflixActivity;
    }

    public void d(boolean z) {
        boolean z2 = this.f13702o;
        if (z2 != z) {
            C1044Mm.d("SearchActionBar", "setSearchViewFocused: %b->%b", Boolean.valueOf(z2), Boolean.valueOf(z));
            this.f13702o = z;
            if (z) {
                G();
                Long l = this.i;
                if (l != null) {
                    Logger.INSTANCE.endSession(l);
                }
                this.i = Logger.INSTANCE.startSession(new Focus(AppView.searchBox, null));
                return;
            }
            Long l2 = this.i;
            if (l2 != null) {
                Logger.INSTANCE.endSession(l2);
                this.i = null;
                u();
            }
        }
    }

    public void e(Intent intent, Activity activity) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("query");
            boolean booleanExtra = intent.getBooleanExtra("submit", false);
            this.m.set(d(intent));
            if (this.m.get()) {
                C8150deu.e(activity);
                float[] floatArrayExtra = intent.getFloatArrayExtra("android.speech.extra.CONFIDENCE_SCORES");
                Logger.INSTANCE.addContext(new VoiceInput(stringExtra, Double.valueOf(floatArrayExtra == null ? 1.0d : floatArrayExtra[0])));
            }
            a(stringExtra, booleanExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C9665ug c9665ug) {
        String charSequence = c9665ug.e().toString();
        C1044Mm.d("SearchActionBar", "queryTextChanges: doOnNext '%s'", charSequence);
        if (this.j == null && c(c9665ug)) {
            this.j = Logger.INSTANCE.startSession(new ThrottleSearch(null, null, null, null));
        }
        if (c9665ug.c()) {
            return;
        }
        InterfaceC6068cSu.c(this.h).a(charSequence, false);
    }

    public Observable<C9665ug> v() {
        return C9630tY.e(w()).doOnNext(new Consumer() { // from class: o.cUF
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6127cUw.this.a((C9665ug) obj);
            }
        }).debounce(new Function() { // from class: o.cUD
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable e;
                e = C6127cUw.this.e((C9665ug) obj);
                return e;
            }
        }).doAfterNext(new Consumer() { // from class: o.cUE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6127cUw.this.b((C9665ug) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable e(C9665ug c9665ug) {
        if (c(c9665ug)) {
            C1044Mm.d("SearchActionBar", "queryTextChanges: debounce delay %d", 700);
            return Observable.empty().delay(700L, TimeUnit.MILLISECONDS);
        }
        C1044Mm.b("SearchActionBar", "queryTextChanges: debounce NOW");
        this.m.set(false);
        return Observable.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(C9665ug c9665ug) {
        Long l = this.j;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.j = null;
        }
    }

    private boolean c(C9665ug c9665ug) {
        return (c9665ug.c() || TextUtils.isEmpty(c9665ug.e()) || this.m.get()) ? false : true;
    }

    private boolean d(Intent intent) {
        if (intent.getExtras() == null) {
            return false;
        }
        for (String str : intent.getExtras().keySet()) {
            if (str.startsWith("android.speech.extra")) {
                C1044Mm.e("SearchActionBar", "Voice search");
                return true;
            }
        }
        C1044Mm.j("SearchActionBar", "Not voice search?");
        return false;
    }

    private void M() {
        ImageView d = C9697vL.d(this.d);
        this.k = d;
        if (d == null) {
            C1044Mm.j("SearchActionBar", "SPY-8468 - Voice search not available. SearchView doesn't have view with id search_voice_btn");
            InterfaceC1598aHf.a(new C1596aHd("SPY-8468 - Voice search not available. SearchView doesn't have view with id search_voice_btn").b(false));
        } else if (this.l) {
        } else {
            d.setEnabled(false);
            this.k.setImageDrawable(null);
        }
    }

    private void K() {
        View inflate = LayoutInflater.from(d()).inflate(B(), (ViewGroup) null);
        this.e = inflate;
        if (inflate != null) {
            this.d = (SearchView) inflate.findViewById(C6035cRo.d.c);
            this.c = (ProgressBar) this.e.findViewById(C6035cRo.d.b);
        }
    }

    protected void H() {
        this.d.setQueryHint(d().getString(com.netflix.mediaclient.ui.R.o.li));
    }

    private void L() {
        SearchView searchView = this.d;
        if (searchView == null) {
            return;
        }
        searchView.setImeOptions(33554435);
        H();
        this.d.setInputType(8192);
        this.d.setQueryRefinementEnabled(true);
        this.d.setSubmitButtonEnabled(false);
        this.d.setIconifiedByDefault(false);
        this.d.setIconified(false);
        C9697vL.c(this.d, 200);
    }

    private void E() {
        EditText editText = (EditText) this.d.findViewById(d().getResources().getIdentifier("android:id/search_src_text", null, null));
        this.g = editText;
        if (editText != null) {
            editText.setTextSize(0, editText.getContext().getResources().getDimension(C9834xU.a.d));
            this.g.setImeOptions(33554432);
            this.g.setCursorVisible(false);
            this.g.setTypeface(C1336Xt.c(d()));
        }
    }

    public void I() {
        EditText editText = this.g;
        if (editText != null) {
            editText.setCursorVisible(true);
        }
        d(true);
    }

    public void C() {
        EditText editText = this.g;
        if (editText != null) {
            editText.setCursorVisible(false);
        }
        d(false);
    }

    protected int A() {
        return C9700vO.d(this.g.getContext().getTheme(), this.g.getContext(), com.netflix.mediaclient.ui.R.a.b);
    }

    protected int D() {
        return C9700vO.d(this.g.getContext().getTheme(), this.g.getContext(), com.netflix.mediaclient.ui.R.a.g);
    }

    public boolean G() {
        try {
            SearchView searchView = this.d;
            if (searchView != null) {
                return searchView.requestFocus();
            }
            return false;
        } catch (NullPointerException e) {
            if (!C8151dev.j()) {
                InterfaceC1598aHf.a(new C1596aHd("SPY-19091: Guard against NPE. Known issue only on Samsung galaxy running Android-9").d(e).b(false));
            }
            return false;
        }
    }

    private void a(View.OnFocusChangeListener onFocusChangeListener) {
        SearchView searchView = this.d;
        if (searchView != null) {
            searchView.setOnQueryTextFocusChangeListener(onFocusChangeListener);
        }
    }

    public void a(String str, boolean z) {
        this.d.setQuery(str, z);
    }

    public String x() {
        return this.d.getQuery().toString();
    }

    public void u() {
        try {
            this.d.clearFocus();
            View findFocus = this.d.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
        } catch (NullPointerException e) {
            if (C8151dev.j()) {
                return;
            }
            InterfaceC1598aHf.a(new C1596aHd("SPY-19091: Guard against NPE. Known issue only on Samsung galaxy running Android-9").d(e).b(false));
        }
    }

    public void z() {
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public void F() {
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void c(String str) {
        SearchView searchView = this.d;
        if (searchView != null) {
            searchView.setQueryHint(str);
        }
    }
}
