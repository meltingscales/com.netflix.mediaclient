package com.netflix.mediaclient.ui.games.impl.gdp;

import com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3911bPf;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes6.dex */
public final class GameDetailRepositoryImpl$setThumbRating$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Result<? extends ThumbRating>>, Object> {
    final /* synthetic */ String a;
    int b;
    final /* synthetic */ int c;
    final /* synthetic */ ThumbRating d;
    final /* synthetic */ C3911bPf e;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailRepositoryImpl$setThumbRating$2(C3911bPf c3911bPf, String str, ThumbRating thumbRating, int i, InterfaceC8585dra<? super GameDetailRepositoryImpl$setThumbRating$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c3911bPf;
        this.a = str;
        this.d = thumbRating;
        this.c = i;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Result<? extends ThumbRating>> interfaceC8585dra) {
        return ((GameDetailRepositoryImpl$setThumbRating$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GameDetailRepositoryImpl$setThumbRating$2 gameDetailRepositoryImpl$setThumbRating$2 = new GameDetailRepositoryImpl$setThumbRating$2(this.e, this.a, this.d, this.c, interfaceC8585dra);
        gameDetailRepositoryImpl$setThumbRating$2.j = obj;
        return gameDetailRepositoryImpl$setThumbRating$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        e = C8586drb.e();
        int i = this.b;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                dwU dwu = (dwU) this.j;
                C3911bPf c3911bPf = this.e;
                String str = this.a;
                ThumbRating thumbRating = this.d;
                int i2 = this.c;
                Result.c cVar = Result.e;
                this.b = 1;
                obj = c3911bPf.a(str, thumbRating, i2, this);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            e2 = Result.e((ThumbRating) obj);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e2 = Result.e(C8556dpz.a(th));
        }
        return Result.b(e2);
    }
}
