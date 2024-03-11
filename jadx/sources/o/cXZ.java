package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetworkErrorStatus;
import com.netflix.mediaclient.android.app.Status;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3983bRx;
import o.C8096ddt;
import o.C8237dgb;
import o.C8632dsu;
import o.cQQ;
import o.dpR;

/* loaded from: classes5.dex */
public abstract class cXZ extends AbstractC3336ax<b> {
    private final cQQ d = new cQQ();

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.aV;
    }

    /* loaded from: classes5.dex */
    public static final class a extends ClickableSpan {
        final /* synthetic */ b e;

        a(b bVar) {
            this.e = bVar;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            C8632dsu.c((Object) view, "");
            cXZ cxz = cXZ.this;
            Context context = this.e.e().getContext();
            C8632dsu.a(context, "");
            cxz.c(context);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            C8632dsu.c((Object) textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.e.e().getCurrentTextColor());
        }
    }

    @Override // o.AbstractC3336ax
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        SpannableStringBuilder append = new SpannableStringBuilder().append(bVar.r().getContext().getText(com.netflix.mediaclient.ui.R.o.jF)).append((CharSequence) " ").append(bVar.r().getContext().getText(com.netflix.mediaclient.ui.R.o.jA), new a(bVar), 33);
        bVar.e().setMovementMethod(LinkMovementMethod.getInstance());
        bVar.e().setText(append);
    }

    /* loaded from: classes5.dex */
    public static final class b extends bIG {
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.ev, false, 2, null);
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(b.class, "footerView", "getFooterView()Landroid/widget/TextView;", 0))};
        public static final int b = 8;

        public final TextView e() {
            return (TextView) this.e.getValue(this, d[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void c(final Context context) {
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context, NetflixActivity.class);
        if (C8126deW.c(netflixActivity) == null) {
            return;
        }
        C6220cYh.c.e();
        final C3983bRx c3983bRx = new C3983bRx(netflixActivity);
        Observable<cQQ.d> timeout = this.d.c(3600000L).takeUntil(netflixActivity.getActivityDestroy()).timeout(10000L, TimeUnit.MILLISECONDS);
        C8632dsu.a(timeout, "");
        SubscribersKt.subscribeBy$default(timeout, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.FooterTextModel$openAccountSettings$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                C8632dsu.c((Object) th, "");
                if (th instanceof TimeoutException) {
                    C3983bRx.b(C3983bRx.this, null, new NetworkErrorStatus(C8237dgb.c), null, null, false, 24, null);
                }
            }
        }, (drO) null, new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.FooterTextModel$openAccountSettings$2
            private static int a = 1;
            private static int b = 0;
            private static byte e$ss2$43 = 24;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cQQ.d dVar) {
                a(dVar);
                return dpR.c;
            }

            public final void a(cQQ.d dVar) {
                int i = 2 % 2;
                C3983bRx c3983bRx2 = C3983bRx.this;
                String b2 = dVar.b();
                Status e = dVar.e();
                String string = context.getString(C8096ddt.e.b);
                if (string.startsWith("'!#+")) {
                    int i2 = b + 21;
                    a = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr = new Object[1];
                    d(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                C3983bRx.b(c3983bRx2, b2, e, string, null, false, 24, null);
                int i4 = a + 35;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private void d(String str, Object[] objArr) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bArr = new byte[decode.length];
                for (int i = 0; i < decode.length; i++) {
                    bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$43);
                }
                objArr[0] = new String(bArr, StandardCharsets.UTF_8);
            }
        }, 2, (Object) null);
    }
}
