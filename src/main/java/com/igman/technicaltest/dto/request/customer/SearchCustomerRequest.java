package com.igman.technicaltest.dto.request.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchCustomerRequest {
    private Integer page;
    private Integer size;
    private String direction;
    private String sortBy;
}
