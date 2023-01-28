package com.imnidasoftware.di

import com.imnidasoftware.data.repository.UserDataSourceImpl
import com.imnidasoftware.domain.repository.UserDataSource
import com.imnidasoftware.util.Constants.DATABASE_NAME
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val koinModule = module {
    single {
        KMongo.createClient()
            .coroutine
            .getDatabase(DATABASE_NAME)

    }
    single<UserDataSource> {
        UserDataSourceImpl(get())
    }
}