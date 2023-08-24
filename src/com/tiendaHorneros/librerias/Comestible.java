package com.tiendaHorneros.librerias;

import java.time.LocalDate;

interface Comestible {
    LocalDate getFechaVencimiento();
    int getCalorias();
}
