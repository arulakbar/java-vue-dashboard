package com.example.backend.mapper;

import java.util.List;

public interface EntityMapper <D,E>{

    D toDto(E entity);
    E toEntity(D dto);

    List <D> toListDto(List<E> entityList);

    List<E> toListEntity(List<D> dtoList);


}
