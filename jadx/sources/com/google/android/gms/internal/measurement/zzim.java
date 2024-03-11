package com.google.android.gms.internal.measurement;

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
/* loaded from: classes5.dex */
public class zzim {
    public static final zzim zza;
    public static final zzim zzb;
    public static final zzim zzc;
    public static final zzim zzd;
    public static final zzim zze;
    public static final zzim zzf;
    public static final zzim zzg;
    public static final zzim zzh;
    public static final zzim zzi;
    public static final zzim zzj;
    public static final zzim zzk;
    public static final zzim zzl;
    public static final zzim zzm;
    public static final zzim zzn;
    public static final zzim zzo;
    public static final zzim zzp;
    public static final zzim zzq;
    public static final zzim zzr;
    private static final /* synthetic */ zzim[] zzu;
    private final zzip zzs;
    private final int zzt;

    public static zzim[] values() {
        return (zzim[]) zzu.clone();
    }

    public final zzip zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    private zzim(String str, int i, zzip zzipVar, int i2) {
        this.zzs = zzipVar;
        this.zzt = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzim(String str, int i, zzip zzipVar, int i2, zzij zzijVar) {
        this(str, i, zzipVar, i2);
    }

    static {
        zzim zzimVar = new zzim("DOUBLE", 0, zzip.DOUBLE, 1);
        zza = zzimVar;
        zzim zzimVar2 = new zzim("FLOAT", 1, zzip.FLOAT, 5);
        zzb = zzimVar2;
        zzip zzipVar = zzip.LONG;
        zzim zzimVar3 = new zzim("INT64", 2, zzipVar, 0);
        zzc = zzimVar3;
        zzim zzimVar4 = new zzim("UINT64", 3, zzipVar, 0);
        zzd = zzimVar4;
        zzip zzipVar2 = zzip.INT;
        zzim zzimVar5 = new zzim("INT32", 4, zzipVar2, 0);
        zze = zzimVar5;
        zzim zzimVar6 = new zzim("FIXED64", 5, zzipVar, 1);
        zzf = zzimVar6;
        zzim zzimVar7 = new zzim("FIXED32", 6, zzipVar2, 5);
        zzg = zzimVar7;
        zzim zzimVar8 = new zzim("BOOL", 7, zzip.BOOLEAN, 0);
        zzh = zzimVar8;
        final zzip zzipVar3 = zzip.STRING;
        zzim zzimVar9 = new zzim("STRING", 8, zzipVar3, 2) { // from class: com.google.android.gms.internal.measurement.zzil
        };
        zzi = zzimVar9;
        final zzip zzipVar4 = zzip.MESSAGE;
        zzim zzimVar10 = new zzim("GROUP", 9, zzipVar4, 3) { // from class: com.google.android.gms.internal.measurement.zzio
        };
        zzj = zzimVar10;
        zzim zzimVar11 = new zzim("MESSAGE", 10, zzipVar4, 2) { // from class: com.google.android.gms.internal.measurement.zzin
        };
        zzk = zzimVar11;
        final zzip zzipVar5 = zzip.BYTE_STRING;
        zzim zzimVar12 = new zzim("BYTES", 11, zzipVar5, 2) { // from class: com.google.android.gms.internal.measurement.zziq
        };
        zzl = zzimVar12;
        zzim zzimVar13 = new zzim("UINT32", 12, zzipVar2, 0);
        zzm = zzimVar13;
        zzim zzimVar14 = new zzim("ENUM", 13, zzip.ENUM, 0);
        zzn = zzimVar14;
        zzim zzimVar15 = new zzim("SFIXED32", 14, zzipVar2, 5);
        zzo = zzimVar15;
        zzim zzimVar16 = new zzim("SFIXED64", 15, zzipVar, 1);
        zzp = zzimVar16;
        zzim zzimVar17 = new zzim("SINT32", 16, zzipVar2, 0);
        zzq = zzimVar17;
        zzim zzimVar18 = new zzim("SINT64", 17, zzipVar, 0);
        zzr = zzimVar18;
        zzu = new zzim[]{zzimVar, zzimVar2, zzimVar3, zzimVar4, zzimVar5, zzimVar6, zzimVar7, zzimVar8, zzimVar9, zzimVar10, zzimVar11, zzimVar12, zzimVar13, zzimVar14, zzimVar15, zzimVar16, zzimVar17, zzimVar18};
    }
}
