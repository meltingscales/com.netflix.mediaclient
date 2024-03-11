package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/* renamed from: o.bqq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5020bqq {
    private static final Set<String> e = new HashSet<String>() { // from class: com.netflix.mediaclient.service.user.UserAgentBroadcastIntents$1
        {
            add("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_NOT_LOGGED_IN");
            add("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE");
            add("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE");
            add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE");
            add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE");
            add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_TYPE_CHANGED");
            add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT");
            add("com.netflix.mediaclient.intent.action.ACCOUNT_DATA_FETCHED");
            add("com.netflix.mediaclient.intent.action.NOTIFY_CELLULAR_DATA_USAGE_CHANGED");
        }
    };

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bqq$a */
    /* loaded from: classes4.dex */
    public interface a {
        Set<UserAgentListener> aI();
    }

    public static IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        for (String str : e) {
            intentFilter.addAction(str);
        }
        return intentFilter;
    }

    public static void c(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_NOT_LOGGED_IN"));
    }

    public static void b(Context context) {
        InterfaceC1593aHa.b("Account Active");
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE"));
        for (UserAgentListener userAgentListener : g(context)) {
            userAgentListener.onUserAccountActive();
        }
        C4987bqJ.c().onNext(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[], java.io.Serializable] */
    public static void d(Context context, List<InterfaceC5283bvo> list, String str) {
        InterfaceC1593aHa.b("Account Deactivated");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE");
        if (list != null && !list.isEmpty()) {
            intent.putExtra("intent.extra.user.profiles", (Serializable) list.toArray());
            intent.putStringArrayListExtra("intent.extra.user.profiles", (ArrayList) list.stream().map(new Function() { // from class: o.bqp
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((InterfaceC5283bvo) obj).getProfileGuid();
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: o.bqn
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        if (str != null) {
            intent.putExtra("intent.extra.account.guid", str);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        for (UserAgentListener userAgentListener : g(context)) {
            userAgentListener.onUserAccountDeactivated(list, str);
        }
        C4987bqJ.g().onNext(dpR.c);
    }

    public static void a(Context context, InterfaceC5283bvo interfaceC5283bvo) {
        InterfaceC1593aHa.b("Profile Active");
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE"));
        for (UserAgentListener userAgentListener : g(context)) {
            userAgentListener.onUserProfileActive(interfaceC5283bvo);
        }
        C4987bqJ.h().onNext(interfaceC5283bvo);
    }

    public static void b(Context context, InterfaceC5283bvo interfaceC5283bvo, List<InterfaceC5283bvo> list) {
        InterfaceC1593aHa.b("Profile Deactivated");
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE"));
        for (UserAgentListener userAgentListener : g(context)) {
            userAgentListener.onUserProfileDeactivated(interfaceC5283bvo, list);
        }
        C4987bqJ.f().onNext(dpR.c);
    }

    public static void d(Context context, String str) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_TYPE_CHANGED");
        intent.putExtra("intent.extra.profile.guid", str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        for (UserAgentListener userAgentListener : g(context)) {
            userAgentListener.onProfileTypeChanged(str);
        }
    }

    public static void e() {
        C4987bqJ.b().onNext(dpR.c);
    }

    public static void a() {
        C4987bqJ.i().onNext(dpR.c);
    }

    public static void c() {
        C4987bqJ.a().onNext(dpR.c);
    }

    public static void a(Context context) {
        for (UserAgentListener userAgentListener : g(context)) {
            userAgentListener.onUserLogOut();
        }
    }

    public static void c(Context context, StatusCode statusCode) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT");
        intent.putExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_INT", statusCode.getValue());
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        for (UserAgentListener userAgentListener : g(context)) {
            userAgentListener.onProfileSelectionResultStatus(statusCode);
        }
        C4987bqJ.e().onNext(statusCode);
    }

    public static void d(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.ACCOUNT_DATA_FETCHED"));
    }

    public static void e(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_CELLULAR_DATA_USAGE_CHANGED"));
    }

    private static Set<UserAgentListener> g(Context context) {
        return ((a) EntryPointAccessors.fromApplication(context, a.class)).aI();
    }
}
