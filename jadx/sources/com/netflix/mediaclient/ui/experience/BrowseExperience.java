package com.netflix.mediaclient.ui.experience;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DarkKidsTheme;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import o.C1332Xp;
import o.C8157dfA;
import o.C9834xU;
import o.C9870yD;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC5283bvo;

/* loaded from: classes.dex */
public enum BrowseExperience {
    STANDARD,
    KIDS_THEME;
    
    private static final TypedValue c = new TypedValue();
    private static BrowseExperience e;

    public static boolean a() {
        return e == KIDS_THEME;
    }

    public static BrowseExperience c() {
        return e;
    }

    static {
        e = c(C8157dfA.e((Context) C1332Xp.b(Context.class), "preference_browse_experience", r0.name()));
    }

    public static BrowseExperience c(String str) {
        try {
            return valueOf(str);
        } catch (Exception unused) {
            InterfaceC1598aHf.a("BrowseExperience.stringToBrowseExperience should not be invalid");
            return STANDARD;
        }
    }

    public static void e(InterfaceC5283bvo interfaceC5283bvo) {
        e = (interfaceC5283bvo == null || !interfaceC5283bvo.isKidsProfile()) ? STANDARD : KIDS_THEME;
        C8157dfA.a((Context) C1332Xp.b(Context.class), "preference_browse_experience", e.name());
    }

    public static boolean e() {
        return e == KIDS_THEME && !Config_FastProperty_DarkKidsTheme.isEnabled();
    }

    public static ImageLoader.c b() {
        return e() ? StaticImgConfig.c : StaticImgConfig.d;
    }

    public static int e(Activity activity, int i) {
        if (activity != null) {
            return d(activity.getTheme(), i);
        }
        InterfaceC1598aHf.a("Context was null or not wrapping an Activity on getResourceIdFromTheme");
        return C9834xU.c.F;
    }

    private static int d(Resources.Theme theme, int i) {
        TypedValue typedValue = c;
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        InterfaceC1593aHa.b("Requesting theme's resource id. Theme was kid? " + e());
        InterfaceC1598aHf.a("Requested a Theme resource id that was not existing");
        return C9834xU.c.F;
    }

    public static int a(Context context, int i) {
        if (context != null) {
            return e(context.getTheme(), i);
        }
        InterfaceC1598aHf.a("Context was null or not wrapping an Activity on getColorFromTheme");
        return 0;
    }

    private static int e(Resources.Theme theme, int i) {
        TypedValue typedValue = c;
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        InterfaceC1593aHa.b("Requesting theme's color. Theme was kid? " + e());
        InterfaceC1598aHf.a("Requested a Theme color attribute that was not existing");
        return 0;
    }

    public static boolean c(Activity activity, int i) {
        if (activity != null) {
            return a(activity.getTheme(), i);
        }
        InterfaceC1598aHf.a("Context was null or not wrapping an Activity on getBooleanFromTheme");
        return false;
    }

    private static boolean a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static Drawable e(Drawable drawable, Activity activity, int i) {
        if (activity != null) {
            return e(drawable, activity.getTheme(), i);
        }
        InterfaceC1598aHf.a("Activity was null on getTintedDrawableForTheme");
        return null;
    }

    private static Drawable e(Drawable drawable, Resources.Theme theme, int i) {
        int e2 = e(theme, i);
        if (e2 != 0) {
            return C9870yD.d(drawable, e2);
        }
        return null;
    }
}
