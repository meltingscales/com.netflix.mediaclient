package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.browser.customtabs.CustomTabsIntent;
import o.C8632dsu;
import o.RunnableC8122deS;
import o.dpR;

/* renamed from: o.dem  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8142dem {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Integer num) {
    }

    public static final drM<String, dpR> d(final ComponentActivity componentActivity, int i) {
        C8632dsu.c((Object) componentActivity, "");
        CustomTabsIntent.Builder initialActivityHeightPx = new CustomTabsIntent.Builder().setCloseButtonPosition(2).setToolbarCornerRadiusDp(10).setInitialActivityHeightPx(i);
        C8632dsu.a(initialActivityHeightPx, "");
        try {
            final ActivityResultLauncher<String> a = a(componentActivity, initialActivityHeightPx);
            return new drM<String, dpR>() { // from class: com.netflix.mediaclient.util.CustomTabsBrowserUtilsKt$createCustomTabsBrowserBottomSheetLauncher$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void c(String str) {
                    C8632dsu.c((Object) str, "");
                    a.launch(str);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(String str) {
                    c(str);
                    return dpR.c;
                }
            };
        } catch (Exception e) {
            C1044Mm.b("customTabsBrowser", e, "Failed to launch custom tabs browser", new Object[0]);
            return new drM<String, dpR>() { // from class: com.netflix.mediaclient.util.CustomTabsBrowserUtilsKt$createCustomTabsBrowserBottomSheetLauncher$2
                {
                    super(1);
                }

                public final void b(String str) {
                    C8632dsu.c((Object) str, "");
                    new RunnableC8122deS(ComponentActivity.this, str).run();
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(String str) {
                    b(str);
                    return dpR.c;
                }
            };
        }
    }

    public static final void b(Activity activity, String str) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        CustomTabsIntent.Builder closeButtonPosition = new CustomTabsIntent.Builder().setCloseButtonPosition(2);
        C8632dsu.a(closeButtonPosition, "");
        try {
            closeButtonPosition.build().launchUrl(activity, Uri.parse(str));
        } catch (Exception e) {
            C1044Mm.b("customTabsBrowser", e, "Failed to launch custom tabs browser", new Object[0]);
            new RunnableC8122deS(activity, str).run();
        }
    }

    /* renamed from: o.dem$b */
    /* loaded from: classes5.dex */
    public static final class b extends ActivityResultContract<String, Integer> {
        final /* synthetic */ CustomTabsIntent.Builder c;

        b(CustomTabsIntent.Builder builder) {
            this.c = builder;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public Integer parseResult(int i, Intent intent) {
            return Integer.valueOf(i);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: d */
        public Intent createIntent(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            Intent intent = this.c.build().intent;
            C8632dsu.a(intent, "");
            intent.setData(Uri.parse(str));
            return intent;
        }
    }

    private static final ActivityResultLauncher<String> a(ComponentActivity componentActivity, CustomTabsIntent.Builder builder) {
        ActivityResultLauncher<String> registerForActivityResult = componentActivity.registerForActivityResult(new b(builder), new ActivityResultCallback() { // from class: o.deo
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C8142dem.b((Integer) obj);
            }
        });
        C8632dsu.a(registerForActivityResult, "");
        return registerForActivityResult;
    }
}
