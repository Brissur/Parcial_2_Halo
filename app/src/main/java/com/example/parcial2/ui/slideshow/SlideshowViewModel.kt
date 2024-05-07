package com.example.parcial2.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "En 2552, el Jefe Maestro, John-117, lidera la lucha contra el Covenant, quienes planean activar los anillos de Halo para destruir la galaxia. Con la ayuda de aliados humanos y Elites, el Jefe Maestro desactiva los anillos, pero su IA, Cortana, queda atrapada en una nave. El Jefe Maestro se pone en criosueño, esperando ser necesario nuevamente. Este evento marca el inicio de la Saga del Reclamador, que explorará la relación entre el Jefe Maestro y Cortana mientras enfrentan nuevos desafíos en el universo de Halo."
    }
    val text: LiveData<String> = _text
}