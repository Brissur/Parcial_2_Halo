package com.example.parcial2.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "En Halo 2, el Jefe Maestro y el Comandante Sangheili Thel 'Vadamee se enfrentan a nuevas amenazas del Covenant y el Flood. Mientras el Jefe protege la Tierra de la invasión Covenant, 'Vadamee se encuentra en una lucha interna dentro del Covenant. Con la revelación de los verdaderos propósitos de los Profetas y la amenaza de activar un Halo, el Jefe Maestro y 'Vadamee se unen para detener la catástrofe inminente."
    }
    val text: LiveData<String> = _text
}