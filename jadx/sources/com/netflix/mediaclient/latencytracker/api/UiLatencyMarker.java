package com.netflix.mediaclient.latencytracker.api;

import android.content.Context;
import androidx.annotation.Keep;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface UiLatencyMarker {
    public static final b b = b.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface a {
        UiLatencyMarker aC();
    }

    static UiLatencyMarker a(Context context) {
        return b.c(context);
    }

    void b(Condition condition, boolean z);

    void b(Mark mark);

    Long c(Mark mark);

    JSONObject e();

    void e(Mark mark, long j);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    /* loaded from: classes.dex */
    public static final class Mark {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ Mark[] $VALUES;
        public static final Mark APP_ON_CREATE_START = new Mark("APP_ON_CREATE_START", 0);
        public static final Mark APP_ON_CREATE_END = new Mark("APP_ON_CREATE_END", 1);
        public static final Mark INIT_CRASH_REPORTER_START = new Mark("INIT_CRASH_REPORTER_START", 2);
        public static final Mark INIT_CRASH_REPORTER_END = new Mark("INIT_CRASH_REPORTER_END", 3);
        public static final Mark INIT_FP_START = new Mark("INIT_FP_START", 4);
        public static final Mark INIT_FP_END = new Mark("INIT_FP_END", 5);
        public static final Mark INIT_HENDRIX_START = new Mark("INIT_HENDRIX_START", 6);
        public static final Mark INIT_HENDRIX_END = new Mark("INIT_HENDRIX_END", 7);
        public static final Mark REGISTER_TESTS_START = new Mark("REGISTER_TESTS_START", 8);
        public static final Mark REGISTER_TESTS_END = new Mark("REGISTER_TESTS_END", 9);
        public static final Mark REGISTER_LOOKUP_START = new Mark("REGISTER_LOOKUP_START", 10);
        public static final Mark REGISTER_LOOKUP_END = new Mark("REGISTER_LOOKUP_END", 11);
        public static final Mark REGISTER_NONMEMBER_TESTS_START = new Mark("REGISTER_NONMEMBER_TESTS_START", 12);
        public static final Mark REGISTER_NONMEMBER_TESTS_END = new Mark("REGISTER_NONMEMBER_TESTS_END", 13);
        public static final Mark APP_LISTENER_START = new Mark("APP_LISTENER_START", 14);
        public static final Mark APP_LISTENER_END = new Mark("APP_LISTENER_END", 15);
        public static final Mark LAUNCH_ACTIVITY_CREATE = new Mark("LAUNCH_ACTIVITY_CREATE", 16);
        public static final Mark LAUNCH_ACTIVITY_READY = new Mark("LAUNCH_ACTIVITY_READY", 17);
        public static final Mark LANGUAGE_INSTALL_START = new Mark("LANGUAGE_INSTALL_START", 18);
        public static final Mark LANGUAGE_INSTALL_END = new Mark("LANGUAGE_INSTALL_END", 19);
        public static final Mark PROFILE_SELECTION_ACTIVITY_CREATE = new Mark("PROFILE_SELECTION_ACTIVITY_CREATE", 20);
        public static final Mark PROFILE_SELECTION_TTI_END = new Mark("PROFILE_SELECTION_TTI_END", 21);
        public static final Mark PROFILE_SELECTION_TTR_END = new Mark("PROFILE_SELECTION_TTR_END", 22);
        public static final Mark PROFILE_SELECTION_CLICKED = new Mark("PROFILE_SELECTION_CLICKED", 23);
        public static final Mark RELAUNCH_ACTIVITY_CREATE = new Mark("RELAUNCH_ACTIVITY_CREATE", 24);
        public static final Mark HOME_ACTIVITY_CREATE = new Mark("HOME_ACTIVITY_CREATE", 25);
        public static final Mark LOLOMO_QUEUED_START = new Mark("LOLOMO_QUEUED_START", 26);
        public static final Mark LOLOMO_QUEUED_END = new Mark("LOLOMO_QUEUED_END", 27);
        public static final Mark LOLOMO_BEFORE_FETCH_START = new Mark("LOLOMO_BEFORE_FETCH_START", 28);
        public static final Mark LOLOMO_BEFORE_FETCH_END = new Mark("LOLOMO_BEFORE_FETCH_END", 29);
        public static final Mark LOLOMO_NETWORK_START = new Mark("LOLOMO_NETWORK_START", 30);
        public static final Mark LOLOMO_NETWORK_END = new Mark("LOLOMO_NETWORK_END", 31);
        public static final Mark LOLOMO_CACHE_START = new Mark("LOLOMO_CACHE_START", 32);
        public static final Mark LOLOMO_CACHE_END = new Mark("LOLOMO_CACHE_END", 33);
        public static final Mark LOLOMO_PROCESSING_START = new Mark("LOLOMO_PROCESSING_START", 34);
        public static final Mark LOLOMO_PROCESSING_END = new Mark("LOLOMO_PROCESSING_END", 35);
        public static final Mark LOMOS_NETWORK_START = new Mark("LOMOS_NETWORK_START", 36);
        public static final Mark LOMOS_NETWORK_END = new Mark("LOMOS_NETWORK_END", 37);
        public static final Mark LOMOS_CACHE_START = new Mark("LOMOS_CACHE_START", 38);
        public static final Mark LOMOS_CACHE_END = new Mark("LOMOS_CACHE_END", 39);
        public static final Mark LOMOS_PROCESSING_START = new Mark("LOMOS_PROCESSING_START", 40);
        public static final Mark LOMOS_PROCESSING_END = new Mark("LOMOS_PROCESSING_END", 41);
        public static final Mark LOLOMO_PREPARE_START = new Mark("LOLOMO_PREPARE_START", 42);
        public static final Mark LOLOMO_PREPARE_END = new Mark("LOLOMO_PREPARE_END", 43);
        public static final Mark PREPARE_START = new Mark("PREPARE_START", 44);
        public static final Mark PREPARE_END = new Mark("PREPARE_END", 45);
        public static final Mark QUEUED_START = new Mark("QUEUED_START", 46);
        public static final Mark QUEUED_END = new Mark("QUEUED_END", 47);
        public static final Mark CACHE_START = new Mark("CACHE_START", 48);
        public static final Mark CACHE_END = new Mark("CACHE_END", 49);
        public static final Mark NETWORK_START = new Mark("NETWORK_START", 50);
        public static final Mark NETWORK_END = new Mark("NETWORK_END", 51);
        public static final Mark PROCESSING_START = new Mark("PROCESSING_START", 52);
        public static final Mark PROCESSING_END = new Mark("PROCESSING_END", 53);

        private static final /* synthetic */ Mark[] $values() {
            return new Mark[]{APP_ON_CREATE_START, APP_ON_CREATE_END, INIT_CRASH_REPORTER_START, INIT_CRASH_REPORTER_END, INIT_FP_START, INIT_FP_END, INIT_HENDRIX_START, INIT_HENDRIX_END, REGISTER_TESTS_START, REGISTER_TESTS_END, REGISTER_LOOKUP_START, REGISTER_LOOKUP_END, REGISTER_NONMEMBER_TESTS_START, REGISTER_NONMEMBER_TESTS_END, APP_LISTENER_START, APP_LISTENER_END, LAUNCH_ACTIVITY_CREATE, LAUNCH_ACTIVITY_READY, LANGUAGE_INSTALL_START, LANGUAGE_INSTALL_END, PROFILE_SELECTION_ACTIVITY_CREATE, PROFILE_SELECTION_TTI_END, PROFILE_SELECTION_TTR_END, PROFILE_SELECTION_CLICKED, RELAUNCH_ACTIVITY_CREATE, HOME_ACTIVITY_CREATE, LOLOMO_QUEUED_START, LOLOMO_QUEUED_END, LOLOMO_BEFORE_FETCH_START, LOLOMO_BEFORE_FETCH_END, LOLOMO_NETWORK_START, LOLOMO_NETWORK_END, LOLOMO_CACHE_START, LOLOMO_CACHE_END, LOLOMO_PROCESSING_START, LOLOMO_PROCESSING_END, LOMOS_NETWORK_START, LOMOS_NETWORK_END, LOMOS_CACHE_START, LOMOS_CACHE_END, LOMOS_PROCESSING_START, LOMOS_PROCESSING_END, LOLOMO_PREPARE_START, LOLOMO_PREPARE_END, PREPARE_START, PREPARE_END, QUEUED_START, QUEUED_END, CACHE_START, CACHE_END, NETWORK_START, NETWORK_END, PROCESSING_START, PROCESSING_END};
        }

        public static InterfaceC8598drn<Mark> getEntries() {
            return $ENTRIES;
        }

        public static Mark valueOf(String str) {
            return (Mark) Enum.valueOf(Mark.class, str);
        }

        public static Mark[] values() {
            return (Mark[]) $VALUES.clone();
        }

        private Mark(String str, int i) {
        }

        static {
            Mark[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    /* loaded from: classes.dex */
    public static final class Condition {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ Condition[] $VALUES;
        public static final Condition USER_LOGGED_IN = new Condition("USER_LOGGED_IN", 0);
        public static final Condition LANGUAGE_INSTALL_PENDING = new Condition("LANGUAGE_INSTALL_PENDING", 1);
        public static final Condition NETWORK_CONNECTED = new Condition("NETWORK_CONNECTED", 2);

        private static final /* synthetic */ Condition[] $values() {
            return new Condition[]{USER_LOGGED_IN, LANGUAGE_INSTALL_PENDING, NETWORK_CONNECTED};
        }

        public static InterfaceC8598drn<Condition> getEntries() {
            return $ENTRIES;
        }

        public static Condition valueOf(String str) {
            return (Condition) Enum.valueOf(Condition.class, str);
        }

        public static Condition[] values() {
            return (Condition[]) $VALUES.clone();
        }

        private Condition(String str, int i) {
        }

        static {
            Condition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        static final /* synthetic */ b c = new b();

        private b() {
        }

        public final UiLatencyMarker c(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).aC();
        }
    }
}
