package app.cash.sqldelight;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C8632dsu;
import o.InterfaceC9092j;
import o.InterfaceC9569s;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes2.dex */
public abstract class BaseTransacterImpl {
    private final InterfaceC9569s driver;

    public final InterfaceC9569s getDriver() {
        return this.driver;
    }

    public BaseTransacterImpl(InterfaceC9569s interfaceC9569s) {
        C8632dsu.c((Object) interfaceC9569s, "");
        this.driver = interfaceC9569s;
    }

    public final <R> R postTransactionCleanup(InterfaceC9092j.b bVar, InterfaceC9092j.b bVar2, Throwable th, R r) {
        C8632dsu.c((Object) bVar, "");
        boolean z = true;
        if (bVar2 == null) {
            if (bVar.i() && bVar.e()) {
                if (true ^ bVar.g().isEmpty()) {
                    InterfaceC9569s interfaceC9569s = this.driver;
                    String[] strArr = (String[]) bVar.g().toArray(new String[0]);
                    interfaceC9569s.d((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                bVar.g().clear();
                bVar.h().clear();
                Iterator<T> it = bVar.f().iterator();
                while (it.hasNext()) {
                    ((drO) it.next()).invoke();
                }
                bVar.f().clear();
            } else {
                try {
                    Iterator<T> it2 = bVar.j().iterator();
                    while (it2.hasNext()) {
                        ((drO) it2.next()).invoke();
                    }
                    bVar.j().clear();
                } catch (Throwable th2) {
                    if (th != null) {
                        throw new Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th + "\nwith cause " + th.getCause() + "\n\nRollback exception: " + th2, th2);
                    }
                    throw th2;
                }
            }
        } else {
            if (!bVar.i() || !bVar.e()) {
                z = false;
            }
            bVar2.b(z);
            bVar2.f().addAll(bVar.f());
            bVar2.j().addAll(bVar.j());
            bVar2.h().addAll(bVar.h());
            bVar2.g().addAll(bVar.g());
        }
        if (bVar2 == null && (th instanceof RollbackException)) {
            return (R) ((RollbackException) th).a();
        }
        if (th == null) {
            return r;
        }
        throw th;
    }

    public final void notifyQueries(int i, drM<? super drM<? super String, dpR>, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        final InterfaceC9092j.b d = this.driver.d();
        if (d != null) {
            if (d.h().add(Integer.valueOf(i))) {
                drm.invoke(new drM<String, dpR>() { // from class: app.cash.sqldelight.BaseTransacterImpl$notifyQueries$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void c(String str) {
                        C8632dsu.c((Object) str, "");
                        InterfaceC9092j.b.this.g().add(str);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(String str) {
                        c(str);
                        return dpR.c;
                    }
                });
                return;
            }
            return;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        drm.invoke(new drM<String, dpR>() { // from class: app.cash.sqldelight.BaseTransacterImpl$notifyQueries$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(String str) {
                C8632dsu.c((Object) str, "");
                linkedHashSet.add(str);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                e(str);
                return dpR.c;
            }
        });
        InterfaceC9569s interfaceC9569s = this.driver;
        String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
        interfaceC9569s.d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String createArguments(int i) {
        if (i == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder(i + 2);
        sb.append("(?");
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append(",?");
        }
        sb.append(')');
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }
}
