package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfd.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class zzfd<MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzdl<MessageType, BuilderType> {
    private static Map<Object, zzfd<?, ?>> zzd = new ConcurrentHashMap();
    protected zzhy zzb = zzhy.zza();
    private int zzc = -1;

    /* loaded from: classes5.dex */
    public static final class zza<T extends zzfd<T, ?>> extends zzdp<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    /* loaded from: classes5.dex */
    static final class zzc implements zzey<zzc> {
        @Override // com.google.android.gms.internal.measurement.zzey
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final zzim zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final zzip zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final zzgn zza(zzgn zzgnVar, zzgo zzgoVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final zzgt zza(zzgt zzgtVar, zzgt zzgtVar2) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes5.dex */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        private static final /* synthetic */ int[] zzl = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzm = {1, 2};
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzn = {1, 2};

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    /* loaded from: classes5.dex */
    public static final class zzf<ContainingType extends zzgo, Type> extends zzer<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.zzdl
    final int zzbj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    final void zzc(int i) {
        this.zzc = i;
    }

    /* loaded from: classes5.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzfd<MessageType, BuilderType> {
        protected zzew<zzc> zzc = zzew.zza();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzew<zzc> zza() {
            if (this.zzc.zzc()) {
                this.zzc = (zzew) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public String toString() {
        return zzgp.zza(this, super.toString());
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza2 = zzgz.zza().zza((zzgz) this).zza(this);
        this.zza = zza2;
        return zza2;
    }

    /* loaded from: classes5.dex */
    public static class zzb<MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzdn<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        /* JADX INFO: Access modifiers changed from: protected */
        public zzb(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (MessageType) messagetype.zza(zze.zzd, null, null);
        }

        @Override // com.google.android.gms.internal.measurement.zzgq
        public final /* synthetic */ zzgo zzbt() {
            return this.zzc;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void zzq() {
            MessageType messagetype = (MessageType) this.zza.zza(zze.zzd, null, null);
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.zzgq
        public final boolean zzbl() {
            return zzfd.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzgn
        /* renamed from: zzr */
        public MessageType zzt() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzgz.zza().zza((zzgz) messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzgn
        /* renamed from: zzs */
        public final MessageType zzu() {
            MessageType messagetype = (MessageType) zzt();
            if (messagetype.zzbl()) {
                return messagetype;
            }
            throw new zzhw(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzgz.zza().zza((zzgz) messagetype).zzb(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzeq zzeqVar) {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            try {
                zzgz.zza().zza((zzgz) this.zza).zza(this.zza, bArr, 0, i2, new zzdt(zzeqVar));
                return this;
            } catch (zzfo e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzfo.zza();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzdn
        /* renamed from: zzb */
        public final BuilderType zza(zzeg zzegVar, zzeq zzeqVar) {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            try {
                zzgz.zza().zza((zzgz) this.zza).zza(this.zza, zzel.zza(zzegVar), zzeqVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdn
        protected final /* synthetic */ zzdn zza(zzdl zzdlVar) {
            return zza((zzb<MessageType, BuilderType>) ((zzfd) zzdlVar));
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ zzdn zza(byte[] bArr, int i, int i2, zzeq zzeqVar) {
            return zzb(bArr, 0, i2, zzeqVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ zzdn zza(byte[] bArr, int i, int i2) {
            return zzb(bArr, 0, i2, zzeq.zza());
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ zzdn zzp() {
            return (zzb) clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdn
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzc.zza(zze.zze, null, null);
            zzbVar.zza((zzb) ((zzfd) zzt()));
            return zzbVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzfd) zza(zze.zzf, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return zzgz.zza().zza((zzgz) this).zza(this, (zzfd) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbk() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    public final boolean zzbl() {
        return zza(this, true);
    }

    public final BuilderType zzbm() {
        BuilderType buildertype = (BuilderType) zza(zze.zze, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final void zza(zzen zzenVar) {
        zzgz.zza().zza((zzgz) this).zza((zzhd) this, (zzis) zzep.zza(zzenVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final int zzbn() {
        if (this.zzc == -1) {
            this.zzc = zzgz.zza().zza((zzgz) this).zzb(this);
        }
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzfd<?, ?>> T zza(Class<T> cls) {
        zzfd<?, ?> zzfdVar = zzd.get(cls);
        if (zzfdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfdVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfdVar == null) {
            zzfdVar = (T) ((zzfd) zzib.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzfdVar == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, zzfdVar);
        }
        return (T) zzfdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzfd<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzgo zzgoVar, String str, Object[] objArr) {
        return new zzhb(zzgoVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends zzfd<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzgz.zza().zza((zzgz) t).zzd(t);
        if (z) {
            t.zza(zze.zzb, zzd2 ? t : null, null);
        }
        return zzd2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfj zzbo() {
        return zzfg.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfm zzbp() {
        return zzgc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfm zza(zzfm zzfmVar) {
        int size = zzfmVar.size();
        return zzfmVar.zzc(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzfl<E> zzbq() {
        return zzhc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzfl<E> zza(zzfl<E> zzflVar) {
        int size = zzflVar.size();
        return zzflVar.zza(size == 0 ? 10 : size << 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final /* synthetic */ zzgn zzbr() {
        zzb zzbVar = (zzb) zza(zze.zze, (Object) null, (Object) null);
        zzbVar.zza((zzb) this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final /* synthetic */ zzgn zzbs() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    public final /* synthetic */ zzgo zzbt() {
        return (zzfd) zza(zze.zzf, (Object) null, (Object) null);
    }
}
