package app.web.drjackycv.mvvmtemplate.di.module

import app.web.drjackycv.domain.products.repository.ProductsListRepository
import app.web.drjackycv.domain.products.usecase.GetBeerByCoroutineUseCase
import app.web.drjackycv.domain.products.usecase.GetBeerUseCase
import app.web.drjackycv.domain.products.usecase.GetBeersListByCoroutineUseCase
import app.web.drjackycv.domain.products.usecase.GetBeersListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class UseCaseModule {

    @Provides
    @ViewModelScoped
    fun getBeersListByCoroutineUseCase(
        productsListRepository: ProductsListRepository,
    ): GetBeersListByCoroutineUseCase =
        GetBeersListByCoroutineUseCase(productsListRepository::getBeersListByCoroutine)

    @Provides
    @ViewModelScoped
    fun getBeerByCoroutineUseCase(
        productsListRepository: ProductsListRepository,
    ): GetBeerByCoroutineUseCase =
        GetBeerByCoroutineUseCase(productsListRepository::getBeerByCoroutine)

    @Provides
    @ViewModelScoped
    fun getBeersListUseCase(
        productsListRepository: ProductsListRepository,
    ): GetBeersListUseCase =
        GetBeersListUseCase(productsListRepository::getBeersList)

    @Provides
    @ViewModelScoped
    fun getBeerUseCase(
        productsListRepository: ProductsListRepository,
    ): GetBeerUseCase =
        GetBeerUseCase(productsListRepository::getBeer)

}