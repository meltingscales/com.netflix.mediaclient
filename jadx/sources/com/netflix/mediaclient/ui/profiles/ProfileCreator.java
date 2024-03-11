package com.netflix.mediaclient.ui.profiles;

import android.app.Activity;
import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public interface ProfileCreator {
    void b(Activity activity);

    void b(Activity activity, AgeSetting ageSetting, int i);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class AgeSetting {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ AgeSetting[] c;
        public static final AgeSetting b = new AgeSetting("KID", 0);
        public static final AgeSetting e = new AgeSetting("TEEN", 1);
        public static final AgeSetting d = new AgeSetting("ADULT", 2);

        private static final /* synthetic */ AgeSetting[] a() {
            return new AgeSetting[]{b, e, d};
        }

        public static AgeSetting valueOf(String str) {
            return (AgeSetting) Enum.valueOf(AgeSetting.class, str);
        }

        public static AgeSetting[] values() {
            return (AgeSetting[]) c.clone();
        }

        private AgeSetting(String str, int i) {
        }

        static {
            AgeSetting[] a2 = a();
            c = a2;
            a = C8600drp.e(a2);
        }
    }
}
