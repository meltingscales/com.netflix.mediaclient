package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.StatusCode;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.Multibinds;
import java.util.List;
import java.util.Set;
import o.C8632dsu;
import o.InterfaceC5283bvo;

/* loaded from: classes.dex */
public interface UserAgentListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ListenerModule {
        @Multibinds
        Set<UserAgentListener> e();
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static void a(UserAgentListener userAgentListener) {
        }

        public static void a(UserAgentListener userAgentListener, StatusCode statusCode) {
            C8632dsu.c((Object) statusCode, "");
        }

        public static void a(UserAgentListener userAgentListener, List<? extends InterfaceC5283bvo> list, String str) {
        }

        public static void b(UserAgentListener userAgentListener) {
        }

        public static void c(UserAgentListener userAgentListener, String str) {
            C8632dsu.c((Object) str, "");
        }

        public static void c(UserAgentListener userAgentListener, InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
        }

        public static void e(UserAgentListener userAgentListener, InterfaceC5283bvo interfaceC5283bvo) {
            C8632dsu.c((Object) interfaceC5283bvo, "");
        }
    }

    void onProfileSelectionResultStatus(StatusCode statusCode);

    void onProfileTypeChanged(String str);

    void onUserAccountActive();

    void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str);

    void onUserLogOut();

    void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo);

    void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list);
}
