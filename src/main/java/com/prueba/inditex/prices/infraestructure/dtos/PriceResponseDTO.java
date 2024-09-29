package com.prueba.inditex.prices.infraestructure.dtos;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class PriceResponseDTO {
    private Long productId;
    private Long brandId;
    private Double price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long priceList;
}
