package com.google.android.gms.internal.recaptcha;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class zzgy {
    public static final zzgy zza;
    public static final zzgy zzb;
    public static final zzgy zzc;
    public static final zzgy zzd;
    public static final zzgy zze;
    public static final zzgy zzf;
    public static final zzgy zzg;
    public static final zzgy zzh;
    public static final zzgy zzi;
    public static final zzgy zzj;
    public static final zzgy zzk;
    public static final zzgy zzl;
    public static final zzgy zzm;
    public static final zzgy zzn;
    public static final zzgy zzo;
    public static final zzgy zzp;
    public static final zzgy zzq;
    public static final zzgy zzr;
    private static final /* synthetic */ zzgy[] zzu;
    private final zzhb zzs;
    private final int zzt;

    public static zzgy[] values() {
        return (zzgy[]) zzu.clone();
    }

    public final zzhb zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    private zzgy(String str, int i, zzhb zzhbVar, int i2) {
        this.zzs = zzhbVar;
        this.zzt = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgy(String str, int i, zzhb zzhbVar, int i2, zzgv zzgvVar) {
        this(str, i, zzhbVar, i2);
    }

    static {
        zzgy zzgyVar = new zzgy("DOUBLE", 0, zzhb.DOUBLE, 1);
        zza = zzgyVar;
        zzgy zzgyVar2 = new zzgy("FLOAT", 1, zzhb.FLOAT, 5);
        zzb = zzgyVar2;
        zzhb zzhbVar = zzhb.LONG;
        zzgy zzgyVar3 = new zzgy("INT64", 2, zzhbVar, 0);
        zzc = zzgyVar3;
        zzgy zzgyVar4 = new zzgy("UINT64", 3, zzhbVar, 0);
        zzd = zzgyVar4;
        zzhb zzhbVar2 = zzhb.INT;
        zzgy zzgyVar5 = new zzgy("INT32", 4, zzhbVar2, 0);
        zze = zzgyVar5;
        zzgy zzgyVar6 = new zzgy("FIXED64", 5, zzhbVar, 1);
        zzf = zzgyVar6;
        zzgy zzgyVar7 = new zzgy("FIXED32", 6, zzhbVar2, 5);
        zzg = zzgyVar7;
        zzgy zzgyVar8 = new zzgy("BOOL", 7, zzhb.BOOLEAN, 0);
        zzh = zzgyVar8;
        final zzhb zzhbVar3 = zzhb.STRING;
        zzgy zzgyVar9 = new zzgy("STRING", 8, zzhbVar3, 2) { // from class: com.google.android.gms.internal.recaptcha.zzgx
        };
        zzi = zzgyVar9;
        final zzhb zzhbVar4 = zzhb.MESSAGE;
        zzgy zzgyVar10 = new zzgy("GROUP", 9, zzhbVar4, 3) { // from class: com.google.android.gms.internal.recaptcha.zzha
        };
        zzj = zzgyVar10;
        zzgy zzgyVar11 = new zzgy("MESSAGE", 10, zzhbVar4, 2) { // from class: com.google.android.gms.internal.recaptcha.zzgz
        };
        zzk = zzgyVar11;
        final zzhb zzhbVar5 = zzhb.BYTE_STRING;
        zzgy zzgyVar12 = new zzgy("BYTES", 11, zzhbVar5, 2) { // from class: com.google.android.gms.internal.recaptcha.zzhc
        };
        zzl = zzgyVar12;
        zzgy zzgyVar13 = new zzgy("UINT32", 12, zzhbVar2, 0);
        zzm = zzgyVar13;
        zzgy zzgyVar14 = new zzgy("ENUM", 13, zzhb.ENUM, 0);
        zzn = zzgyVar14;
        zzgy zzgyVar15 = new zzgy("SFIXED32", 14, zzhbVar2, 5);
        zzo = zzgyVar15;
        zzgy zzgyVar16 = new zzgy("SFIXED64", 15, zzhbVar, 1);
        zzp = zzgyVar16;
        zzgy zzgyVar17 = new zzgy("SINT32", 16, zzhbVar2, 0);
        zzq = zzgyVar17;
        zzgy zzgyVar18 = new zzgy("SINT64", 17, zzhbVar, 0);
        zzr = zzgyVar18;
        zzu = new zzgy[]{zzgyVar, zzgyVar2, zzgyVar3, zzgyVar4, zzgyVar5, zzgyVar6, zzgyVar7, zzgyVar8, zzgyVar9, zzgyVar10, zzgyVar11, zzgyVar12, zzgyVar13, zzgyVar14, zzgyVar15, zzgyVar16, zzgyVar17, zzgyVar18};
    }
}
