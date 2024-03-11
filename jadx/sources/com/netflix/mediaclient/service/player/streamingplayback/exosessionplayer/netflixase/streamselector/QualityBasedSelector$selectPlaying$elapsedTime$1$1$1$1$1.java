package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.media.manifest.SegmentVmaf;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.AbstractC4739bkX;
import o.C1045Mp;
import o.C1596aHd;
import o.C4656bid;
import o.C4755bkv;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8657dts;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC8585dra;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drX;
import o.dwU;

/* loaded from: classes6.dex */
final class QualityBasedSelector$selectPlaying$elapsedTime$1$1$1$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ long a;
    final /* synthetic */ List<? extends C4656bid> b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ float f;
    final /* synthetic */ Ref.LongRef g;
    final /* synthetic */ long h;
    final /* synthetic */ int i;
    final /* synthetic */ Ref.IntRef j;
    final /* synthetic */ int k;
    final /* synthetic */ long l;
    final /* synthetic */ long m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ int[] f13218o;
    final /* synthetic */ Object q$7488013c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityBasedSelector$selectPlaying$elapsedTime$1$1$1$1$1(long j, Object obj, long j2, long j3, long j4, List<? extends C4656bid> list, long j5, Ref.LongRef longRef, int i, int i2, int i3, float f, Ref.IntRef intRef, long j6, int[] iArr, InterfaceC8585dra<? super QualityBasedSelector$selectPlaying$elapsedTime$1$1$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.h = j;
        this.q$7488013c = obj;
        this.m = j2;
        this.d = j3;
        this.e = j4;
        this.b = list;
        this.a = j5;
        this.g = longRef;
        this.i = i;
        this.k = i2;
        this.c = i3;
        this.f = f;
        this.j = intRef;
        this.l = j6;
        this.f13218o = iArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new QualityBasedSelector$selectPlaying$elapsedTime$1$1$1$1$1(this.h, this.q$7488013c, this.m, this.d, this.e, this.b, this.a, this.g, this.i, this.k, this.c, this.f, this.j, this.l, this.f13218o, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((QualityBasedSelector$selectPlaying$elapsedTime$1$1$1$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object[] objArr;
        String str;
        Object[] objArr2;
        Method method;
        Method method2;
        Object[] objArr3;
        long j;
        List g;
        long j2;
        Ref.DoubleRef doubleRef;
        String str2;
        Object obj2;
        Object[] objArr4;
        Method method3;
        Object[] objArr5;
        Method method4;
        Map c;
        Map k;
        Throwable th;
        Object B;
        Object y;
        Object[] objArr6;
        Method method5;
        Object[] objArr7;
        Method method6;
        int c2;
        Object[] objArr8;
        Method method7;
        Object[] objArr9;
        int c3;
        C8586drb.e();
        if (this.n == 0) {
            C8556dpz.d(obj);
            long j3 = this.h;
            Object obj3 = this.q$7488013c;
            try {
                Object obj4 = C4755bkv.q.get(48901555);
                if (obj4 == null) {
                    obj4 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("c", null);
                    C4755bkv.q.put(48901555, obj4);
                }
                long intValue = ((Integer) ((Method) obj4).invoke(obj3, null)).intValue() - this.h;
                Object obj5 = this.q$7488013c;
                long j4 = this.m;
                long j5 = this.d;
                int k2 = ((IStreamSelector$b) ((Class) C4755bkv.b((char) 0, 5, 2499)).getField("j").get(obj5)).k();
                long j6 = this.e;
                List<? extends C4656bid> list = this.b;
                long j7 = this.a;
                long j8 = this.g.a;
                long aY = ((AseConfig) ((Class) C4755bkv.b((char) 19864, 5, 2557)).getField("b").get(this.q$7488013c)).aY();
                long j9 = 1000;
                Object[] objArr10 = (Object[]) ((Class) C4755bkv.b((char) 19864, 5, 2557)).getField("f").get(this.q$7488013c);
                try {
                    Object[] objArr11 = {Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(k2 * 1000), Long.valueOf(j6), list, Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(aY * j9), objArr10[this.i], Long.valueOf(j3 * j9), objArr10[this.k], Long.valueOf(j9 * intValue), Integer.valueOf(this.c), Float.valueOf(this.f)};
                    Object obj6 = C4755bkv.q.get(320722406);
                    String str3 = "d";
                    if (obj6 == null) {
                        obj6 = ((Class) C4755bkv.b((char) 19864, 5, 2557)).getMethod("d", Long.TYPE, Long.TYPE, Integer.TYPE, Long.TYPE, List.class, Long.TYPE, Long.TYPE, Long.TYPE, (Class) C4755bkv.b((char) 0, 117, 2358), Long.TYPE, (Class) C4755bkv.b((char) 0, 117, 2358), Long.TYPE, Integer.TYPE, Float.TYPE);
                        C4755bkv.q.put(320722406, obj6);
                    }
                    long longValue = ((Long) ((Method) obj6).invoke(obj5, objArr11)).longValue();
                    this.j.b++;
                    if (longValue > -1) {
                        long j10 = this.l;
                        Object obj7 = this.q$7488013c;
                        long j11 = j10 + j3;
                        try {
                            Object obj8 = C4755bkv.q.get(48903477);
                            if (obj8 != null) {
                                objArr = null;
                            } else {
                                objArr = null;
                                obj8 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("e", null);
                                C4755bkv.q.put(48903477, obj8);
                            }
                            long longValue2 = j11 - ((Long) ((Method) obj8).invoke(obj7, objArr)).longValue();
                            long j12 = this.l;
                            Object obj9 = this.q$7488013c;
                            try {
                                Object obj10 = C4755bkv.q.get(48901555);
                                if (obj10 != null) {
                                    method = obj10;
                                    str = "c";
                                    objArr2 = null;
                                } else {
                                    str = "c";
                                    objArr2 = null;
                                    method = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod(str, null);
                                    C4755bkv.q.put(48901555, method);
                                }
                                long intValue2 = ((Integer) ((Method) method).invoke(obj9, objArr2)).intValue() + j12;
                                try {
                                    Object[] objArr12 = {this.q$7488013c, Integer.valueOf(this.i), Long.valueOf(this.l), Long.valueOf(longValue2)};
                                    Object obj11 = C4755bkv.q.get(1563915899);
                                    if (obj11 != null) {
                                        method2 = obj11;
                                    } else {
                                        method2 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("d", (Class) C4755bkv.b((char) 0, 5, 2499), Integer.TYPE, Long.TYPE, Long.TYPE);
                                        C4755bkv.q.put(1563915899, method2);
                                    }
                                    Collection collection = (Collection) ((Method) method2).invoke(null, objArr12);
                                    Object obj12 = this.q$7488013c;
                                    int i = this.k;
                                    try {
                                        Object obj13 = C4755bkv.q.get(48903477);
                                        if (obj13 != null) {
                                            objArr3 = null;
                                        } else {
                                            objArr3 = null;
                                            obj13 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("e", null);
                                            C4755bkv.q.put(48903477, obj13);
                                        }
                                        try {
                                            Object[] objArr13 = {obj12, Integer.valueOf(i), Long.valueOf(((Long) ((Method) obj13).invoke(obj12, objArr3)).longValue() + longValue2), Long.valueOf(intValue2)};
                                            Object obj14 = C4755bkv.q.get(1563915899);
                                            if (obj14 != null) {
                                                j = longValue2;
                                            } else {
                                                j = longValue2;
                                                obj14 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("d", (Class) C4755bkv.b((char) 0, 5, 2499), Integer.TYPE, Long.TYPE, Long.TYPE);
                                                C4755bkv.q.put(1563915899, obj14);
                                            }
                                            g = C8576dqs.g(collection, (Iterable) ((Method) obj14).invoke(null, objArr13));
                                            Ref.DoubleRef doubleRef2 = new Ref.DoubleRef();
                                            Ref.DoubleRef doubleRef3 = new Ref.DoubleRef();
                                            Ref.DoubleRef doubleRef4 = new Ref.DoubleRef();
                                            if (!g.isEmpty()) {
                                                int size = g.size();
                                                double d = 0.0d;
                                                double d2 = 0.0d;
                                                int i2 = 1;
                                                while (i2 < size) {
                                                    int i3 = i2 - 1;
                                                    int i4 = size;
                                                    long j13 = intValue2;
                                                    double vmaf = d + (((SegmentVmaf) g.get(i3)).vmaf() * (((SegmentVmaf) g.get(i2)).offsetMs() - ((SegmentVmaf) g.get(i3)).offsetMs()));
                                                    Object obj15 = this.q$7488013c;
                                                    try {
                                                        Object obj16 = C4755bkv.q.get(48899633);
                                                        if (obj16 == null) {
                                                            Method method8 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("a", null);
                                                            C4755bkv.q.put(48899633, method8);
                                                            obj16 = method8;
                                                        }
                                                        Double[] dArr = (Double[]) ((Method) obj16).invoke(obj15, null);
                                                        int vmaf2 = ((SegmentVmaf) g.get(i2)).vmaf();
                                                        int vmaf3 = ((SegmentVmaf) g.get(i3)).vmaf();
                                                        Object obj17 = this.q$7488013c;
                                                        String str4 = str3;
                                                        try {
                                                            Ref.DoubleRef doubleRef5 = doubleRef4;
                                                            Object obj18 = C4755bkv.q.get(48899633);
                                                            if (obj18 == null) {
                                                                obj18 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("a", null);
                                                                C4755bkv.q.put(48899633, obj18);
                                                            }
                                                            c2 = C8657dts.c(vmaf2 - vmaf3, 0, ((Object[]) ((Method) obj18).invoke(obj17, null)).length - 1);
                                                            dArr[c2].doubleValue();
                                                            Object obj19 = this.q$7488013c;
                                                            try {
                                                                Object obj20 = C4755bkv.q.get(48899633);
                                                                if (obj20 != null) {
                                                                    method7 = obj20;
                                                                    objArr8 = null;
                                                                } else {
                                                                    objArr8 = null;
                                                                    method7 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("a", null);
                                                                    C4755bkv.q.put(48899633, method7);
                                                                }
                                                                Double[] dArr2 = (Double[]) ((Method) method7).invoke(obj19, objArr8);
                                                                int vmaf4 = ((SegmentVmaf) g.get(i3)).vmaf();
                                                                int vmaf5 = ((SegmentVmaf) g.get(i2)).vmaf();
                                                                Object obj21 = this.q$7488013c;
                                                                try {
                                                                    Object obj22 = C4755bkv.q.get(48899633);
                                                                    if (obj22 != null) {
                                                                        objArr9 = null;
                                                                    } else {
                                                                        objArr9 = null;
                                                                        obj22 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("a", null);
                                                                        C4755bkv.q.put(48899633, obj22);
                                                                    }
                                                                    c3 = C8657dts.c(vmaf4 - vmaf5, 0, ((Object[]) ((Method) obj22).invoke(obj21, objArr9)).length - 1);
                                                                    d2 += dArr2[c3].doubleValue();
                                                                    i2++;
                                                                    d = vmaf;
                                                                    str3 = str4;
                                                                    size = i4;
                                                                    intValue2 = j13;
                                                                    doubleRef4 = doubleRef5;
                                                                } catch (Throwable th2) {
                                                                    Throwable cause = th2.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause2 = th3.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause3 = th4.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause4 = th5.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                                j2 = intValue2;
                                                Ref.DoubleRef doubleRef6 = doubleRef4;
                                                str2 = str3;
                                                B = C8576dqs.B((List<? extends Object>) g);
                                                long offsetMs = ((SegmentVmaf) B).offsetMs();
                                                y = C8576dqs.y(g);
                                                doubleRef2.c = d / (offsetMs - ((SegmentVmaf) y).offsetMs());
                                                Object obj23 = this.q$7488013c;
                                                try {
                                                    Object obj24 = C4755bkv.q.get(48901555);
                                                    if (obj24 != null) {
                                                        method5 = obj24;
                                                        objArr6 = null;
                                                    } else {
                                                        objArr6 = null;
                                                        method5 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod(str, null);
                                                        C4755bkv.q.put(48901555, method5);
                                                    }
                                                    double d3 = 1000;
                                                    double d4 = 3600;
                                                    doubleRef3.c = (d2 / ((Integer) ((Method) method5).invoke(obj23, objArr6)).intValue()) * d3 * d4;
                                                    Object obj25 = this.q$7488013c;
                                                    try {
                                                        Object obj26 = C4755bkv.q.get(48901555);
                                                        if (obj26 != null) {
                                                            method6 = obj26;
                                                            objArr7 = null;
                                                        } else {
                                                            objArr7 = null;
                                                            method6 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod(str, null);
                                                            C4755bkv.q.put(48901555, method6);
                                                        }
                                                        doubleRef = doubleRef6;
                                                        doubleRef.c = (d2 / ((Integer) ((Method) method6).invoke(obj25, objArr7)).intValue()) * d3 * d4;
                                                    } catch (Throwable th6) {
                                                        Throwable cause5 = th6.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th6;
                                                    }
                                                } catch (Throwable th7) {
                                                    Throwable cause6 = th7.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th7;
                                                }
                                            } else {
                                                j2 = intValue2;
                                                doubleRef = doubleRef4;
                                                str2 = "d";
                                                Object[] objArr14 = (Object[]) ((Class) C4755bkv.b((char) 19864, 5, 2557)).getField("f").get(this.q$7488013c);
                                                double d5 = (((Class) C4755bkv.b((char) 0, 117, 2358)).getField("h").getInt(objArr14[this.i]) * j3) + (((Class) C4755bkv.b((char) 0, 117, 2358)).getField("h").getInt(objArr14[this.k]) * intValue);
                                                try {
                                                    Object obj27 = C4755bkv.q.get(48901555);
                                                    if (obj27 != null) {
                                                        method3 = obj27;
                                                        objArr4 = null;
                                                    } else {
                                                        objArr4 = null;
                                                        method3 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod(str, null);
                                                        C4755bkv.q.put(48901555, method3);
                                                    }
                                                    doubleRef2.c = d5 / ((Integer) ((Method) method3).invoke(obj2, objArr4)).intValue();
                                                } catch (Throwable th8) {
                                                    Throwable cause7 = th8.getCause();
                                                    if (cause7 != null) {
                                                        throw cause7;
                                                    }
                                                    throw th8;
                                                }
                                            }
                                            float f = ((float) longValue) / ((float) this.d);
                                            Object obj28 = this.q$7488013c;
                                            try {
                                                Object obj29 = C4755bkv.q.get(48901555);
                                                if (obj29 != null) {
                                                    method4 = obj29;
                                                    objArr5 = null;
                                                } else {
                                                    objArr5 = null;
                                                    method4 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod(str, null);
                                                    C4755bkv.q.put(48901555, method4);
                                                }
                                                float intValue3 = (f / ((Integer) ((Method) method4).invoke(obj28, objArr5)).intValue()) * 1000 * 60;
                                                Object obj30 = this.q$7488013c;
                                                try {
                                                    Object obj31 = C4755bkv.q.get(48902516);
                                                    if (obj31 == null) {
                                                        obj31 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod(str2, null);
                                                        C4755bkv.q.put(48902516, obj31);
                                                    }
                                                    double exp = Math.exp((-((AbstractC4739bkX) ((Method) obj31).invoke(obj30, null)).b()) * ((longValue / 1000000.0d) / 60));
                                                    ((C1045Mp) ((Class) C4755bkv.b((char) 0, 5, 2499)).getField(str).get(null)).getLogTag();
                                                    if (Double.isNaN(doubleRef2.c) || Double.isNaN(doubleRef.c) || Double.isNaN(doubleRef3.c) || Float.isNaN(intValue3) || Double.isNaN(exp)) {
                                                        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                                                        c = dqE.c(dpD.a("avgSegVMAF", String.valueOf(doubleRef2.c)), dpD.a("segVMAFPNDDownNormalized", String.valueOf(doubleRef.c)), dpD.a("segVMAFPNDUpNormalized", String.valueOf(doubleRef3.c)), dpD.a("bufferLevelChangeRate", String.valueOf(intValue3)), dpD.a("rebufferProbability", String.valueOf(exp)));
                                                        k = dqE.k(c);
                                                        C1596aHd c1596aHd = new C1596aHd("SPY-35329", null, null, true, k, false, false, 96, null);
                                                        ErrorType errorType = c1596aHd.a;
                                                        if (errorType != null) {
                                                            c1596aHd.e.put("errorType", errorType.c());
                                                            String b = c1596aHd.b();
                                                            if (b != null) {
                                                                c1596aHd.a(errorType.c() + " " + b);
                                                            }
                                                        }
                                                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                                                            th = new Throwable(c1596aHd.b(), c1596aHd.i);
                                                        } else if (c1596aHd.b() != null) {
                                                            th = new Throwable(c1596aHd.b());
                                                        } else {
                                                            th = c1596aHd.i;
                                                            if (th == null) {
                                                                th = new Throwable("Handled exception with no message");
                                                            } else if (th == null) {
                                                                throw new IllegalArgumentException("Required value was null.".toString());
                                                            }
                                                        }
                                                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                                                        InterfaceC1597aHe c4 = dVar2.c();
                                                        if (c4 != null) {
                                                            c4.d(c1596aHd, th);
                                                        } else {
                                                            dVar2.e().b(c1596aHd, th);
                                                        }
                                                    } else {
                                                        try {
                                                            Object[] objArr15 = {this.q$7488013c};
                                                            Object obj32 = C4755bkv.q.get(1490447499);
                                                            if (obj32 == null) {
                                                                obj32 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod(str, (Class) C4755bkv.b((char) 0, 5, 2499));
                                                                C4755bkv.q.put(1490447499, obj32);
                                                            }
                                                            ArrayList arrayList = (ArrayList) ((Method) obj32).invoke(null, objArr15);
                                                            try {
                                                                Object[] objArr16 = {this.q$7488013c, Long.valueOf(this.l), Integer.valueOf(this.i), Double.valueOf(doubleRef2.c), this.f13218o, Long.valueOf(j), Long.valueOf(j2), Double.valueOf(doubleRef.c), Double.valueOf(doubleRef3.c), Float.valueOf(intValue3), Double.valueOf(exp)};
                                                                Object obj33 = C4755bkv.q.get(-1372296429);
                                                                if (obj33 == null) {
                                                                    obj33 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getDeclaredConstructor((Class) C4755bkv.b((char) 0, 5, 2499), Long.TYPE, Integer.TYPE, Double.TYPE, int[].class, Long.TYPE, Long.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Double.TYPE);
                                                                    C4755bkv.q.put(-1372296429, obj33);
                                                                }
                                                                arrayList.add(((Constructor) obj33).newInstance(objArr16));
                                                            } catch (Throwable th9) {
                                                                Throwable cause8 = th9.getCause();
                                                                if (cause8 != null) {
                                                                    throw cause8;
                                                                }
                                                                throw th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            Throwable cause9 = th10.getCause();
                                                            if (cause9 != null) {
                                                                throw cause9;
                                                            }
                                                            throw th10;
                                                        }
                                                    }
                                                } catch (Throwable th11) {
                                                    Throwable cause10 = th11.getCause();
                                                    if (cause10 != null) {
                                                        throw cause10;
                                                    }
                                                    throw th11;
                                                }
                                            } catch (Throwable th12) {
                                                Throwable cause11 = th12.getCause();
                                                if (cause11 != null) {
                                                    throw cause11;
                                                }
                                                throw th12;
                                            }
                                        } catch (Throwable th13) {
                                            Throwable cause12 = th13.getCause();
                                            if (cause12 != null) {
                                                throw cause12;
                                            }
                                            throw th13;
                                        }
                                    } catch (Throwable th14) {
                                        Throwable cause13 = th14.getCause();
                                        if (cause13 != null) {
                                            throw cause13;
                                        }
                                        throw th14;
                                    }
                                } catch (Throwable th15) {
                                    Throwable cause14 = th15.getCause();
                                    if (cause14 != null) {
                                        throw cause14;
                                    }
                                    throw th15;
                                }
                            } catch (Throwable th16) {
                                Throwable cause15 = th16.getCause();
                                if (cause15 != null) {
                                    throw cause15;
                                }
                                throw th16;
                            }
                        } catch (Throwable th17) {
                            Throwable cause16 = th17.getCause();
                            if (cause16 != null) {
                                throw cause16;
                            }
                            throw th17;
                        }
                    }
                    return dpR.c;
                } catch (Throwable th18) {
                    Throwable cause17 = th18.getCause();
                    if (cause17 != null) {
                        throw cause17;
                    }
                    throw th18;
                }
            } catch (Throwable th19) {
                Throwable cause18 = th19.getCause();
                if (cause18 != null) {
                    throw cause18;
                }
                throw th19;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
