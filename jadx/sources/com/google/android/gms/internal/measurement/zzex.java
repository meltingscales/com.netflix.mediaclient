package com.google.android.gms.internal.measurement;

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
/* loaded from: classes5.dex */
public final class zzex {
    public static final zzex zza;
    private static final zzex zzaa;
    private static final zzex zzab;
    private static final zzex zzac;
    private static final zzex zzad;
    private static final zzex zzae;
    private static final zzex zzaf;
    private static final zzex zzag;
    private static final zzex zzah;
    private static final zzex zzai;
    private static final zzex zzaj;
    private static final zzex zzak;
    private static final zzex zzal;
    private static final zzex zzam;
    private static final zzex zzan;
    private static final zzex zzao;
    private static final zzex zzap;
    private static final zzex zzaq;
    private static final zzex zzar;
    private static final zzex zzas;
    private static final zzex zzat;
    private static final zzex zzau;
    private static final zzex zzav;
    private static final zzex zzaw;
    private static final zzex zzax;
    private static final zzex zzay;
    public static final zzex zzb;
    private static final zzex[] zzbe;
    private static final Type[] zzbf;
    private static final /* synthetic */ zzex[] zzbg;
    private static final zzex zzc;
    private static final zzex zzd;
    private static final zzex zze;
    private static final zzex zzf;
    private static final zzex zzg;
    private static final zzex zzh;
    private static final zzex zzi;
    private static final zzex zzj;
    private static final zzex zzk;
    private static final zzex zzl;
    private static final zzex zzm;
    private static final zzex zzn;
    private static final zzex zzo;
    private static final zzex zzp;
    private static final zzex zzq;
    private static final zzex zzr;
    private static final zzex zzs;
    private static final zzex zzt;
    private static final zzex zzu;
    private static final zzex zzv;
    private static final zzex zzw;
    private static final zzex zzx;
    private static final zzex zzy;
    private static final zzex zzz;
    private final zzfq zzaz;
    private final int zzba;
    private final zzez zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    public static zzex[] values() {
        return (zzex[]) zzbg.clone();
    }

    public final int zza() {
        return this.zzba;
    }

    private zzex(String str, int i, int i2, zzez zzezVar, zzfq zzfqVar) {
        int i3;
        this.zzba = i2;
        this.zzbb = zzezVar;
        this.zzaz = zzfqVar;
        int i4 = zzfa.zza[zzezVar.ordinal()];
        boolean z = true;
        if (i4 == 1) {
            this.zzbc = zzfqVar.zza();
        } else if (i4 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = zzfqVar.zza();
        }
        this.zzbd = (zzezVar != zzez.SCALAR || (i3 = zzfa.zzb[zzfqVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : false;
    }

    static {
        zzez zzezVar = zzez.SCALAR;
        zzfq zzfqVar = zzfq.zze;
        zzex zzexVar = new zzex("DOUBLE", 0, 0, zzezVar, zzfqVar);
        zzc = zzexVar;
        zzfq zzfqVar2 = zzfq.zzd;
        zzex zzexVar2 = new zzex("FLOAT", 1, 1, zzezVar, zzfqVar2);
        zzd = zzexVar2;
        zzfq zzfqVar3 = zzfq.zzc;
        zzex zzexVar3 = new zzex("INT64", 2, 2, zzezVar, zzfqVar3);
        zze = zzexVar3;
        zzex zzexVar4 = new zzex("UINT64", 3, 3, zzezVar, zzfqVar3);
        zzf = zzexVar4;
        zzfq zzfqVar4 = zzfq.zzb;
        zzex zzexVar5 = new zzex("INT32", 4, 4, zzezVar, zzfqVar4);
        zzg = zzexVar5;
        zzex zzexVar6 = new zzex("FIXED64", 5, 5, zzezVar, zzfqVar3);
        zzh = zzexVar6;
        zzex zzexVar7 = new zzex("FIXED32", 6, 6, zzezVar, zzfqVar4);
        zzi = zzexVar7;
        zzfq zzfqVar5 = zzfq.zzf;
        zzex zzexVar8 = new zzex("BOOL", 7, 7, zzezVar, zzfqVar5);
        zzj = zzexVar8;
        zzfq zzfqVar6 = zzfq.zzg;
        zzex zzexVar9 = new zzex("STRING", 8, 8, zzezVar, zzfqVar6);
        zzk = zzexVar9;
        zzfq zzfqVar7 = zzfq.zzj;
        zzex zzexVar10 = new zzex("MESSAGE", 9, 9, zzezVar, zzfqVar7);
        zzl = zzexVar10;
        zzfq zzfqVar8 = zzfq.zzh;
        zzex zzexVar11 = new zzex("BYTES", 10, 10, zzezVar, zzfqVar8);
        zzm = zzexVar11;
        zzex zzexVar12 = new zzex("UINT32", 11, 11, zzezVar, zzfqVar4);
        zzn = zzexVar12;
        zzfq zzfqVar9 = zzfq.zzi;
        zzex zzexVar13 = new zzex("ENUM", 12, 12, zzezVar, zzfqVar9);
        zzo = zzexVar13;
        zzex zzexVar14 = new zzex("SFIXED32", 13, 13, zzezVar, zzfqVar4);
        zzp = zzexVar14;
        zzex zzexVar15 = new zzex("SFIXED64", 14, 14, zzezVar, zzfqVar3);
        zzq = zzexVar15;
        zzex zzexVar16 = new zzex("SINT32", 15, 15, zzezVar, zzfqVar4);
        zzr = zzexVar16;
        zzex zzexVar17 = new zzex("SINT64", 16, 16, zzezVar, zzfqVar3);
        zzs = zzexVar17;
        zzex zzexVar18 = new zzex("GROUP", 17, 17, zzezVar, zzfqVar7);
        zzt = zzexVar18;
        zzez zzezVar2 = zzez.VECTOR;
        zzex zzexVar19 = new zzex("DOUBLE_LIST", 18, 18, zzezVar2, zzfqVar);
        zzu = zzexVar19;
        zzex zzexVar20 = new zzex("FLOAT_LIST", 19, 19, zzezVar2, zzfqVar2);
        zzv = zzexVar20;
        zzex zzexVar21 = new zzex("INT64_LIST", 20, 20, zzezVar2, zzfqVar3);
        zzw = zzexVar21;
        zzex zzexVar22 = new zzex("UINT64_LIST", 21, 21, zzezVar2, zzfqVar3);
        zzx = zzexVar22;
        zzex zzexVar23 = new zzex("INT32_LIST", 22, 22, zzezVar2, zzfqVar4);
        zzy = zzexVar23;
        zzex zzexVar24 = new zzex("FIXED64_LIST", 23, 23, zzezVar2, zzfqVar3);
        zzz = zzexVar24;
        zzex zzexVar25 = new zzex("FIXED32_LIST", 24, 24, zzezVar2, zzfqVar4);
        zzaa = zzexVar25;
        zzex zzexVar26 = new zzex("BOOL_LIST", 25, 25, zzezVar2, zzfqVar5);
        zzab = zzexVar26;
        zzex zzexVar27 = new zzex("STRING_LIST", 26, 26, zzezVar2, zzfqVar6);
        zzac = zzexVar27;
        zzex zzexVar28 = new zzex("MESSAGE_LIST", 27, 27, zzezVar2, zzfqVar7);
        zzad = zzexVar28;
        zzex zzexVar29 = new zzex("BYTES_LIST", 28, 28, zzezVar2, zzfqVar8);
        zzae = zzexVar29;
        zzex zzexVar30 = new zzex("UINT32_LIST", 29, 29, zzezVar2, zzfqVar4);
        zzaf = zzexVar30;
        zzex zzexVar31 = new zzex("ENUM_LIST", 30, 30, zzezVar2, zzfqVar9);
        zzag = zzexVar31;
        zzex zzexVar32 = new zzex("SFIXED32_LIST", 31, 31, zzezVar2, zzfqVar4);
        zzah = zzexVar32;
        zzex zzexVar33 = new zzex("SFIXED64_LIST", 32, 32, zzezVar2, zzfqVar3);
        zzai = zzexVar33;
        zzex zzexVar34 = new zzex("SINT32_LIST", 33, 33, zzezVar2, zzfqVar4);
        zzaj = zzexVar34;
        zzex zzexVar35 = new zzex("SINT64_LIST", 34, 34, zzezVar2, zzfqVar3);
        zzak = zzexVar35;
        zzez zzezVar3 = zzez.PACKED_VECTOR;
        zzex zzexVar36 = new zzex("DOUBLE_LIST_PACKED", 35, 35, zzezVar3, zzfqVar);
        zza = zzexVar36;
        zzex zzexVar37 = new zzex("FLOAT_LIST_PACKED", 36, 36, zzezVar3, zzfqVar2);
        zzal = zzexVar37;
        zzex zzexVar38 = new zzex("INT64_LIST_PACKED", 37, 37, zzezVar3, zzfqVar3);
        zzam = zzexVar38;
        zzex zzexVar39 = new zzex("UINT64_LIST_PACKED", 38, 38, zzezVar3, zzfqVar3);
        zzan = zzexVar39;
        zzex zzexVar40 = new zzex("INT32_LIST_PACKED", 39, 39, zzezVar3, zzfqVar4);
        zzao = zzexVar40;
        zzex zzexVar41 = new zzex("FIXED64_LIST_PACKED", 40, 40, zzezVar3, zzfqVar3);
        zzap = zzexVar41;
        zzex zzexVar42 = new zzex("FIXED32_LIST_PACKED", 41, 41, zzezVar3, zzfqVar4);
        zzaq = zzexVar42;
        zzex zzexVar43 = new zzex("BOOL_LIST_PACKED", 42, 42, zzezVar3, zzfqVar5);
        zzar = zzexVar43;
        zzex zzexVar44 = new zzex("UINT32_LIST_PACKED", 43, 43, zzezVar3, zzfqVar4);
        zzas = zzexVar44;
        zzex zzexVar45 = new zzex("ENUM_LIST_PACKED", 44, 44, zzezVar3, zzfqVar9);
        zzat = zzexVar45;
        zzex zzexVar46 = new zzex("SFIXED32_LIST_PACKED", 45, 45, zzezVar3, zzfqVar4);
        zzau = zzexVar46;
        zzex zzexVar47 = new zzex("SFIXED64_LIST_PACKED", 46, 46, zzezVar3, zzfqVar3);
        zzav = zzexVar47;
        zzex zzexVar48 = new zzex("SINT32_LIST_PACKED", 47, 47, zzezVar3, zzfqVar4);
        zzaw = zzexVar48;
        zzex zzexVar49 = new zzex("SINT64_LIST_PACKED", 48, 48, zzezVar3, zzfqVar3);
        zzb = zzexVar49;
        zzex zzexVar50 = new zzex("GROUP_LIST", 49, 49, zzezVar2, zzfqVar7);
        zzax = zzexVar50;
        zzex zzexVar51 = new zzex("MAP", 50, 50, zzez.MAP, zzfq.zza);
        zzay = zzexVar51;
        zzbg = new zzex[]{zzexVar, zzexVar2, zzexVar3, zzexVar4, zzexVar5, zzexVar6, zzexVar7, zzexVar8, zzexVar9, zzexVar10, zzexVar11, zzexVar12, zzexVar13, zzexVar14, zzexVar15, zzexVar16, zzexVar17, zzexVar18, zzexVar19, zzexVar20, zzexVar21, zzexVar22, zzexVar23, zzexVar24, zzexVar25, zzexVar26, zzexVar27, zzexVar28, zzexVar29, zzexVar30, zzexVar31, zzexVar32, zzexVar33, zzexVar34, zzexVar35, zzexVar36, zzexVar37, zzexVar38, zzexVar39, zzexVar40, zzexVar41, zzexVar42, zzexVar43, zzexVar44, zzexVar45, zzexVar46, zzexVar47, zzexVar48, zzexVar49, zzexVar50, zzexVar51};
        zzbf = new Type[0];
        zzex[] values = values();
        zzbe = new zzex[values.length];
        for (zzex zzexVar52 : values) {
            zzbe[zzexVar52.zzba] = zzexVar52;
        }
    }
}
