package ro.gabrielbadicioiu.authenticationapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ro.gabrielbadicioiu.authenticationapp.di.appModule

class AuthenticationApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AuthenticationApp)
            modules(appModule)
        }
    }
}