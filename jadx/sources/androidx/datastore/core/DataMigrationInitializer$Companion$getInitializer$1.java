package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class DataMigrationInitializer$Companion$getInitializer$1<T> extends SuspendLambda implements drX<InitializerApi<T>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$getInitializer$1(List<? extends DataMigration<T>> list, InterfaceC8585dra<? super DataMigrationInitializer$Companion$getInitializer$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$migrations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.$migrations, interfaceC8585dra);
        dataMigrationInitializer$Companion$getInitializer$1.L$0 = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    public final Object invoke(InitializerApi<T> initializerApi, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(initializerApi, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke((InitializerApi) ((InitializerApi) obj), interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object runMigrations;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.Companion;
            List<DataMigration<T>> list = this.$migrations;
            this.label = 1;
            runMigrations = companion.runMigrations(list, (InitializerApi) this.L$0, this);
            if (runMigrations == e) {
                return e;
            }
        } else if (i == 1) {
            C8556dpz.d(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return dpR.c;
    }
}
