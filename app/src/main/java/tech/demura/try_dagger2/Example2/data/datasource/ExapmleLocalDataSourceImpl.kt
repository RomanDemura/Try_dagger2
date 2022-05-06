package tech.demura.try_dagger2.Example2.data.datasource

import tech.demura.try_dagger2.Example2.data.database.ExampleDatabase

class ExapmleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}