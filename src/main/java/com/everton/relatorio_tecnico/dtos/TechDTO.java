package com.everton.relatorio_tecnico.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class TechDTO {

    private String name;
    private String email;
    private String phone;
}
