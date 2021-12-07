package com.engeto.urm.dto;

import java.time.LocalDate;

public class Route {
    private Integer id;
    private Port startPort;
    private Port targetPort;
    private Integer distance;
    private LocalDate travelTime;
    // TODO: 07.12.2021 id lodě 
    private Integer ship_id;

    public Integer getShip_id() {
        return ship_id;
    }

    public void setShip_id(Integer ship_id) {
        // if ship_id je id lodě tak...
        this.ship_id = ship_id;
    }
}
