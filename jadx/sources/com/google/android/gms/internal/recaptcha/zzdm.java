package com.google.android.gms.internal.recaptcha;

import java.lang.reflect.Type;

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
public final class zzdm {
    public static final zzdm zza;
    private static final zzdm zzaa;
    private static final zzdm zzab;
    private static final zzdm zzac;
    private static final zzdm zzad;
    private static final zzdm zzae;
    private static final zzdm zzaf;
    private static final zzdm zzag;
    private static final zzdm zzah;
    private static final zzdm zzai;
    private static final zzdm zzaj;
    private static final zzdm zzak;
    private static final zzdm zzal;
    private static final zzdm zzam;
    private static final zzdm zzan;
    private static final zzdm zzao;
    private static final zzdm zzap;
    private static final zzdm zzaq;
    private static final zzdm zzar;
    private static final zzdm zzas;
    private static final zzdm zzat;
    private static final zzdm zzau;
    private static final zzdm zzav;
    private static final zzdm zzaw;
    private static final zzdm zzax;
    private static final zzdm zzay;
    public static final zzdm zzb;
    private static final zzdm[] zzbe;
    private static final Type[] zzbf;
    private static final /* synthetic */ zzdm[] zzbg;
    private static final zzdm zzc;
    private static final zzdm zzd;
    private static final zzdm zze;
    private static final zzdm zzf;
    private static final zzdm zzg;
    private static final zzdm zzh;
    private static final zzdm zzi;
    private static final zzdm zzj;
    private static final zzdm zzk;
    private static final zzdm zzl;
    private static final zzdm zzm;
    private static final zzdm zzn;
    private static final zzdm zzo;
    private static final zzdm zzp;
    private static final zzdm zzq;
    private static final zzdm zzr;
    private static final zzdm zzs;
    private static final zzdm zzt;
    private static final zzdm zzu;
    private static final zzdm zzv;
    private static final zzdm zzw;
    private static final zzdm zzx;
    private static final zzdm zzy;
    private static final zzdm zzz;
    private final zzea zzaz;
    private final int zzba;
    private final zzdo zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    public static zzdm[] values() {
        return (zzdm[]) zzbg.clone();
    }

    public final int zza() {
        return this.zzba;
    }

    private zzdm(String str, int i, int i2, zzdo zzdoVar, zzea zzeaVar) {
        int i3;
        this.zzba = i2;
        this.zzbb = zzdoVar;
        this.zzaz = zzeaVar;
        int i4 = zzdp.zza[zzdoVar.ordinal()];
        boolean z = true;
        if (i4 == 1) {
            this.zzbc = zzeaVar.zza();
        } else if (i4 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = zzeaVar.zza();
        }
        this.zzbd = (zzdoVar != zzdo.SCALAR || (i3 = zzdp.zzb[zzeaVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : false;
    }

    static {
        zzdo zzdoVar = zzdo.SCALAR;
        zzea zzeaVar = zzea.zze;
        zzdm zzdmVar = new zzdm("DOUBLE", 0, 0, zzdoVar, zzeaVar);
        zzc = zzdmVar;
        zzea zzeaVar2 = zzea.zzd;
        zzdm zzdmVar2 = new zzdm("FLOAT", 1, 1, zzdoVar, zzeaVar2);
        zzd = zzdmVar2;
        zzea zzeaVar3 = zzea.zzc;
        zzdm zzdmVar3 = new zzdm("INT64", 2, 2, zzdoVar, zzeaVar3);
        zze = zzdmVar3;
        zzdm zzdmVar4 = new zzdm("UINT64", 3, 3, zzdoVar, zzeaVar3);
        zzf = zzdmVar4;
        zzea zzeaVar4 = zzea.zzb;
        zzdm zzdmVar5 = new zzdm("INT32", 4, 4, zzdoVar, zzeaVar4);
        zzg = zzdmVar5;
        zzdm zzdmVar6 = new zzdm("FIXED64", 5, 5, zzdoVar, zzeaVar3);
        zzh = zzdmVar6;
        zzdm zzdmVar7 = new zzdm("FIXED32", 6, 6, zzdoVar, zzeaVar4);
        zzi = zzdmVar7;
        zzea zzeaVar5 = zzea.zzf;
        zzdm zzdmVar8 = new zzdm("BOOL", 7, 7, zzdoVar, zzeaVar5);
        zzj = zzdmVar8;
        zzea zzeaVar6 = zzea.zzg;
        zzdm zzdmVar9 = new zzdm("STRING", 8, 8, zzdoVar, zzeaVar6);
        zzk = zzdmVar9;
        zzea zzeaVar7 = zzea.zzj;
        zzdm zzdmVar10 = new zzdm("MESSAGE", 9, 9, zzdoVar, zzeaVar7);
        zzl = zzdmVar10;
        zzea zzeaVar8 = zzea.zzh;
        zzdm zzdmVar11 = new zzdm("BYTES", 10, 10, zzdoVar, zzeaVar8);
        zzm = zzdmVar11;
        zzdm zzdmVar12 = new zzdm("UINT32", 11, 11, zzdoVar, zzeaVar4);
        zzn = zzdmVar12;
        zzea zzeaVar9 = zzea.zzi;
        zzdm zzdmVar13 = new zzdm("ENUM", 12, 12, zzdoVar, zzeaVar9);
        zzo = zzdmVar13;
        zzdm zzdmVar14 = new zzdm("SFIXED32", 13, 13, zzdoVar, zzeaVar4);
        zzp = zzdmVar14;
        zzdm zzdmVar15 = new zzdm("SFIXED64", 14, 14, zzdoVar, zzeaVar3);
        zzq = zzdmVar15;
        zzdm zzdmVar16 = new zzdm("SINT32", 15, 15, zzdoVar, zzeaVar4);
        zzr = zzdmVar16;
        zzdm zzdmVar17 = new zzdm("SINT64", 16, 16, zzdoVar, zzeaVar3);
        zzs = zzdmVar17;
        zzdm zzdmVar18 = new zzdm("GROUP", 17, 17, zzdoVar, zzeaVar7);
        zzt = zzdmVar18;
        zzdo zzdoVar2 = zzdo.VECTOR;
        zzdm zzdmVar19 = new zzdm("DOUBLE_LIST", 18, 18, zzdoVar2, zzeaVar);
        zzu = zzdmVar19;
        zzdm zzdmVar20 = new zzdm("FLOAT_LIST", 19, 19, zzdoVar2, zzeaVar2);
        zzv = zzdmVar20;
        zzdm zzdmVar21 = new zzdm("INT64_LIST", 20, 20, zzdoVar2, zzeaVar3);
        zzw = zzdmVar21;
        zzdm zzdmVar22 = new zzdm("UINT64_LIST", 21, 21, zzdoVar2, zzeaVar3);
        zzx = zzdmVar22;
        zzdm zzdmVar23 = new zzdm("INT32_LIST", 22, 22, zzdoVar2, zzeaVar4);
        zzy = zzdmVar23;
        zzdm zzdmVar24 = new zzdm("FIXED64_LIST", 23, 23, zzdoVar2, zzeaVar3);
        zzz = zzdmVar24;
        zzdm zzdmVar25 = new zzdm("FIXED32_LIST", 24, 24, zzdoVar2, zzeaVar4);
        zzaa = zzdmVar25;
        zzdm zzdmVar26 = new zzdm("BOOL_LIST", 25, 25, zzdoVar2, zzeaVar5);
        zzab = zzdmVar26;
        zzdm zzdmVar27 = new zzdm("STRING_LIST", 26, 26, zzdoVar2, zzeaVar6);
        zzac = zzdmVar27;
        zzdm zzdmVar28 = new zzdm("MESSAGE_LIST", 27, 27, zzdoVar2, zzeaVar7);
        zzad = zzdmVar28;
        zzdm zzdmVar29 = new zzdm("BYTES_LIST", 28, 28, zzdoVar2, zzeaVar8);
        zzae = zzdmVar29;
        zzdm zzdmVar30 = new zzdm("UINT32_LIST", 29, 29, zzdoVar2, zzeaVar4);
        zzaf = zzdmVar30;
        zzdm zzdmVar31 = new zzdm("ENUM_LIST", 30, 30, zzdoVar2, zzeaVar9);
        zzag = zzdmVar31;
        zzdm zzdmVar32 = new zzdm("SFIXED32_LIST", 31, 31, zzdoVar2, zzeaVar4);
        zzah = zzdmVar32;
        zzdm zzdmVar33 = new zzdm("SFIXED64_LIST", 32, 32, zzdoVar2, zzeaVar3);
        zzai = zzdmVar33;
        zzdm zzdmVar34 = new zzdm("SINT32_LIST", 33, 33, zzdoVar2, zzeaVar4);
        zzaj = zzdmVar34;
        zzdm zzdmVar35 = new zzdm("SINT64_LIST", 34, 34, zzdoVar2, zzeaVar3);
        zzak = zzdmVar35;
        zzdo zzdoVar3 = zzdo.PACKED_VECTOR;
        zzdm zzdmVar36 = new zzdm("DOUBLE_LIST_PACKED", 35, 35, zzdoVar3, zzeaVar);
        zza = zzdmVar36;
        zzdm zzdmVar37 = new zzdm("FLOAT_LIST_PACKED", 36, 36, zzdoVar3, zzeaVar2);
        zzal = zzdmVar37;
        zzdm zzdmVar38 = new zzdm("INT64_LIST_PACKED", 37, 37, zzdoVar3, zzeaVar3);
        zzam = zzdmVar38;
        zzdm zzdmVar39 = new zzdm("UINT64_LIST_PACKED", 38, 38, zzdoVar3, zzeaVar3);
        zzan = zzdmVar39;
        zzdm zzdmVar40 = new zzdm("INT32_LIST_PACKED", 39, 39, zzdoVar3, zzeaVar4);
        zzao = zzdmVar40;
        zzdm zzdmVar41 = new zzdm("FIXED64_LIST_PACKED", 40, 40, zzdoVar3, zzeaVar3);
        zzap = zzdmVar41;
        zzdm zzdmVar42 = new zzdm("FIXED32_LIST_PACKED", 41, 41, zzdoVar3, zzeaVar4);
        zzaq = zzdmVar42;
        zzdm zzdmVar43 = new zzdm("BOOL_LIST_PACKED", 42, 42, zzdoVar3, zzeaVar5);
        zzar = zzdmVar43;
        zzdm zzdmVar44 = new zzdm("UINT32_LIST_PACKED", 43, 43, zzdoVar3, zzeaVar4);
        zzas = zzdmVar44;
        zzdm zzdmVar45 = new zzdm("ENUM_LIST_PACKED", 44, 44, zzdoVar3, zzeaVar9);
        zzat = zzdmVar45;
        zzdm zzdmVar46 = new zzdm("SFIXED32_LIST_PACKED", 45, 45, zzdoVar3, zzeaVar4);
        zzau = zzdmVar46;
        zzdm zzdmVar47 = new zzdm("SFIXED64_LIST_PACKED", 46, 46, zzdoVar3, zzeaVar3);
        zzav = zzdmVar47;
        zzdm zzdmVar48 = new zzdm("SINT32_LIST_PACKED", 47, 47, zzdoVar3, zzeaVar4);
        zzaw = zzdmVar48;
        zzdm zzdmVar49 = new zzdm("SINT64_LIST_PACKED", 48, 48, zzdoVar3, zzeaVar3);
        zzb = zzdmVar49;
        zzdm zzdmVar50 = new zzdm("GROUP_LIST", 49, 49, zzdoVar2, zzeaVar7);
        zzax = zzdmVar50;
        zzdm zzdmVar51 = new zzdm("MAP", 50, 50, zzdo.MAP, zzea.zza);
        zzay = zzdmVar51;
        zzbg = new zzdm[]{zzdmVar, zzdmVar2, zzdmVar3, zzdmVar4, zzdmVar5, zzdmVar6, zzdmVar7, zzdmVar8, zzdmVar9, zzdmVar10, zzdmVar11, zzdmVar12, zzdmVar13, zzdmVar14, zzdmVar15, zzdmVar16, zzdmVar17, zzdmVar18, zzdmVar19, zzdmVar20, zzdmVar21, zzdmVar22, zzdmVar23, zzdmVar24, zzdmVar25, zzdmVar26, zzdmVar27, zzdmVar28, zzdmVar29, zzdmVar30, zzdmVar31, zzdmVar32, zzdmVar33, zzdmVar34, zzdmVar35, zzdmVar36, zzdmVar37, zzdmVar38, zzdmVar39, zzdmVar40, zzdmVar41, zzdmVar42, zzdmVar43, zzdmVar44, zzdmVar45, zzdmVar46, zzdmVar47, zzdmVar48, zzdmVar49, zzdmVar50, zzdmVar51};
        zzbf = new Type[0];
        zzdm[] values = values();
        zzbe = new zzdm[values.length];
        for (zzdm zzdmVar52 : values) {
            zzbe[zzdmVar52.zzba] = zzdmVar52;
        }
    }
}
