package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class zzfq {
    public static final zzfq zza;
    public static final zzfq zzb;
    public static final zzfq zzc;
    public static final zzfq zzd;
    public static final zzfq zze;
    public static final zzfq zzf;
    public static final zzfq zzg;
    public static final zzfq zzh;
    public static final zzfq zzi;
    public static final zzfq zzj;
    private static final /* synthetic */ zzfq[] zzn;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    public static zzfq[] values() {
        return (zzfq[]) zzn.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }

    private zzfq(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    static {
        zzfq zzfqVar = new zzfq("VOID", 0, Void.class, Void.class, null);
        zza = zzfqVar;
        Class cls = Integer.TYPE;
        zzfq zzfqVar2 = new zzfq("INT", 1, cls, Integer.class, 0);
        zzb = zzfqVar2;
        zzfq zzfqVar3 = new zzfq("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzfqVar3;
        zzfq zzfqVar4 = new zzfq("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzfqVar4;
        zzfq zzfqVar5 = new zzfq("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzfqVar5;
        zzfq zzfqVar6 = new zzfq("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzfqVar6;
        zzfq zzfqVar7 = new zzfq("STRING", 6, String.class, String.class, "");
        zzg = zzfqVar7;
        zzfq zzfqVar8 = new zzfq("BYTE_STRING", 7, zzdu.class, zzdu.class, zzdu.zza);
        zzh = zzfqVar8;
        zzfq zzfqVar9 = new zzfq("ENUM", 8, cls, Integer.class, null);
        zzi = zzfqVar9;
        zzfq zzfqVar10 = new zzfq("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzfqVar10;
        zzn = new zzfq[]{zzfqVar, zzfqVar2, zzfqVar3, zzfqVar4, zzfqVar5, zzfqVar6, zzfqVar7, zzfqVar8, zzfqVar9, zzfqVar10};
    }
}
