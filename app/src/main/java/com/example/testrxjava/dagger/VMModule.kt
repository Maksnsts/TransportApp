package com.example.testrxjava.dagger

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import com.example.domain.usecases.FetchBelgiumTransportUseCase
import com.example.testrxjava.screens.main.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class VMModule {

    @Provides
    fun providesViewModelFactory(application: Application): ViewModelProvider.Factory{
        return ViewModelProvider.AndroidViewModelFactory(application)
    }

    @Provides
    fun provideManViewModel(
        factory: ViewModelProvider.Factory,
        fetchBelgiumTransportUseCase: FetchBelgiumTransportUseCase
    ): MainViewModel{
        val viewModel = factory.create(MainViewModel::class.java)
        viewModel.fetchBelgiumTransportUseCase = fetchBelgiumTransportUseCase
        return  viewModel;
    }
}
