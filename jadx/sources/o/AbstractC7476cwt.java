package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.nio.charset.StandardCharsets;
import o.AbstractC7431cwA;
import o.AbstractC7475cws;

/* renamed from: o.cwt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7476cwt extends C8019dcV {
    private static byte e$ss2$146 = 24;
    private static int l = 1;

    /* renamed from: o  reason: collision with root package name */
    private static int f13783o;
    private PublishSubject<AbstractC7431cwA> a;
    private PublishSubject<AbstractC7475cws> c;
    private Observable<AbstractC7475cws> d;
    private Observable<AbstractC7431cwA> e;
    private final String k;

    public AbstractC7476cwt(String str) {
        C8632dsu.c((Object) str, "");
        this.k = str;
        l();
        setStyle(1, com.netflix.mediaclient.ui.R.l.g);
    }

    public final Observable<AbstractC7475cws> a() {
        Observable<AbstractC7475cws> observable = this.d;
        if (observable != null) {
            return observable;
        }
        C8632dsu.d("");
        return null;
    }

    public final Observable<AbstractC7431cwA> e() {
        Observable<AbstractC7431cwA> observable = this.e;
        if (observable != null) {
            return observable;
        }
        C8632dsu.d("");
        return null;
    }

    private final void l() {
        PublishSubject<AbstractC7475cws> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.c = create;
        PublishSubject<AbstractC7431cwA> publishSubject = null;
        if (create == null) {
            C8632dsu.d("");
            create = null;
        }
        this.d = create;
        PublishSubject<AbstractC7431cwA> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        this.a = create2;
        if (create2 == null) {
            C8632dsu.d("");
        } else {
            publishSubject = create2;
        }
        this.e = publishSubject;
    }

    public final void e(AbstractC7431cwA abstractC7431cwA) {
        C8632dsu.c((Object) abstractC7431cwA, "");
        PublishSubject<AbstractC7431cwA> publishSubject = this.a;
        PublishSubject<AbstractC7431cwA> publishSubject2 = null;
        if (publishSubject == null) {
            C8632dsu.d("");
            publishSubject = null;
        }
        if (!publishSubject.hasComplete()) {
            PublishSubject<AbstractC7431cwA> publishSubject3 = this.a;
            if (publishSubject3 == null) {
                C8632dsu.d("");
            } else {
                publishSubject2 = publishSubject3;
            }
            publishSubject2.onNext(abstractC7431cwA);
        }
        if (abstractC7431cwA instanceof AbstractC7431cwA.c) {
            dismiss();
            b();
        } else if (abstractC7431cwA instanceof AbstractC7431cwA.a) {
            AbstractC7431cwA.a aVar = (AbstractC7431cwA.a) abstractC7431cwA;
            if (aVar.b()) {
                c(aVar.d());
                return;
            }
            dismiss();
            b();
        }
    }

    @Override // o.C8019dcV
    public void b(Dialog dialog) {
        C8632dsu.c((Object) dialog, "");
        super.b(dialog);
        this.j.setText(this.k);
    }

    @Override // o.C8019dcV
    public void c(InterfaceC8018dcU interfaceC8018dcU) {
        C8632dsu.c((Object) interfaceC8018dcU, "");
        throw new IllegalStateException("setPinVerifierCallback not supported, use observables");
    }

    @Override // o.C8019dcV
    public void a(NetflixActivity netflixActivity, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) str, "");
        a(true);
        b(false);
        C8150deu.e(c(netflixActivity), this.g);
        PublishSubject<AbstractC7475cws> publishSubject = this.c;
        if (publishSubject == null) {
            C8632dsu.d("");
            publishSubject = null;
        }
        publishSubject.onNext(new AbstractC7475cws.e(str));
    }

    private final void c(String str) {
        int i = 2 % 2;
        a(false);
        if (str != null) {
            this.j.setText(str);
        } else {
            TextView textView = this.j;
            int i2 = com.netflix.mediaclient.ui.R.o.fF;
            Context context = textView.getContext();
            String string = context.getString(i2);
            if (string.startsWith("'!#+")) {
                int i3 = l + 85;
                f13783o = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                p(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i2);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            textView.setText(string);
            int i5 = f13783o + 37;
            l = i5 % 128;
            int i6 = i5 % 2;
        }
        this.g.getText().clear();
        b(true);
        m();
    }

    @Override // o.C8019dcV, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        super.onCancel(dialogInterface);
        d();
    }

    @Override // o.C8019dcV, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        b();
    }

    @Override // o.C8019dcV
    public void d() {
        PublishSubject<AbstractC7431cwA> publishSubject = this.a;
        if (publishSubject == null) {
            C8632dsu.d("");
            publishSubject = null;
        }
        publishSubject.onNext(AbstractC7431cwA.b.c);
        dismiss();
    }

    private final void b() {
        PublishSubject<AbstractC7475cws> publishSubject = this.c;
        PublishSubject<AbstractC7431cwA> publishSubject2 = null;
        if (publishSubject == null) {
            C8632dsu.d("");
            publishSubject = null;
        }
        if (!publishSubject.hasComplete()) {
            PublishSubject<AbstractC7475cws> publishSubject3 = this.c;
            if (publishSubject3 == null) {
                C8632dsu.d("");
                publishSubject3 = null;
            }
            publishSubject3.onComplete();
        }
        PublishSubject<AbstractC7431cwA> publishSubject4 = this.a;
        if (publishSubject4 == null) {
            C8632dsu.d("");
            publishSubject4 = null;
        }
        if (!publishSubject4.hasComplete()) {
            PublishSubject<AbstractC7431cwA> publishSubject5 = this.a;
            if (publishSubject5 == null) {
                C8632dsu.d("");
            } else {
                publishSubject2 = publishSubject5;
            }
            publishSubject2.onComplete();
        }
        l();
    }

    private void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$146);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
