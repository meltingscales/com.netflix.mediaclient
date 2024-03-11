package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class IL {
    public static void a(InterfaceC0912Hj interfaceC0912Hj, List<IK> list, InterfaceC0906Hd interfaceC0906Hd) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (IK ik : list) {
            ik.a(ik.b().e(ik.a()));
            arrayList.add(ik.c());
        }
        try {
            Map<String, HZ> e = interfaceC0912Hj.e(arrayList, interfaceC0906Hd);
            for (IK ik2 : list) {
                if (ik2.f() != null) {
                    ik2.a(d(ik2.f(), e.get(ik2.c()), ik2.a(), ik2.b(), currentTimeMillis));
                }
            }
        } catch (Exception e2) {
            InterfaceC1598aHf.a(new C1596aHd("Cannot load record for paths: '" + list).b(ErrorType.m).d(e2));
        }
    }

    private static InterfaceC8322diG d(InterfaceC8322diG interfaceC8322diG, HZ hz, String str, InterfaceC0943Io interfaceC0943Io, long j) {
        if ((interfaceC8322diG instanceof AbstractC0941Im) || (interfaceC8322diG instanceof IF) || (interfaceC8322diG instanceof InterfaceC0952Ix)) {
            if (hz == null) {
                e(interfaceC8322diG, str, interfaceC0943Io, j);
            } else {
                if (interfaceC8322diG instanceof IF) {
                    IF r8 = (IF) interfaceC8322diG;
                    if (hz instanceof HX) {
                        r8.d(IE.b(hz.m()));
                    } else if (hz instanceof HJ) {
                        r8.d(IE.d(HA.e.a(hz.o())));
                    } else {
                        interfaceC8322diG = IJ.b();
                    }
                    if (interfaceC0943Io != null) {
                        interfaceC0943Io.d(str, interfaceC8322diG);
                    }
                } else if (interfaceC8322diG instanceof InterfaceC0952Ix) {
                    ((InterfaceC0952Ix) interfaceC8322diG).populate(C0950Iv.e(hz));
                    if (interfaceC0943Io != null) {
                        interfaceC0943Io.d(str, interfaceC8322diG);
                    }
                } else if (interfaceC0943Io != null) {
                    interfaceC0943Io.d(str, C0946Ir.d("DiskCacheUtils", C0950Iv.e(hz), interfaceC8322diG.getClass()));
                }
                if ((interfaceC8322diG instanceof InterfaceC8321diF) && interfaceC8322diG != IJ.b() && (hz instanceof HO)) {
                    HO ho = (HO) hz;
                    Long e = ho.e();
                    InterfaceC8321diF interfaceC8321diF = (InterfaceC8321diF) interfaceC8322diG;
                    if (e != null && e.longValue() > 0) {
                        interfaceC8321diF.setTimestamp(e.longValue());
                        interfaceC8321diF.setExpires(ho.a());
                        return interfaceC8322diG;
                    } else if (hz instanceof HH) {
                        HH hh = (HH) hz;
                        Long h = hh.h();
                        if (h != null && h.longValue() > 0) {
                            interfaceC8321diF.setTimestamp(h.longValue());
                        }
                        interfaceC8321diF.setExpires(hh.a());
                        return interfaceC8322diG;
                    } else {
                        return interfaceC8322diG;
                    }
                }
                return interfaceC8322diG;
            }
        } else if (!(interfaceC8322diG instanceof IH)) {
            return interfaceC8322diG;
        } else {
            IH ih = (IH) interfaceC8322diG;
            if (!(ih.a() instanceof InterfaceC0951Iw)) {
                return interfaceC8322diG;
            }
            if (hz != null) {
                ((InterfaceC0952Ix) ih.a()).populate(C0950Iv.e(hz));
                return interfaceC8322diG;
            }
            e(ih.a(), str, interfaceC0943Io, j);
        }
        return null;
    }

    private static void e(Object obj, String str, InterfaceC0943Io interfaceC0943Io, long j) {
        if (!(obj instanceof InterfaceC8323diH) || interfaceC0943Io == null || ((InterfaceC8323diH) obj).getTimestamp() < j) {
            return;
        }
        interfaceC0943Io.a(str);
    }

    public static String b(List<? extends Object> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i).toString());
            if (i < size - 1) {
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
