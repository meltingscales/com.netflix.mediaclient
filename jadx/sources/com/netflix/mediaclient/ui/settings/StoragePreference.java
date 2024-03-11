package com.netflix.mediaclient.ui.settings;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.settings.StoragePreference;
import com.netflix.mediaclient.util.ViewUtils;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import o.C1044Mm;
import o.C1596aHd;
import o.C8054ddD;
import o.C8176dfT;
import o.C8627dsp;
import o.C8632dsu;
import o.C9737vz;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4208baF;
import o.InterfaceC5203buN;
import o.InterfaceC5204buO;
import o.InterfaceC7306cti;
import o.dqE;

/* loaded from: classes6.dex */
public final class StoragePreference extends Preference {
    private static byte e$ss2$1512 = 24;
    private static int k = 1;
    private static int n;
    private TextView a;
    private TextView b;
    private TextView c;
    private View d;
    private final String e;
    private TextView f;
    private View g;
    private View h;
    private TextView i;
    private View j;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC5203buN f13324o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoragePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoragePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoragePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        this.e = "StoragePreference";
    }

    public /* synthetic */ StoragePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        C8632dsu.c((Object) preferenceViewHolder, "");
        super.onBindViewHolder(preferenceViewHolder);
        d(preferenceViewHolder);
        b();
        a(preferenceViewHolder);
        a();
        d();
        e(preferenceViewHolder);
    }

    private final void b() {
        ServiceManager c = ServiceManager.c((Activity) C9737vz.b(getContext(), NetflixActivity.class));
        InterfaceC4208baF t = c != null ? c.t() : null;
        if (t != null) {
            InterfaceC5204buO l = t.l();
            C8632dsu.a(l, "");
            this.f13324o = l.c(l.b());
        }
    }

    private final void a() {
        int i;
        int i2 = 2 % 2;
        Context context = getContext();
        InterfaceC5203buN interfaceC5203buN = this.f13324o;
        if (interfaceC5203buN == null || !interfaceC5203buN.n()) {
            i = R.o.ip;
        } else {
            i = R.o.iF;
            int i3 = n + 101;
            k = i3 % 128;
            int i4 = i3 % 2;
        }
        String string = context.getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            m(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        C8632dsu.a(string, "");
        TextView textView = this.a;
        if (textView == null) {
            int i5 = k + 17;
            n = i5 % 128;
            if (i5 % 2 != 0) {
                C8632dsu.d("");
                throw null;
            } else {
                C8632dsu.d("");
                textView = null;
            }
        }
        textView.setText(string);
    }

    private final void d() {
        InterfaceC5203buN interfaceC5203buN = this.f13324o;
        if (interfaceC5203buN != null) {
            TextView textView = this.c;
            if (textView == null) {
                C8632dsu.d("");
                textView = null;
            }
            ViewUtils.d(textView, interfaceC5203buN.f());
        }
    }

    private final void e(PreferenceViewHolder preferenceViewHolder) {
        preferenceViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.cVw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoragePreference.c(StoragePreference.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(StoragePreference storagePreference, View view) {
        NetflixActivity netflixActivity;
        ServiceManager c;
        C8632dsu.c((Object) storagePreference, "");
        if (C8054ddD.l(storagePreference.getContext()) || (netflixActivity = (NetflixActivity) C9737vz.b(storagePreference.getContext(), NetflixActivity.class)) == null || (c = ServiceManager.c(netflixActivity)) == null || !c.H()) {
            return;
        }
        storagePreference.getContext().startActivity(InterfaceC7306cti.c.e(netflixActivity).d((Activity) netflixActivity));
    }

    private final void d(PreferenceViewHolder preferenceViewHolder) {
        View findViewById = preferenceViewHolder.findViewById(R.g.ge);
        C8632dsu.d(findViewById);
        this.f = (TextView) findViewById;
        View findViewById2 = preferenceViewHolder.findViewById(R.g.gg);
        C8632dsu.d(findViewById2);
        this.i = (TextView) findViewById2;
        View findViewById3 = preferenceViewHolder.findViewById(R.g.gf);
        C8632dsu.d(findViewById3);
        this.b = (TextView) findViewById3;
        View findViewById4 = preferenceViewHolder.findViewById(R.g.fW);
        C8632dsu.d(findViewById4);
        this.a = (TextView) findViewById4;
        View findViewById5 = preferenceViewHolder.findViewById(R.g.gd);
        C8632dsu.d(findViewById5);
        this.c = (TextView) findViewById5;
        View findViewById6 = preferenceViewHolder.findViewById(R.g.gb);
        C8632dsu.a(findViewById6, "");
        this.g = findViewById6;
        View findViewById7 = preferenceViewHolder.findViewById(R.g.gi);
        C8632dsu.a(findViewById7, "");
        this.j = findViewById7;
        View findViewById8 = preferenceViewHolder.findViewById(R.g.fY);
        C8632dsu.a(findViewById8, "");
        this.d = findViewById8;
        View findViewById9 = preferenceViewHolder.findViewById(R.g.gc);
        C8632dsu.a(findViewById9, "");
        this.h = findViewById9;
    }

    public final void a(PreferenceViewHolder preferenceViewHolder) {
        Map d;
        Map k2;
        Throwable th;
        C8632dsu.c((Object) preferenceViewHolder, "");
        try {
            if (C8054ddD.a(getContext()) == null) {
                C1044Mm.d(this.e, "SettingsActivity:update fileDir is null");
                return;
            }
            InterfaceC5203buN interfaceC5203buN = this.f13324o;
            if (interfaceC5203buN == null) {
                C1044Mm.d(this.e, "SettingsActivity:update volume is null");
            } else if (interfaceC5203buN != null) {
                long j = interfaceC5203buN.j();
                long c = interfaceC5203buN.c();
                long a = interfaceC5203buN.a();
                long j2 = (j - c) - a;
                View view = this.g;
                TextView textView = null;
                if (view == null) {
                    C8632dsu.d("");
                    view = null;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C8632dsu.d(layoutParams);
                ((LinearLayout.LayoutParams) layoutParams).weight = (float) a;
                View view2 = this.j;
                if (view2 == null) {
                    C8632dsu.d("");
                    view2 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                C8632dsu.d(layoutParams2);
                ((LinearLayout.LayoutParams) layoutParams2).weight = (float) j2;
                View view3 = this.d;
                if (view3 == null) {
                    C8632dsu.d("");
                    view3 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                C8632dsu.d(layoutParams3);
                ((LinearLayout.LayoutParams) layoutParams3).weight = (float) c;
                View view4 = this.h;
                if (view4 == null) {
                    C8632dsu.d("");
                    view4 = null;
                }
                view4.requestLayout();
                String a2 = a(a);
                String a3 = a(j2);
                String a4 = a(c);
                TextView textView2 = this.f;
                if (textView2 == null) {
                    C8632dsu.d("");
                    textView2 = null;
                }
                textView2.setText(getContext().getString(R.o.bh, a2));
                TextView textView3 = this.i;
                if (textView3 == null) {
                    C8632dsu.d("");
                    textView3 = null;
                }
                textView3.setText(getContext().getString(R.o.bk, a3));
                TextView textView4 = this.b;
                if (textView4 == null) {
                    C8632dsu.d("");
                } else {
                    textView = textView4;
                }
                textView.setText(getContext().getString(R.o.be, a4));
                preferenceViewHolder.itemView.requestLayout();
                d();
            }
        } catch (IllegalArgumentException e) {
            C1044Mm.b(this.e, e, String.valueOf(e), new Object[0]);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k2 = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(null, e, null, false, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            InterfaceC1598aHf a5 = dVar.a();
            if (a5 != null) {
                a5.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    private final String a(long j) {
        String d = C8176dfT.d(getContext(), j);
        C8632dsu.a(d, "");
        return d;
    }

    private void m(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$1512);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
