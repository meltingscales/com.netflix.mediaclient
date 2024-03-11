package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TokenScope {
    public static final a a;
    private static final C9033hu f;
    private static final /* synthetic */ TokenScope[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private final String n;
    public static final TokenScope e = new TokenScope("ACCOUNT_LITE_SESSION_TRANSFER", 0, "ACCOUNT_LITE_SESSION_TRANSFER");
    public static final TokenScope b = new TokenScope("MOBILE_DEVICE_UPGRADE", 1, "MOBILE_DEVICE_UPGRADE");
    public static final TokenScope c = new TokenScope("FORGET_PASSWORD_SESSION_TRANSFER", 2, "FORGET_PASSWORD_SESSION_TRANSFER");
    public static final TokenScope i = new TokenScope("PROFILE_LOCK_RESET_SESSION_TRANSFER", 3, "PROFILE_LOCK_RESET_SESSION_TRANSFER");
    public static final TokenScope d = new TokenScope("ANDROID_SIGNUP_VIA_SMS_OR_IN_APP_LINK", 4, "ANDROID_SIGNUP_VIA_SMS_OR_IN_APP_LINK");
    public static final TokenScope j = new TokenScope("UNKNOWN__", 5, "UNKNOWN__");

    public static InterfaceC8598drn<TokenScope> b() {
        return h;
    }

    private static final /* synthetic */ TokenScope[] c() {
        return new TokenScope[]{e, b, c, i, d, j};
    }

    public static TokenScope valueOf(String str) {
        return (TokenScope) Enum.valueOf(TokenScope.class, str);
    }

    public static TokenScope[] values() {
        return (TokenScope[]) g.clone();
    }

    public final String e() {
        return this.n;
    }

    private TokenScope(String str, int i2, String str2) {
        this.n = str2;
    }

    static {
        List j2;
        TokenScope[] c2 = c();
        g = c2;
        h = C8600drp.e(c2);
        a = new a(null);
        j2 = C8569dql.j("ACCOUNT_LITE_SESSION_TRANSFER", "MOBILE_DEVICE_UPGRADE", "FORGET_PASSWORD_SESSION_TRANSFER", "PROFILE_LOCK_RESET_SESSION_TRANSFER", "ANDROID_SIGNUP_VIA_SMS_OR_IN_APP_LINK");
        f = new C9033hu("TokenScope", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final TokenScope e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = TokenScope.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((TokenScope) obj).e(), (Object) str)) {
                    break;
                }
            }
            TokenScope tokenScope = (TokenScope) obj;
            return tokenScope == null ? TokenScope.j : tokenScope;
        }
    }
}
