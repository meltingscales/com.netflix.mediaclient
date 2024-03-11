package o;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.SearchCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.nio.charset.StandardCharsets;
import o.C8632dsu;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class SE {
    public static final c b;
    public static final int c;
    private static byte e$ss2$99 = 0;
    private static int g = 0;
    private static int i = 1;
    private ViewGroup a;
    private final Context d;
    private final Activity e;
    private final boolean f;
    private final ViewGroup h;
    private SearchView j;

    static {
        d();
        b = new c(null);
        c = 8;
    }

    static void d() {
        e$ss2$99 = (byte) 24;
    }

    public SE(ViewGroup viewGroup, boolean z) {
        C8632dsu.c((Object) viewGroup, "");
        this.h = viewGroup;
        this.f = z;
        Context context = viewGroup.getContext();
        this.d = context;
        C8632dsu.a(context, "");
        this.e = (Activity) C9737vz.e(context, Activity.class);
    }

    public /* synthetic */ SE(ViewGroup viewGroup, boolean z, int i2, C8627dsp c8627dsp) {
        this(viewGroup, (i2 & 2) != 0 ? false : z);
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SearchBoxButton");
        }

        public final ActivityOptions c(Activity activity) {
            C8632dsu.c((Object) activity, "");
            View findViewById = activity.findViewById(com.netflix.mediaclient.ui.R.g.g);
            if (findViewById != null) {
                return ActivityOptions.makeSceneTransitionAnimation(activity, findViewById, "searchBox");
            }
            return null;
        }
    }

    public final void b(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.a;
            if (viewGroup == null) {
                viewGroup = c();
            }
            viewGroup.setVisibility(0);
            return;
        }
        ViewGroup viewGroup2 = this.a;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    private final ViewGroup c() {
        View inflate = LayoutInflater.from(this.d).inflate(this.f ? com.netflix.mediaclient.ui.R.i.c : com.netflix.mediaclient.ui.R.i.g, this.h, false);
        C8632dsu.d(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate;
        ViewGroup viewGroup2 = this.h;
        viewGroup2.addView(viewGroup, -1, this.f ? viewGroup2.getContext().getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.V) : -2);
        this.a = viewGroup;
        SearchView searchView = (SearchView) viewGroup.findViewById(com.netflix.mediaclient.ui.R.g.g);
        C8632dsu.d(searchView);
        e(searchView);
        C9697vL.a(searchView, this.e);
        this.j = searchView;
        viewGroup.findViewById(com.netflix.mediaclient.ui.R.g.at).setOnClickListener(new View.OnClickListener() { // from class: o.SG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SE.e(SE.this, view);
            }
        });
        return viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SE se, View view) {
        C8632dsu.c((Object) se, "");
        CLv2Utils.INSTANCE.d(AppView.searchTab, CommandValue.SearchCommand, null, new Focus(AppView.searchBox, null), new SearchCommand(), true, null);
        InterfaceC6068cSu.e.d(se.e).c("");
        b.getLogTag();
    }

    private final void e(SearchView searchView) {
        AppCompatActivity appCompatActivity;
        Lifecycle lifecycle;
        int i2 = 2 % 2;
        int i3 = i + 49;
        g = i3 % 128;
        int i4 = i3 % 2;
        int color = ContextCompat.getColor(this.e, C9834xU.c.r);
        C9697vL.d(searchView, color);
        C9697vL.b(searchView, color);
        final EditText c2 = C9697vL.c(searchView);
        String string = this.d.getString(com.netflix.mediaclient.ui.R.o.li);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        searchView.setQueryHint(string);
        searchView.setIconifiedByDefault(false);
        searchView.setIconified(false);
        if (c2 != null) {
            c2.setTextSize(0, this.d.getResources().getDimension(C9834xU.a.d));
            c2.setImeOptions(33554432);
            c2.setCursorVisible(false);
            c2.setFocusable(false);
            c2.setTypeface(C1336Xt.c(this.e));
            Context context = this.d;
            if (context instanceof AppCompatActivity) {
                int i5 = g;
                int i6 = i5 + 45;
                i = i6 % 128;
                int i7 = i6 % 2;
                appCompatActivity = (AppCompatActivity) context;
                int i8 = i5 + 75;
                i = i8 % 128;
                int i9 = i8 % 2;
            } else {
                appCompatActivity = null;
            }
            if (appCompatActivity != null && (lifecycle = appCompatActivity.getLifecycle()) != null) {
                lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.android.widget.SearchBoxButton$configureSearchViewTextView$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onResume(LifecycleOwner lifecycleOwner) {
                        C8632dsu.c((Object) lifecycleOwner, "");
                        c2.clearFocus();
                    }
                });
                int i10 = g + 85;
                i = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        ImageView d = C9697vL.d(searchView);
        if (d != null) {
            d.setEnabled(false);
            d.setImageDrawable(null);
        }
        int i12 = i + 65;
        g = i12 % 128;
        int i13 = i12 % 2;
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$99);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
