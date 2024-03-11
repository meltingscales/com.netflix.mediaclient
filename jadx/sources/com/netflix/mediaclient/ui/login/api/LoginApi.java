package com.netflix.mediaclient.ui.login.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.app.Status;
import io.reactivex.Single;
import o.C5007bqd;
import o.C6365cbt;
import o.C8600drp;
import o.InterfaceC6276caJ;
import o.InterfaceC6280caN;
import o.InterfaceC8598drn;

/* loaded from: classes.dex */
public interface LoginApi {
    Intent a(Context context, Oauth2State oauth2State);

    Single<C6365cbt> a(Activity activity);

    void a(Context context);

    boolean b(Activity activity);

    Intent c(Context context);

    Intent c(Context context, C5007bqd c5007bqd, Status status);

    InterfaceC6280caN d(InterfaceC6276caJ interfaceC6276caJ);

    void d(Activity activity);

    Intent e(Context context);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Oauth2State {
        private static final /* synthetic */ Oauth2State[] b;
        private static final /* synthetic */ InterfaceC8598drn c;
        private final String a;
        public static final Oauth2State e = new Oauth2State("START", 0, "Oauth2ViaBrowserStart");
        public static final Oauth2State d = new Oauth2State("ERROR", 1, "Oauth2ViaBrowserError");

        private static final /* synthetic */ Oauth2State[] b() {
            return new Oauth2State[]{e, d};
        }

        public static Oauth2State valueOf(String str) {
            return (Oauth2State) Enum.valueOf(Oauth2State.class, str);
        }

        public static Oauth2State[] values() {
            return (Oauth2State[]) b.clone();
        }

        public final String e() {
            return this.a;
        }

        private Oauth2State(String str, int i, String str2) {
            this.a = str2;
        }

        static {
            Oauth2State[] b2 = b();
            b = b2;
            c = C8600drp.e(b2);
        }
    }
}
