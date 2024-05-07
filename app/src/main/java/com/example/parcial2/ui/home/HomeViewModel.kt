package com.example.parcial2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Después de un aterrizaje forzoso en un misterioso mundo anillo conocido como Halo, el Jefe Maestro tiene la tarea de ayudar a los humanos restantes a sobrevivir contra las abrumadoras fuerzas del Covenant. Mientras lo hacen, él y Cortana descubren el oscuro secreto de Halo y luchan para proteger toda la vida en la galaxia."
    }
    val text: LiveData<String> = _text
}