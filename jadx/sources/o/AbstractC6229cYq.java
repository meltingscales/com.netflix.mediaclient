package o;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import com.netflix.mediaclient.util.l10n.BidiMarker;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.BehaviorSubject;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6229cYq;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cYq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6229cYq extends AbstractC3336ax<e> {
    private static byte e$ss2$145 = 24;
    private static int h = 0;
    private static int j = 1;
    public BehaviorSubject<Integer> b;
    public MembershipProductChoice c;
    private Disposable d;
    private final View.OnClickListener g = new View.OnClickListener() { // from class: o.cYp
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC6229cYq.b(AbstractC6229cYq.this, view);
        }
    };

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.aX;
    }

    public final MembershipProductChoice n() {
        MembershipProductChoice membershipProductChoice = this.c;
        if (membershipProductChoice != null) {
            return membershipProductChoice;
        }
        C8632dsu.d("");
        return null;
    }

    public final BehaviorSubject<Integer> i() {
        BehaviorSubject<Integer> behaviorSubject = this.b;
        if (behaviorSubject != null) {
            return behaviorSubject;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC6229cYq abstractC6229cYq, View view) {
        C8632dsu.c((Object) abstractC6229cYq, "");
        abstractC6229cYq.i().onNext(Integer.valueOf(abstractC6229cYq.n().getLatestPlanId()));
        C6220cYh.c.d(abstractC6229cYq.n().getLatestPlanId());
    }

    @Override // o.AbstractC3336ax
    public void e(final e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.d().setText(n().getPlanName());
        TextView c = eVar.c();
        Context context = eVar.r().getContext();
        C8632dsu.a(context, "");
        c.setText(d(context));
        eVar.r().setOnClickListener(this.g);
        this.d = SubscribersKt.subscribeBy$default(i(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.ProductChoiceModel$bind$1
            public final void d(Throwable th) {
                C8632dsu.c((Object) th, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }
        }, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.ProductChoiceModel$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                d(num);
                return dpR.c;
            }

            public final void d(Integer num) {
                boolean z = true;
                AbstractC6229cYq.e.this.r().setSelected(num != null && num.intValue() == this.n().getLatestPlanId());
                RadioButton a = AbstractC6229cYq.e.this.a();
                int latestPlanId = this.n().getLatestPlanId();
                if (num == null || num.intValue() != latestPlanId) {
                    z = false;
                }
                a.setChecked(z);
            }
        }, 2, (Object) null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
        super.b((AbstractC6229cYq) eVar);
    }

    /* renamed from: o.cYq$e */
    /* loaded from: classes5.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "radioButton", "getRadioButton()Landroid/widget/RadioButton;", 0)), dsA.c(new PropertyReference1Impl(e.class, "header", "getHeader()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "description", "getDescription()Landroid/widget/TextView;", 0))};
        public static final int d = 8;
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.ew, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.ep, false, 2, null);
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.er, false, 2, null);

        public final RadioButton a() {
            return (RadioButton) this.e.getValue(this, c[0]);
        }

        public final TextView d() {
            return (TextView) this.b.getValue(this, c[1]);
        }

        public final TextView c() {
            return (TextView) this.a.getValue(this, c[2]);
        }
    }

    private final CharSequence d(Context context) {
        int i = 2 % 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String c = C1333Xq.d(n().getPriceDuration() == MembershipProductChoice.MembershipDuration.WEEK ? com.netflix.mediaclient.ui.R.o.jM : com.netflix.mediaclient.ui.R.o.jL).d("formatted_localized_price", n().getLatestPriceFormatted()).c();
        if (C8632dsu.c(n().getShouldShowPreTaxInPrice(), Boolean.TRUE)) {
            int i2 = com.netflix.mediaclient.ui.R.o.jN;
            String string = context.getString(i2);
            if (string.startsWith("'!#+")) {
                int i3 = h + 107;
                j = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                k(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i2);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            c = ((Object) c) + " " + ((Object) string);
        }
        spannableStringBuilder.append((CharSequence) n().getPlanDescShort());
        spannableStringBuilder.append((CharSequence) "\n");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C8310dhv.b(c, BidiMarker.FORCED_RTL));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        int i5 = j + 89;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return spannableStringBuilder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$145);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
