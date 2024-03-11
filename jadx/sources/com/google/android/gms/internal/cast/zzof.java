package com.google.android.gms.internal.cast;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class zzof<V> extends zzoj implements ListenableFuture<V> {
    static final boolean zza;
    private static final Logger zzb;
    private static final zza zzc;
    private static final Object zzd;
    volatile zzd listeners;
    volatile Object value;
    volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class zza {
        /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
        }

        abstract zzd zza(zzof zzofVar, zzd zzdVar);

        abstract zzk zzb(zzof zzofVar, zzk zzkVar);

        abstract void zzc(zzk zzkVar, zzk zzkVar2);

        abstract void zzd(zzk zzkVar, Thread thread);

        abstract boolean zze(zzof zzofVar, zzd zzdVar, zzd zzdVar2);

        abstract boolean zzf(zzof zzofVar, Object obj, Object obj2);

        abstract boolean zzg(zzof zzofVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzof.zza) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        zzb(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.cast.zzof.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes2.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzof, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzof, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzof, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final zzd zza(zzof zzofVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzofVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final zzk zzb(zzof zzofVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzofVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zze(zzof zzofVar, zzd zzdVar, zzd zzdVar2) {
            return zzog.zza(this.zzd, zzofVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zzf(zzof zzofVar, Object obj, Object obj2) {
            return zzog.zza(this.zze, zzofVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zzg(zzof zzofVar, zzk zzkVar, zzk zzkVar2) {
            return zzog.zza(this.zzc, zzofVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzf<V> implements Runnable {
        final zzof<V> zza;
        final ListenableFuture<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        /* synthetic */ zzg(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final zzd zza(zzof zzofVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzofVar) {
                zzdVar2 = zzofVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzofVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final zzk zzb(zzof zzofVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzofVar) {
                zzkVar2 = zzofVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzofVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zze(zzof zzofVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzofVar) {
                if (zzofVar.listeners == zzdVar) {
                    zzofVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zzf(zzof zzofVar, Object obj, Object obj2) {
            synchronized (zzofVar) {
                if (zzofVar.value == obj) {
                    zzofVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zzg(zzof zzofVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzofVar) {
                if (zzofVar.waiters == zzkVar) {
                    zzofVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface zzh<V> extends ListenableFuture<V> {
    }

    /* loaded from: classes2.dex */
    abstract class zzi<V> extends zzof<V> implements zzh<V> {
    }

    /* loaded from: classes2.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.cast.zzof.zzj.1
                    public static final Unsafe zza() {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }

                    @Override // java.security.PrivilegedExceptionAction
                    public final /* synthetic */ Unsafe run() {
                        return zza();
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzof.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzof.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzof.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (Exception e2) {
                zzdu.zza(e2);
                throw new RuntimeException(e2);
            }
        }

        private zzj() {
            super(null);
        }

        /* synthetic */ zzj(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final zzd zza(zzof zzofVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzofVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzofVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final zzk zzb(zzof zzofVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzofVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzofVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zze(zzof zzofVar, zzd zzdVar, zzd zzdVar2) {
            return zzoh.zza(zza, zzofVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zzf(zzof zzofVar, Object obj, Object obj2) {
            return zzoh.zza(zza, zzofVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.cast.zzof.zza
        final boolean zzg(zzof zzofVar, zzk zzkVar, zzk zzkVar2) {
            return zzoh.zza(zza, zzofVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk() {
            zzof.zzc.zzd(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zza = z;
        zzb = Logger.getLogger(zzof.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzof.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzof.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzof.class, Object.class, "value"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                zzgVar = new zzg(null);
            }
        }
        zzc = zzgVar;
        if (th != null) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    protected zzof() {
    }

    private static Object zzj(ListenableFuture listenableFuture) {
        Throwable zzh2;
        if (listenableFuture instanceof zzh) {
            Object obj = ((zzof) listenableFuture).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(listenableFuture instanceof zzoj) || (zzh2 = ((zzoj) listenableFuture).zzh()) == null) {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!zza) & isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzk2 = zzk(listenableFuture);
                if (!isCancelled) {
                    return zzk2 == null ? zzd : zzk2;
                }
                String valueOf = String.valueOf(listenableFuture);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new zzb(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e));
                }
                return new zzb(false, e);
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e2));
                }
                return new zzc(e2.getCause());
            } catch (Throwable th2) {
                return new zzc(th2);
            }
        } else {
            return new zzc(zzh2);
        }
    }

    private static Object zzk(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzl(StringBuilder sb) {
        try {
            Object zzk2 = zzk(this);
            sb.append("SUCCESS, result=[");
            if (zzk2 == null) {
                sb.append("null");
            } else if (zzk2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzk2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzk2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private final void zzm(StringBuilder sb) {
        String concat;
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (!(obj instanceof zzf)) {
            try {
                if (this instanceof ScheduledFuture) {
                    long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("remaining delay=[");
                    sb2.append(delay);
                    sb2.append(" ms]");
                    str = sb2.toString();
                } else {
                    str = null;
                }
                concat = zzdt.zza(str);
            } catch (RuntimeException | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        } else {
            sb.append(", setFuture=[");
            zzn(sb, ((zzf) obj).zzb);
            sb.append("]");
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzl(sb);
        }
    }

    private final void zzn(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void zzo(zzof zzofVar) {
        zzd zzdVar;
        zzof<V> zzofVar2;
        zzd zzdVar2 = null;
        while (true) {
            for (zzk zzb2 = zzc.zzb(zzofVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzd zza2 = zzc.zza(zzofVar, zzd.zza);
            while (zza2 != null) {
                zzd zzdVar3 = zza2.next;
                zza2.next = zzdVar2;
                zzdVar2 = zza2;
                zza2 = zzdVar3;
            }
            while (zzdVar2 != null) {
                zzdVar = zzdVar2.next;
                Runnable runnable = zzdVar2.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzofVar2 = zzfVar.zza;
                    if (zzofVar2.value == zzfVar) {
                        if (zzc.zzf(zzofVar2, zzfVar, zzj(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar2.zzc;
                    executor.getClass();
                    zzp(runnable, executor);
                }
                zzdVar2 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
            zzofVar = zzofVar2;
        }
    }

    private static void zzp(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    private final void zzq(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzc.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzr(Object obj) {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else {
            if (obj == zzd) {
                return null;
            }
            return obj;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzdr.zzc(runnable, "Runnable was null.");
        zzdr.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listeners) == zzd.zza) {
            zzp(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzc.zze(this, zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listeners;
        } while (zzdVar != zzd.zza);
        zzp(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof zzf)) {
            return false;
        }
        if (zza) {
            zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                zzbVar = zzb.zza;
            } else {
                zzbVar = zzb.zzb;
            }
            zzbVar.getClass();
        }
        zzof<V> zzofVar = this;
        boolean z2 = false;
        while (true) {
            if (zzc.zzf(zzofVar, obj, zzbVar)) {
                zzo(zzofVar);
                if (!(obj instanceof zzf)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((zzf) obj).zzb;
                if (listenableFuture instanceof zzh) {
                    zzofVar = (zzof) listenableFuture;
                    obj = zzofVar.value;
                    if (!(obj == null) && !(obj instanceof zzf)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj = zzofVar.value;
                if (!(obj instanceof zzf)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzr(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzc;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzq(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzr(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
            Object obj3 = this.value;
            obj3.getClass();
            return zzr(obj3);
        }
        Object obj32 = this.value;
        obj32.getClass();
        return zzr(obj32);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.value instanceof zzb) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzl(sb);
        } else {
            zzm(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzoj
    public final Throwable zzh() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzi(Object obj) {
        if (zzc.zzf(this, null, zzd)) {
            zzo(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof zzf))) {
            return zzr(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (!Thread.interrupted()) {
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof zzf)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return zzr(obj2);
                                }
                            } else {
                                zzq(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (nanos >= 1000);
                        zzq(zzkVar2);
                    } else {
                        zzkVar = this.waiters;
                    }
                } while (zzkVar != zzk.zza);
                Object obj3 = this.value;
                obj3.getClass();
                return zzr(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return zzr(obj32);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if (!((obj4 != null) & (!(obj4 instanceof zzf)))) {
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            } else {
                return zzr(obj4);
            }
        }
        String zzofVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z = i == 0 || nanos2 > 1000;
            if (i > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(",");
                }
                concat = String.valueOf(sb4).concat(" ");
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + zzofVar.length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(zzofVar);
        throw new TimeoutException(sb6.toString());
    }
}
