package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.core.app.BundleCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CustomTabsIntent {
    public final Intent intent;
    public final Bundle startAnimationBundle;

    public void launchUrl(Context context, Uri uri) {
        this.intent.setData(uri);
        ContextCompat.startActivity(context, this.intent, this.startAnimationBundle);
    }

    CustomTabsIntent(Intent intent, Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private ArrayList<Bundle> mActionButtons;
        private SparseArray<Bundle> mColorSchemeParamBundles;
        private Bundle mDefaultColorSchemeBundle;
        private ArrayList<Bundle> mMenuItems;
        private Bundle mStartAnimationBundle;
        private final Intent mIntent = new Intent("android.intent.action.VIEW");
        private final CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder = new CustomTabColorSchemeParams.Builder();
        private int mShareState = 0;
        private boolean mInstantAppsEnabled = true;

        private void setSessionParameters(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.mIntent.putExtras(bundle);
        }

        public Builder setInitialActivityHeightPx(int i, int i2) {
            if (i > 0) {
                if (i2 < 0 || i2 > 2) {
                    throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
                }
                this.mIntent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
                this.mIntent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i2);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
        }

        public Builder setInitialActivityHeightPx(int i) {
            return setInitialActivityHeightPx(i, 0);
        }

        public Builder setToolbarCornerRadiusDp(int i) {
            if (i < 0 || i > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.mIntent.putExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", i);
            return this;
        }

        public Builder setCloseButtonPosition(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.mIntent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i);
            return this;
        }

        public CustomTabsIntent build() {
            if (!this.mIntent.hasExtra("android.support.customtabs.extra.SESSION")) {
                setSessionParameters(null, null);
            }
            ArrayList<Bundle> arrayList = this.mMenuItems;
            if (arrayList != null) {
                this.mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.mActionButtons;
            if (arrayList2 != null) {
                this.mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.mIntent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.mInstantAppsEnabled);
            this.mIntent.putExtras(this.mDefaultColorSchemeBuilder.build().toBundle());
            Bundle bundle = this.mDefaultColorSchemeBundle;
            if (bundle != null) {
                this.mIntent.putExtras(bundle);
            }
            if (this.mColorSchemeParamBundles != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.mColorSchemeParamBundles);
                this.mIntent.putExtras(bundle2);
            }
            this.mIntent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.mShareState);
            setCurrentLocaleAsDefaultAcceptLanguage();
            return new CustomTabsIntent(this.mIntent, this.mStartAnimationBundle);
        }

        private void setCurrentLocaleAsDefaultAcceptLanguage() {
            String defaultLocale = Api24Impl.getDefaultLocale();
            if (TextUtils.isEmpty(defaultLocale)) {
                return;
            }
            Bundle bundleExtra = this.mIntent.hasExtra("com.android.browser.headers") ? this.mIntent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", defaultLocale);
            this.mIntent.putExtra("com.android.browser.headers", bundleExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Api24Impl {
        static String getDefaultLocale() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }
}
