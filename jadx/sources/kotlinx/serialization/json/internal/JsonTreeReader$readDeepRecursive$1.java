package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.AbstractC8550dpt;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dEI;
import o.dET;
import o.dEU;
import o.dFF;
import o.dpR;

/* loaded from: classes5.dex */
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements InterfaceC8612dsa<AbstractC8550dpt<dpR, dEI>, dpR, InterfaceC8585dra<? super dEI>, Object> {
    final /* synthetic */ dFF c;
    int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(dFF dff, InterfaceC8585dra<? super JsonTreeReader$readDeepRecursive$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.c = dff;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(AbstractC8550dpt<dpR, dEI> abstractC8550dpt, dpR dpr, InterfaceC8585dra<? super dEI> interfaceC8585dra) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.c, interfaceC8585dra);
        jsonTreeReader$readDeepRecursive$1.e = abstractC8550dpt;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dEU deu;
        dEU deu2;
        dEI c;
        dET e2;
        dET e3;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            AbstractC8550dpt abstractC8550dpt = (AbstractC8550dpt) this.e;
            deu = this.c.b;
            byte n = deu.n();
            if (n == 1) {
                e3 = this.c.e(true);
                return e3;
            } else if (n == 0) {
                e2 = this.c.e(false);
                return e2;
            } else if (n != 6) {
                if (n == 8) {
                    c = this.c.c();
                    return c;
                }
                deu2 = this.c.b;
                dEU.d(deu2, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new KotlinNothingValueException();
            } else {
                dFF dff = this.c;
                this.d = 1;
                obj = dff.a(abstractC8550dpt, this);
                if (obj == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return (dEI) obj;
    }
}
