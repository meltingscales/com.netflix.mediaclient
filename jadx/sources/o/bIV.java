package o;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.util.ViewUtils;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C9834xU;
import o.InterfaceC7303ctf;
import o.bIV;

/* loaded from: classes4.dex */
public abstract class bIV extends AbstractC3336ax<a> {
    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.bN;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(final a aVar) {
        C8632dsu.c((Object) aVar, "");
        InterfaceC7303ctf.a aVar2 = InterfaceC7303ctf.c;
        Context context = aVar.r().getContext();
        C8632dsu.a(context, "");
        aVar.r().setVisibility(aVar2.a(context).a().f() > 0 ? 0 : 8);
        aVar.d().setOnClickListener(new View.OnClickListener() { // from class: o.bIW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bIV.b(bIV.a.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        C8632dsu.c((Object) aVar, "");
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(aVar.d().getContext(), NetflixActivity.class);
        if (netflixActivity == null || C8054ddD.l(netflixActivity)) {
            return;
        }
        netflixActivity.startActivity(InterfaceC7306cti.c.e(netflixActivity).d((Activity) netflixActivity));
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        public static final int b;
        static final /* synthetic */ dtC<Object>[] c;
        private static int d = 1;
        private static int e;
        private static byte e$ss2$64;
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.gW, false, 2, null);

        static void c() {
            e$ss2$64 = (byte) 24;
        }

        static {
            c();
            c = new dtC[]{dsA.c(new PropertyReference1Impl(a.class, "button", "getButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
            b = 8;
        }

        public final C1203Sq d() {
            return (C1203Sq) this.a.getValue(this, c[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            if (BrowseExperience.a()) {
                b(d());
            }
        }

        private final void b(C1203Sq c1203Sq) {
            int i = 2 % 2;
            int i2 = e + 69;
            d = i2 % 128;
            int i3 = i2 % 2;
            c1203Sq.e(C9834xU.o.e);
            ViewGroup.LayoutParams layoutParams = c1203Sq.getLayoutParams();
            layoutParams.height = c1203Sq.getResources().getDimensionPixelOffset(C9834xU.a.p);
            c1203Sq.setLayoutParams(layoutParams);
            int i4 = C9834xU.h.g;
            Context context = c1203Sq.getContext();
            String string = context.getString(i4);
            if (string.startsWith("'!#+")) {
                int i5 = e + 41;
                d = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i4);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    int i7 = e + 3;
                    d = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 5 / 2;
                    }
                    string = spannableString;
                }
            }
            c1203Sq.setText(string);
            ViewUtils.b(c1203Sq, C9834xU.a.ab);
        }

        private void f(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$64);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }
}
