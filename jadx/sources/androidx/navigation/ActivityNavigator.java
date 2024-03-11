package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.drM;
import o.dtQ;
import o.dtY;

@Navigator.Name("activity")
/* loaded from: classes5.dex */
public class ActivityNavigator extends Navigator<Destination> {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final Activity hostActivity;

    /* loaded from: classes5.dex */
    public static final class Extras implements Navigator.Extras {
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public ActivityNavigator(Context context) {
        dtQ a;
        Object obj;
        C8632dsu.c((Object) context, "");
        this.context = context;
        a = dtY.a(context, new drM<Context, Context>() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // o.drM
            public final Context invoke(Context context2) {
                C8632dsu.c((Object) context2, "");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        });
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.hostActivity = (Activity) obj;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // androidx.navigation.Navigator
    public NavDestination navigate(Destination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        int b;
        int b2;
        Intent intent;
        int intExtra;
        C8632dsu.c((Object) destination, "");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (bundle.containsKey(group)) {
                        matcher.appendReplacement(stringBuffer, "");
                        stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                    } else {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + dataPattern);
                    }
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = extras instanceof Extras;
        if (z) {
            intent2.addFlags(((Extras) extras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.shouldLaunchSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.getId());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim > 0 && C8632dsu.c((Object) resources.getResourceTypeName(popEnterAnim), (Object) "animator")) || (popExitAnim > 0 && C8632dsu.c((Object) resources.getResourceTypeName(popExitAnim), (Object) "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            } else {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", popEnterAnim);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", popExitAnim);
            }
        }
        if (z) {
            ActivityOptionsCompat activityOptions = ((Extras) extras).getActivityOptions();
            if (activityOptions != null) {
                ContextCompat.startActivity(this.context, intent2, activityOptions.toBundle());
            } else {
                this.context.startActivity(intent2);
            }
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int enterAnim = navOptions.getEnterAnim();
        int exitAnim = navOptions.getExitAnim();
        if ((enterAnim <= 0 || !C8632dsu.c((Object) resources.getResourceTypeName(enterAnim), (Object) "animator")) && (exitAnim <= 0 || !C8632dsu.c((Object) resources.getResourceTypeName(exitAnim), (Object) "animator"))) {
            if (enterAnim >= 0 || exitAnim >= 0) {
                b = C8657dts.b(enterAnim, 0);
                b2 = C8657dts.b(exitAnim, 0);
                this.hostActivity.overridePendingTransition(b, b2);
                return null;
            }
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
        return null;
    }

    /* loaded from: classes5.dex */
    public static class Destination extends NavDestination {
        private String dataPattern;
        private Intent intent;

        public final String getDataPattern() {
            return this.dataPattern;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        @Override // androidx.navigation.NavDestination
        public boolean supportsActions() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> navigator) {
            super(navigator);
            C8632dsu.c((Object) navigator, "");
        }

        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            ComponentName component = getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                String action = getAction();
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            Intent intent;
            return obj != null && (obj instanceof Destination) && super.equals(obj) && ((intent = this.intent) == null ? ((Destination) obj).intent == null : intent.filterEquals(((Destination) obj).intent)) && C8632dsu.c((Object) this.dataPattern, (Object) ((Destination) obj).dataPattern);
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int hashCode = super.hashCode();
            Intent intent = this.intent;
            int filterHashCode = intent != null ? intent.filterHashCode() : 0;
            String str = this.dataPattern;
            return (((hashCode * 31) + filterHashCode) * 31) + (str != null ? str.hashCode() : 0);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
