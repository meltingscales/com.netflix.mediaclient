package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.util.ViewUtils;
import java.nio.charset.StandardCharsets;
import o.C9834xU;

/* renamed from: o.Rt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1180Rt {
    private static byte e$ss2$88 = 24;
    private static int h = 1;
    private static int j;
    private final View a;
    private final d b;
    private final C1203Sq c;
    private final TextView d;
    private final View.OnClickListener e;
    private final C1203Sq f;
    private boolean i = true;

    /* renamed from: o.Rt$d */
    /* loaded from: classes3.dex */
    public interface d {
        void e();
    }

    public View e() {
        return this.c;
    }

    public C1180Rt(View view, d dVar) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.Rt.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                C1044Mm.b("ErrorWrapper", "Retry requested");
                if (C1180Rt.this.b != null) {
                    C1180Rt.this.b.e();
                }
            }
        };
        this.e = onClickListener;
        this.b = dVar;
        View findViewById = view.findViewById(com.netflix.mediaclient.ui.R.g.bL);
        this.a = findViewById;
        findViewById.setVisibility(0);
        this.d = (TextView) view.findViewById(com.netflix.mediaclient.ui.R.g.bS);
        C1203Sq c1203Sq = (C1203Sq) findViewById.findViewById(com.netflix.mediaclient.ui.R.g.bR);
        this.c = c1203Sq;
        c1203Sq.setOnClickListener(onClickListener);
        C1203Sq c1203Sq2 = (C1203Sq) findViewById.findViewById(com.netflix.mediaclient.ui.R.g.bQ);
        this.f = c1203Sq2;
        if (c1203Sq2 != null) {
            c1203Sq2.setOnClickListener(new View.OnClickListener() { // from class: o.Rt.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(view2.getContext(), NetflixActivity.class);
                    if (C8054ddD.l(netflixActivity)) {
                        return;
                    }
                    netflixActivity.startActivity(InterfaceC7306cti.d((Context) netflixActivity).d((Activity) netflixActivity));
                }
            });
        }
        NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(view.getContext(), NetflixActivity.class);
        if (netflixActivity != null && BrowseExperience.e()) {
            a(netflixActivity);
        }
        a();
    }

    private void a(NetflixActivity netflixActivity) {
        int i = 2 % 2;
        int i2 = h + 23;
        j = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = netflixActivity.getResources();
        this.d.setTextColor(resources.getColor(com.netflix.mediaclient.ui.R.c.a));
        ViewUtils.b(this.d, C9834xU.a.V);
        ViewUtils.e(this.d);
        this.c.e(C9834xU.o.e);
        this.c.getLayoutParams().height = resources.getDimensionPixelOffset(C9834xU.a.p);
        this.c.setAllCaps(false);
        ViewUtils.b(this.c, C9834xU.a.ab);
        Drawable drawable = resources.getDrawable(com.netflix.mediaclient.ui.R.e.L);
        int b = C9870yD.b(netflixActivity, 32);
        int b2 = C9870yD.b(netflixActivity, 8);
        drawable.setBounds(b2, 0, b + b2, b);
        this.c.setCompoundDrawables(null, null, drawable, null);
        this.c.setCompoundDrawablePadding(C9870yD.b(netflixActivity, 8));
        this.f.e(C9834xU.o.e);
        this.f.getLayoutParams().height = resources.getDimensionPixelOffset(C9834xU.a.p);
        this.f.setAllCaps(false);
        C1203Sq c1203Sq = this.f;
        int i4 = C9834xU.h.g;
        Context context = c1203Sq.getContext();
        String string = context.getString(i4);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i4);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            }
        }
        c1203Sq.setText(string);
        ViewUtils.b(this.f, C9834xU.a.ab);
        this.a.setBackgroundColor(-1);
        int i5 = h + 25;
        j = i5 % 128;
        int i6 = i5 % 2;
    }

    public void b(boolean z) {
        C8254dgs.a(this.a, z);
    }

    public void c(boolean z) {
        C8254dgs.d(this.a, z);
        a();
    }

    private void a() {
        this.c.setVisibility((this.b == null || !this.i) ? 8 : 0);
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$88);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
