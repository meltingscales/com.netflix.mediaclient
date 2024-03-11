package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* loaded from: classes2.dex */
final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, InterfaceC8585dra<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.$migration = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, interfaceC8585dra);
    }

    @Override // o.drM
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
