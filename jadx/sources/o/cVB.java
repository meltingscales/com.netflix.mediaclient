package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.cl.Logger;
import com.netflix.cl.model.ABTest;
import com.netflix.cl.model.ABTestAllocations;
import com.netflix.cl.model.context.TestAllocations;
import com.netflix.mediaclient.acquisition.api.Signup;
import com.netflix.mediaclient.acquisition.api.SignupNativeActivity;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AmazonSingup;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class cVB {
    public static final cVB c = new cVB();
    private static final String a = "SignupUtilities";

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface e {
        LoginApi Z();
    }

    private cVB() {
    }

    public static final boolean g(Context context) {
        C8632dsu.c((Object) context, "");
        SignInConfigData a2 = new C1823aPo(context).a();
        return a2 == null || a2.isAndroidNative();
    }

    public static final boolean h(Context context) {
        C8632dsu.c((Object) context, "");
        SignInConfigData a2 = new C1823aPo(context).a();
        return a2 == null || a2.useDarkHeader();
    }

    public static final Intent d(Context context) {
        C8632dsu.c((Object) context, "");
        if (e(context)) {
            return ((e) EntryPointAccessors.fromApplication(context, e.class)).Z().c(context);
        }
        if (g(context)) {
            return Signup.Companion.get(context).createNativeIntent(context);
        }
        Intent putExtra = Signup.Companion.get(context).createWebIntent(context).putExtra(SignupActivity.EXTRA_USE_DARK_BACKGROUND, true);
        C8632dsu.a(putExtra, "");
        return putExtra;
    }

    public static final void a(Activity activity, Intent intent) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) intent, "");
        if (activity instanceof SignupNativeActivity) {
            return;
        }
        intent.setFlags(268468224);
        activity.startActivity(intent);
        activity.finish();
    }

    public static final Intent d(Context context, String str, String str2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Intent d = d(context);
        d.putExtra("extra_flow", str);
        d.putExtra("extra_mode", str2);
        return d;
    }

    public static final Intent a(Context context, String str, String str2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Intent d = d(context, str, str2);
        d.putExtra("extra_launched_from_mode", "memberHome");
        return d;
    }

    public static final Intent a(Context context) {
        C8632dsu.c((Object) context, "");
        Intent d = d(context);
        d.putExtra("useDynecomCookies", true);
        return d;
    }

    public static final boolean e(Context context) {
        C8632dsu.c((Object) context, "");
        boolean z = C8151dev.d(context) || (C8151dev.c() && !Config_FastProperty_AmazonSingup.Companion.e());
        SignInConfigData a2 = new C1823aPo(context).a();
        return z || (a2 != null && a2.isSignupBlocked());
    }

    public static final void c(Context context) {
        SignInConfigData.Fields fields;
        C8632dsu.c((Object) context, "");
        ArrayList arrayList = new ArrayList();
        SignInConfigData a2 = new C1823aPo(context).a();
        List<SignInConfigData.NmAbConfig> list = (a2 == null || (fields = a2.fields) == null) ? null : fields.abAllocations;
        if (list != null) {
            for (SignInConfigData.NmAbConfig nmAbConfig : list) {
                arrayList.add(new ABTest(nmAbConfig.testId, nmAbConfig.cellId));
            }
        }
        Logger.INSTANCE.addContext(new TestAllocations(new ABTestAllocations((ABTest[]) arrayList.toArray(new ABTest[0])).toJSONObject()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
        r0 = o.C8563dqf.D(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b() {
        /*
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            java.lang.String r1 = ""
            o.C8632dsu.a(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.size()
            r4 = 0
        L1b:
            if (r4 >= r3) goto L32
            java.util.Locale r5 = r0.get(r4)
            java.lang.String r5 = r5.getLanguage()
            o.C8632dsu.d(r5)
            java.lang.String r5 = e(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L1b
        L32:
            com.netflix.mediaclient.NetflixApplication r0 = com.netflix.mediaclient.NetflixApplication.getInstance()
            java.lang.String[] r0 = o.C1821aPm.b(r0)
            if (r0 == 0) goto L42
            java.util.List r0 = o.C8561dqd.o(r0)
            if (r0 != 0) goto L46
        L42:
            java.util.List r0 = o.C8570dqm.c()
        L46:
            java.util.Set r2 = o.C8570dqm.c(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = o.C8570dqm.h(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L55
            return r2
        L55:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L64
            java.lang.Object r0 = o.C8570dqm.b(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L64:
            o.bqG r0 = o.C4984bqG.b
            o.dhy r0 = r0.e()
            java.lang.String r0 = r0.b()
            o.C8632dsu.a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cVB.b():java.lang.String");
    }

    public static final String e(String str) {
        C8632dsu.c((Object) str, "");
        String lowerCase = str.toLowerCase();
        C8632dsu.a(lowerCase, "");
        int hashCode = lowerCase.hashCode();
        return hashCode != 3365 ? hashCode != 3374 ? (hashCode == 3391 && lowerCase.equals("ji")) ? "yi" : str : !lowerCase.equals("iw") ? str : "he" : !lowerCase.equals("in") ? str : SignupConstants.Field.LANG_ID;
    }

    public static final Locale b(Context context) {
        C8632dsu.c((Object) context, "");
        Locale locale = new Locale(b(), Locale.getDefault().getCountry());
        C1332Xp.d(Context.class, C8310dhv.e((Context) C1332Xp.b(Context.class), locale), true);
        return locale;
    }
}
