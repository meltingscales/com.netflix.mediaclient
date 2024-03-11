package com.netflix.hawkins.consumer.component.staticlist;

import com.netflix.hawkins.consumer.component.icon.HawkinsIconSize;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C1011Le;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsStaticListSize {
    public static final HawkinsStaticListSize a;
    public static final HawkinsStaticListSize c;
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final /* synthetic */ HawkinsStaticListSize[] e;
    private final C1011Le b;
    private final int f;
    private final int h;
    private final HawkinsIconSize i;
    private final C1011Le j;

    private static final /* synthetic */ HawkinsStaticListSize[] j() {
        return new HawkinsStaticListSize[]{a, c};
    }

    public static HawkinsStaticListSize valueOf(String str) {
        return (HawkinsStaticListSize) Enum.valueOf(HawkinsStaticListSize.class, str);
    }

    public static HawkinsStaticListSize[] values() {
        return (HawkinsStaticListSize[]) e.clone();
    }

    public final C1011Le a() {
        return this.j;
    }

    public final int b() {
        return this.h;
    }

    public final C1011Le c() {
        return this.b;
    }

    public final int d() {
        return this.f;
    }

    public final HawkinsIconSize e() {
        return this.i;
    }

    private HawkinsStaticListSize(String str, int i, HawkinsIconSize hawkinsIconSize, int i2, C1011Le c1011Le, C1011Le c1011Le2, int i3) {
        this.i = hawkinsIconSize;
        this.h = i2;
        this.j = c1011Le;
        this.b = c1011Le2;
        this.f = i3;
    }

    static {
        HawkinsIconSize hawkinsIconSize = HawkinsIconSize.d;
        a = new HawkinsStaticListSize("Medium", 0, hawkinsIconSize, 2, new C1011Le(Token.Typography.ak.c, Token.Typography.C0688al.e), new C1011Le(Token.Typography.C0685ae.e, null), 8);
        c = new HawkinsStaticListSize("Large", 1, hawkinsIconSize, 1, new C1011Le(Token.Typography.ai.d, Token.Typography.ah.b), new C1011Le(Token.Typography.C0694g.e, null), 16);
        HawkinsStaticListSize[] j = j();
        e = j;
        d = C8600drp.e(j);
    }
}
