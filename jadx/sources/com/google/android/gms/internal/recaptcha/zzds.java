package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;
import com.google.android.gms.internal.recaptcha.zzds.zza;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzds<MessageType extends zzds<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzbz<MessageType, BuilderType> {
    private static Map<Object, zzds<?, ?>> zzd = new ConcurrentHashMap();
    protected zzgk zzb = zzgk.zza();
    private int zzc = -1;

    /* loaded from: classes2.dex */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzds<MessageType, BuilderType> {
        protected zzdl<zze> zzc = zzdl.zza();
    }

    /* loaded from: classes2.dex */
    public static final class zzc<T extends zzds<T, ?>> extends zzca<T> {
        private final T zza;

        public zzc(T t) {
            this.zza = t;
        }
    }

    /* loaded from: classes2.dex */
    static final class zze implements zzdn<zze> {
        @Override // com.google.android.gms.internal.recaptcha.zzdn
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.zzdn
        public final zzgy zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.zzdn
        public final zzhb zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.zzdn
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.zzdn
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.zzdn
        public final zzfb zza(zzfb zzfbVar, zzey zzeyVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.zzdn
        public final zzfe zza(zzfe zzfeVar, zzfe zzfeVar2) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes2.dex */
    public enum zzf {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.recaptcha.zzbz
    final void zza(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzbz
    final int zzd() {
        return this.zzc;
    }

    public String toString() {
        return zzfd.zza(this, super.toString());
    }

    /* loaded from: classes2.dex */
    public static class zza<MessageType extends zzds<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzby<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        /* JADX INFO: Access modifiers changed from: protected */
        public zza(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (MessageType) messagetype.zza(zzf.zzd, null, null);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzfa
        public final /* synthetic */ zzey zzh() {
            return this.zzc;
        }

        protected void zzb() {
            MessageType messagetype = (MessageType) this.zza.zza(zzf.zzd, null, null);
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.recaptcha.zzfa
        public final boolean zzc() {
            return zzds.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzfb
        /* renamed from: zzd */
        public MessageType zzf() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzfk.zza().zza((zzfk) messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        @Override // com.google.android.gms.internal.recaptcha.zzfb
        /* renamed from: zze */
        public final MessageType zzg() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzc()) {
                return messagetype;
            }
            throw new zzgi(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzfk.zza().zza((zzfk) messagetype).zzb(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.recaptcha.zzby
        protected final /* synthetic */ zzby zza(zzbz zzbzVar) {
            return zza((zza<MessageType, BuilderType>) ((zzds) zzbzVar));
        }

        @Override // com.google.android.gms.internal.recaptcha.zzby
        public final /* synthetic */ zzby zza() {
            return (zza) clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.recaptcha.zzby
        public /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.zzc.zza(zzf.zze, null, null);
            zzaVar.zza((zza) ((zzds) zzf()));
            return zzaVar;
        }
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza2 = zzfk.zza().zza((zzfk) this).zza(this);
        this.zza = zza2;
        return zza2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfk.zza().zza((zzfk) this).zza(this, (zzds) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfa
    public final boolean zzc() {
        return zza(this, true);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzey
    public final void zza(zzcy zzcyVar) {
        zzfk.zza().zza((zzfk) this).zza((zzfp) this, (zzhe) zzdb.zza(zzcyVar));
    }

    @Override // com.google.android.gms.internal.recaptcha.zzey
    public final int zzk() {
        if (this.zzc == -1) {
            this.zzc = zzfk.zza().zza((zzfk) this).zzb(this);
        }
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzds<?, ?>> T zza(Class<T> cls) {
        zzds<?, ?> zzdsVar = zzd.get(cls);
        if (zzdsVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzdsVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzdsVar == null) {
            zzdsVar = (T) ((zzds) zzgn.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzdsVar == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, zzdsVar);
        }
        return (T) zzdsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzds<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzey zzeyVar, String str, Object[] objArr) {
        return new zzfn(zzeyVar, str, objArr);
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

    protected static final <T extends zzds<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzfk.zza().zza((zzfk) t).zzd(t);
        if (z) {
            t.zza(zzf.zzb, zzd2 ? t : null, null);
        }
        return zzd2;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzey
    public final /* synthetic */ zzfb zzl() {
        zza zzaVar = (zza) zza(zzf.zze, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfa
    public final /* synthetic */ zzey zzh() {
        return (zzds) zza(zzf.zzf, (Object) null, (Object) null);
    }
}
