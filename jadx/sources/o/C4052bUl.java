package o;

import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC6337cbR;
import o.C1645aIz;
import o.C4052bUl;
import o.C6400ccb;
import o.C8153dex;
import o.C8166dfJ;
import o.C8571dqn;
import o.C8572dqo;
import o.C8632dsu;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.dpR;
import o.drM;

/* renamed from: o.bUl */
/* loaded from: classes4.dex */
public class C4052bUl {
    public static final e b = new e(null);
    private final Map<String, LinkedList<InterfaceC5222bug<? extends InterfaceC5223buh>>> a;
    private final bTF c;
    private final Set<String> d;
    private final Set<String> e;
    private final NetflixActivity f;

    public void a(InterfaceC5223buh interfaceC5223buh, LoMoType loMoType, String str) {
        C8632dsu.c((Object) interfaceC5223buh, "");
    }

    public C4052bUl(NetflixActivity netflixActivity, bTF btf) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) btf, "");
        this.f = netflixActivity;
        this.c = btf;
        this.a = new LinkedHashMap();
        this.e = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    /* renamed from: o.bUl$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("LolomoPrefetchHandler");
        }
    }

    public final drX<LoMo, Integer, dpR> a(final Context context) {
        C8632dsu.c((Object) context, "");
        return new drX<LoMo, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoPrefetchHandler$buildOnRowScrollStateChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(LoMo loMo, Integer num) {
                e(loMo, num.intValue());
                return dpR.c;
            }

            public final void e(LoMo loMo, int i) {
                C8632dsu.c((Object) loMo, "");
                if (i == 1) {
                    C4052bUl.this.a(context, loMo);
                }
            }
        };
    }

    public final void d(final String str) {
        C8632dsu.c((Object) str, "");
        this.c.b(str, new drX<LoMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoPrefetchHandler$onRowVideosBound$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class e {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[LoMoType.values().length];
                    try {
                        iArr[LoMoType.CONTINUE_WATCHING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LoMoType.BILLBOARD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(LoMo loMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list) {
                c(loMo, list);
                return dpR.c;
            }

            public final void c(final LoMo loMo, final List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list) {
                int d;
                NetflixActivity netflixActivity;
                int d2;
                Set set;
                NetflixActivity netflixActivity2;
                Set set2;
                Map map;
                Map map2;
                Map map3;
                NetflixActivity netflixActivity3;
                int d3;
                C8632dsu.c((Object) loMo, "");
                C8632dsu.c((Object) list, "");
                C8166dfJ.e(null, false, 3, null);
                int i = e.a[loMo.getType().ordinal()];
                if (i != 1) {
                    if (i == 2 && C8153dex.H()) {
                        netflixActivity3 = C4052bUl.this.f;
                        d3 = C8572dqo.d(list, 10);
                        ArrayList arrayList = new ArrayList(d3);
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((InterfaceC5222bug) it.next()).getVideo());
                        }
                        AbstractC6337cbR.e(netflixActivity3, arrayList);
                    }
                } else {
                    ArrayList<InterfaceC5222bug> arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof InterfaceC5222bug) {
                            arrayList2.add(obj);
                        }
                    }
                    d = C8572dqo.d(arrayList2, 10);
                    ArrayList arrayList3 = new ArrayList(d);
                    for (InterfaceC5222bug interfaceC5222bug : arrayList2) {
                        C8632dsu.d(interfaceC5222bug);
                        arrayList3.add(interfaceC5222bug);
                    }
                    C4052bUl.b.getLogTag();
                    C6400ccb.c.c(arrayList3);
                    if (C8153dex.H()) {
                        netflixActivity = C4052bUl.this.f;
                        d2 = C8572dqo.d(list, 10);
                        ArrayList arrayList4 = new ArrayList(d2);
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((InterfaceC5222bug) it2.next()).getVideo());
                        }
                        AbstractC6337cbR.e(netflixActivity, arrayList4);
                    }
                }
                String listId = loMo.getListId();
                if (listId != null) {
                    C4052bUl c4052bUl = C4052bUl.this;
                    map = c4052bUl.a;
                    if (!map.containsKey(listId)) {
                        map3 = c4052bUl.a;
                        map3.put(listId, new LinkedList());
                    }
                    map2 = c4052bUl.a;
                    Object obj2 = map2.get(listId);
                    if (obj2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    C8571dqn.b((Collection) obj2, list);
                }
                set = C4052bUl.this.e;
                if (set.contains(str)) {
                    return;
                }
                netflixActivity2 = C4052bUl.this.f;
                final C4052bUl c4052bUl2 = C4052bUl.this;
                C1645aIz.a(netflixActivity2, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoPrefetchHandler$onRowVideosBound$1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                        e(serviceManager);
                        return dpR.c;
                    }

                    public final void e(ServiceManager serviceManager) {
                        NetflixActivity netflixActivity4;
                        int d4;
                        C8632dsu.c((Object) serviceManager, "");
                        netflixActivity4 = C4052bUl.this.f;
                        List<InterfaceC5222bug<? extends InterfaceC5223buh>> list2 = list;
                        d4 = C8572dqo.d(list2, 10);
                        ArrayList arrayList5 = new ArrayList(d4);
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((InterfaceC5222bug) it3.next()).getVideo());
                        }
                        AbstractC6337cbR.c(serviceManager, netflixActivity4, arrayList5, loMo);
                    }
                });
                set2 = C4052bUl.this.e;
                set2.add(str);
            }
        });
    }

    public static /* synthetic */ void c(C4052bUl c4052bUl, InterfaceC5223buh interfaceC5223buh, LoMoType loMoType, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVideoBound");
        }
        if ((i & 4) != 0) {
            str = null;
        }
        c4052bUl.a(interfaceC5223buh, loMoType, str);
    }

    public final void a(Context context, LoMo loMo) {
        LinkedList<InterfaceC5222bug<? extends InterfaceC5223buh>> linkedList;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        e eVar = b;
        eVar.getLogTag();
        if (!C8141del.a()) {
            C8166dfJ.e(null, false, 3, null);
        }
        String listId = loMo.getListId();
        if (listId == null || (linkedList = this.a.get(listId)) == null || !(!linkedList.isEmpty())) {
            return;
        }
        eVar.getLogTag();
        do {
            InterfaceC5222bug<? extends InterfaceC5223buh> pop = linkedList.pop();
            if (!this.d.contains(pop.getVideo().getId())) {
                C6388ccP.a(context, pop);
                Set<String> set = this.d;
                String id = pop.getVideo().getId();
                C8632dsu.a(id, "");
                set.add(id);
            }
        } while (!linkedList.isEmpty());
    }
}
