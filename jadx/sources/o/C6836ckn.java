package o;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.ckn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6836ckn {
    private final CharSequence a;
    private final String b;
    private final C6831cki c;
    private final String d;
    private final String e;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final CharSequence c() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    @Inject
    public C6836ckn(StringProvider stringProvider, Activity activity, C6834ckl c6834ckl) {
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) c6834ckl, "");
        C6831cki b = c6834ckl.b();
        this.c = b;
        this.d = b.e();
        this.e = stringProvider.getString(C6832ckj.a.m);
        this.b = b.b();
        final String string = stringProvider.getString(C6832ckj.a.h);
        final String c = stringProvider.getFormatter(C6832ckj.a.n).d("location", b.c()).c();
        SpannableStringBuilder append = C6840ckr.a(C6840ckr.d(C6840ckr.a(C6840ckr.d(new SpannableStringBuilder(), activity, new drM<SpannableStringBuilder, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.components.household.HouseholdViewModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(SpannableStringBuilder spannableStringBuilder) {
                C8632dsu.c((Object) spannableStringBuilder, "");
                spannableStringBuilder.append((CharSequence) string);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(SpannableStringBuilder spannableStringBuilder) {
                a(spannableStringBuilder);
                return dpR.c;
            }
        })), activity, new drM<SpannableStringBuilder, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.components.household.HouseholdViewModel$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(SpannableStringBuilder spannableStringBuilder) {
                C8632dsu.c((Object) spannableStringBuilder, "");
                spannableStringBuilder.append((CharSequence) c);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(SpannableStringBuilder spannableStringBuilder) {
                a(spannableStringBuilder);
                return dpR.c;
            }
        })).append((CharSequence) stringProvider.getFormatter(C6832ckj.a.g).d("device", b.a()).c());
        C8632dsu.a(append, "");
        this.a = SpannedString.valueOf(append);
    }
}
