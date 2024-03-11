package com.netflix.mediaclient.service.configuration;

import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum d uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class EsnMigrationState {
    public static final EsnMigrationState a;
    public static final EsnMigrationState b;
    public static final EsnMigrationState c;
    public static final EsnMigrationState d;
    public static final EsnMigrationState e;
    public static final EsnMigrationState f;
    public static final EsnMigrationState g;
    public static final EsnMigrationState h;
    public static final EsnMigrationState j;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ EsnMigrationState[] f13196o;
    public final CryptoProvider i;
    public final CryptoProvider n;

    private static /* synthetic */ EsnMigrationState[] a() {
        return new EsnMigrationState[]{d, b, a, e, c, g, h, j, f};
    }

    public boolean d() {
        if (this != h) {
            return (this != j) & (this != f);
        }
        return false;
    }

    public static EsnMigrationState valueOf(String str) {
        return (EsnMigrationState) Enum.valueOf(EsnMigrationState.class, str);
    }

    public static EsnMigrationState[] values() {
        return (EsnMigrationState[]) f13196o.clone();
    }

    static {
        CryptoProvider cryptoProvider = CryptoProvider.WIDEVINE_L1;
        CryptoProvider cryptoProvider2 = CryptoProvider.WIDEVINE_L3;
        d = new EsnMigrationState("ESN_MIGRATION_L1_2_L3", 0, cryptoProvider, cryptoProvider2);
        b = new EsnMigrationState("ESN_MIGRATION_L3_2_L3", 1, cryptoProvider2, cryptoProvider2);
        a = new EsnMigrationState("ESN_MIGRATION_L1_2_L1", 2, cryptoProvider, cryptoProvider);
        e = new EsnMigrationState("ESN_MIGRATION_L3_2_L1", 3, cryptoProvider2, cryptoProvider);
        CryptoProvider cryptoProvider3 = CryptoProvider.LEGACY;
        c = new EsnMigrationState("ESN_MIGRATION_LEGACY_2_L1", 4, cryptoProvider3, cryptoProvider);
        g = new EsnMigrationState("ESN_MIGRATION_LEGACY_2_L3", 5, cryptoProvider3, cryptoProvider2);
        h = new EsnMigrationState("NO_ESN_MIGRATION_L1", 6, cryptoProvider, cryptoProvider);
        j = new EsnMigrationState("NO_ESN_MIGRATION_L3", 7, cryptoProvider2, cryptoProvider2);
        f = new EsnMigrationState("NO_ESN_MIGRATION_LEGACY", 8, null, null);
        f13196o = a();
    }

    private EsnMigrationState(String str, int i, CryptoProvider cryptoProvider, CryptoProvider cryptoProvider2) {
        this.n = cryptoProvider;
        this.i = cryptoProvider2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EsnMigrationState{previousCryptoProvider=" + this.n + ", currentCryptoProvider=" + this.i + ", esnMigration=" + d() + '}';
    }

    public static EsnMigrationState a(CryptoProvider cryptoProvider, CryptoProvider cryptoProvider2, boolean z) {
        if (cryptoProvider == null && cryptoProvider2 == null) {
            return f;
        }
        if (!z && cryptoProvider == cryptoProvider2) {
            return cryptoProvider == CryptoProvider.WIDEVINE_L1 ? h : cryptoProvider == CryptoProvider.WIDEVINE_L3 ? j : f;
        }
        CryptoProvider cryptoProvider3 = CryptoProvider.WIDEVINE_L1;
        if (cryptoProvider == cryptoProvider3) {
            return cryptoProvider2 == cryptoProvider3 ? a : cryptoProvider2 == CryptoProvider.WIDEVINE_L3 ? d : f;
        }
        CryptoProvider cryptoProvider4 = CryptoProvider.WIDEVINE_L3;
        return cryptoProvider == cryptoProvider4 ? cryptoProvider2 == cryptoProvider3 ? e : cryptoProvider2 == cryptoProvider4 ? b : f : cryptoProvider == CryptoProvider.LEGACY ? cryptoProvider2 == cryptoProvider3 ? c : cryptoProvider2 == cryptoProvider4 ? g : f : f;
    }
}
