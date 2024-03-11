package com.google.android.gms.internal.recaptcha;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgn {
    static final boolean zza;
    private static final Logger zzb = Logger.getLogger(zzgn.class.getName());
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzd zzg;
    private static final boolean zzh;
    private static final boolean zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final long zzw;
    private static final int zzx;

    private zzgn() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza() {
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb() {
        return zzh;
    }

    /* loaded from: classes2.dex */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final byte zza(Object obj, long j) {
            if (zzgn.zza) {
                return zzgn.zzk(obj, j);
            }
            return zzgn.zzl(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, byte b) {
            if (zzgn.zza) {
                zzgn.zzc(obj, j, b);
            } else {
                zzgn.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final boolean zzb(Object obj, long j) {
            if (zzgn.zza) {
                return zzgn.zzm(obj, j);
            }
            return zzgn.zzn(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzgn.zza) {
                zzgn.zzd(obj, j, z);
            } else {
                zzgn.zze(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* loaded from: classes2.dex */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final byte zza(Object obj, long j) {
            return this.zza.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, byte b) {
            this.zza.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final boolean zzb(Object obj, long j) {
            return this.zza.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zza.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final float zzc(Object obj, long j) {
            return this.zza.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, float f) {
            this.zza.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final double zzd(Object obj, long j) {
            return this.zza.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, double d) {
            this.zza.putDouble(obj, j, d);
        }
    }

    /* loaded from: classes2.dex */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final byte zza(Object obj, long j) {
            if (zzgn.zza) {
                return zzgn.zzk(obj, j);
            }
            return zzgn.zzl(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, byte b) {
            if (zzgn.zza) {
                zzgn.zzc(obj, j, b);
            } else {
                zzgn.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final boolean zzb(Object obj, long j) {
            if (zzgn.zza) {
                return zzgn.zzm(obj, j);
            }
            return zzgn.zzn(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzgn.zza) {
                zzgn.zzd(obj, j, z);
            } else {
                zzgn.zze(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        @Override // com.google.android.gms.internal.recaptcha.zzgn.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class zzd {
        Unsafe zza;

        zzd(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract byte zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract boolean zzb(Object obj, long j);

        public abstract float zzc(Object obj, long j);

        public abstract double zzd(Object obj, long j);

        public final int zze(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final void zza(Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public final long zzf(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzb(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzc(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, long j) {
        return zzg.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, int i) {
        zzg.zza(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzb(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, long j2) {
        zzg.zza(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, boolean z) {
        zzg.zza(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzd(Object obj, long j) {
        return zzg.zzc(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, float f) {
        zzg.zza(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zze(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, double d) {
        zzg.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzf(Object obj, long j) {
        return zzg.zza.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, Object obj2) {
        zzg.zza.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j) {
        return zzg.zza(bArr, zzj + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, byte b) {
        zzg.zza((Object) bArr, zzj + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzc() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgp());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzd() {
        Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (zzcc.zza()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zze() {
        Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (zzf() == null) {
                return false;
            }
            if (zzcc.zza()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzd(Class<?> cls) {
        if (zzcc.zza()) {
            try {
                Class<?> cls2 = zzd;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field zzf() {
        Field zza2;
        if (!zzcc.zza() || (zza2 = zza(Buffer.class, "effectiveDirectAddress")) == null) {
            Field zza3 = zza(Buffer.class, "address");
            if (zza3 == null || zza3.getType() != Long.TYPE) {
                return null;
            }
            return zza3;
        }
        return zza2;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzk(Object obj, long j) {
        return (byte) (zza(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzl(Object obj, long j) {
        return (byte) (zza(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zza2 = zza(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((~(PrivateKeyType.INVALID << i)) & zza2) | ((b & 255) << i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        zza(obj, j2, ((~(PrivateKeyType.INVALID << i)) & zza(obj, j2)) | i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(Object obj, long j) {
        return zzk(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzn(Object obj, long j) {
        return zzl(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(Object obj, long j, boolean z) {
        zzd(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    static {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.zzgn.<clinit>():void");
    }
}
