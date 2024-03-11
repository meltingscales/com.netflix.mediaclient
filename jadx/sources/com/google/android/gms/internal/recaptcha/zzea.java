package com.google.android.gms.internal.recaptcha;

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
/* loaded from: classes2.dex */
public final class zzea {
    public static final zzea zza;
    public static final zzea zzb;
    public static final zzea zzc;
    public static final zzea zzd;
    public static final zzea zze;
    public static final zzea zzf;
    public static final zzea zzg;
    public static final zzea zzh;
    public static final zzea zzi;
    public static final zzea zzj;
    private static final /* synthetic */ zzea[] zzn;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    public static zzea[] values() {
        return (zzea[]) zzn.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }

    private zzea(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    static {
        zzea zzeaVar = new zzea("VOID", 0, Void.class, Void.class, null);
        zza = zzeaVar;
        Class cls = Integer.TYPE;
        zzea zzeaVar2 = new zzea("INT", 1, cls, Integer.class, 0);
        zzb = zzeaVar2;
        zzea zzeaVar3 = new zzea("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzeaVar3;
        zzea zzeaVar4 = new zzea("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzeaVar4;
        zzea zzeaVar5 = new zzea("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzeaVar5;
        zzea zzeaVar6 = new zzea("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzeaVar6;
        zzea zzeaVar7 = new zzea("STRING", 6, String.class, String.class, "");
        zzg = zzeaVar7;
        zzea zzeaVar8 = new zzea("BYTE_STRING", 7, zzch.class, zzch.class, zzch.zza);
        zzh = zzeaVar8;
        zzea zzeaVar9 = new zzea("ENUM", 8, cls, Integer.class, null);
        zzi = zzeaVar9;
        zzea zzeaVar10 = new zzea("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzeaVar10;
        zzn = new zzea[]{zzeaVar, zzeaVar2, zzeaVar3, zzeaVar4, zzeaVar5, zzeaVar6, zzeaVar7, zzeaVar8, zzeaVar9, zzeaVar10};
    }
}
